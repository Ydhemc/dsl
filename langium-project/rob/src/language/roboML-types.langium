
type Unit = Unit_MM | Unit_KM | Unit_CM | Unit_M | Unit_DM | Unit_HM | Unit_DAM | Unit_RAD;
type Unit_MM = 'mm';
type Unit_KM = 'km';
type Unit_CM = 'cm';
type Unit_M = 'm';
type Unit_DM = 'dm';
type Unit_HM = 'hm';
type Unit_DAM = 'dam';
type Unit_RAD = 'rad';

type BoolOperation = BoolOperation_INF | BoolOperation_SUP | BoolOperation_INF_EQ | BoolOperation_EQ | BoolOperation_SUP_EQ | BoolOperation_NEQ | BoolOperation_OR | BoolOperation_AND;
type BoolOperation_INF = '<';
type BoolOperation_SUP = '>';
type BoolOperation_INF_EQ = '<=';
type BoolOperation_EQ = '==';
type BoolOperation_SUP_EQ = '>=';
type BoolOperation_NEQ = '!=';
type BoolOperation_OR = '||';
type BoolOperation_AND = '&&';

type ArithmeticOperation = ArithmeticOperation_ADD | ArithmeticOperation_SUB | ArithmeticOperation_DIV | ArithmeticOperation_MULT;
type ArithmeticOperation_ADD = '+';
type ArithmeticOperation_SUB = '-';
type ArithmeticOperation_DIV = '/';
type ArithmeticOperation_MULT = '*';

interface RobotProgram {
	declarations: Declaration[]
	instructions: Instruction[]
}

interface Declaration {
}

interface Instruction {
}

interface Expression {
}

interface Variable extends Declaration {
	^type: Type
	name: string
}

interface Type {
}

interface BooleanExpr extends Expression {
}

interface Sensor extends Declaration {
	name: string
}

interface Func extends Declaration {
	parameter: Parameter[]
	name: string
	typeReturn?: Type
	instruction: Instruction
}

interface Parameter extends Variable{
}

interface SensorDistance extends Sensor {
}

interface SensorTime extends Sensor {
}

interface Bool extends Type {
}

interface Real extends Type {
	unit?: Unit
}

interface Loop extends Instruction {
	booleanexpr: BooleanExpr
	instruction: Instruction
}

interface Condition extends Instruction {
	booleanexpr: BooleanExpr
	if: Instruction
	else?: Instruction
}

interface Call extends Instruction {
	parameters: Expression[]
	fonction?: @Func
}

interface Assignment extends Instruction {
	expression?: Expression
	variable?: @Variable
}

interface Return extends Instruction {
	expression?: Expression
}

interface Block extends Instruction {
	declarations: Declaration[]
	instructions: Instruction[]
}

interface Forward extends Movement {
}

interface Movement extends Instruction {
	parameter: Expression
}

interface Rotate extends Movement {
}

interface Left extends Movement {
}

interface Backward extends Movement {
}

interface Right extends Movement {
}

interface Speed extends Instruction {
	parameter?: Expression
}

interface Not extends Expression, BooleanExpr {
	expression: BooleanExpr
}

interface BinaryBool extends Expression, BooleanExpr {
	operation?: BoolOperation
	expressionL: Expression
	expressionR: Expression
}

interface CallExpr extends Expression {
	parameters: Expression[]
	fonction?: @Func
}

interface VarExpr extends Expression {
	variableRef?: @Variable
}

interface Negative extends ArithmeticExpr {
	expression: Expression
}

interface ArithmeticExpr extends Expression {
}

interface BinaryArithmetic extends ArithmeticExpr {
	operation?: ArithmeticOperation
	expressionL: Expression
	expressionR: Expression
}

interface SensorExpr extends Expression {
	sensor?: @Sensor
}

interface NumeralExpr extends Expression {
	value: number
}

interface TrueExpr extends BooleanExpr {
}

interface FalseExpr extends BooleanExpr {
}


