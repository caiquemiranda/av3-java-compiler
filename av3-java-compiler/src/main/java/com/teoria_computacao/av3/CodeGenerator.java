package com.teoria_computacao.av3;

import com.teoria_computacao.av3.parser.Av3BaseVisitor;
import com.teoria_computacao.av3.parser.Av3Parser;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the Code Generator
 *
 * LOGIC FIX:
 * All 'visit' methods representing a command (if, for, printf) or an expression (a+b)
 * will NOW RETURN the translated Java String.
 *
 * Only visitProg (at the top) and the visitVarDecl methods will use
 * the StringBuilders to assemble the final file.
 */
public class CodeGenerator extends Av3BaseVisitor<String> {

    // Using the symbol table for know the variable type for SCANF
    private final SymbolTable symbolTable;

    // StringBuilders to assemble the final code
    private StringBuilder mainBody;
    private StringBuilder declarations;
    private StringBuilder setup; // For imports and the Scanner object

    public CodeGenerator(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.mainBody = new StringBuilder();
        this.declarations = new StringBuilder();
        this.setup = new StringBuilder();

        // Add the setup for keyboard input (our 'scanf' function)
        this.setup.append("\t\t// Setup for keyboard input (scanf)\n");
        this.setup.append("\t\tjava.util.Scanner scanner = new java.util.Scanner(System.in);\n\n");
    }

    /**
     * Called at the end to get the complete generated Java file.
     * It wraps the setup, declarations, and mainBody in a runnable Java class.
     */
    public String getGeneratedCode() {
        return "public class ProgramaGerado {\n" +
                "\tpublic static void main(String[] args) {\n\n" +
                setup.toString() +
                declarations.toString() + "\n" +
                mainBody.toString() + "\n" +
                "\t\t// Close the scanner at the end\n" +
                "\t\tscanner.close();\n" +
                "\t}\n" +
                "}\n";
    }

    // --- VISITOR METHODS ---

    /**
     * Entry point.
     * Visits all declarations and statements.
     * Declarations are ADDED to the 'declarations' builder.
     * Statements have their code (String) RETURNED and are ADDED to the 'mainBody'.
     */
    @Override
    public String visitProg(Av3Parser.ProgContext ctx) {
        // Visit declarations. They will populate the 'declarations' builder
        for (Av3Parser.DeclarationContext decl : ctx.declaration()) {
            visit(decl);
        }

        // Visit statements. Each will RETURN a string of Java code
        for (Av3Parser.StatementContext stmt : ctx.statement()) {
            String stmtCode = visit(stmt); // e.g., "if (x > 10) { ... }"
            if (stmtCode != null) {
                mainBody.append("\t\t" + stmtCode + "\n");
            }
        }
        return null; // Final result is fetched with getGeneratedCode()
    }

    // --- VARIABLE DECLARATIONS ---
    // (These methods append to 'declarations' and return null)

    @Override
    public String visitVarDecl(Av3Parser.VarDeclContext ctx) {
        String javaType = translateType(ctx.type());
        String id = ctx.ID().getText();
        declarations.append("\t\t" + javaType + " " + id + ";\n");
        return null; // Appended to declarations builder
    }

    @Override
    public String visitVarInitDecl(Av3Parser.VarInitDeclContext ctx) {
        String javaType = translateType(ctx.type());
        String id = ctx.ID().getText();
        String expr = visit(ctx.expression());
        declarations.append("\t\t" + javaType + " " + id + " = " + expr + ";\n");
        return null;
    }

    // --- STATEMENTS ---
    // (These methods RETURN the translated Java code string)

    @Override
    public String visitStmtAssign(Av3Parser.StmtAssignContext ctx) {
        String assignStr = visit(ctx.assignment());
        return assignStr + ";";
    }

