grammar RobotML
import 'Terminals'
import 'roboML-types'

entry RobotProgram returns RobotProgram: 
    {RobotProgram} (declaration+=Declaration  ( declaration+=Declaration  )*)? (instruction+=Instruction  (";" instruction+=Instruction  )*)?
;

Declaration returns Declaration:
    Func | Variable | Sensor 
;

Instruction returns Instruction:
    Loop | Condition | Call | Assignment | Return | Block | Forward | Rotate | Left | Backward | Right | Speed 
;

Expression returns Expression:
     ArithmeticExpr
    | BooleanExpr 
;

BooleanExpr returns BooleanExpr:
    {BinaryBool}  expressionL=FactorBool operation=BoolOperation_AND expressionR=BooleanExpr
    | {BinaryBool}  expressionL=FactorBool operation=BoolOperation_OR expressionR=BooleanExpr
    | {BinaryBool}  expressionL=ArithmeticExpr operation=BoolOperation_INF expressionR=ArithmeticExpr
    | {BinaryBool}  expressionL=ArithmeticExpr operation=BoolOperation_INF_EQ expressionR=ArithmeticExpr
    | {BinaryBool}  expressionL=ArithmeticExpr operation=BoolOperation_SUP expressionR=ArithmeticExpr
    | {BinaryBool}  expressionL=ArithmeticExpr operation=BoolOperation_SUP_EQ expressionR=ArithmeticExpr
    | {BinaryBool}  expressionL=ArithmeticExpr operation=BoolOperation_EQ expressionR=ArithmeticExpr
    | {BinaryBool}  expressionL=ArithmeticExpr operation=BoolOperation_NEQ expressionR=ArithmeticExpr
    | Not
    | FactorBool
;

FactorBool returns BooleanExpr:
    PrimaryBool
;

PrimaryBool returns BooleanExpr:
    True | False | VarExpr | CallExpr | '(' BooleanExpr ')' | SensorExpr
;

ArithmeticExpr returns Expression:
    {BinaryArithmetic}  expressionL=FactorAri operation=ArithmeticOperation_ADD expressionR=ArithmeticExpr
    | {BinaryArithmetic}  expressionL=FactorAri operation=ArithmeticOperation_SUB expressionR=ArithmeticExpr
    | FactorAri
;

FactorAri returns Expression:
    {BinaryArithmetic}  expressionL=PrimaryAri operation=ArithmeticOperation_MULT expressionR=ArithmeticExpr
    | {BinaryArithmetic}  expressionL=PrimaryAri operation=ArithmeticOperation_DIV expressionR=ArithmeticExpr
    | PrimaryAri
;

PrimaryAri returns Expression:
    Negative | NumeralExpr | VarExpr | CallExpr | '(' ArithmeticExpr ')' | SensorExpr
;

Type returns Type:
    Bool | Real 
;

// BooleanExpr returns BooleanExpr:
//     Not | BinaryBool 
// ;

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

Parameter returns Parameter:
    {Parameter} 'Parameter' name=EString  '{' ('type' ^type=[Type:EString ] )? '}'  
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
    {Condition} 'if' '(' booleanexpr=BooleanExpr ')' if=Instruction   ('else' else=Instruction  )?  
;

Call returns Call:
    {Call} fonction=[Func:EString ] '(' ( parameters+=Expression ("," parameters+=Expression )*  )?  ')'
;

Assignment returns Assignment:
    {Assignment} ('variable' variable=[Variable:EString ] ) '=' (expression=Expression  )
;

Return returns Return:
    {Return} 'return' ( expression=[Expression:EString ] )?
;

Block returns Block:
    {Block} '{' ( instruction+=Instruction  (';' instruction+=Instruction  )* )? '}'  
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
    'Not' expression=BooleanExpr  
;


// BinaryBool returns BinaryBool:
//     'BinaryBool' '{' ('operation' operation=BoolOperation  )? ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? 'expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' '}'  
// ;

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
    {Negative} '-' expression=ArithmeticExpr   
;

// BinaryArithmetic returns BinaryArithmetic:
//     {BinaryArithmetic}  expressionL=Expression (operation=ArithmeticOperation) expressionR=Expression
// ;

SensorExpr returns SensorExpr:
    {SensorExpr} sensor=[Sensor:EString ]  
;

// ArithmeticOperation returns ArithmeticOperation:
//     ArithmeticOperation_ADD | ArithmeticOperation_SUB | ArithmeticOperation_DIV | ArithmeticOperation_MULT
// ;

ArithmeticOperation_ADD returns ArithmeticOperation_ADD: '+' ;
ArithmeticOperation_SUB returns ArithmeticOperation_SUB: '-' ;
ArithmeticOperation_DIV returns ArithmeticOperation_DIV: '/' ;
ArithmeticOperation_MULT returns ArithmeticOperation_MULT: '*' ;


True returns True:
    {True} 'true'
;

False returns False:
    {False} 'False'
;

NumeralExpr returns NumeralExpr:
    {NumeralExpr} value=INT
;






