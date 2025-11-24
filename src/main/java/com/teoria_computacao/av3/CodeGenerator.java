package com.teoria_computacao.av3;

import com.teoria_computacao.av3.parser.Av3BaseVisitor;
import com.teoria_computacao.av3.parser.Av3Parser;
import java.util.ArrayList;
import java.util.List;

/**
 * Code Generator - Updated to re-populate Symbol Table locally
 * to ensure variable types are available during generation.
 */
public class CodeGenerator extends Av3BaseVisitor<String> {

    private final SymbolTable symbolTable;
    private StringBuilder mainBody;
    private StringBuilder declarations;
    private StringBuilder setup;

    public CodeGenerator(SymbolTable symbolTable) {
        // We use the symbol table passed in, but we might need to re-declare vars
        // if the previous analysis cleared the scopes.
        this.symbolTable = symbolTable;

        this.mainBody = new StringBuilder();
        this.declarations = new StringBuilder();
        this.setup = new StringBuilder();

        this.setup.append("\t\t// Setup for keyboard input (scanf)\n");
        this.setup.append("\t\tjava.util.Scanner scanner = new java.util.Scanner(System.in);\n\n");
    }

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

    @Override
    public String visitProg(Av3Parser.ProgContext ctx) {
        for (Av3Parser.DeclarationContext decl : ctx.declaration()) {
            visit(decl);
        }
        for (Av3Parser.StatementContext stmt : ctx.statement()) {
            String stmtCode = visit(stmt);
            if (stmtCode != null) {
                mainBody.append("\t\t" + stmtCode + "\n");
            }
        }
        return null;
    }

    // --- register variables in SymbolTable ---

    @Override
    public String visitVarDecl(Av3Parser.VarDeclContext ctx) {
        String typeStr = translateType(ctx.type());
        String id = ctx.ID().getText();
        Type type = getTypeFromStr(typeStr);
        symbolTable.declare(new Symbol(id, type, 0, 0));
        declarations.append("\t\t" + typeStr + " " + id + ";\n");
        return null;
    }

    @Override
    public String visitVarInitDecl(Av3Parser.VarInitDeclContext ctx) {
        String typeStr = translateType(ctx.type());
        String id = ctx.ID().getText();
        Type type = getTypeFromStr(typeStr);
        symbolTable.declare(new Symbol(id, type, 0, 0));
        String expr = visit(ctx.expression());
        declarations.append("\t\t" + typeStr + " " + id + " = " + expr + ";\n");
        return null;
    }
    // Helper to convert Java type string back to Enum Type
    private Type getTypeFromStr(String typeStr) {
        if (typeStr.equals("int")) return Type.INT;
        if (typeStr.equals("double")) return Type.DOUBLE;
        if (typeStr.equals("boolean")) return Type.BOOL;
        return Type.VOID;
    }

    // --- STATEMENTS ---

    @Override
    public String visitStmtAssign(Av3Parser.StmtAssignContext ctx) {
        String assignStr = visit(ctx.assignment());
        return assignStr + ";";
    }

