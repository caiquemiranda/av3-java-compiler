package com.teoria_computacao.av3;

import com.teoria_computacao.av3.parser.Av3Lexer;
import com.teoria_computacao.av3.parser.Av3Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Demonstration of the AV3 Semantic Analyzer
 * This class shows how to use the semantic analyzer to check AV3 source code
 * for semantic errors.
 */
public class SemanticAnalyzerDemo {

  public static void main(String[] args) {
    System.out.println("╔════════════════════════════════════════════════════════════════╗");
    System.out.println("║        Analisador Semântico AV3 - Demonstração                ║");
    System.out.println("╚════════════════════════════════════════════════════════════════╝");

    // If a file is provided as argument, analyze it
    if (args.length > 0) {
      String filename = args[0];
      try {
        System.out.println("\nAnalisando arquivo: " + filename);
        analyzeFile(filename);
      } catch (IOException e) {
        System.err.println("Erro ao ler arquivo: " + e.getMessage());
      }
    } else {
      // Run demo examples
      runDemoExamples();
    }
  }

  /**
   * Run several demo examples showing different semantic errors
   */
  private static void runDemoExamples() {
    System.out.println("\nExecutando exemplos de demonstração...\n");

    // Example 1: Valid code
    System.out.println("\n" + "═".repeat(70));
    System.out.println("EXEMPLO 1: Código Válido");
    System.out.println("═".repeat(70));
    String validCode = "int x = 10;\n" +
        "double y = 3.14;\n" +
        "bool flag = true;\n" +
        "\n" +
        "if (x > 5) {\n" +
        "    x = x + 1;\n" +
        "    y = y * 2.0;\n" +
        "}\n" +
        "\n" +
        "while (x < 20) {\n" +
        "    x = x + 1;\n" +
        "}\n";
    analyzeCode(validCode, "Exemplo 1");

    // Example 2: Undeclared variable
    System.out.println("\n" + "═".repeat(70));
    System.out.println("EXEMPLO 2: Variável Não Declarada");
    System.out.println("═".repeat(70));
    String undeclaredVarCode = "int x = 10;\n" +
        "y = 20;\n" + // y not declared
        "printf(z);\n"; // z not declared
    analyzeCode(undeclaredVarCode, "Exemplo 2");

    // Example 3: Type mismatch
    System.out.println("\n" + "═".repeat(70));
    System.out.println("EXEMPLO 3: Incompatibilidade de Tipos");
    System.out.println("═".repeat(70));
    String typeMismatchCode = "int x = 10;\n" +
        "bool flag = false;\n" +
        "x = flag;\n" + // can't assign bool to int
        "flag = x + 5;\n"; // can't assign int to bool
    analyzeCode(typeMismatchCode, "Exemplo 3");

    // Example 4: Redeclared variable
    System.out.println("\n" + "═".repeat(70));
    System.out.println("EXEMPLO 4: Redeclaração de Variável");
    System.out.println("═".repeat(70));
    String redeclaredCode = "int x = 10;\n" +
        "double x = 3.14;\n" + // redeclaration
        "int y = 5;\n" +
        "{\n" +
        "    int y = 10;\n" + // OK - different scope
        "}\n";
    analyzeCode(redeclaredCode, "Exemplo 4");

    // Example 5: Invalid condition type
    System.out.println("\n" + "═".repeat(70));
    System.out.println("EXEMPLO 5: Tipo Inválido em Condição");
    System.out.println("═".repeat(70));
    String invalidCondCode = "int x = 10;\n" +
        "if (x) {\n" + // condition must be bool
        "    x = x + 1;\n" +
        "}\n" +
        "while (5) {\n" + // condition must be bool
        "    x = x - 1;\n" +
        "}\n";
    analyzeCode(invalidCondCode, "Exemplo 5");

    // Example 6: Invalid operations
    System.out.println("\n" + "═".repeat(70));
    System.out.println("EXEMPLO 6: Operações Inválidas");
    System.out.println("═".repeat(70));
    String invalidOpCode = "bool flag = true;\n" +
        "int x = 10;\n" +
        "int result = 0;\n" +
        "result = flag + x;\n" + // can't add bool and int
        "flag = !x;\n"; // can't negate int
    analyzeCode(invalidOpCode, "Exemplo 6");

    // Example 7: Scoping
    System.out.println("\n" + "═".repeat(70));
    System.out.println("EXEMPLO 7: Escopo de Variáveis");
    System.out.println("═".repeat(70));
    String scopingCode = "int x = 10;\n" +
        "{\n" +
        "    int y = 20;\n" +
        "    x = x + y;\n" + // OK - x is visible
        "}\n" +
        "y = 30;\n"; // ERROR - y not visible outside block
    analyzeCode(scopingCode, "Exemplo 7");

    // Example 8: For loop with scoping
    System.out.println("\n" + "═".repeat(70));
    System.out.println("EXEMPLO 8: Escopo em Loop For");
    System.out.println("═".repeat(70));
    String forLoopCode = "int sum = 0;\n" +
        "for (int i = 0; i < 10; i = i + 1) {\n" +
        "    sum = sum + i;\n" +
        "}\n" +
        "i = 5;\n"; // ERROR - i not visible outside for loop
    analyzeCode(forLoopCode, "Exemplo 8");
  }

  /**
   * Analyze a string of AV3 code
   */
  public static void analyzeCode(String code, String label) {
    System.out.println("\nCódigo:");
    System.out.println("─".repeat(70));
    System.out.println(code);
    System.out.println("─".repeat(70));

    try {
      // Create lexer
      CharStream input = CharStreams.fromString(code);
      Av3Lexer lexer = new Av3Lexer(input);

      // Create parser
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      Av3Parser parser = new Av3Parser(tokens);

      // Parse the code
      ParseTree tree = parser.prog();

      // Check for syntax errors
      if (parser.getNumberOfSyntaxErrors() > 0) {
        System.out.println("Erros de sintaxe encontrados. Análise semântica interrompida.");
        return;
      }

      // Perform semantic analysis
      SemanticAnalyzer analyzer = new SemanticAnalyzer();
      analyzer.visit(tree);

      // Print results
      System.out.println("\nResultado da Análise:");
      System.out.println("─".repeat(70));

      if (analyzer.hasErrors()) {
        analyzer.printErrors();
      } else {
        System.out.println("Análise semântica concluída com sucesso!");
        System.out.println("   Nenhum erro semântico encontrado.");
      }

      // Optionally print symbol table
      // analyzer.printSymbolTable();

    } catch (Exception e) {
      System.err.println("Erro durante a análise: " + e.getMessage());
      e.printStackTrace();
    }
  }

  /**
   * Analyze an AV3 source file
   */
  public static void analyzeFile(String filename) throws IOException {
    // Read file
    CharStream input = CharStreams.fromFileName(filename);

    // Create lexer
    Av3Lexer lexer = new Av3Lexer(input);

    // Create parser
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    Av3Parser parser = new Av3Parser(tokens);

    // Parse the code
    System.out.println("\nRealizando análise sintática...");
    ParseTree tree = parser.prog();

    // Check for syntax errors
    if (parser.getNumberOfSyntaxErrors() > 0) {
      System.out.println("Erros de sintaxe encontrados. Análise semântica interrompida.");
      return;
    }

    System.out.println("Análise sintática concluída com sucesso!");

    // Perform semantic analysis
    System.out.println("\nRealizando análise semântica...");
    SemanticAnalyzer analyzer = new SemanticAnalyzer();
    analyzer.visit(tree);

    // Print results
    System.out.println("\n" + "═".repeat(70));
    System.out.println("RESULTADO DA ANÁLISE SEMÂNTICA");
    System.out.println("═".repeat(70));

    if (analyzer.hasErrors()) {
      analyzer.printErrors();
    } else {
      System.out.println("Análise semântica concluída com sucesso!");
      System.out.println("   Nenhum erro semântico encontrado.");
      System.out.println("\nO código está semanticamente correto!");
    }

    // Print symbol table
    analyzer.printSymbolTable();

    // Print statistics
    System.out.println("\nEstatísticas:");
    System.out.println("   • Erros encontrados: " + analyzer.getErrors().size());
    System.out.println("   • Escopo atual: " + analyzer.getSymbolTable().getScopeDepth());
  }
}
