/**
 */
package roboML.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import roboML.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see roboML.RoboMLPackage
 * @generated
 */
public class RoboMLAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RoboMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboMLAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = RoboMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoboMLSwitch<Adapter> modelSwitch =
		new RoboMLSwitch<Adapter>()
		{
			@Override
			public Adapter caseFonction(Fonction object)
			{
				return createFonctionAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object)
			{
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseRobotProgram(RobotProgram object)
			{
				return createRobotProgramAdapter();
			}
			@Override
			public Adapter caseBooleanExpr(BooleanExpr object)
			{
				return createBooleanExprAdapter();
			}
			@Override
			public Adapter caseLoop(Loop object)
			{
				return createLoopAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object)
			{
				return createConditionAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object)
			{
				return createVariableAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object)
			{
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseArithmeticExpr(ArithmeticExpr object)
			{
				return createArithmeticExprAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object)
			{
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseType(Type object)
			{
				return createTypeAdapter();
			}
			@Override
			public Adapter caseBool(Bool object)
			{
				return createBoolAdapter();
			}
			@Override
			public Adapter caseReal(Real object)
			{
				return createRealAdapter();
			}
			@Override
			public Adapter caseCall(Call object)
			{
				return createCallAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object)
			{
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseCallExpr(CallExpr object)
			{
				return createCallExprAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object)
			{
				return createSensorAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object)
			{
				return createParameterAdapter();
			}
			@Override
			public Adapter caseVarExpr(VarExpr object)
			{
				return createVarExprAdapter();
			}
			@Override
			public Adapter casereturn(return object)
			{
				return createreturnAdapter();
			}
			@Override
			public Adapter caseBlock(Block object)
			{
				return createBlockAdapter();
			}
			@Override
			public Adapter caseMovement(Movement object)
			{
				return createMovementAdapter();
			}
			@Override
			public Adapter caseForward(Forward object)
			{
				return createForwardAdapter();
			}
			@Override
			public Adapter caseRotate(Rotate object)
			{
				return createRotateAdapter();
			}
			@Override
			public Adapter caseLeft(Left object)
			{
				return createLeftAdapter();
			}
			@Override
			public Adapter caseBackward(Backward object)
			{
				return createBackwardAdapter();
			}
			@Override
			public Adapter caseRight(Right object)
			{
				return createRightAdapter();
			}
			@Override
			public Adapter caseSpeed(Speed object)
			{
				return createSpeedAdapter();
			}
			@Override
			public Adapter caseSensorDistance(SensorDistance object)
			{
				return createSensorDistanceAdapter();
			}
			@Override
			public Adapter caseSensorTime(SensorTime object)
			{
				return createSensorTimeAdapter();
			}
			@Override
			public Adapter caseNegative(Negative object)
			{
				return createNegativeAdapter();
			}
			@Override
			public Adapter caseBinaryArithmetic(BinaryArithmetic object)
			{
				return createBinaryArithmeticAdapter();
			}
			@Override
			public Adapter caseNot(Not object)
			{
				return createNotAdapter();
			}
			@Override
			public Adapter caseBinaryBool(BinaryBool object)
			{
				return createBinaryBoolAdapter();
			}
			@Override
			public Adapter caseSensorExpr(SensorExpr object)
			{
				return createSensorExprAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link roboML.Fonction <em>Fonction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Fonction
	 * @generated
	 */
	public Adapter createFonctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.RobotProgram <em>Robot Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.RobotProgram
	 * @generated
	 */
	public Adapter createRobotProgramAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.BooleanExpr <em>Boolean Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.BooleanExpr
	 * @generated
	 */
	public Adapter createBooleanExprAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Loop
	 * @generated
	 */
	public Adapter createLoopAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.ArithmeticExpr <em>Arithmetic Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.ArithmeticExpr
	 * @generated
	 */
	public Adapter createArithmeticExprAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Type
	 * @generated
	 */
	public Adapter createTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Bool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Bool
	 * @generated
	 */
	public Adapter createBoolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Real
	 * @generated
	 */
	public Adapter createRealAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Call
	 * @generated
	 */
	public Adapter createCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.CallExpr <em>Call Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.CallExpr
	 * @generated
	 */
	public Adapter createCallExprAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.VarExpr <em>Var Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.VarExpr
	 * @generated
	 */
	public Adapter createVarExprAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.return <em>return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.return
	 * @generated
	 */
	public Adapter createreturnAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Block
	 * @generated
	 */
	public Adapter createBlockAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Movement <em>Movement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Movement
	 * @generated
	 */
	public Adapter createMovementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Forward
	 * @generated
	 */
	public Adapter createForwardAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Rotate
	 * @generated
	 */
	public Adapter createRotateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Left
	 * @generated
	 */
	public Adapter createLeftAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Backward <em>Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Backward
	 * @generated
	 */
	public Adapter createBackwardAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Right
	 * @generated
	 */
	public Adapter createRightAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Speed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Speed
	 * @generated
	 */
	public Adapter createSpeedAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.SensorDistance <em>Sensor Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.SensorDistance
	 * @generated
	 */
	public Adapter createSensorDistanceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.SensorTime <em>Sensor Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.SensorTime
	 * @generated
	 */
	public Adapter createSensorTimeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Negative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Negative
	 * @generated
	 */
	public Adapter createNegativeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.BinaryArithmetic <em>Binary Arithmetic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.BinaryArithmetic
	 * @generated
	 */
	public Adapter createBinaryArithmeticAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.Not
	 * @generated
	 */
	public Adapter createNotAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.BinaryBool <em>Binary Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.BinaryBool
	 * @generated
	 */
	public Adapter createBinaryBoolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link roboML.SensorExpr <em>Sensor Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see roboML.SensorExpr
	 * @generated
	 */
	public Adapter createSensorExprAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //RoboMLAdapterFactory
