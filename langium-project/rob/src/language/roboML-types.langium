import 'XMLType-types'

type ArithmeticOperation = ArithmeticOperation_ADD | ArithmeticOperation_SUB | ArithmeticOperation_DIV | ArithmeticOperation_MULT;
type ArithmeticOperation_ADD = 'ADD';
type ArithmeticOperation_SUB = 'SUB';
type ArithmeticOperation_DIV = 'DIV';
type ArithmeticOperation_MULT = 'MULT';

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

interface Type {
}

interface Expression {
	variable: Variable[]
}

interface Variable extends Declaration {
	^type?: @Type
	name?: TString
}

interface Declaration {
}

interface Sensor extends Declaration {
	name?: TString
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

interface Bool extends Type {
}

interface Real extends Type {
	unit?: Unit
}

interface CallExpr extends Expression {
	parameters: Expression[]
	fonction?: @Fonction
}

interface Fonction extends Declaration {
	parameter: @Parameter[]
	name?: TString
	typeReturn?: @Type
}

interface Parameter {
	^type?: @Type
	name?: TString
}

interface VarExpr extends Expression {
	variableRef?: @Variable
}

interface Not extends Expression {
	expression: Expression
}

interface BinaryBool extends Expression {
	operation?: BoolOperation
	expression: Expression[]
}

interface SensorExpr extends Expression {
	sensor?: @Sensor
}

interface SensorDistance extends Sensor {
}

interface SensorTime extends Sensor {
}

