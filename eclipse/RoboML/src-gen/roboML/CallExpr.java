/**
 */
package roboML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link roboML.CallExpr#getParameters <em>Parameters</em>}</li>
 *   <li>{@link roboML.CallExpr#getFonction <em>Fonction</em>}</li>
 * </ul>
 *
 * @see roboML.RoboMLPackage#getCallExpr()
 * @model
 * @generated
 */
public interface CallExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link roboML.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see roboML.RoboMLPackage#getCallExpr_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getParameters();

	/**
	 * Returns the value of the '<em><b>Fonction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction</em>' reference.
	 * @see #setFonction(Fonction)
	 * @see roboML.RoboMLPackage#getCallExpr_Fonction()
	 * @model
	 * @generated
	 */
	Fonction getFonction();

	/**
	 * Sets the value of the '{@link roboML.CallExpr#getFonction <em>Fonction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction</em>' reference.
	 * @see #getFonction()
	 * @generated
	 */
	void setFonction(Fonction value);

} // CallExpr
