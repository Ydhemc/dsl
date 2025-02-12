/**
 */
package roboML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.Real#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getReal()
 * @model
 * @generated
 */
public interface Real extends Type {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link roboML.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see roboML.Unit
	 * @see #setUnit(Unit)
	 * @see roboML.RoboMLPackage#getReal_Unit()
	 * @model
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link roboML.Real#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see roboML.Unit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

} // Real
