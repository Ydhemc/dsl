import { ArithmeticExpr, Assignment, Backward, BinaryArithmetic, BinaryBool, Block, Bool, BooleanExpr, Call, CallExpr, Condition, Declaration, Expression, FalseExpr, Forward, Func, Instruction, Left, Loop, Movement, Negative, Not, NumeralExpr, Real, Return, Right, RobotMLVisitor, RobotProgram, Rotate, Sensor, SensorDistance, SensorExpr, SensorTime, Speed, TrueExpr, Type, VarExpr, Variable } from "../semantics/robot-ml-visitor.js";
import { CompositeGeneratorNode, expandToNode, toString } from 'langium/generate';
import * as fs from 'node:fs';
import * as path from 'node:path';
import { extractDestinationAndName } from '../cli/cli-util.js';
import { isBool, isReal, Unit} from "../language/generated/ast.js";

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
    currentExprStr: string
    parametre = "";
    para = false;

    public constructor() {
        this.declarationNode = expandToNode``
        this.setupNode = expandToNode``
        this.loopNode = expandToNode``
        this.currentType = undefined
        this.currentExprStr = ""
    } 

    private requireType(requiredType: string, message: string){
        if(this.currentType?.$type != requiredType){
            throw new Error("The type should be ["+requiredType+"] for : "+message)
        }
    }

    private requireBool(message: string){
        this.requireType('Bool', message)
    }
    private requireExactType(requiredType: Type | undefined, message: string){
        if(requiredType == undefined){
            throw new Error("The type should be [void] for : "+message)
        }
        else if(requiredType.$type == 'Bool') this.requireBool(message);
        else {
            this.requireRealOfUnit((requiredType as Real).unit, message)
        }
    }
    

    private requireRealOfUnit(unit: Unit, message: string){
        if(this.currentType?.$type != 'Real' || (this.currentType as Real).unit != unit){
            throw new Error("The type should be [Real in "+unit+"] for : "+message)
        }
    }

    private requireRealAnyDistUnit(message: string): Unit{
        if(this.currentType?.$type != 'Real' || (this.currentType as Real).unit == 'rad'){
            throw new Error("The type should be [Real (not in rad)] for : "+message)
        }
        return (this.currentType as Real).unit
    }

    private requireRealAnyUnit(message: string): Unit{
        this.requireType('Real', message)
        return (this.currentType as Real).unit
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

        unsigned long __duration;
        unsigned long __begin;
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
        bool __isDone = false;

        void setup() {
            TCCR1B = TCCR1B & 0xf8 | 0x01; // Pin9,Pin10 PWM 31250Hz
            TCCR2B = TCCR2B & 0xf8 | 0x01; // Pin3,Pin11 PWM 31250Hz
        `).append(this.setupNode)
        .append(expandToNode`
            Omni.PIDEnable(0.31, 0.01, 0, 10);
        }

        void loop() {
            if(!__isDone){
            `).append(this.loopNode)
        .append(expandToNode`
            __isDone = true;
            } else {
                Omni.setCarSlow2Stop(1000)
            }
        }`)
        return fileNode
    }


    visitRobotProgram(node: RobotProgram) {
        this.visitDeclarations(node.declarations)
        this.visitInstructions(node.instructions)
    }

    private visitDeclarations(declarations: Declaration[]){
        declarations.forEach(element => {
            element.accept(this)
        });
    }

    private visitInstructions(instructions: Instruction[]){
        instructions.forEach(element => {
            element.accept(this)
        })
    }

    visitDeclaration(node: Declaration) {
        //throw new Error("Declaration non pris en charge.")
    }

    visitInstruction(node: Instruction) {
        //throw new Error("Method not implemented.");
    }

    visitFunc(node: Func) {
        this.parametre="";
        this.para=true;
        node.parameter.forEach((para, i) => {if(i>0){this.parametre+=", "}; this.parametre+=(para.type.$type=="Bool" ? "bool ":"int ")+para.name/*para.accept(this)*/},)
        this.declarationNode.append(` 
${(node.typeReturn == undefined ? "void " : node.typeReturn.$type+" ") }${node.name} (${this.parametre}){
        //instruction    
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
    visitExpression(node: Expression) {
        throw new Error("Should not be visited");
    }
    visitArithmeticExpr(node: ArithmeticExpr) {
        throw new Error("Should not be visited");
    }
    visitBinaryArithmetic(node: BinaryArithmetic) {
        let op = node.operation
        node.expressionL.accept(this)
        let unit = this.requireRealAnyUnit("Arithmetic expression")
        let left = this.currentExprStr
        node.expressionR.accept(this)
        this.requireRealOfUnit(unit, "Arithmetic expression") // should have same unit as left branch
        let right = this.currentExprStr
        this.currentExprStr = "(" + left + op + right + ")"
    }
    visitNegative(node: Negative) {
        node.expression.accept(this)
        this.requireRealAnyUnit("Negative number expression")
        this.currentExprStr = "(-"+this.currentExprStr+")"
        //this.currentType = this.currentType
    }
    visitBinaryBool(node: BinaryBool) {
        let op = node.operation
        if(op == '&&' || op == '||'){
            node.expressionL.accept(this)
            this.requireBool("Boolean operator Expression")
            let left = this.currentExprStr
            node.expressionR.accept(this)
            this.requireBool("Boolean operator Expression")
            let right = this.currentExprStr
            this.currentExprStr = "(" + left + op + right + ")"
        } else { //>= <= ...
            node.expressionL.accept(this)
            let unit = this.requireRealAnyUnit("Comparison Expression")
            let left = this.currentExprStr
            node.expressionR.accept(this)
            this.requireRealOfUnit(unit, "Comparison expression") // should have same unit as left branch
            let right = this.currentExprStr
            this.currentExprStr = "(" + left + op + right + ")"
        }
        this.currentType = new Bool('Bool')
    }
    visitBooleanExpr(node: BooleanExpr) {
        throw new Error("Should not be visited");
    }
    visitNot(node: Not) {
        node.expression.accept(this)
        this.requireBool("Not expression")
        this.currentExprStr = "!("+this.currentExprStr+")"
        this.currentType = new Bool('Bool')
    }
    visitFalseExpr(node: FalseExpr) {
        this.currentType = new Bool('Bool')
        this.currentExprStr = 'false'
    }
    visitTrueExpr(node: TrueExpr) {
        this.currentType = new Bool('Bool')
        this.currentExprStr = 'true'
    }
    visitCallExpr(node: CallExpr) {
        let func = node.fonction.ref
        if(func){
            if(func.parameter.length != node.parameters.length) {
                throw new Error("Not right number of parameters for function call: "+func.name)
            }
            let params = node.parameters
            let paramsStr = ""
            for (let i = 0; i < params.length; i++) {
                params[i].accept(this)
                this.requireExactType(func.parameter[i].type, "Parameter "+func.parameter[i].name+" in "+func.name+" call")
                paramsStr += this.currentExprStr
                if(i != (params.length-1)) {
                    paramsStr += ", "
                } 
            }
            this.currentExprStr = func.name + "(" + paramsStr + ")"
            this.currentType = func.typeReturn
        } else { throw new Error("undefined function") }
    }
    visitNumeralExpr(node: NumeralExpr) {
        this.currentType = new Real('Real', 'mm')
        this.currentExprStr = ""+node.value
    }
    visitSensorExpr(node: SensorExpr) {
        throw new Error("Method not implemented.");
    }
    visitVarExpr(node: VarExpr) {
        let varRef: Variable | undefined = node.variableRef.ref;
        if (varRef) {
            this.currentType = varRef.type;
            this.currentExprStr = varRef.name;
        } else throw Error("Variable declaration not found")
    }
    visitAssignment(node: Assignment) {
        let variableRef = node.variable.ref
        if(variableRef){
            node.expression.accept(this)
            this.requireExactType(variableRef.type, "Assignment to "+variableRef.name)
            this.loopNode.append(`
            ${variableRef.name} = ${this.currentExprStr};`).appendNewLine()
        }
        else {
            throw new Error("Variable declaration not found")
        }
        this.currentType = undefined
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
        throw new Error("Method not implemented.");
    }

    private surroundWithDistanceLoop(distanceExpr: Expression, action: string){
        distanceExpr.accept(this)
        this.requireRealAnyDistUnit("linear movement")
        this.loopNode.append(`
            __duration = 1000*( Omni.getSpeedMMPS() * ${this.currentExprStr});
            __begin = millis();
            while((millis() - __begin) < __duration){${action};}`).appendNewLine()
    }

    visitBackward(node: Backward) {
        this.surroundWithDistanceLoop(node.parameter, "Omni.setCarBackoff(Omni.getCarSpeedMMPS())")
        this.currentType = undefined
    }

    visitForward(node: Forward) {
        this.surroundWithDistanceLoop(node.parameter, "Omni.setCarAdvance(Omni.getCarSpeedMMPS())")
        this.currentType = undefined
    }

    visitLeft(node: Left) {
        this.surroundWithDistanceLoop(node.parameter, "Omni.setCarLeft(Omni.getCarSpeedMMPS())")
        this.currentType = undefined
    }
    visitRight(node: Right) {
        this.surroundWithDistanceLoop(node.parameter, "Omni.setCarRight(Omni.getCarSpeedMMPS())")
        this.currentType = undefined
    }
    visitRotate(node: Rotate) { //OMEGA = dteta/dt rad/s avec dteta rapport d'angle parcouru et dt rapport de temps
        node.parameter.accept(this)
        let unit = this.requireRealAnyUnit("angular movement")
        if(unit == 'rad'){
            throw new Error("Rotation with radians not implemented yet")
        }else {
            this.loopNode.append(`
            int __rota = ${this.currentExprStr};
            __duration = 1000*( Omni.getSpeedMMPS() * __rota);
            __begin = millis();
            while((millis() - __begin) < __duration){
                if(__rota < 0) Omni.setCarRotateLeft(Omni.getSpeedMMPS());
                else Omni.setCarRotateRight(Omni.getSpeedMMPS());
            }`).appendNewLine()
        }
        this.currentType = undefined
    }
    visitReturn(node: Return) {
        throw new Error("Method not implemented.");
    }
    visitSpeed(node: Speed) {
        node.parameter.accept(this) // expression
        this.requireRealAnyUnit("speed")
        this.loopNode.append(`
            Omni.setCarSpeedMMPS(${this.currentExprStr});`).appendNewLine()
        this.currentType = undefined
    }
    visitType(node: Type) {
        if(isBool(node)) (node as Bool).accept(this);
        if(isReal(node)) (node as Real).accept(this);
        
    }
    visitBool(node: Bool) {
        if(this.para){
            this.parametre+=("bool ")   
        }else{        
            this.declarationNode.append(`
bool `)  
        }

    }
    visitReal(node: Real) {
    //Sauvé dans un tableau le type ? cm mm m ?
        if(this.para){
            this.parametre+="int "   
        }else{        
            this.declarationNode.append(`
int `)  
        }
    }
    
}