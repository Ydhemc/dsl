/**
 */
package roboML.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import roboML.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see roboML.RoboMLPackage
 * @generated
 */
public class RoboMLSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RoboMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboMLSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = RoboMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case RoboMLPackage.FONCTION:
			{
				Fonction fonction = (Fonction)theEObject;
				T result = caseFonction(fonction);
				if (result == null) result = caseDeclaration(fonction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.INSTRUCTION:
			{
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.ROBOT_PROGRAM:
			{
				RobotProgram robotProgram = (RobotProgram)theEObject;
				T result = caseRobotProgram(robotProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.BOOLEAN_EXPR:
			{
				BooleanExpr booleanExpr = (BooleanExpr)theEObject;
				T result = caseBooleanExpr(booleanExpr);
				if (result == null) result = caseExpression(booleanExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.LOOP:
			{
				Loop loop = (Loop)theEObject;
				T result = caseLoop(loop);
				if (result == null) result = caseInstruction(loop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.CONDITION:
			{
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseInstruction(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.VARIABLE:
			{
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseDeclaration(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.EXPRESSION:
			{
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.ARITHMETIC_EXPR:
			{
				ArithmeticExpr arithmeticExpr = (ArithmeticExpr)theEObject;
				T result = caseArithmeticExpr(arithmeticExpr);
				if (result == null) result = caseExpression(arithmeticExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.DECLARATION:
			{
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.TYPE:
			{
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.BOOL:
			{
				Bool bool = (Bool)theEObject;
				T result = caseBool(bool);
				if (result == null) result = caseType(bool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.REAL:
			{
				Real real = (Real)theEObject;
				T result = caseReal(real);
				if (result == null) result = caseType(real);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.CALL:
			{
				Call call = (Call)theEObject;
				T result = caseCall(call);
				if (result == null) result = caseInstruction(call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.ASSIGNMENT:
			{
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseInstruction(assignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.CALL_EXPR:
			{
				CallExpr callExpr = (CallExpr)theEObject;
				T result = caseCallExpr(callExpr);
				if (result == null) result = caseExpression(callExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.SENSOR:
			{
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseDeclaration(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.PARAMETER:
			{
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.VAR_EXPR:
			{
				VarExpr varExpr = (VarExpr)theEObject;
				T result = caseVarExpr(varExpr);
				if (result == null) result = caseExpression(varExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.RETURN:
			{
				return return_ = (return)theEObject;
				T result = casereturn(return_);
				if (result == null) result = caseInstruction(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.BLOCK:
			{
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseInstruction(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.MOVEMENT:
			{
				Movement movement = (Movement)theEObject;
				T result = caseMovement(movement);
				if (result == null) result = caseInstruction(movement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.FORWARD:
			{
				Forward forward = (Forward)theEObject;
				T result = caseForward(forward);
				if (result == null) result = caseMovement(forward);
				if (result == null) result = caseInstruction(forward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.ROTATE:
			{
				Rotate rotate = (Rotate)theEObject;
				T result = caseRotate(rotate);
				if (result == null) result = caseMovement(rotate);
				if (result == null) result = caseInstruction(rotate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.LEFT:
			{
				Left left = (Left)theEObject;
				T result = caseLeft(left);
				if (result == null) result = caseMovement(left);
				if (result == null) result = caseInstruction(left);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.BACKWARD:
			{
				Backward backward = (Backward)theEObject;
				T result = caseBackward(backward);
				if (result == null) result = caseMovement(backward);
				if (result == null) result = caseInstruction(backward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.RIGHT:
			{
				Right right = (Right)theEObject;
				T result = caseRight(right);
				if (result == null) result = caseMovement(right);
				if (result == null) result = caseInstruction(right);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.SPEED:
			{
				Speed speed = (Speed)theEObject;
				T result = caseSpeed(speed);
				if (result == null) result = caseInstruction(speed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.SENSOR_DISTANCE:
			{
				SensorDistance sensorDistance = (SensorDistance)theEObject;
				T result = caseSensorDistance(sensorDistance);
				if (result == null) result = caseSensor(sensorDistance);
				if (result == null) result = caseDeclaration(sensorDistance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.SENSOR_TIME:
			{
				SensorTime sensorTime = (SensorTime)theEObject;
				T result = caseSensorTime(sensorTime);
				if (result == null) result = caseSensor(sensorTime);
				if (result == null) result = caseDeclaration(sensorTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.NEGATIVE:
			{
				Negative negative = (Negative)theEObject;
				T result = caseNegative(negative);
				if (result == null) result = caseArithmeticExpr(negative);
				if (result == null) result = caseExpression(negative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.BINARY_ARITHMETIC:
			{
				BinaryArithmetic binaryArithmetic = (BinaryArithmetic)theEObject;
				T result = caseBinaryArithmetic(binaryArithmetic);
				if (result == null) result = caseArithmeticExpr(binaryArithmetic);
				if (result == null) result = caseExpression(binaryArithmetic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.NOT:
			{
				Not not = (Not)theEObject;
				T result = caseNot(not);
				if (result == null) result = caseExpression(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.BINARY_BOOL:
			{
				BinaryBool binaryBool = (BinaryBool)theEObject;
				T result = caseBinaryBool(binaryBool);
				if (result == null) result = caseExpression(binaryBool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RoboMLPackage.SENSOR_EXPR:
			{
				SensorExpr sensorExpr = (SensorExpr)theEObject;
				T result = caseSensorExpr(sensorExpr);
				if (result == null) result = caseExpression(sensorExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fonction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fonction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFonction(Fonction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobotProgram(RobotProgram object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpr(BooleanExpr object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticExpr(ArithmeticExpr object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBool(Bool object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReal(Real object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallExpr(CallExpr object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarExpr(VarExpr object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casereturn(return object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovement(Movement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForward(Forward object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotate(Rotate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeft(Left object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackward(Backward object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRight(Right object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeed(Speed object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorDistance(SensorDistance object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorTime(SensorTime object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegative(Negative object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Arithmetic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Arithmetic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryArithmetic(BinaryArithmetic object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Bool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Bool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryBool(BinaryBool object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorExpr(SensorExpr object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //RoboMLSwitch
