import { RobotProgram } from "../semantics/robot-ml-visitor.js";
import { expandToNode, toString } from 'langium/generate';
import * as fs from 'node:fs';
import * as path from 'node:path';
import { extractDestinationAndName } from '../cli/cli-util.js';

export function generateArduino(model: RobotProgram, filePath: string, destination: string | undefined): string {
    const data = extractDestinationAndName(filePath, destination);
    const generatedFilePath = `${path.join(data.destination, data.name)}.ino`;

    const fileNode = expandToNode`        
        #include <PinChangeInt.h>
        #include <PinChangeIntConfig.h>
        #include <EEPROM.h>
        #define _NAMIKI_MOTOR	 //for Namiki 22CL-103501PG80:1
        #include <fuzzy_table.h>
        #include <PID_Beta6.h>
        #include <MotorWheel.h>
        #include <Omni4WD.h>

        irqISR(irq1, isr1);
        MotorWheel wheel1(3, 2, 4, 5, &irq1);

        irqISR(irq2, isr2);
        MotorWheel wheel2(11, 12, 14, 15, &irq2);

        irqISR(irq3, isr3);
        MotorWheel wheel3(9, 8, 16, 17, &irq3);

        irqISR(irq4, isr4);
        MotorWheel wheel4(10, 7, 18, 19, &irq4);
        void setup() {
            TCCR1B = TCCR1B & 0xf8 | 0x01; // Pin9,Pin10 PWM 31250Hz
            TCCR2B = TCCR2B & 0xf8 | 0x01; // Pin3,Pin11 PWM 31250Hz
            Omni.PIDEnable(0.31, 0.01, 0, 10);
        }
        void loop() {

    `.appendNewLineIfNotEmpty();

    if (!fs.existsSync(data.destination)) {
        fs.mkdirSync(data.destination, { recursive: true });
    }
    fs.writeFileSync(generatedFilePath, toString(fileNode));
    return generatedFilePath;
}
