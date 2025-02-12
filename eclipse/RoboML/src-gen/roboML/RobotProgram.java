/**
 */
package roboML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.RobotProgram#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link roboML.RobotProgram#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link roboML.RobotProgram#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getRobotProgram()
 * @model
 * @generated
 */
public interface RobotProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link roboML.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference list.
	 * @see roboML.RoboMLPackage#getRobotProgram_Declaration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaration> getDeclaration();

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link roboML.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference list.
	 * @see roboML.RoboMLPackage#getRobotProgram_Instruction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstruction();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link roboML.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see roboML.RoboMLPackage#getRobotProgram_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // RobotProgram