    @Override
    public String visitStmtIfElse(Av3Parser.StmtIfElseContext ctx) {
        String cond = visit(ctx.expression());
        String thenStmt = visit(ctx.statement(0)); // Returns the 'then' block string

        // The grammar makes the 'else' optional
        String elseStmt = "";
        if (ctx.statement(1) != null) { // Check if 'else' (statement(1)) exists
            elseStmt = " else " + visit(ctx.statement(1));
        }

        return "if (" + cond + ") " + thenStmt + elseStmt;
    }

    @Override
    public String visitStmtWhile(Av3Parser.StmtWhileContext ctx) {
        String cond = visit(ctx.expression());
        String body = visit(ctx.statement());
        return "while (" + cond + ") " + body;
    }

    @Override
    public String visitStmtDoWhile(Av3Parser.StmtDoWhileContext ctx) {
        String body = visit(ctx.statement());
        String cond = visit(ctx.expression());
        return "do " + body + " while (" + cond + ");";
    }

    @Override
    public String visitStmtFor(Av3Parser.StmtForContext ctx) {
        String init = visit(ctx.forInit());
        String cond = visit(ctx.expression());
        String update = visit(ctx.forUpdate());
        String body = visit(ctx.statement());
        return "for (" + init + "; " + cond + "; " + update + ") " + body;
    }

    @Override
    public String visitStmtPrintf(Av3Parser.StmtPrintfContext ctx) {
        String args = visit(ctx.printfArgs());
        return "System.out.println(" + args + ");";
    }

    @Override
    public String visitStmtScanf(Av3Parser.StmtScanfContext ctx) {
        String varName = ctx.ID().getText();
        Symbol symbol = symbolTable.lookup(varName);

        if (symbol == null) {
            return "// CODEGEN ERROR: Symbol '" + varName + "' not found!";
        } else if (symbol.getType() == Type.INT) {
            return varName + " = scanner.nextInt();";
        } else if (symbol.getType() == Type.DOUBLE) {
            return varName + " = scanner.nextDouble();";
        } else if (symbol.getType() == Type.BOOL) {
            return varName + " = scanner.nextBoolean();";
        } else {
            return "// CODEGEN ERROR: Cannot scanf type " + symbol.getType();
        }
    }

    @Override
    public String visitStmtBlock(Av3Parser.StmtBlockContext ctx) {
        return visit(ctx.block()); // Just visit the 'block' node
    }

    /**
     * Visits a block (e.g., "{ ... }").
     * This method builds the block string by visiting its children
     * and getting their RETURNED strings.
     */
    @Override
    public String visitBlock(Av3Parser.BlockContext ctx) {
        StringBuilder blockBody = new StringBuilder("{\n");

        // Visit declarations INSIDE the block
        for (Av3Parser.DeclarationContext decl : ctx.declaration()) {

            visit(decl);
        }

        for (Av3Parser.StatementContext stmt : ctx.statement()) {
            String stmtCode = visit(stmt); // Get the returned string (e.g., "x = 10;")
            blockBody.append("\t\t\t" + stmtCode + "\n"); // Add to the block's body
        }

        blockBody.append("\t\t}");
        return blockBody.toString(); // RETURN the "{ ... }" block string
    }

    // --- FOR-LOOP PARTS ---
    // (These return Strings)

    @Override
    public String visitForVarDecl(Av3Parser.ForVarDeclContext ctx) {
        return translateType(ctx.type()) + " " + ctx.ID().getText();
    }

    @Override
    public String visitForInitDecl(Av3Parser.ForInitDeclContext ctx) {
        return translateType(ctx.type()) + " " + ctx.ID().getText() + " = " + visit(ctx.expression());
    }

    // --- EXPRESSIONS ---
    // (These methods ALWAYS RETURN the expression string)

    @Override
    public String visitAssignment(Av3Parser.AssignmentContext ctx) {
        return ctx.ID().getText() + " = " + visit(ctx.expression());
    }

