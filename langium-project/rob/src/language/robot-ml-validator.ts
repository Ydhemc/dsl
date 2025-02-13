import type { ValidationAcceptor, ValidationChecks } from 'langium';
import { Forward, Func, Movement, RobotMLAstType, RobotProgram } from './generated/ast.js';
import type { RobotMLServices } from './robot-ml-module.js';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: RobotMLServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.RobotMLValidator;
    const checks: ValidationChecks<RobotMLAstType> = {
        Func: [validator.checkFuncNameLowerCamelCase, validator.checkUniqueParams, validator.checkUnusedParams],
        RobotProgram: validator.checkUniqueFunc
    };
    registry.register(checks, validator);
}



/**
 * Implementation of custom validations.
 */
export class RobotMLValidator {

    checkFuncNameLowerCamelCase(func: Func, accept: ValidationAcceptor): void {
        const camelCaseRegex = /^[a-z]+(?:[A-Z0-9]+[a-z0-9]+[A-Za-z0-9]*)*$/
        if (!camelCaseRegex.test(func.name)) {
            accept('warning', 'Func name should be camelCase.', { node: func, property: 'name' });
        }
    }

    checkUniqueParams(func: Func, accept: ValidationAcceptor): void {
        const reported = new Set();
        func.parameter.forEach(p => {
            if (reported.has(p.name)) {
                accept('error', `Param ${p.name} is non-unique for Def '${func.name}'`, {node: p, property: 'name'});
            }
            reported.add(p.name);
        });
    }

    checkUniqueFunc(Program: RobotProgram, accept: ValidationAcceptor): void {
        const reported = new Set();  
        
        Program.declarations.forEach(d => {
            if(d.$type==Func && reported.has((d as Func).name)) {
                accept('error', `Param ${(d as Func).name} is non-unique for Def '${(d as Func).name}'`, {node: d, property: 'name'});
            }
            reported.add((d as Func).name);
        });
    }

    checkUnusedParams(func: Func, accept: ValidationAcceptor): void {
        func.parameter.forEach(param => {
            /*
            if (func.instruction.$type==Block ) { 
                accept('warning', `Parameter '${param.name}' is declared but never used in function '${func.name}'.`, { node: param, property: 'name' });
            }*/
            if(func.instruction.$type==Forward && !(func.instruction as Movement).parameter.variable.includes(param)){
                accept('warning', `Parameter '${param.name}' is declared but never used in function '${func.name}'.`, { node: param, property: 'name' });    
            }
        });
    }
    
}
