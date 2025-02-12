/**
 */
package roboML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.VarExpr#getVariableRef <em>Variable Ref</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getVarExpr()
 * @model
 * @generated
 */
public interface VarExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Ref</em>' reference.
	 * @see #setVariableRef(Variable)
	 * @see roboML.RoboMLPackage#getVarExpr_VariableRef()
	 * @model
	 * @generated
	 */
	Variable getVariableRef();

	/**
	 * Sets the value of the '{@link roboML.VarExpr#getVariableRef <em>Variable Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Ref</em>' reference.
	 * @see #getVariableRef()
	 * @generated
	 */
	void setVariableRef(Variable value);

} // VarExpr
