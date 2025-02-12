grammar MyDsl
import 'Terminals'
import 'roboML-types'

entry RobotProgram returns RobotProgram:
    {RobotProgram} 'RobotProgram' '{' ('declaration' '{' declaration+=Declaration  ("," declaration+=Declaration  )* '}' )? ('instruction' '{' instruction+=Instruction  ("," instruction+=Instruction  )* '}' )? ('expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' )? '}'  
;

Declaration returns Declaration:
    Fonction | Variable | Sensor_Impl | SensorDistance | SensorTime 
;

Instruction returns Instruction:
    Loop | Condition | Call | Assignment | return | Block | Forward | Rotate | Left | Backward | Right | Speed 
;

Expression returns Expression:
    CallExpr | VarExpr | Negative | BinaryArithmetic | Not | BinaryBool | SensorExpr 
;

Type returns Type:
    Type_Impl | Bool | Real 
;

BooleanExpr returns BooleanExpr:
    Not | BinaryBool 
;

Sensor returns Sensor:
    Sensor_Impl | SensorDistance | SensorTime 
;

Fonction returns Fonction:
    {Fonction} 'Fonction' name=EString  '{' ('parameter' '(' parameter+=[Parameter:EString ] ("," parameter+=[Parameter:EString ] )* ')' )? ('typeReturn' typeReturn=[Type:EString ] )? '}'  
;

Variable returns Variable:
    {Variable} 'Variable' name=EString  '{' ('type' ^type=[Type:EString ] )? '}'  
;

Sensor_Impl returns Sensor:
    {Sensor} 'Sensor' name=EString   
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

Type_Impl returns Type:
    {Type} 'Type'  
;

Bool returns Bool:
    {Bool} 'Bool'  
;

Real returns Real:
    {Real} 'Real' '{' ('unit' unit=Unit  )? '}'  
;

Unit returns Unit:
    Unit_MM | Unit_KM | Unit_CM | Unit_M | Unit_DM | Unit_HM | Unit_DAM | Unit_RAD
;
Unit_MM returns Unit_MM: 'MM' ;
Unit_KM returns Unit_KM: 'KM' ;
Unit_CM returns Unit_CM: 'CM' ;
Unit_M returns Unit_M: 'M' ;
Unit_DM returns Unit_DM: 'DM' ;
Unit_HM returns Unit_HM: 'HM' ;
Unit_DAM returns Unit_DAM: 'DAM' ;
Unit_RAD returns Unit_RAD: 'RAD' ;

Loop returns Loop:
    {Loop} 'Loop' '{' ('booleanexpr' booleanexpr=BooleanExpr  )? ('instruction' '{' instruction+=Instruction  ("," instruction+=Instruction  )* '}' )? '}'  
;

Condition returns Condition:
    {Condition} 'Condition' '{' ('booleanexpr' booleanexpr=BooleanExpr  )? ('if' if=Instruction  )? ('else' else=Instruction  )? '}'  
;

Call returns Call:
    {Call} 'Call' '{' ('parameters' '(' parameters+=[Expression:EString ] ("," parameters+=[Expression:EString ] )* ')' )? ('fonction' fonction=[Fonction:EString ] )? '}'  
;

Assignment returns Assignment:
    {Assignment} 'Assignment' '{' ('variable' variable=[Variable:EString ] )? ('expression' expression=Expression  )? '}'  
;

return returns return:
    {return} 'return' '{' ('expression' expression=[Expression:EString ] )? '}'  
;

Block returns Block:
    {Block} 'Block' '{' ('instruction' '{' instruction+=Instruction  ("," instruction+=Instruction  )* '}' )? '}'  
;

Forward returns Forward:
    {Forward} 'Forward' '{' ('parameters' parameters=Expression  )? '}'  
;

Rotate returns Rotate:
    {Rotate} 'Rotate' '{' ('parameters' parameters=Expression  )? '}'  
;

Left returns Left:
    {Left} 'Left' '{' ('parameters' parameters=Expression  )? '}'  
;

Backward returns Backward:
    {Backward} 'Backward' '{' ('parameters' parameters=Expression  )? '}'  
;

Right returns Right:
    {Right} 'Right' '{' ('parameters' parameters=Expression  )? '}'  
;

Speed returns Speed:
    {Speed} 'Speed' '{' ('parameters' parameters=Expression  )? '}'  
;

Not returns Not:
    'Not' '{' ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? 'expression' expression=Expression  '}'  
;

BinaryBool returns BinaryBool:
    'BinaryBool' '{' ('operation' operation=BoolOperation  )? ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? 'expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' '}'  
;

BoolOperation returns BoolOperation:
    BoolOperation_INF | BoolOperation_SUP | BoolOperation_INF_EQ | BoolOperation_EQ | BoolOperation_SUP_EQ | BoolOperation_NEQ | BoolOperation_OR | BoolOperation_AND
;
BoolOperation_INF returns BoolOperation_INF: 'INF' ;
BoolOperation_SUP returns BoolOperation_SUP: 'SUP' ;
BoolOperation_INF_EQ returns BoolOperation_INF_EQ: 'INF_EQ' ;
BoolOperation_EQ returns BoolOperation_EQ: 'EQ' ;
BoolOperation_SUP_EQ returns BoolOperation_SUP_EQ: 'SUP_EQ' ;
BoolOperation_NEQ returns BoolOperation_NEQ: 'NEQ' ;
BoolOperation_OR returns BoolOperation_OR: 'OR' ;
BoolOperation_AND returns BoolOperation_AND: 'AND' ;

CallExpr returns CallExpr:
    {CallExpr} 'CallExpr' '{' ('fonction' fonction=[Fonction:EString ] )? ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? ('parameters' '{' parameters+=Expression  ("," parameters+=Expression  )* '}' )? '}'  
;

VarExpr returns VarExpr:
    {VarExpr} 'VarExpr' '{' ('variableRef' variableRef=[Variable:EString ] )? ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? '}'  
;

Negative returns Negative:
    'Negative' '{' ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? 'expression' expression=Expression  '}'  
;

BinaryArithmetic returns BinaryArithmetic:
    'BinaryArithmetic' '{' ('operation' operation=ArithmeticOperation  )? ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? 'expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' '}'  
;

SensorExpr returns SensorExpr:
    {SensorExpr} 'SensorExpr' '{' ('sensor' sensor=[Sensor:EString ] )? ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? '}'  
;

ArithmeticOperation returns ArithmeticOperation:
    ArithmeticOperation_ADD | ArithmeticOperation_SUB | ArithmeticOperation_DIV | ArithmeticOperation_MULT
;
ArithmeticOperation_ADD returns ArithmeticOperation_ADD: 'ADD' ;
ArithmeticOperation_SUB returns ArithmeticOperation_SUB: 'SUB' ;
ArithmeticOperation_DIV returns ArithmeticOperation_DIV: 'DIV' ;
ArithmeticOperation_MULT returns ArithmeticOperation_MULT: 'MULT' ;

