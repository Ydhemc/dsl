
import * as ASTInterfaces from '../language/generated/ast.js';
import { Reference } from 'langium';

export interface RobotMLVisitor {
    visitDeclaration(node : Declaration) : any;
    visitFunc(node : Func) : any;
    visitSensor(node : Sensor) : any;
    visitSensorDistance(node : SensorDistance) : any;
    visitSensorTime(node : SensorTime) : any;
    visitVariable(node : Variable) : any;
    visitExpression(node : Expression) : any;
    visitArithmeticExpr(node : ArithmeticExpr) : any;
    visitBinaryArithmetic(node : BinaryArithmetic) : any;
    visitNegative(node : Negative) : any;
    visitBinaryBool(node : BinaryBool) : any;
    visitBooleanExpr(node : BooleanExpr) : any;
    visitNot(node : Not) : any;
    visitFalseExpr(node : FalseExpr) : any;
    visitTrueExpr(node : TrueExpr) : any;
    visitCallExpr(node : CallExpr) : any;
    visitNumeralExpr(node : NumeralExpr) : any;
    visitSensorExpr(node : SensorExpr) : any;
    visitVarExpr(node : VarExpr) : any;
    visitInstruction(node : Instruction) : any;
    visitAssignment(node : Assignment) : any;
    visitBlock(node : Block) : any;
    visitCall(node : Call) : any;
    visitCondition(node : Condition) : any;
    visitLoop(node : Loop) : any;
    visitMovement(node : Movement) : any;
    visitBackward(node : Backward) : any;
    visitForward(node : Forward) : any;
    visitLeft(node : Left) : any;
    visitRight(node : Right) : any;
    visitRotate(node : Rotate) : any;
    visitReturn(node : Return) : any;
    visitSpeed(node : Speed) : any;
    visitRobotProgram(node : RobotProgram) : any;
    visitType(node : Type) : any;
    visitBool(node : Bool) : any;
    visitReal(node : Real) : any;
}


export class Declaration implements ASTInterfaces.Declaration {
    
    constructor(public $type: 'Declaration' | 'Func' | 'Sensor' | 'SensorDistance' | 'SensorTime' | 'Variable') {
    }
    
     accept(visitor: RobotMLVisitor) : any {
    }
}

export class Func extends Declaration implements ASTInterfaces.Func {
    
    constructor(public override $type: 'Func', public parameter: Variable[], public name: string, public typeReturn: Type, public instruction: Instruction) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitFunc(this);
    }
}

export class Sensor extends Declaration implements ASTInterfaces.Sensor {
    
    constructor(public override $type: 'Sensor' | 'SensorDistance' | 'SensorTime', public name: string) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
    }
}

export class SensorDistance extends Sensor implements ASTInterfaces.SensorDistance {
    
    constructor(public override $type: 'SensorDistance', public override name: string) {
        super($type, name);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitSensorDistance(this);
    }
}

export class SensorTime extends Sensor implements ASTInterfaces.SensorTime {
    
    constructor(public override $type: 'SensorTime', public override name: string) {
        super($type, name);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitSensorTime(this);
    }
}

export class Variable extends Declaration implements ASTInterfaces.Variable {
    
    constructor(public override $type: 'Variable', public $container: Func, public type: Type, public name: string) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitVariable(this);
    }
}

export class Expression implements ASTInterfaces.Expression {
    
    constructor(public $type: 'Expression' | 'ArithmeticExpr' | 'BinaryArithmetic' | 'Negative' | 'BinaryBool' | 'BooleanExpr' | 'Not' | 'FalseExpr' | 'TrueExpr' | 'CallExpr' | 'NumeralExpr' | 'SensorExpr' | 'VarExpr') {
    }
    
     accept(visitor: RobotMLVisitor) : any {
    }
}

export class ArithmeticExpr extends Expression implements ASTInterfaces.ArithmeticExpr {
    
    constructor(public override $type: 'ArithmeticExpr' | 'BinaryArithmetic' | 'Negative') {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
    }
}

export class BinaryArithmetic extends ArithmeticExpr implements ASTInterfaces.BinaryArithmetic {
    
    constructor(public override $type: 'BinaryArithmetic', public operation: ASTInterfaces.ArithmeticOperation, public expressionL: Expression, public expressionR: Expression) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitBinaryArithmetic(this);
    }
}

export class Negative extends ArithmeticExpr implements ASTInterfaces.Negative {
    
    constructor(public override $type: 'Negative', public expression: Expression) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitNegative(this);
    }
}

export class BinaryBool extends Expression implements ASTInterfaces.BinaryBool {
    
    constructor(public override $type: 'BinaryBool', public operation: ASTInterfaces.BoolOperation, public expressionL: Expression, public expressionR: Expression) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitBinaryBool(this);
    }
}

export class BooleanExpr extends Expression implements ASTInterfaces.BooleanExpr {
    
    constructor(public override $type: 'BooleanExpr' | 'Not' | 'FalseExpr' | 'TrueExpr') {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
    }
}

export class Not extends BooleanExpr implements ASTInterfaces.Not {
    
    constructor(public override $type: 'Not', public expression: BooleanExpr) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitNot(this);
    }
}

