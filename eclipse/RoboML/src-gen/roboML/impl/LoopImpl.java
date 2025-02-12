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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import roboML.BooleanExpr;
import roboML.Instruction;
import roboML.Loop;
import roboML.RoboMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roboML.impl.LoopImpl#getBooleanexpr <em>Booleanexpr</em>}</li>
 *   <li>{@link roboML.impl.LoopImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends MinimalEObjectImpl.Container implements Loop {
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
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboMLPackage.Literals.LOOP;
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
					RoboMLPackage.LOOP__BOOLEANEXPR, oldBooleanexpr, newBooleanexpr);
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
						EOPPOSITE_FEATURE_BASE - RoboMLPackage.LOOP__BOOLEANEXPR, null, msgs);
			if (newBooleanexpr != null)
				msgs = ((InternalEObject) newBooleanexpr).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - RoboMLPackage.LOOP__BOOLEANEXPR, null, msgs);
			msgs = basicSetBooleanexpr(newBooleanexpr, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboMLPackage.LOOP__BOOLEANEXPR, newBooleanexpr,
					newBooleanexpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getInstruction() {
		if (instruction == null) {
			instruction = new EObjectContainmentEList<Instruction>(Instruction.class, this,
					RoboMLPackage.LOOP__INSTRUCTION);
		}
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoboMLPackage.LOOP__BOOLEANEXPR:
			return basicSetBooleanexpr(null, msgs);
		case RoboMLPackage.LOOP__INSTRUCTION:
			return ((InternalEList<?>) getInstruction()).basicRemove(otherEnd, msgs);
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
		case RoboMLPackage.LOOP__BOOLEANEXPR:
			return getBooleanexpr();
		case RoboMLPackage.LOOP__INSTRUCTION:
			return getInstruction();
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
		case RoboMLPackage.LOOP__BOOLEANEXPR:
			setBooleanexpr((BooleanExpr) newValue);
			return;
		case RoboMLPackage.LOOP__INSTRUCTION:
			getInstruction().clear();
			getInstruction().addAll((Collection<? extends Instruction>) newValue);
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
		case RoboMLPackage.LOOP__BOOLEANEXPR:
			setBooleanexpr((BooleanExpr) null);
			return;
		case RoboMLPackage.LOOP__INSTRUCTION:
			getInstruction().clear();
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
		case RoboMLPackage.LOOP__BOOLEANEXPR:
			return booleanexpr != null;
		case RoboMLPackage.LOOP__INSTRUCTION:
			return instruction != null && !instruction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoopImpl
