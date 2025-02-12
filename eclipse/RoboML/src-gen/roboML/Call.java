/**
 */
package roboML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.Call#getParameters <em>Parameters</em>}</li>
 *   <li>{@link roboML.Call#getFonction <em>Fonction</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Instruction {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link roboML.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see roboML.RoboMLPackage#getCall_Parameters()
	 * @model
	 * @generated
	 */
	EList<Expression> getParameters();

	/**
	 * Returns the value of the '<em><b>Fonction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction</em>' reference.
	 * @see #setFonction(Fonction)
	 * @see roboML.RoboMLPackage#getCall_Fonction()
	 * @model
	 * @generated
	 */
	Fonction getFonction();

	/**
	 * Sets the value of the '{@link roboML.Call#getFonction <em>Fonction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction</em>' reference.
	 * @see #getFonction()
	 * @generated
	 */
	void setFonction(Fonction value);

} // Call
