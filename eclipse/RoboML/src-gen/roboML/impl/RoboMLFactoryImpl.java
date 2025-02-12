/**
 */
package roboML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import roboML.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoboMLFactoryImpl extends EFactoryImpl implements RoboMLFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoboMLFactory init()
	{
		try
		{
			RoboMLFactory theRoboMLFactory = (RoboMLFactory)EPackage.Registry.INSTANCE.getEFactory(RoboMLPackage.eNS_URI);
			if (theRoboMLFactory != null)
			{
				return theRoboMLFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RoboMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboMLFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case RoboMLPackage.FONCTION: return createFonction();
			case RoboMLPackage.ROBOT_PROGRAM: return createRobotProgram();
			case RoboMLPackage.LOOP: return createLoop();
			case RoboMLPackage.CONDITION: return createCondition();
			case RoboMLPackage.VARIABLE: return createVariable();
			case RoboMLPackage.TYPE: return createType();
			case RoboMLPackage.BOOL: return createBool();
			case RoboMLPackage.REAL: return createReal();
			case RoboMLPackage.CALL: return createCall();
			case RoboMLPackage.ASSIGNMENT: return createAssignment();
			case RoboMLPackage.CALL_EXPR: return createCallExpr();
			case RoboMLPackage.SENSOR: return createSensor();
			case RoboMLPackage.PARAMETER: return createParameter();
			case RoboMLPackage.VAR_EXPR: return createVarExpr();
			case RoboMLPackage.RETURN: return createreturn();
			case RoboMLPackage.BLOCK: return createBlock();
			case RoboMLPackage.FORWARD: return createForward();
			case RoboMLPackage.ROTATE: return createRotate();
			case RoboMLPackage.LEFT: return createLeft();
			case RoboMLPackage.BACKWARD: return createBackward();
			case RoboMLPackage.RIGHT: return createRight();
			case RoboMLPackage.SPEED: return createSpeed();
			case RoboMLPackage.SENSOR_DISTANCE: return createSensorDistance();
			case RoboMLPackage.SENSOR_TIME: return createSensorTime();
			case RoboMLPackage.NEGATIVE: return createNegative();
			case RoboMLPackage.BINARY_ARITHMETIC: return createBinaryArithmetic();
			case RoboMLPackage.NOT: return createNot();
			case RoboMLPackage.BINARY_BOOL: return createBinaryBool();
			case RoboMLPackage.SENSOR_EXPR: return createSensorExpr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case RoboMLPackage.UNIT:
				return createUnitFromString(eDataType, initialValue);
			case RoboMLPackage.BOOL_OPERATION:
				return createBoolOperationFromString(eDataType, initialValue);
			case RoboMLPackage.ARITHMETIC_OPERATION:
				return createArithmeticOperationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case RoboMLPackage.UNIT:
				return convertUnitToString(eDataType, instanceValue);
			case RoboMLPackage.BOOL_OPERATION:
				return convertBoolOperationToString(eDataType, instanceValue);
			case RoboMLPackage.ARITHMETIC_OPERATION:
				return convertArithmeticOperationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fonction createFonction()
	{
		FonctionImpl fonction = new FonctionImpl();
		return fonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotProgram createRobotProgram()
	{
		RobotProgramImpl robotProgram = new RobotProgramImpl();
		return robotProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop()
	{
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition()
	{
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable()
	{
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType()
	{
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bool createBool()
	{
		BoolImpl bool = new BoolImpl();
		return bool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Real createReal()
	{
		RealImpl real = new RealImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call createCall()
	{
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment()
	{
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallExpr createCallExpr()
	{
		CallExprImpl callExpr = new CallExprImpl();
		return callExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor()
	{
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter()
	{
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarExpr createVarExpr()
	{
		VarExprImpl varExpr = new VarExprImpl();
		return varExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public return createreturn()
	{
		returnImpl return_ = new returnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock()
	{
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forward createForward()
	{
		ForwardImpl forward = new ForwardImpl();
		return forward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rotate createRotate()
	{
		RotateImpl rotate = new RotateImpl();
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Left createLeft()
	{
		LeftImpl left = new LeftImpl();
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Backward createBackward()
	{
		BackwardImpl backward = new BackwardImpl();
		return backward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Right createRight()
	{
		RightImpl right = new RightImpl();
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speed createSpeed()
	{
		SpeedImpl speed = new SpeedImpl();
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorDistance createSensorDistance()
	{
		SensorDistanceImpl sensorDistance = new SensorDistanceImpl();
		return sensorDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorTime createSensorTime()
	{
		SensorTimeImpl sensorTime = new SensorTimeImpl();
		return sensorTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negative createNegative()
	{
		NegativeImpl negative = new NegativeImpl();
		return negative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryArithmetic createBinaryArithmetic()
	{
		BinaryArithmeticImpl binaryArithmetic = new BinaryArithmeticImpl();
		return binaryArithmetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot()
	{
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryBool createBinaryBool()
	{
		BinaryBoolImpl binaryBool = new BinaryBoolImpl();
		return binaryBool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorExpr createSensorExpr()
	{
		SensorExprImpl sensorExpr = new SensorExprImpl();
		return sensorExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnitFromString(EDataType eDataType, String initialValue)
	{
		Unit result = Unit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolOperation createBoolOperationFromString(EDataType eDataType, String initialValue)
	{
		BoolOperation result = BoolOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBoolOperationToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperation createArithmeticOperationFromString(EDataType eDataType, String initialValue)
	{
		ArithmeticOperation result = ArithmeticOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArithmeticOperationToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboMLPackage getRoboMLPackage()
	{
		return (RoboMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RoboMLPackage getPackage()
	{
		return RoboMLPackage.eINSTANCE;
	}

} //RoboMLFactoryImpl
