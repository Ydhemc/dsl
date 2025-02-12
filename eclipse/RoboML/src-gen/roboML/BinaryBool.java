/**
 */
package roboML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Bool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.BinaryBool#getOperation <em>Operation</em>}</li>
 *   <li>{@link roboML.BinaryBool#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getBinaryBool()
 * @model
 * @generated
 */
public interface BinaryBool extends Expression {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link roboML.BoolOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see roboML.BoolOperation
	 * @see #setOperation(BoolOperation)
	 * @see roboML.RoboMLPackage#getBinaryBool_Operation()
	 * @model
	 * @generated
	 */
	BoolOperation getOperation();

	/**
	 * Sets the value of the '{@link roboML.BinaryBool#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see roboML.BoolOperation
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(BoolOperation value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link roboML.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see roboML.RoboMLPackage#getBinaryBool_Expression()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Expression> getExpression();

} // BinaryBool