    @Override
    public String visitPrintfArgs(Av3Parser.PrintfArgsContext ctx) {
        List<String> args = new ArrayList<>();

        if (ctx.STRING_LIT() != null) {
            args.add(ctx.STRING_LIT().getText());
        }

        for (Av3Parser.ExpressionContext exprCtx : ctx.expression()) {
            args.add(visit(exprCtx));
        }

        // Joins all arguments with " + "
        return String.join(" + ", args);
    }

    // --- PRECEDENCE ---

    @Override
    public String visitOrExpression(Av3Parser.OrExpressionContext ctx) {
        if (ctx.andExpression().size() == 1) {
            return visit(ctx.andExpression(0));
        }
        String left = visit(ctx.andExpression(0));
        for(int i = 1; i < ctx.andExpression().size(); i++) {
            String right = visit(ctx.andExpression(i));
            left = left + " || " + right;
        }
        return left;
    }

    @Override
    public String visitAndExpression(Av3Parser.AndExpressionContext ctx) {
        if (ctx.eqExpression().size() == 1) {
            return visit(ctx.eqExpression(0));
        }
        String left = visit(ctx.eqExpression(0));
        for(int i = 1; i < ctx.eqExpression().size(); i++) {
            String right = visit(ctx.eqExpression(i));
            left = left + " && " + right;
        }
        return left;
    }

    @Override
    public String visitEqExpression(Av3Parser.EqExpressionContext ctx) {
        if (ctx.relExpression().size() == 1) {
            return visit(ctx.relExpression(0));
        }
        String left = visit(ctx.relExpression(0));
        String op = ctx.getChild(1).getText();
        String right = visit(ctx.relExpression(1));
        return left + " " + op + " " + right;
    }

    @Override
    public String visitRelExpression(Av3Parser.RelExpressionContext ctx) {
        if (ctx.addExpression().size() == 1) {
            return visit(ctx.addExpression(0));
        }
        String left = visit(ctx.addExpression(0));
        String op = ctx.getChild(1).getText();
        String right = visit(ctx.addExpression(1));
        return left + " " + op + " " + right;
    }

    @Override
    public String visitAddExpression(Av3Parser.AddExpressionContext ctx) {
        if (ctx.mulExpression().size() == 1) {
            return visit(ctx.mulExpression(0));
        }
        String left = visit(ctx.mulExpression(0));
        String op = ctx.getChild(1).getText();
        String right = visit(ctx.mulExpression(1));
        return left + " " + op + " " + right;
    }

    @Override
    public String visitMulExpression(Av3Parser.MulExpressionContext ctx) {
        if (ctx.unaryExpression().size() == 1) {
            return visit(ctx.unaryExpression(0));
        }
        String left = visit(ctx.unaryExpression(0));
        String op = ctx.getChild(1).getText();
        String right = visit(ctx.unaryExpression(1));
        return left + " " + op + " " + right;
    }

    @Override
    public String visitUnaryExpression(Av3Parser.UnaryExpressionContext ctx) {
        if (ctx.primary() != null) {
            return visit(ctx.primary());
        }
        String op = ctx.getChild(0).getText();
        String expr = visit(ctx.unaryExpression());
        return op + expr;
    }

    @Override
    public String visitPrimary(Av3Parser.PrimaryContext ctx) {
        if (ctx.literal() != null) {
            return visit(ctx.literal());
        }
        if (ctx.ID() != null) {
            return ctx.ID().getText();
        }
        return "(" + visit(ctx.expression()) + ")"; // Parenthesized expression
    }

    @Override
    public String visitLiteral(Av3Parser.LiteralContext ctx) {
        return ctx.getText();
    }


    // --- HELPER METHOD ---

    /**
     * Translates a grammar 'type' node into a Java type string.
     * (e.g., 'bool' becomes 'boolean')
     */
    private String translateType(Av3Parser.TypeContext ctx) {
        if (ctx.INT_T() != null) {
            return "int";
        } else if (ctx.DOUBLE_T() != null) {
            return "double";
        } else if (ctx.BOOL_T() != null) {
            return "boolean"; // 'bool' in our lang is 'boolean' in Java
        }
        return "void";
    }
}