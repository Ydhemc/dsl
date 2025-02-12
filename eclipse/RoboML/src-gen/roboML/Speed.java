/**
 */
package roboML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.Speed#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getSpeed()
 * @model
 * @generated
 */
public interface Speed extends Instruction {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(Expression)
	 * @see roboML.RoboMLPackage#getSpeed_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	Expression getParameters();

	/**
	 * Sets the value of the '{@link roboML.Speed#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(Expression value);

} // Speed
