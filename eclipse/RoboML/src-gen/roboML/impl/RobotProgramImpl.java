/**
 */
package roboML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import roboML.Declaration;
import roboML.Expression;
import roboML.Instruction;
import roboML.RoboMLPackage;
import roboML.RobotProgram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link roboML.impl.RobotProgramImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link roboML.impl.RobotProgramImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link roboML.impl.RobotProgramImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotProgramImpl extends MinimalEObjectImpl.Container implements RobotProgram {
	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declaration;

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
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboMLPackage.Literals.ROBOT_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclaration() {
		if (declaration == null) {
			declaration = new EObjectContainmentEList<Declaration>(Declaration.class, this,
					RoboMLPackage.ROBOT_PROGRAM__DECLARATION);
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getInstruction() {
		if (instruction == null) {
			instruction = new EObjectContainmentEList<Instruction>(Instruction.class, this,
					RoboMLPackage.ROBOT_PROGRAM__INSTRUCTION);
		}
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExpression() {
		if (expression == null) {
			expression = new EObjectContainmentEList<Expression>(Expression.class, this,
					RoboMLPackage.ROBOT_PROGRAM__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RoboMLPackage.ROBOT_PROGRAM__DECLARATION:
			return ((InternalEList<?>) getDeclaration()).basicRemove(otherEnd, msgs);
		case RoboMLPackage.ROBOT_PROGRAM__INSTRUCTION:
			return ((InternalEList<?>) getInstruction()).basicRemove(otherEnd, msgs);
		case RoboMLPackage.ROBOT_PROGRAM__EXPRESSION:
			return ((InternalEList<?>) getExpression()).basicRemove(otherEnd, msgs);
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
		case RoboMLPackage.ROBOT_PROGRAM__DECLARATION:
			return getDeclaration();
		case RoboMLPackage.ROBOT_PROGRAM__INSTRUCTION:
			return getInstruction();
		case RoboMLPackage.ROBOT_PROGRAM__EXPRESSION:
			return getExpression();
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
		case RoboMLPackage.ROBOT_PROGRAM__DECLARATION:
			getDeclaration().clear();
			getDeclaration().addAll((Collection<? extends Declaration>) newValue);
			return;
		case RoboMLPackage.ROBOT_PROGRAM__INSTRUCTION:
			getInstruction().clear();
			getInstruction().addAll((Collection<? extends Instruction>) newValue);
			return;
		case RoboMLPackage.ROBOT_PROGRAM__EXPRESSION:
			getExpression().clear();
			getExpression().addAll((Collection<? extends Expression>) newValue);
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
		case RoboMLPackage.ROBOT_PROGRAM__DECLARATION:
			getDeclaration().clear();
			return;
		case RoboMLPackage.ROBOT_PROGRAM__INSTRUCTION:
			getInstruction().clear();
			return;
		case RoboMLPackage.ROBOT_PROGRAM__EXPRESSION:
			getExpression().clear();
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
		case RoboMLPackage.ROBOT_PROGRAM__DECLARATION:
			return declaration != null && !declaration.isEmpty();
		case RoboMLPackage.ROBOT_PROGRAM__INSTRUCTION:
			return instruction != null && !instruction.isEmpty();
		case RoboMLPackage.ROBOT_PROGRAM__EXPRESSION:
			return expression != null && !expression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RobotProgramImpl
