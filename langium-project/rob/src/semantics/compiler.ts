import { RobotProgram } from "../language/generated/ast.js";

export function generateArduino(model: RobotProgram, fileName: string, destination: string | undefined): string {
    let filePath = ""
    if(destination == undefined){
        filePath = "./out.ino"
    } else filePath = destination

    return filePath
}