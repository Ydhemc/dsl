
type Unit = Unit_MM | Unit_KM | Unit_CM | Unit_M | Unit_DM | Unit_HM | Unit_DAM | Unit_RAD;
type Unit_MM = 'MM';
type Unit_KM = 'KM';
type Unit_CM = 'CM';
type Unit_M = 'M';
type Unit_DM = 'DM';
type Unit_HM = 'HM';
type Unit_DAM = 'DAM';
type Unit_RAD = 'RAD';

type BoolOperation = BoolOperation_INF | BoolOperation_SUP | BoolOperation_INF_EQ | BoolOperation_EQ | BoolOperation_SUP_EQ | BoolOperation_NEQ | BoolOperation_OR | BoolOperation_AND;
type BoolOperation_INF = 'INF';
type BoolOperation_SUP = 'SUP';
type BoolOperation_INF_EQ = 'INF_EQ';
type BoolOperation_EQ = 'EQ';
type BoolOperation_SUP_EQ = 'SUP_EQ';
type BoolOperation_NEQ = 'NEQ';
type BoolOperation_OR = 'OR';
type BoolOperation_AND = 'AND';

type ArithmeticOperation = ArithmeticOperation_ADD | ArithmeticOperation_SUB | ArithmeticOperation_DIV | ArithmeticOperation_MULT;
type ArithmeticOperation_ADD = 'ADD';
type ArithmeticOperation_SUB = 'SUB';
type ArithmeticOperation_DIV = 'DIV';
type ArithmeticOperation_MULT = 'MULT';

interface RobotProgram {
	declaration: Declaration[]
	instruction: Instruction[]
	expression: Expression[]
}

interface Declaration {
}

interface Instruction {
}

interface Expression {
	variable: Variable[]
}

interface Variable extends Declaration {
	^type?: @Type
	name?: string
}

interface Type {
}

interface BooleanExpr extends Expression {
}

interface Sensor extends Declaration {
	name?: string
}

interface Fonction extends Declaration {
	parameter: @Parameter[]
	name?: string
	typeReturn?: @Type
}

interface Parameter {
	^type?: @Type
	name?: string
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
	booleanexpr?: BooleanExpr
	instruction: Instruction[]
}

interface Condition extends Instruction {
	booleanexpr?: BooleanExpr
	if?: Instruction
	else?: Instruction
}

interface Call extends Instruction {
	parameters: @Expression[]
	fonction?: @Fonction
}

interface Assignment extends Instruction {
	expression?: Expression
	variable?: @Variable
}

interface return extends Instruction {
	expression?: @Expression
}

interface Block extends Instruction {
	instruction: Instruction[]
}

interface Forward extends Movement {
}

interface Movement extends Instruction {
	parameters?: Expression
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
	parameters?: Expression
}

interface Not extends Expression, BooleanExpr {
	expression: Expression
}

interface BinaryBool extends Expression, BooleanExpr {
	operation?: BoolOperation
	expression: Expression[]
}

interface CallExpr extends Expression {
	parameters: Expression[]
	fonction?: @Fonction
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
	expression: Expression[]
}

interface SensorExpr extends Expression {
	sensor?: @Sensor
}

