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
        Func: validator.checkFuncFirstCharLowercase
    };
    registry.register(checks, validator);
}



/**
 * Implementation of custom validations.
 */
export class RobotMLValidator {

    
    checkFuncFirstCharLowercase(func: Func, accept: ValidationAcceptor): void {
        const firstChar = func.name.substring(0, 1)
        if (firstChar.toLowerCase() != firstChar) {
            accept('warning', 'Func name should be CamelCase.', { node: func, property: 'name' });
        }
    }

}
