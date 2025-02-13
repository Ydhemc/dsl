import * as ASTInterfaces from '../language/generated/ast.js';
import type { RobotProgram } from '../semantics/robot-ml-visitor.js';
import chalk from 'chalk';
import { Command } from 'commander';
import { RobotMLLanguageMetaData } from '../language/generated/module.js';
import { createRobotMLServices } from '../language/robot-ml-module.js';
import { extractAstNode } from './cli-util.js';
import { NodeFileSystem } from 'langium/node';
import * as url from 'node:url';
import * as fs from 'node:fs/promises';
import * as path from 'node:path';
import { generateArduino } from '../semantics/compiler.js';
const __dirname = url.fileURLToPath(new URL('.', import.meta.url));

const packagePath = path.resolve(__dirname, '..', '..', 'package.json');
const packageContent = await fs.readFile(packagePath, 'utf-8');

export const generateAction = async (fileName: string, opts: GenerateOptions): Promise<void> => {
    const services = createRobotMLServices(NodeFileSystem).RobotML;
    const model = await extractAstNode<ASTInterfaces.RobotProgram>(fileName, services);
    const generatedFilePath = generateArduino((model as RobotProgram), fileName, opts.destination);
    console.log(chalk.green(`Arduino code generated successfully: ${generatedFilePath}`));
};

export type GenerateOptions = {
    destination?: string;
}

export default function(): void {
    const program = new Command();

    program.version(JSON.parse(packageContent).version);

    const fileExtensions = RobotMLLanguageMetaData.fileExtensions.join(', ');
    program
        .command('compile')
        .argument('<file>', `source file (possible file extensions: ${fileExtensions})`)
        .option('-d, --destination <dir>', 'destination directory of generating')
        .description('generates Arduino code')
        .action(generateAction);

    program.parse(process.argv);
}
