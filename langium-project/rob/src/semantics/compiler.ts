import { ArithmeticExpr, Assignment, Backward, BinaryArithmetic, BinaryBool, Block, Bool, BooleanExpr, Call, CallExpr, Condition, Declaration, Expression, FalseExpr, Forward, Func, Instruction, Left, Loop, Movement, Negative, Not, NumeralExpr, Parameter, Real, Return, Right, RobotMLVisitor, RobotProgram, Rotate, Sensor, SensorDistance, SensorExpr, SensorTime, Speed, TrueExpr, Type, VarExpr, Variable } from "../semantics/robot-ml-visitor.js";
import { CompositeGeneratorNode, expandToNode, toString } from 'langium/generate';
import * as fs from 'node:fs';
import * as path from 'node:path';
import { extractDestinationAndName } from '../cli/cli-util.js';
import { isBackward, isBool, isForward, isLeft, isMovement, isReal, isRight, isRotate} from "../language/generated/ast.js";

export function generateArduino(model: RobotProgram, filePath: string, destination: string | undefined): string {
    const data = extractDestinationAndName(filePath, destination);
    const generatedFilePath = `${path.join(data.destination, data.name)}.ino`;

    const visitor = new RobotVisitorImpl()
    model.accept(visitor)

    if (!fs.existsSync(data.destination)) {
        fs.mkdirSync(data.destination, { recursive: true });
    }
    fs.writeFileSync(generatedFilePath, toString(visitor.getFileNode()));
    return generatedFilePath;
}


export class RobotVisitorImpl implements RobotMLVisitor {

    declarationNode: CompositeGeneratorNode;
    setupNode: CompositeGeneratorNode;
    loopNode: CompositeGeneratorNode;
    currentType?: Type

    parametre = "";
    para = false;

    public constructor() {
        this.declarationNode = expandToNode``
        this.setupNode = expandToNode``
        this.loopNode = expandToNode``
        this.currentType = undefined
    } 

    public getFileNode(): CompositeGeneratorNode {
        const fileNode = expandToNode`
        #include <PinChangeInt.h>
        #include <PinChangeIntConfig.h>
        #include <EEPROM.h>
        #define _NAMIKI_MOTOR	 //for Namiki 22CL-103501PG80:1
        #include <fuzzy_table.h>
        #include <PID_Beta6.h>
        #include <MotorWheel.h>
        #include <Omni4WD.h>
        `.append(this.declarationNode).append(expandToNode`


        irqISR(irq1, isr1);
        MotorWheel wheel1(3, 2, 4, 5, &irq1);

        irqISR(irq2, isr2);
        MotorWheel wheel2(11, 12, 14, 15, &irq2);

        irqISR(irq3, isr3);
        MotorWheel wheel3(9, 8, 16, 17, &irq3);

        irqISR(irq4, isr4);
        MotorWheel wheel4(10, 7, 18, 19, &irq4);


        Omni4WD Omni(&wheel1, &wheel2, &wheel3, &wheel4);
        bool isDone = false;

        void setup() {
            TCCR1B = TCCR1B & 0xf8 | 0x01; // Pin9,Pin10 PWM 31250Hz
            TCCR2B = TCCR2B & 0xf8 | 0x01; // Pin3,Pin11 PWM 31250Hz
        `).append(this.setupNode)
        .append(expandToNode`
            Omni.PIDEnable(0.31, 0.01, 0, 10);
        }

        void loop() {
            if(!isDone){
            `).append(this.loopNode)
        .append(expandToNode`
            isDone = true;
            } else {
                Omni.setCarStop(0); // You should fix the lib because ms the parameter may be useless
            }
        }`)
        return fileNode
    }


    visitRobotProgram(node: RobotProgram) {
        this.visitDeclarations(node.declarations)
    }

    visitDeclarations(declarations: Declaration[]){
        declarations.forEach(element => {
            element.accept(this)
        });
    }

    visitInstructions(instructions: Instruction[]){
        instructions.forEach(element => {
            element.accept(this)
        })
    }

    visitDeclaration(node: Declaration) {
        //throw new Error("Declaration non pris en charge.")
    }

    visitInstruction(node: Instruction) {
        if(isMovement(node)){
            (node as Instruction).accept(this)
        }
    }

