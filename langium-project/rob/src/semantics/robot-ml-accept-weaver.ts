import type { ValidationAcceptor, ValidationChecks } from 'langium';
import type { RobotMLAstType } from '../language/generated/ast.js';
import * as InterfaceAST from '../language/generated/ast.js';
import * as ClassAST from './robot-ml-visitor.js';
import { RobotMLVisitor } from './robot-ml-visitor.js';
import type { RobotMLServices } from '../language/robot-ml-module.js';

/**
 * Register custom validation checks.
 * TODO : Call this function in the language module.ts file (see registerValidationChecks(...);)
 */
export function weaveAcceptMethods(services: RobotMLServices) {
    const registry = services.validation.ValidationRegistry;
    const weaver = services.validation.RobotMLAcceptWeaver
    registry.register(weaver.checks, weaver);
}

export class RobotMLAcceptWeaver {
    
    checks: ValidationChecks<RobotMLAstType> = {
        Func: this.weaveFunc,
        SensorDistance: this.weaveSensorDistance,
        SensorTime: this.weaveSensorTime,
        Parameter: this.weaveParameter,
        BinaryArithmetic: this.weaveBinaryArithmetic,
        Negative: this.weaveNegative,
        BinaryBool: this.weaveBinaryBool,
        Not: this.weaveNot,
        FalseExpr: this.weaveFalseExpr,
        TrueExpr: this.weaveTrueExpr,
        CallExpr: this.weaveCallExpr,
        NumeralExpr: this.weaveNumeralExpr,
        SensorExpr: this.weaveSensorExpr,
        VarExpr: this.weaveVarExpr,
        Assignment: this.weaveAssignment,
        Block: this.weaveBlock,
        Call: this.weaveCall,
        Condition: this.weaveCondition,
        Loop: this.weaveLoop,
        Backward: this.weaveBackward,
        Forward: this.weaveForward,
        Left: this.weaveLeft,
        Right: this.weaveRight,
        Rotate: this.weaveRotate,
        Return: this.weaveReturn,
        Speed: this.weaveSpeed,
        RobotProgram: this.weaveRobotProgram,
        Bool: this.weaveBool,
        Real: this.weaveReal
    };

    
    weaveFunc(node : InterfaceAST.Func, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitFunc(node as unknown as ClassAST.Func); }
    }
    
    weaveSensorDistance(node : InterfaceAST.SensorDistance, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitSensorDistance(node as unknown as ClassAST.SensorDistance); }
    }
    
    weaveSensorTime(node : InterfaceAST.SensorTime, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitSensorTime(node as unknown as ClassAST.SensorTime); }
    }
    
    weaveParameter(node : InterfaceAST.Parameter, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitParameter(node as unknown as ClassAST.Parameter); }
    }
    
    weaveBinaryArithmetic(node : InterfaceAST.BinaryArithmetic, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitBinaryArithmetic(node as unknown as ClassAST.BinaryArithmetic); }
    }
    
    weaveNegative(node : InterfaceAST.Negative, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitNegative(node as unknown as ClassAST.Negative); }
    }
    
    weaveBinaryBool(node : InterfaceAST.BinaryBool, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitBinaryBool(node as unknown as ClassAST.BinaryBool); }
    }
    
    weaveNot(node : InterfaceAST.Not, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitNot(node as unknown as ClassAST.Not); }
    }
    
    weaveFalseExpr(node : InterfaceAST.FalseExpr, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitFalseExpr(node as unknown as ClassAST.FalseExpr); }
    }
    
    weaveTrueExpr(node : InterfaceAST.TrueExpr, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitTrueExpr(node as unknown as ClassAST.TrueExpr); }
    }
    
    weaveCallExpr(node : InterfaceAST.CallExpr, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitCallExpr(node as unknown as ClassAST.CallExpr); }
    }
    
    weaveNumeralExpr(node : InterfaceAST.NumeralExpr, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitNumeralExpr(node as unknown as ClassAST.NumeralExpr); }
    }
    
    weaveSensorExpr(node : InterfaceAST.SensorExpr, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitSensorExpr(node as unknown as ClassAST.SensorExpr); }
    }
    
    weaveVarExpr(node : InterfaceAST.VarExpr, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitVarExpr(node as unknown as ClassAST.VarExpr); }
    }
    
    weaveAssignment(node : InterfaceAST.Assignment, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitAssignment(node as unknown as ClassAST.Assignment); }
    }
    
    weaveBlock(node : InterfaceAST.Block, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitBlock(node as unknown as ClassAST.Block); }
    }
    
    weaveCall(node : InterfaceAST.Call, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitCall(node as unknown as ClassAST.Call); }
    }
    
    weaveCondition(node : InterfaceAST.Condition, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitCondition(node as unknown as ClassAST.Condition); }
    }
    
    weaveLoop(node : InterfaceAST.Loop, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitLoop(node as unknown as ClassAST.Loop); }
    }
    
    weaveBackward(node : InterfaceAST.Backward, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitBackward(node as unknown as ClassAST.Backward); }
    }
    
    weaveForward(node : InterfaceAST.Forward, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitForward(node as unknown as ClassAST.Forward); }
    }
    
    weaveLeft(node : InterfaceAST.Left, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitLeft(node as unknown as ClassAST.Left); }
    }
    
    weaveRight(node : InterfaceAST.Right, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitRight(node as unknown as ClassAST.Right); }
    }
    
    weaveRotate(node : InterfaceAST.Rotate, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitRotate(node as unknown as ClassAST.Rotate); }
    }
    
    weaveReturn(node : InterfaceAST.Return, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitReturn(node as unknown as ClassAST.Return); }
    }
    
    weaveSpeed(node : InterfaceAST.Speed, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitSpeed(node as unknown as ClassAST.Speed); }
    }
    
    weaveRobotProgram(node : InterfaceAST.RobotProgram, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitRobotProgram(node as unknown as ClassAST.RobotProgram); }
    }
    
    weaveBool(node : InterfaceAST.Bool, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitBool(node as unknown as ClassAST.Bool); }
    }
    
    weaveReal(node : InterfaceAST.Real, accept : ValidationAcceptor) : void {
        (<any> node).accept = (visitor: RobotMLVisitor) => { return visitor.visitReal(node as unknown as ClassAST.Real); }
    }
    
}