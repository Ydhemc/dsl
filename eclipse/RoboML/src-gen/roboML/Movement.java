/**
 */
package roboML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.Movement#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getMovement()
 * @model abstract="true"
 * @generated
 */
public interface Movement extends Instruction {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(Expression)
	 * @see roboML.RoboMLPackage#getMovement_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	Expression getParameters();

	/**
	 * Sets the value of the '{@link roboML.Movement#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(Expression value);

} // Movement