    @Override
    public String visitStmtIfElse(Av3Parser.StmtIfElseContext ctx) {
        String cond = visit(ctx.expression());
        String thenStmt = visit(ctx.statement(0));
        String elseStmt = "";
        if (ctx.statement(1) != null) {
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

        // Now this lookup should work because we re-registered the vars
        Symbol symbol = symbolTable.lookup(varName);

        if (symbol == null) {
            // Fallback: if still not found, assume int or try to guess?
            // Ideally this shouldn't happen if declared globally.
            return "// CODEGEN ERROR: Symbol '" + varName + "' not found!";
        } else if (symbol.getType() == Type.INT) {
            // Added .nextLine() to consume the newline character left by nextInt
            return varName + " = scanner.nextInt();\nscanner.nextLine();";
        } else if (symbol.getType() == Type.DOUBLE) {
            return varName + " = scanner.nextDouble();\nscanner.nextLine();";
        } else if (symbol.getType() == Type.BOOL) {
            return varName + " = scanner.nextBoolean();\nscanner.nextLine();";
        } else {
            return "// CODEGEN ERROR: Cannot scanf type " + symbol.getType();
        }
    }

    @Override
    public String visitStmtBlock(Av3Parser.StmtBlockContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public String visitBlock(Av3Parser.BlockContext ctx) {
        StringBuilder blockBody = new StringBuilder("{\n");

        for (Av3Parser.StatementContext stmt : ctx.statement()) {
            String stmtCode = visit(stmt);
            blockBody.append("\t\t\t" + stmtCode + "\n");
        }
        blockBody.append("\t\t}");
        return blockBody.toString();
    }

    // --- FOR-LOOP PARTS ---

    @Override
    public String visitForVarDecl(Av3Parser.ForVarDeclContext ctx) {
        // We also register loop variables!
        String typeStr = translateType(ctx.type());
        String id = ctx.ID().getText();
        Type type = getTypeFromStr(typeStr);
        symbolTable.declare(new Symbol(id, type, 0, 0));

        return typeStr + " " + id;
    }

    @Override
    public String visitForInitDecl(Av3Parser.ForInitDeclContext ctx) {
        String typeStr = translateType(ctx.type());
        String id = ctx.ID().getText();
        Type type = getTypeFromStr(typeStr);
        symbolTable.declare(new Symbol(id, type, 0, 0));

        return typeStr + " " + id + " = " + visit(ctx.expression());
    }

    // --- EXPRESSIONS ---

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
        return String.join(" + ", args);
    }

    // --- PRECEDENCE ---

    @Override
    public String visitOrExpression(Av3Parser.OrExpressionContext ctx) {
        if (ctx.andExpression().size() == 1) return visit(ctx.andExpression(0));
        String left = visit(ctx.andExpression(0));
        for(int i = 1; i < ctx.andExpression().size(); i++) {
            String right = visit(ctx.andExpression(i));
            left = left + " || " + right;
        }
        return left;
    }

    @Override
    public String visitAndExpression(Av3Parser.AndExpressionContext ctx) {
        if (ctx.eqExpression().size() == 1) return visit(ctx.eqExpression(0));
        String left = visit(ctx.eqExpression(0));
        for(int i = 1; i < ctx.eqExpression().size(); i++) {
            String right = visit(ctx.eqExpression(i));
            left = left + " && " + right;
        }
        return left;
    }

    @Override
    public String visitEqExpression(Av3Parser.EqExpressionContext ctx) {
        if (ctx.relExpression().size() == 1) return visit(ctx.relExpression(0));
        String left = visit(ctx.relExpression(0));
        String op = ctx.getChild(1).getText();
        String right = visit(ctx.relExpression(1));
        return left + " " + op + " " + right;
    }

    @Override
    public String visitRelExpression(Av3Parser.RelExpressionContext ctx) {
        if (ctx.addExpression().size() == 1) return visit(ctx.addExpression(0));
        String left = visit(ctx.addExpression(0));
        String op = ctx.getChild(1).getText();
        String right = visit(ctx.addExpression(1));
        return left + " " + op + " " + right;
    }

    @Override
    public String visitAddExpression(Av3Parser.AddExpressionContext ctx) {
        if (ctx.mulExpression().size() == 1) return visit(ctx.mulExpression(0));
        String left = visit(ctx.mulExpression(0));
        String op = ctx.getChild(1).getText();
        String right = visit(ctx.mulExpression(1));
        return left + " " + op + " " + right;
    }

    @Override
    public String visitMulExpression(Av3Parser.MulExpressionContext ctx) {
        if (ctx.unaryExpression().size() == 1) return visit(ctx.unaryExpression(0));
        String left = visit(ctx.unaryExpression(0));
        String op = ctx.getChild(1).getText();
        String right = visit(ctx.unaryExpression(1));
        return left + " " + op + " " + right;
    }

    @Override
    public String visitUnaryExpression(Av3Parser.UnaryExpressionContext ctx) {
        if (ctx.primary() != null) return visit(ctx.primary());
        String op = ctx.getChild(0).getText();
        String expr = visit(ctx.unaryExpression());
        return op + expr;
    }

    @Override
    public String visitPrimary(Av3Parser.PrimaryContext ctx) {
        if (ctx.literal() != null) return visit(ctx.literal());
        if (ctx.ID() != null) return ctx.ID().getText();
        return "(" + visit(ctx.expression()) + ")";
    }

    @Override
    public String visitLiteral(Av3Parser.LiteralContext ctx) {
        return ctx.getText();
    }

    private String translateType(Av3Parser.TypeContext ctx) {
        if (ctx.INT_T() != null) return "int";
        if (ctx.DOUBLE_T() != null) return "double";
        if (ctx.BOOL_T() != null) return "boolean";
        return "void";
    }
}