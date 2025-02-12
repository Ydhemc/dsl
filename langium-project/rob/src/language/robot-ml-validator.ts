import type { ValidationAcceptor, ValidationChecks } from 'langium';
import type { Func, RobotMLAstType } from './generated/ast.js';
import type { RobotMLServices } from './robot-ml-module.js';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: RobotMLServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.RobotMLValidator;
    const checks: ValidationChecks<RobotMLAstType> = {
        Func: validator.checkFuncNameLowerCamelCase
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

}
