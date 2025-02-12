/**
 */
package roboML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.return#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getreturn()
 * @model
 * @generated
 */
public interface return extends Instruction
{
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression)
	 * @see roboML.RoboMLPackage#getreturn_Expression()
	 * @model
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link roboML.return#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // return
