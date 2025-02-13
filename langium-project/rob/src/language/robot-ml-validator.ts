import type { ValidationAcceptor, ValidationChecks } from 'langium';
import { Block, Condition, FalseExpr, Loop, TrueExpr, Variable, RobotMLAstType, RobotProgram, Func } from './generated/ast.js';
import type { RobotMLServices } from './robot-ml-module.js';
//import { ReconnectionRunningEvent } from 'vscode/vscode/vs/platform/remote/common/remoteAgentConnection';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: RobotMLServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.RobotMLValidator;
    const checks: ValidationChecks<RobotMLAstType> = {
        Func: [validator.checkFuncNameLowerCamelCase, validator.checkUniqueParams],
        Variable: validator.checkVariableSnakeCase,
        RobotProgram: validator.checkUniqueFunc,
        Loop: [validator.checkNoObviousLoop, validator.checkLoopHasBody],
        Condition: [validator.checkNoObviousCondition, validator.checkConditionHasBody]
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

    /*checkUnusedParams(func: Func, accept: ValidationAcceptor): void {
        func.parameter.forEach(param => {
            if (func.instruction.$type==Block ) { 
                accept('warning', `Parameter '${param.name}' is declared but never used in function '${func.name}'.`, { node: param, property: 'name' });
            }
            if(func.instruction.$type==Forward && !(func.instruction as Movement).parameter){
                accept('warning', `Parameter '${param.name}' is declared but never used in function '${func.name}'.`, { node: param, property: 'name' });    
            }
        });
    }*/


    checkVariableSnakeCase(variable: Variable, accept: ValidationAcceptor): void {
        const snakeCaseRegex = /^[a-z0-9]+(?:_[a-z0-9]+)*$/
        if(!snakeCaseRegex.test(variable.name)) {
            accept('warning', 'Variable should be snake_case', {node: variable, property: 'name'})
        }
    }
    
    checkNoObviousCondition(condition: Condition, accept: ValidationAcceptor): void {
        const exprType = condition.booleanexpr.$type
        if(exprType == TrueExpr || exprType == FalseExpr) {
            accept('warning', 'Obvious condition', {node: condition, property: 'booleanexpr'})
        }
    }

    checkNoObviousLoop(loop: Loop, accept: ValidationAcceptor): void {
        const exprType = loop.booleanexpr.$type
        if(exprType == TrueExpr || exprType == FalseExpr) {
            accept('warning', 'Obvious loop', {node: loop, property: 'booleanexpr'})
        }
    }

    checkConditionHasBody(condition: Condition, accept: ValidationAcceptor): void {
        const ifInst = condition.if
        if(ifInst.$type == Block &&  (ifInst as Block).instructions.length == 0){
            accept('error', 'If must have a body', {node: condition, property: 'if'})
        }
    }

    checkLoopHasBody(loop: Loop, accept: ValidationAcceptor): void {
        const loopInst = loop.instruction
        if(loopInst.$type == Block &&  (loopInst as Block).instructions.length == 0){
            accept('warning', 'Loop should have a body', {node: loop, property: 'instruction'})
        }
    }
    /*
    checkInstHasReturn(instruction: Instruction): boolean{
        if(instruction.$type == Block) return this.checkBlockHasReturn((instruction as Block));
        else if (instruction.$type == Return){
            return true;
        }
        return false;
    }
    /*
    checkBlockHasReturn(block: Block): boolean {
        let hasReturn = true
        block.instructions.forEach(element => {
            if(element.$type == Return) {
                hasReturn;
                return;
            }
            else if (element.$type == Condition){
                const condition = element as Condition
                const ifHasReturn = this.checkInstHasReturn(condition.if)
                hasReturn = hasReturn && ifHasReturn
                //TODO else
            }
        });
        return hasReturn
    }

    checkFuncMustReturn(func: Func, accept: ValidationAcceptor): void {
        const funcInst = func.instruction
        if(!this.checkInstHasReturn(funcInst)){
            accept('error', 'function should have a return statement', {node: func, property: 'instruction'})
        }
    }
    */

}
