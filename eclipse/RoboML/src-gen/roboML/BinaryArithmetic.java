/**
 */
package roboML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Arithmetic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.BinaryArithmetic#getOperation <em>Operation</em>}</li>
 *   <li>{@link roboML.BinaryArithmetic#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getBinaryArithmetic()
 * @model
 * @generated
 */
public interface BinaryArithmetic extends ArithmeticExpr {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link roboML.ArithmeticOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see roboML.ArithmeticOperation
	 * @see #setOperation(ArithmeticOperation)
	 * @see roboML.RoboMLPackage#getBinaryArithmetic_Operation()
	 * @model
	 * @generated
	 */
	ArithmeticOperation getOperation();

	/**
	 * Sets the value of the '{@link roboML.BinaryArithmetic#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see roboML.ArithmeticOperation
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ArithmeticOperation value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link roboML.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see roboML.RoboMLPackage#getBinaryArithmetic_Expression()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Expression> getExpression();

} // BinaryArithmetic