export class FalseExpr extends BooleanExpr implements ASTInterfaces.FalseExpr {
    
    constructor(public override $type: 'FalseExpr') {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitFalseExpr(this);
    }
}

export class TrueExpr extends BooleanExpr implements ASTInterfaces.TrueExpr {
    
    constructor(public override $type: 'TrueExpr') {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitTrueExpr(this);
    }
}

export class CallExpr extends Expression implements ASTInterfaces.CallExpr {
    
    constructor(public override $type: 'CallExpr', public parameters: Expression[], public fonction: Reference<Func>) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitCallExpr(this);
    }
}

export class NumeralExpr extends Expression implements ASTInterfaces.NumeralExpr {
    
    constructor(public override $type: 'NumeralExpr', public value: number) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitNumeralExpr(this);
    }
}

export class SensorExpr extends Expression implements ASTInterfaces.SensorExpr {
    
    constructor(public override $type: 'SensorExpr', public sensor: Reference<Sensor>) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitSensorExpr(this);
    }
}

export class VarExpr extends Expression implements ASTInterfaces.VarExpr {
    
    constructor(public override $type: 'VarExpr', public variableRef: Reference<Variable>) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitVarExpr(this);
    }
}

export class Instruction implements ASTInterfaces.Instruction {
    
    constructor(public $type: 'Instruction' | 'Assignment' | 'Block' | 'Call' | 'Condition' | 'Loop' | 'Movement' | 'Backward' | 'Forward' | 'Left' | 'Right' | 'Rotate' | 'Return' | 'Speed') {
    }
    
     accept(visitor: RobotMLVisitor) : any {
    }
}

export class Assignment extends Instruction implements ASTInterfaces.Assignment {
    
    constructor(public override $type: 'Assignment', public expression: Expression, public variable: Reference<Variable>) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitAssignment(this);
    }
}

export class Block extends Instruction implements ASTInterfaces.Block {
    
    constructor(public override $type: 'Block', public declarations: Declaration[], public instructions: Instruction[]) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitBlock(this);
    }
}

export class Call extends Instruction implements ASTInterfaces.Call {
    
    constructor(public override $type: 'Call', public parameters: Expression[], public fonction: Reference<Func>) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitCall(this);
    }
}

export class Condition extends Instruction implements ASTInterfaces.Condition {
    
    constructor(public override $type: 'Condition', public booleanexpr: BooleanExpr, public ifInstr: Instruction, public elseInstr: Instruction) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitCondition(this);
    }
}

export class Loop extends Instruction implements ASTInterfaces.Loop {
    
    constructor(public override $type: 'Loop', public booleanexpr: BooleanExpr, public instruction: Instruction) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitLoop(this);
    }
}

export class Movement extends Instruction implements ASTInterfaces.Movement {
    
    constructor(public override $type: 'Movement' | 'Backward' | 'Forward' | 'Left' | 'Right' | 'Rotate', public parameter: Expression) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
    }
}

export class Backward extends Movement implements ASTInterfaces.Backward {
    
    constructor(public override $type: 'Backward', public override parameter: Expression) {
        super($type, parameter);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitBackward(this);
    }
}

export class Forward extends Movement implements ASTInterfaces.Forward {
    
    constructor(public override $type: 'Forward', public override parameter: Expression) {
        super($type, parameter);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitForward(this);
    }
}

export class Left extends Movement implements ASTInterfaces.Left {
    
    constructor(public override $type: 'Left', public override parameter: Expression) {
        super($type, parameter);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitLeft(this);
    }
}

export class Right extends Movement implements ASTInterfaces.Right {
    
    constructor(public override $type: 'Right', public override parameter: Expression) {
        super($type, parameter);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitRight(this);
    }
}

export class Rotate extends Movement implements ASTInterfaces.Rotate {
    
    constructor(public override $type: 'Rotate', public override parameter: Expression) {
        super($type, parameter);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitRotate(this);
    }
}

export class Return extends Instruction implements ASTInterfaces.Return {
    
    constructor(public override $type: 'Return', public expression: Expression) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitReturn(this);
    }
}

export class Speed extends Instruction implements ASTInterfaces.Speed {
    
    constructor(public override $type: 'Speed', public parameter: Expression) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitSpeed(this);
    }
}

export class RobotProgram implements ASTInterfaces.RobotProgram {
    
    constructor(public $type: 'RobotProgram', public declarations: Declaration[], public instructions: Instruction[]) {
    }
    
     accept(visitor: RobotMLVisitor) : any {
        return visitor.visitRobotProgram(this);
    }
}

export class Type implements ASTInterfaces.Type {
    
    constructor(public $type: 'Type' | 'Bool' | 'Real') {
    }
    
     accept(visitor: RobotMLVisitor) : any {
    }
}

export class Bool extends Type implements ASTInterfaces.Bool {
    
    constructor(public override $type: 'Bool') {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitBool(this);
    }
}

export class Real extends Type implements ASTInterfaces.Real {
    
    constructor(public override $type: 'Real', public unit: ASTInterfaces.Unit) {
        super($type);
    }
    
    override accept(visitor: RobotMLVisitor) : any {
        return visitor.visitReal(this);
    }
}
