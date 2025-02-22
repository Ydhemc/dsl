grammar RobotML
import 'Terminals'
import 'roboML-types'

entry RobotProgram returns RobotProgram: 
    {RobotProgram} (declarations+=Declaration  )* (instructions+=Instruction)*
;

Declaration returns Declaration:
    (Func) |
    (( Variable | Sensor ) ';')
;

Instruction returns Instruction:
    ((Call | Assignment | Return | Forward | Rotate | Left | Backward | Right | Speed ) ';' )
    | (Block | Loop | Condition)
;

Expression returns Expression:
     ArithmeticExpr
    | BooleanExpr 
;

BooleanExpr returns BooleanExpr:
    FactorBool ({BinaryBool.expressionL=current} operation=(BoolOperation_AND | BoolOperation_OR) expressionR=FactorBool)*
    | {BinaryBool}  expressionL=ArithmeticExpr operation=BoolOperation_INF expressionR=ArithmeticExpr
    | {BinaryBool}  expressionL=ArithmeticExpr operation=BoolOperation_INF_EQ expressionR=ArithmeticExpr
    | {BinaryBool}  expressionL=ArithmeticExpr operation=BoolOperation_SUP expressionR=ArithmeticExpr
    | {BinaryBool}  expressionL=ArithmeticExpr operation=BoolOperation_SUP_EQ expressionR=ArithmeticExpr
    | {BinaryBool}  expressionL=ArithmeticExpr operation=BoolOperation_EQ expressionR=ArithmeticExpr
    | {BinaryBool}  expressionL=ArithmeticExpr operation=BoolOperation_NEQ expressionR=ArithmeticExpr
;

FactorBool returns BooleanExpr:
    PrimaryBool | Not
;

PrimaryBool returns BooleanExpr:
    TrueExpr | FalseExpr | VarExpr | CallExpr | '(' BooleanExpr ')' | SensorExpr
;

ArithmeticExpr returns Expression:
    FactorAri ({BinaryArithmetic.expressionL=current} operation=(ArithmeticOperation_ADD | ArithmeticOperation_SUB) expressionR=FactorAri)*
;

FactorAri returns Expression:
    PrimaryAri ({BinaryArithmetic.expressionL=current} operation=(ArithmeticOperation_MULT | ArithmeticOperation_DIV) expressionR=PrimaryAri)*
;

PrimaryAri returns Expression:
    Negative | NumeralExpr | VarExpr | CallExpr | '(' ArithmeticExpr ')' | SensorExpr
;

Type returns Type:
    Bool | Real 
;

Sensor returns Sensor:
    SensorDistance | SensorTime 
;

Func returns Func:
    {Func} (typeReturn=Type)? name=EString '(' ( parameter+=Parameter ("," parameter+=Parameter )* )? ')' instruction=Instruction  
;

Variable returns Variable:
    {Variable} 'var' ^type=Type  name=EString
;

SensorDistance returns SensorDistance:
    {SensorDistance} 'SensorDistance' name=EString   
;

SensorTime returns SensorTime:
    {SensorTime} 'SensorTime' name=EString   
;

Parameter returns Variable:
    {Variable} ^type=Type name=EString
;

EString returns string:
    STRING | ID 
;

Bool returns Bool:
    {Bool} 'bool'  
;

Real returns Real:
    {Real} 'real' ':'  unit=Unit
;

Unit returns Unit:
    Unit_MM | Unit_KM | Unit_CM | Unit_M | Unit_DM | Unit_HM | Unit_DAM | Unit_RAD
;

Unit_MM returns Unit_MM: 'mm' ;
Unit_KM returns Unit_KM: 'km' ;
Unit_CM returns Unit_CM: 'cm' ;
Unit_M returns Unit_M: 'm' ;
Unit_DM returns Unit_DM: 'dm' ;
Unit_HM returns Unit_HM: 'hm' ;
Unit_DAM returns Unit_DAM: 'dam' ;
Unit_RAD returns Unit_RAD: 'rad' ;

Loop returns Loop:
    {Loop} 'loop' '(' booleanexpr=BooleanExpr ')' instruction=Instruction  
;

Condition returns Condition:
    {Condition} 'if' '(' booleanexpr=BooleanExpr ')' ifInstr=Instruction   ('else' elseInstr=Instruction  )?  
;

Call returns Call:
    {Call} fonction=[Func:EString ] '(' ( parameters+=Expression ("," parameters+=Expression )*  )?  ')'
;

Assignment returns Assignment:
    {Assignment} variable=[Variable:EString ] '=' expression=Expression
;

Return returns Return:
    {Return} 'return' ( expression=Expression )?
;

Block returns Block:
    {Block} '{' (declarations+=Declaration  )* (instructions+=Instruction)* '}'  
;

Forward returns Forward:
    {Forward} 'Forward' parameter=Expression
;

Rotate returns Rotate:
    {Rotate} 'Rotate' parameter=Expression  
;

Left returns Left:
    {Left} 'Left' parameter=Expression 
;

Backward returns Backward:
    {Backward} 'Backward' parameter=Expression
;

Right returns Right:
    {Right} 'Right' parameter=Expression
;

Speed returns Speed:
    {Speed} 'Speed' parameter=Expression 
;

Not returns Not:
    '!' expression=BooleanExpr  
;

BoolOperation returns BoolOperation:
    BoolOperation_INF | BoolOperation_SUP | BoolOperation_INF_EQ | BoolOperation_EQ | BoolOperation_SUP_EQ | BoolOperation_NEQ | BoolOperation_OR | BoolOperation_AND
;
BoolOperation_INF returns BoolOperation_INF: '<' ;
BoolOperation_SUP returns BoolOperation_SUP: '>' ;
BoolOperation_INF_EQ returns BoolOperation_INF_EQ: '<=' ;
BoolOperation_EQ returns BoolOperation_EQ: '==' ;
BoolOperation_SUP_EQ returns BoolOperation_SUP_EQ: '>=' ;
BoolOperation_NEQ returns BoolOperation_NEQ: '!=' ;
BoolOperation_OR returns BoolOperation_OR: '||' ;
BoolOperation_AND returns BoolOperation_AND: '&&' ;

CallExpr returns CallExpr:
    {CallExpr}  fonction=[Func:EString ] '(' ( parameters+=Expression  ("," parameters+=Expression  )*  )?  ')'
;

VarExpr returns VarExpr:
    {VarExpr} variableRef=[Variable:EString ]
;

Negative returns Negative:
    {Negative} '-' expression=PrimaryAri   
;

SensorExpr returns SensorExpr:
    {SensorExpr} sensor=[Sensor:EString ]  
;

ArithmeticOperation_ADD returns ArithmeticOperation_ADD: '+' ;
ArithmeticOperation_SUB returns ArithmeticOperation_SUB: '-' ;
ArithmeticOperation_DIV returns ArithmeticOperation_DIV: '/' ;
ArithmeticOperation_MULT returns ArithmeticOperation_MULT: '*' ;


TrueExpr returns TrueExpr:
    {TrueExpr} 'true'
;

FalseExpr returns FalseExpr:
    {FalseExpr} 'false'
;

NumeralExpr returns NumeralExpr:
    {NumeralExpr} value=INT
;






