/**
 */
package roboML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.SensorExpr#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getSensorExpr()
 * @model
 * @generated
 */
public interface SensorExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see roboML.RoboMLPackage#getSensorExpr_Sensor()
	 * @model
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link roboML.SensorExpr#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

} // SensorExpr