    visitFunc(node: Func) {
        this.parametre="";
        this.para=true;
        node.parameter.forEach((para, i) => {if(i>0){this.parametre+=", "}; para.accept(this)},)
        this.declarationNode.append(` 
${(node.typeReturn == undefined ? "void " : node.typeReturn.$type+" ") }${node.name} (${this.parametre}){
            
}
`)
        this.para=false;
        this.parametre="";
    }

    visitSensor(node: Sensor) {
        //throw new Error("Method not implemented.");
    }
    visitSensorDistance(node: SensorDistance) {
        //throw new Error("Method not implemented.");
    }
    visitSensorTime(node: SensorTime) {
        //throw new Error("Method not implemented.");
    }
    visitVariable(node: Variable) {
        if(this.para){
            node.type.accept(this);
            this.parametre+=node.name    
        }else {
            node.type.accept(this);
            this.declarationNode.append(`${node.name};`);
        
        }
        
    }
    visitParameter(node: Parameter) {
        console.log("para");
        this.parametre+=node.name

    }
    visitExpression(node: Expression) {
        throw new Error("Method not implemented.");
    }
    visitArithmeticExpr(node: ArithmeticExpr) {
        throw new Error("Method not implemented.");
    }
    visitBinaryArithmetic(node: BinaryArithmetic) {
        throw new Error("Method not implemented.");
    }
    visitNegative(node: Negative) {
        throw new Error("Method not implemented.");
    }
    visitBinaryBool(node: BinaryBool) {
        throw new Error("Method not implemented.");
    }
    visitBooleanExpr(node: BooleanExpr) {
        throw new Error("Method not implemented.");
    }
    visitNot(node: Not) {
        throw new Error("Method not implemented.");
    }
    visitFalseExpr(node: FalseExpr) {
        throw new Error("Method not implemented.");
    }
    visitTrueExpr(node: TrueExpr) {
        throw new Error("Method not implemented.");
    }
    visitCallExpr(node: CallExpr) {
        throw new Error("Method not implemented.");
    }
    visitNumeralExpr(node: NumeralExpr) {
        throw new Error("Method not implemented.");
    }
    visitSensorExpr(node: SensorExpr) {
        throw new Error("Method not implemented.");
    }
    visitVarExpr(node: VarExpr) {
        throw new Error("Method not implemented.");
    }
    visitAssignment(node: Assignment) {
        throw new Error("Method not implemented.");
    }
    visitBlock(node: Block) {
        throw new Error("Method not implemented.");
    }
    visitCall(node: Call) {
        throw new Error("Method not implemented.");
    }
    visitCondition(node: Condition) {
        throw new Error("Method not implemented.");
    }
    visitLoop(node: Loop) {
        throw new Error("Method not implemented.");
    }
    visitMovement(node: Movement) {
        if(isForward(node)){
            (node as Forward).accept(this)
        }
        if(isBackward(node)){
            (node as Backward).accept(this)
        }
        if(isRotate(node)){
            (node as Rotate).accept(this)
        }
        if(isLeft(node)){
            (node as Left).accept(this)
        }
        if(isRight(node)){
            (node as Right).accept(this)   
        }
    }
    visitBackward(node: Backward) {
        throw new Error("Method not implemented.");
    }
    visitForward(node: Forward) {
        node.parameter.accept(this)
    }
    visitLeft(node: Left) {
        throw new Error("Method not implemented.");
    }
    visitRight(node: Right) {
        throw new Error("Method not implemented.");
    }
    visitRotate(node: Rotate) {
        throw new Error("Method not implemented.");
    }
    visitReturn(node: Return) {
        throw new Error("Method not implemented.");
    }
    visitSpeed(node: Speed) {
        throw new Error("Method not implemented.");
    }
    visitType(node: Type) {
        if(isBool(node)) (node as Bool).accept(this);
        if(isReal(node)) (node as Real).accept(this);
        
    }
    visitBool(node: Bool) {
        if(this.para){
            this.parametre+=node.$type+" "   
        }else{        
            this.declarationNode.append(`
${node.$type} `)  
        }

    }
    visitReal(node: Real) {
        this.setupNode.append(`${node.$type}`) 
    }
    
}

