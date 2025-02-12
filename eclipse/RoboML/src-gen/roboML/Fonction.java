/**
 */
package roboML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fonction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.Fonction#getParameter <em>Parameter</em>}</li>
 *   <li>{@link roboML.Fonction#getName <em>Name</em>}</li>
 *   <li>{@link roboML.Fonction#getTypeReturn <em>Type Return</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getFonction()
 * @model
 * @generated
 */
public interface Fonction extends Declaration {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link roboML.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see roboML.RoboMLPackage#getFonction_Parameter()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see roboML.RoboMLPackage#getFonction_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link roboML.Fonction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Return</em>' reference.
	 * @see #setTypeReturn(Type)
	 * @see roboML.RoboMLPackage#getFonction_TypeReturn()
	 * @model
	 * @generated
	 */
	Type getTypeReturn();

	/**
	 * Sets the value of the '{@link roboML.Fonction#getTypeReturn <em>Type Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Return</em>' reference.
	 * @see #getTypeReturn()
	 * @generated
	 */
	void setTypeReturn(Type value);

} // Fonction
