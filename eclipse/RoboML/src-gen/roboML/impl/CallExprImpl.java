/**
 */
package roboML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import roboML.CallExpr;
import roboML.Expression;
import roboML.Fonction;
import roboML.RoboMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roboML.impl.CallExprImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link roboML.impl.CallExprImpl#getFonction <em>Fonction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallExprImpl extends ExpressionImpl implements CallExpr {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> parameters;

	/**
	 * The cached value of the '{@link #getFonction() <em>Fonction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonction()
	 * @generated
	 * @ordered
	 */
	protected Fonction fonction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboMLPackage.Literals.CALL_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Expression>(Expression.class, this,
					RoboMLPackage.CALL_EXPR__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fonction getFonction() {
		if (fonction != null && fonction.eIsProxy()) {
			InternalEObject oldFonction = (InternalEObject) fonction;
			fonction = (Fonction) eResolveProxy(oldFonction);
			if (fonction != oldFonction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoboMLPackage.CALL_EXPR__FONCTION,
							oldFonction, fonction));
			}
		}
		return fonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fonction basicGetFonction() {
		return fonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonction(Fonction newFonction) {
		Fonction oldFonction = fonction;
		fonction = newFonction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboMLPackage.CALL_EXPR__FONCTION, oldFonction,
					fonction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoboMLPackage.CALL_EXPR__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RoboMLPackage.CALL_EXPR__PARAMETERS:
			return getParameters();
		case RoboMLPackage.CALL_EXPR__FONCTION:
			if (resolve)
				return getFonction();
			return basicGetFonction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RoboMLPackage.CALL_EXPR__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Expression>) newValue);
			return;
		case RoboMLPackage.CALL_EXPR__FONCTION:
			setFonction((Fonction) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RoboMLPackage.CALL_EXPR__PARAMETERS:
			getParameters().clear();
			return;
		case RoboMLPackage.CALL_EXPR__FONCTION:
			setFonction((Fonction) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RoboMLPackage.CALL_EXPR__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case RoboMLPackage.CALL_EXPR__FONCTION:
			return fonction != null;
		}
		return super.eIsSet(featureID);
	}

} //CallExprImpl
