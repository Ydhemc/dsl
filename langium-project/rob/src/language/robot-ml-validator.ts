import type { ValidationAcceptor, ValidationChecks } from 'langium';
import type { RobotMlAstType, Person } from './generated/ast.js';
import type { RobotMlServices } from './robot-ml-module.js';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: RobotMlServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.RobotMlValidator;
    const checks: ValidationChecks<RobotMlAstType> = {
        Person: validator.checkPersonStartsWithCapital
    };
    registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class RobotMlValidator {

    checkPersonStartsWithCapital(person: Person, accept: ValidationAcceptor): void {
        if (person.name) {
            const firstChar = person.name.substring(0, 1);
            if (firstChar.toUpperCase() !== firstChar) {
                accept('warning', 'Person name should start with a capital.', { node: person, property: 'name' });
            }
        }
    }

}
