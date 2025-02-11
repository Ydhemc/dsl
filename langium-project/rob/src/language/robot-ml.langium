grammar MyDsl
import 'Terminals'
import 'roboML-types'
import 'XMLType-types'

entry Type returns Type:
    Type_Impl | Bool | Real 
;

Expression returns Expression:
    CallExpr | VarExpr | Negative | BinaryArithmetic | Not | BinaryBool | SensorExpr 
;

Sensor returns Sensor:
    Sensor_Impl | SensorDistance | SensorTime 
;

Variable returns Variable:
    {Variable} 'Variable' '{' ('name' name=String0  )? ('type' ^type=[Type:EString ] )? '}'  
;

Negative returns Negative:
    'Negative' '{' ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? 'expression' expression=Expression  '}'  
;

BinaryArithmetic returns BinaryArithmetic:
    'BinaryArithmetic' '{' ('operation' operation=ArithmeticOperation  )? ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? 'expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' '}'  
;

Type_Impl returns Type:
    {Type} 'Type'  
;

String0 returns TString:
    'String' 
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

CallExpr returns CallExpr:
    {CallExpr} 'CallExpr' '{' ('fonction' fonction=[Fonction:EString ] )? ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? ('parameters' '{' parameters+=Expression  ("," parameters+=Expression  )* '}' )? '}'  
;

VarExpr returns VarExpr:
    {VarExpr} 'VarExpr' '{' ('variableRef' variableRef=[Variable:EString ] )? ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? '}'  
;

Not returns Not:
    'Not' '{' ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? 'expression' expression=Expression  '}'  
;

BinaryBool returns BinaryBool:
    'BinaryBool' '{' ('operation' operation=BoolOperation  )? ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? 'expression' '{' expression+=Expression  ("," expression+=Expression  )* '}' '}'  
;

SensorExpr returns SensorExpr:
    {SensorExpr} 'SensorExpr' '{' ('sensor' sensor=[Sensor:EString ] )? ('variable' '{' variable+=Variable  ("," variable+=Variable  )* '}' )? '}'  
;

Fonction returns Fonction:
    {Fonction} 'Fonction' '{' ('name' name=String0  )? ('parameter' '(' parameter+=[Parameter:EString ] ("," parameter+=[Parameter:EString ] )* ')' )? ('typeReturn' typeReturn=[Type:EString ] )? '}'  
;

Parameter returns Parameter:
    {Parameter} 'Parameter' '{' ('name' name=String0  )? ('type' ^type=[Type:EString ] )? '}'  
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

Sensor_Impl returns Sensor:
    {Sensor} 'Sensor' '{' ('name' name=String0  )? '}'  
;

SensorDistance returns SensorDistance:
    {SensorDistance} 'SensorDistance' '{' ('name' name=String0  )? '}'  
;

SensorTime returns SensorTime:
    {SensorTime} 'SensorTime' '{' ('name' name=String0  )? '}'  
;

ArithmeticOperation returns ArithmeticOperation:
    ArithmeticOperation_ADD | ArithmeticOperation_SUB | ArithmeticOperation_DIV | ArithmeticOperation_MULT
;
ArithmeticOperation_ADD returns ArithmeticOperation_ADD: 'ADD' ;
ArithmeticOperation_SUB returns ArithmeticOperation_SUB: 'SUB' ;
ArithmeticOperation_DIV returns ArithmeticOperation_DIV: 'DIV' ;
ArithmeticOperation_MULT returns ArithmeticOperation_MULT: 'MULT' ;

EString returns string:
    STRING | ID 
;

