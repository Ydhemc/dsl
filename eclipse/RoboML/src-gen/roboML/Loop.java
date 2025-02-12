/**
 */
package roboML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.Loop#getBooleanexpr <em>Booleanexpr</em>}</li>
 *   <li>{@link roboML.Loop#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Instruction {
	/**
	 * Returns the value of the '<em><b>Booleanexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanexpr</em>' containment reference.
	 * @see #setBooleanexpr(BooleanExpr)
	 * @see roboML.RoboMLPackage#getLoop_Booleanexpr()
	 * @model containment="true"
	 * @generated
	 */
	BooleanExpr getBooleanexpr();

	/**
	 * Sets the value of the '{@link roboML.Loop#getBooleanexpr <em>Booleanexpr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booleanexpr</em>' containment reference.
	 * @see #getBooleanexpr()
	 * @generated
	 */
	void setBooleanexpr(BooleanExpr value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link roboML.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference list.
	 * @see roboML.RoboMLPackage#getLoop_Instruction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstruction();

} // Loop
