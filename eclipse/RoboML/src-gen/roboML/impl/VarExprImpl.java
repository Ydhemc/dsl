/**
 */
package roboML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import roboML.RoboMLPackage;
import roboML.VarExpr;
import roboML.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roboML.impl.VarExprImpl#getVariableRef <em>Variable Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarExprImpl extends ExpressionImpl implements VarExpr {
	/**
	 * The cached value of the '{@link #getVariableRef() <em>Variable Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableRef()
	 * @generated
	 * @ordered
	 */
	protected Variable variableRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboMLPackage.Literals.VAR_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariableRef() {
		if (variableRef != null && variableRef.eIsProxy()) {
			InternalEObject oldVariableRef = (InternalEObject) variableRef;
			variableRef = (Variable) eResolveProxy(oldVariableRef);
			if (variableRef != oldVariableRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoboMLPackage.VAR_EXPR__VARIABLE_REF,
							oldVariableRef, variableRef));
			}
		}
		return variableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariableRef() {
		return variableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableRef(Variable newVariableRef) {
		Variable oldVariableRef = variableRef;
		variableRef = newVariableRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboMLPackage.VAR_EXPR__VARIABLE_REF, oldVariableRef,
					variableRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RoboMLPackage.VAR_EXPR__VARIABLE_REF:
			if (resolve)
				return getVariableRef();
			return basicGetVariableRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RoboMLPackage.VAR_EXPR__VARIABLE_REF:
			setVariableRef((Variable) newValue);
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
		case RoboMLPackage.VAR_EXPR__VARIABLE_REF:
			setVariableRef((Variable) null);
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
		case RoboMLPackage.VAR_EXPR__VARIABLE_REF:
			return variableRef != null;
		}
		return super.eIsSet(featureID);
	}

} //VarExprImpl
