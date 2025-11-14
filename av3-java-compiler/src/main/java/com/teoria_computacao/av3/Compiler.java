package com.teoria_computacao.av3;

import com.teoria_computacao.av3.parser.Av3Lexer;
import com.teoria_computacao.av3.parser.Av3Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

/**
 * This is the main "Orchestrator" for the compiler.
 * It runs all phases in order:
 * 1. Lexical Analysis (Lexer)
 * 2. Syntax Analysis (Parser)
 * 3. Semantic Analysis (SemanticAnalyzer)
 * 4. Code Generation (CodeGenerator)
 */
public class Compiler {

    public static void main(String[] args) {

        // --- SAMPLE SOURCE CODE (AV3) ---

        String code; // String to hold the source code

        // --- Read code from file or use default ---
        try {
            if (args.length > 0) {
                // 1. File path was provided as a command-line argument
                String filePath = args[0];
                System.out.println("--- Reading code from file: " + filePath + " ---");
                code = Files.readString(Paths.get(filePath));
            } else {
                // 2. No file path provided, use the default hard-coded sample
                System.out.println("--- No file path provided, using default test code ---");
                code = "/*\n" +
                        "  Teste de estresse para o compilador Av3:\n" +
                        "  - Testa blocos aninhados\n" +
                        "  - Testa 'if' e 'else'\n" +
                        "  - Testa 'if' sem 'else'\n" +
                        "  - Testa loop 'while'\n" +
                        "  - Testa operadores (==, <=, %, +)\n" +
                        "  - Testa tipos (int, bool, double)\n" +
                        "  - Testa comentários\n" +
                        "*/\n" +
                        "\n" +
                        "int num;            // O número a ser testado\n" +
                        "int i;              // Nosso contador de loop\n" +
                        "bool isPrime;\n" +
                        "double d;       // Variável double apenas para testar a declaração\n" +
                        "\n" +
                        "d = 123.45;     // Teste de atribuição de double\n" +
                        "\n" +
                        "printf(\"Digite um numero inteiro para verificar se eh primo:\");\n" +
                        "scanf(num);\n" +
                        "\n" +
                        "isPrime = true; // Assumimos que eh primo ate provar o contrario\n" +
                        "i = 2;          // Comecamos a dividir por 2\n" +
                        "\n" +
                        "if (num <= 1) {\n" +
                        "    isPrime = false; // 0 e 1 nao sao primos\n" +
                        "} else {\n" +
                        "    // Loop 'while' para verificar os divisores\n" +
                        "    while (i < num) {\n" +
                        "        \n" +
                        "        // Verifica se 'num' eh divisivel por 'i'\n" +
                        "        if (num % i == 0) {\n" +
                        "            // Encontrou um divisor, logo nao eh primo\n" +
                        "            isPrime = false;\n" +
                        "        }\n" +
                        "        \n" +
                        "        i = i + 1;\n" +
                        "    }\n" +
                        "}\n" +
                        "\n" +
                        "// Imprime o resultado final\n" +
                        "if (isPrime == true) {\n" +
                        "    printf(\"O numero \", num, \" eh primo!\");\n" +
                        "} else {\n" +
                        "    printf(\"O numero \", num, \" NAO eh primo.\");\n" +
                        "}\n" +
                        "\n" +
                        "// Teste de 'if' sem 'else'\n" +
                        "if (num == 2) {\n" +
                        "    printf(\"(Lembrando: 2 eh o unico primo par!)\");\n" +
                        "}\n" +
                        "\n" +
                        "printf(\"Variavel double de teste: \", d);\n";

            }
        } catch (IOException e) {
            // This catch is for Files.readString()
            System.err.println("ERROR: Could not read file: " + (args.length > 0 ? args[0] : ""));
            e.printStackTrace();
            return; // Stop execution
        }


        System.out.println("--- 1. SOURCE CODE (AV3) ---");
        System.out.println(code);
        System.out.println("----------------------------------------\n");

        // This main 'try' process encompasses the entire compilation process.
        try {
            // STEP 1 & 2: Lexical and Syntax Analysis
            System.out.println("--- 2. Lexical and Syntax Analysis ---");
            CharStream input = CharStreams.fromString(code);
            Av3Lexer lexer = new Av3Lexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Av3Parser parser = new Av3Parser(tokens);

            // Get the "tree" (AST)
            ParseTree tree = parser.prog();

            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.out.println("SYNTAX ERRORS FOUND. Compilation halted.");
                return; // Stop if syntax is wrong
            }
            System.out.println("Syntax Analysis OK!");
            System.out.println("----------------------------------------\n");

            // STEP 3: Semantic Analysis (The "Checker")
            System.out.println("--- 3. Semantic Analysis ---");
            SemanticAnalyzer analyzer = new SemanticAnalyzer();
            analyzer.visit(tree); // Visit the tree to "check" it

            if (analyzer.hasErrors()) {
                System.out.println("SEMANTIC ERRORS FOUND. Code generation cancelled.");
                analyzer.printErrors(); // Show the errors found by the "checker"
                return; // Stop if semantics are wrong
            }
            System.out.println("Semantic Analysis OK!");
            System.out.println("----------------------------------------\n");

            // STEP 4: Code Generation (The "Translator" - YOUR PART!)
            System.out.println("--- 4. Code Generation (Translating to Java) ---");

            SymbolTable symbolTable = analyzer.getSymbolTable();
            CodeGenerator generator = new CodeGenerator(symbolTable);
            generator.visit(tree);

            String javaCode = generator.getGeneratedCode();

            System.out.println(javaCode);

            // --- Saving the generated code file (with auto-incrementing name) ---
            try {
                String baseName = "ProgramaGerado";
                String extension = ".java";
                int counter = 1;

                // Creates the first filename (e.g., "ProgramaGerado1.java")
                Path outputPath = Paths.get(baseName + counter + extension);

                // Loop: WHILE the file "ProgramaGeradoX.java" already exists...
                while (Files.exists(outputPath)) {
                    // increment the counter and try the next name.
                    counter++;
                    outputPath = Paths.get(baseName + counter + extension); // (ex: "ProgramaGerado2.java")
                }

                Files.write(outputPath, javaCode.getBytes());

                System.out.println("\n----------------------------------------");
                System.out.println("SUCCESS: Generated code saved to: " + outputPath.toString());

            } catch (IOException e) {
                System.err.println("ERROR: Could not write file to disk!");
                e.printStackTrace();
            }

            System.out.println("----------------------------------------\n");
            System.out.println("COMPILATION FINISHED SUCCESSFULLY!");

        } catch (Exception e) {
            System.err.println("COMPILATION FAILED: An unexpected error occurred.");
            e.printStackTrace();
        }
    }
}