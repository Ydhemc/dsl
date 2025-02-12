/**
 */
package roboML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.Condition#getBooleanexpr <em>Booleanexpr</em>}</li>
 *   <li>{@link roboML.Condition#getIf <em>If</em>}</li>
 *   <li>{@link roboML.Condition#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends Instruction {
	/**
	 * Returns the value of the '<em><b>Booleanexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleanexpr</em>' containment reference.
	 * @see #setBooleanexpr(BooleanExpr)
	 * @see roboML.RoboMLPackage#getCondition_Booleanexpr()
	 * @model containment="true"
	 * @generated
	 */
	BooleanExpr getBooleanexpr();

	/**
	 * Sets the value of the '{@link roboML.Condition#getBooleanexpr <em>Booleanexpr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booleanexpr</em>' containment reference.
	 * @see #getBooleanexpr()
	 * @generated
	 */
	void setBooleanexpr(BooleanExpr value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(Instruction)
	 * @see roboML.RoboMLPackage#getCondition_If()
	 * @model containment="true"
	 * @generated
	 */
	Instruction getIf();

	/**
	 * Sets the value of the '{@link roboML.Condition#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(Instruction value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Instruction)
	 * @see roboML.RoboMLPackage#getCondition_Else()
	 * @model containment="true"
	 * @generated
	 */
	Instruction getElse();

	/**
	 * Sets the value of the '{@link roboML.Condition#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Instruction value);

} // Condition
