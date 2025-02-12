/**
 */
package roboML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import roboML.BooleanExpr;
import roboML.Condition;
import roboML.Instruction;
import roboML.RoboMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roboML.impl.ConditionImpl#getBooleanexpr <em>Booleanexpr</em>}</li>
 *   <li>{@link roboML.impl.ConditionImpl#getIf <em>If</em>}</li>
 *   <li>{@link roboML.impl.ConditionImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The cached value of the '{@link #getBooleanexpr() <em>Booleanexpr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanexpr()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpr booleanexpr;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected Instruction if_;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected Instruction else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboMLPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpr getBooleanexpr() {
		return booleanexpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanexpr(BooleanExpr newBooleanexpr, NotificationChain msgs) {
		BooleanExpr oldBooleanexpr = booleanexpr;
		booleanexpr = newBooleanexpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RoboMLPackage.CONDITION__BOOLEANEXPR, oldBooleanexpr, newBooleanexpr);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanexpr(BooleanExpr newBooleanexpr) {
		if (newBooleanexpr != booleanexpr) {
			NotificationChain msgs = null;
			if (booleanexpr != null)
				msgs = ((InternalEObject) booleanexpr).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RoboMLPackage.CONDITION__BOOLEANEXPR, null, msgs);
			if (newBooleanexpr != null)
				msgs = ((InternalEObject) newBooleanexpr).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RoboMLPackage.CONDITION__BOOLEANEXPR, null, msgs);
			msgs = basicSetBooleanexpr(newBooleanexpr, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboMLPackage.CONDITION__BOOLEANEXPR, newBooleanexpr,
					newBooleanexpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(Instruction newIf, NotificationChain msgs) {
		Instruction oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboMLPackage.CONDITION__IF,
					oldIf, newIf);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf(Instruction newIf) {
		if (newIf != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject) if_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RoboMLPackage.CONDITION__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject) newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboMLPackage.CONDITION__IF,
						null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboMLPackage.CONDITION__IF, newIf, newIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(Instruction newElse, NotificationChain msgs) {
		Instruction oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RoboMLPackage.CONDITION__ELSE, oldElse, newElse);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(Instruction newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject) else_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - RoboMLPackage.CONDITION__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject) newElse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RoboMLPackage.CONDITION__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboMLPackage.CONDITION__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoboMLPackage.CONDITION__BOOLEANEXPR:
			return basicSetBooleanexpr(null, msgs);
		case RoboMLPackage.CONDITION__IF:
			return basicSetIf(null, msgs);
		case RoboMLPackage.CONDITION__ELSE:
			return basicSetElse(null, msgs);
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
		case RoboMLPackage.CONDITION__BOOLEANEXPR:
			return getBooleanexpr();
		case RoboMLPackage.CONDITION__IF:
			return getIf();
		case RoboMLPackage.CONDITION__ELSE:
			return getElse();
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
		case RoboMLPackage.CONDITION__BOOLEANEXPR:
			setBooleanexpr((BooleanExpr) newValue);
			return;
		case RoboMLPackage.CONDITION__IF:
			setIf((Instruction) newValue);
			return;
		case RoboMLPackage.CONDITION__ELSE:
			setElse((Instruction) newValue);
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
		case RoboMLPackage.CONDITION__BOOLEANEXPR:
			setBooleanexpr((BooleanExpr) null);
			return;
		case RoboMLPackage.CONDITION__IF:
			setIf((Instruction) null);
			return;
		case RoboMLPackage.CONDITION__ELSE:
			setElse((Instruction) null);
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
		case RoboMLPackage.CONDITION__BOOLEANEXPR:
			return booleanexpr != null;
		case RoboMLPackage.CONDITION__IF:
			return if_ != null;
		case RoboMLPackage.CONDITION__ELSE:
			return else_ != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionImpl
