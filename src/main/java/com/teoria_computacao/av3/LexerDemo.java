package com.teoria_computacao.av3;

import com.teoria_computacao.av3.parser.Av3Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

/**
 * Demonstration of the AV3 Lexer
 * This class shows how to use the ANTLR-generated lexer to tokenize AV3 source code.
 */
public class LexerDemo {

    public static void main(String[] args) {
        // Sample AV3 code to tokenize
        String code =
            "int x = 42;\n" +
            "double y = 3.14;\n" +
            "bool flag = true;\n" +
            "\n" +
            "if (x > 10) {\n" +
            "    printf(\"x is greater than 10\");\n" +
            "    y = y + 1.5;\n" +
            "} else {\n" +
            "    x = x * 2;\n" +
            "}\n" +
            "\n" +
            "while (x < 100) {\n" +
            "    x = x + 1;\n" +
            "}\n" +
            "\n" +
            "for (int i = 0; i < 10; i = i + 1) {\n" +
            "    printf(\"Iteration: \", i);\n" +
            "}\n";

        System.out.println("=== AV3 Lexical Analysis Demo ===");
        System.out.println("\nSource Code:");
        System.out.println("---");
        System.out.println(code);
        System.out.println("---\n");

        // Tokenize the code
        System.out.println("Tokens:");
        System.out.println("---");
        tokenize(code);
        System.out.println("---");

        // If a file is provided as argument, tokenize it
        if (args.length > 0) {
            String filename = args[0];
            try {
                System.out.println("\n=== Tokenizing file: " + filename + " ===\n");
                tokenizeFile(filename);
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        }
    }

    /**
     * Tokenizes a string of AV3 code and prints each token
     */
    public static void tokenize(String code) {
        CharStream input = CharStreams.fromString(code);
        Av3Lexer lexer = new Av3Lexer(input);

        Token token;
        int tokenCount = 0;
        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            tokenCount++;
            String tokenName = Av3Lexer.VOCABULARY.getSymbolicName(token.getType());
            String tokenText = token.getText();
            int line = token.getLine();
            int column = token.getCharPositionInLine();

            System.out.printf("%-3d: %-15s %-20s [Line: %2d, Col: %2d]%n",
                    tokenCount, tokenName, "'" + tokenText + "'", line, column);
        }

        System.out.println("\nTotal tokens: " + tokenCount);
    }

    /**
     * Tokenizes an AV3 source file
     */
    public static void tokenizeFile(String filename) throws IOException {
        CharStream input = CharStreams.fromFileName(filename);
        Av3Lexer lexer = new Av3Lexer(input);

        Token token;
        int tokenCount = 0;
        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            tokenCount++;
            String tokenName = Av3Lexer.VOCABULARY.getSymbolicName(token.getType());
            String tokenText = token.getText();
            int line = token.getLine();
            int column = token.getCharPositionInLine();

            System.out.printf("%-3d: %-15s %-20s [Line: %2d, Col: %2d]%n",
                    tokenCount, tokenName, "'" + tokenText + "'", line, column);
        }

        System.out.println("\nTotal tokens: " + tokenCount);
    }
}
