package com.teoria_computacao.av3;


import com.teoria_computacao.av3.parser.Av3BaseVisitor;
import com.teoria_computacao.av3.parser.Av3Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Semantic Analyzer for AV3 language
 * Performs type checking, variable declaration checking, and other semantic
 * validations
 */
public class SemanticAnalyzer extends Av3BaseVisitor<Type> {
  private final SymbolTable symbolTable;
  private final List<SemanticError> errors;

  public SemanticAnalyzer() {
    this.symbolTable = new SymbolTable();
    this.errors = new ArrayList<>();
  }

  public List<SemanticError> getErrors() {
    return errors;
  }

  public boolean hasErrors() {
    return !errors.isEmpty();
  }

  public SymbolTable getSymbolTable() {
    return symbolTable;
  }

  private void addError(SemanticError.ErrorType type, String message, ParserRuleContext ctx) {
    int line = ctx.getStart().getLine();
    int column = ctx.getStart().getCharPositionInLine();
    errors.add(new SemanticError(type, message, line, column));
  }

  // ==================== PROGRAM ====================

  @Override
  public Type visitProg(Av3Parser.ProgContext ctx) {
    // Visit all declarations and statements
    for (ParseTree child : ctx.children) {
      if (child != ctx.EOF()) {
        visit(child);
      }
    }
    return Type.VOID;
  }

  // ==================== DECLARATIONS ====================

  @Override
  public Type visitVarDecl(Av3Parser.VarDeclContext ctx) {
    String varName = ctx.ID().getText();
    Type varType = getTypeFromContext(ctx.type());

    int line = ctx.ID().getSymbol().getLine();
    int column = ctx.ID().getSymbol().getCharPositionInLine();

    // Check if variable already declared in current scope
    if (symbolTable.existsInCurrentScope(varName)) {
      Symbol existing = symbolTable.lookup(varName);
      addError(SemanticError.ErrorType.REDECLARED_VARIABLE,
          String.format("Variável '%s' já foi declarada (primeira declaração na linha %d)",
              varName, existing.getLine()),
          ctx);
    } else {
      // Declare variable (not initialized)
      Symbol symbol = new Symbol(varName, varType, line, column, false);
      symbolTable.declare(symbol);
    }

    return Type.VOID;
  }

  @Override
  public Type visitVarInitDecl(Av3Parser.VarInitDeclContext ctx) {
    String varName = ctx.ID().getText();
    Type varType = getTypeFromContext(ctx.type());

    int line = ctx.ID().getSymbol().getLine();
    int column = ctx.ID().getSymbol().getCharPositionInLine();

    // Check expression type
    Type exprType = visit(ctx.expression());

    // Check if variable already declared in current scope
    if (symbolTable.existsInCurrentScope(varName)) {
      Symbol existing = symbolTable.lookup(varName);
      addError(SemanticError.ErrorType.REDECLARED_VARIABLE,
          String.format("Variável '%s' já foi declarada (primeira declaração na linha %d)",
              varName, existing.getLine()),
          ctx);
    } else {
      // Check type compatibility
      if (!varType.isCompatibleWith(exprType)) {
        addError(SemanticError.ErrorType.TYPE_MISMATCH,
            String.format("Tipo incompatível: não é possível atribuir '%s' a variável do tipo '%s'",
                exprType, varType),
            ctx);
      }

      // Declare variable (initialized)
      Symbol symbol = new Symbol(varName, varType, line, column, true);
      symbolTable.declare(symbol);
    }

    return Type.VOID;
  }

  // ==================== FOR DECLARATIONS ====================

  @Override
  public Type visitForVarDecl(Av3Parser.ForVarDeclContext ctx) {
    String varName = ctx.ID().getText();
    Type varType = getTypeFromContext(ctx.type());

    int line = ctx.ID().getSymbol().getLine();
    int column = ctx.ID().getSymbol().getCharPositionInLine();

    // Check if variable already declared in current scope
    if (symbolTable.existsInCurrentScope(varName)) {
      Symbol existing = symbolTable.lookup(varName);
      addError(SemanticError.ErrorType.REDECLARED_VARIABLE,
          String.format("Variável '%s' já foi declarada (primeira declaração na linha %d)",
              varName, existing.getLine()),
          ctx);
    } else {
      // Declare variable (not initialized in for)
      Symbol symbol = new Symbol(varName, varType, line, column, false);
      symbolTable.declare(symbol);
    }

    return Type.VOID;
  }

  @Override
  public Type visitForInitDecl(Av3Parser.ForInitDeclContext ctx) {
    String varName = ctx.ID().getText();
    Type varType = getTypeFromContext(ctx.type());

    int line = ctx.ID().getSymbol().getLine();
    int column = ctx.ID().getSymbol().getCharPositionInLine();

    // Check expression type
    Type exprType = visit(ctx.expression());

    // Check if variable already declared in current scope
    if (symbolTable.existsInCurrentScope(varName)) {
      Symbol existing = symbolTable.lookup(varName);
      addError(SemanticError.ErrorType.REDECLARED_VARIABLE,
          String.format("Variável '%s' já foi declarada (primeira declaração na linha %d)",
              varName, existing.getLine()),
          ctx);
    } else {
      // Check type compatibility
      if (!varType.isCompatibleWith(exprType)) {
        addError(SemanticError.ErrorType.TYPE_MISMATCH,
            String.format("Tipo incompatível: não é possível atribuir '%s' a variável do tipo '%s'",
                exprType, varType),
            ctx);
      }

      // Declare variable (initialized)
      Symbol symbol = new Symbol(varName, varType, line, column, true);
      symbolTable.declare(symbol);
    }

    return Type.VOID;
  }

  // ==================== STATEMENTS ====================

  @Override
  public Type visitStmtAssign(Av3Parser.StmtAssignContext ctx) {
    visit(ctx.assignment());
    return Type.VOID;
  }

  @Override
  public Type visitAssignment(Av3Parser.AssignmentContext ctx) {
    String varName = ctx.ID().getText();

    // Check if variable is declared
    Symbol symbol = symbolTable.lookup(varName);
    if (symbol == null) {
      addError(SemanticError.ErrorType.UNDECLARED_VARIABLE,
          String.format("Variável '%s' não foi declarada", varName),
          ctx);
      return Type.ERROR;
    }

    // Check expression type
    Type exprType = visit(ctx.expression());

    // Check type compatibility
    if (!symbol.getType().isCompatibleWith(exprType)) {
      addError(SemanticError.ErrorType.TYPE_MISMATCH,
          String.format("Tipo incompatível: não é possível atribuir '%s' a variável '%s' do tipo '%s'",
              exprType, varName, symbol.getType()),
          ctx);
    }

    // Mark variable as initialized
    symbol.setInitialized(true);

    return Type.VOID;
  }

  @Override
  public Type visitStmtIfElse(Av3Parser.StmtIfElseContext ctx) {
    // Check condition type (must be boolean)
    Type condType = visit(ctx.expression());
    if (condType != Type.BOOL && condType != Type.ERROR) {
      addError(SemanticError.ErrorType.INVALID_CONDITION_TYPE,
          String.format("Condição do 'if' deve ser do tipo 'bool', mas é '%s'", condType),
          ctx.expression());
    }

    // Visit then and else branches
      visit(ctx.statement(0)); // then
      if (ctx.statement(1) != null) { // verify
          visit(ctx.statement(1)); // else
      }

    return Type.VOID;
  }

  @Override
  public Type visitStmtWhile(Av3Parser.StmtWhileContext ctx) {
    // Check condition type (must be boolean)
    Type condType = visit(ctx.expression());
    if (condType != Type.BOOL && condType != Type.ERROR) {
      addError(SemanticError.ErrorType.INVALID_CONDITION_TYPE,
          String.format("Condição do 'while' deve ser do tipo 'bool', mas é '%s'", condType),
          ctx.expression());
    }

    // Visit body
    visit(ctx.statement());

    return Type.VOID;
  }

  @Override
  public Type visitStmtDoWhile(Av3Parser.StmtDoWhileContext ctx) {
    // Visit body first
    visit(ctx.statement());

    // Check condition type (must be boolean)
    Type condType = visit(ctx.expression());
    if (condType != Type.BOOL && condType != Type.ERROR) {
      addError(SemanticError.ErrorType.INVALID_CONDITION_TYPE,
          String.format("Condição do 'do-while' deve ser do tipo 'bool', mas é '%s'", condType),
          ctx.expression());
    }

    return Type.VOID;
  }

  @Override
  public Type visitStmtFor(Av3Parser.StmtForContext ctx) {
    // Enter new scope for the for loop
    symbolTable.enterScope();

    // Visit init
    visit(ctx.forInit());

    // Check condition type (must be boolean)
    Type condType = visit(ctx.expression());
    if (condType != Type.BOOL && condType != Type.ERROR) {
      addError(SemanticError.ErrorType.INVALID_CONDITION_TYPE,
          String.format("Condição do 'for' deve ser do tipo 'bool', mas é '%s'", condType),
          ctx.expression());
    }

    // Visit update
    visit(ctx.forUpdate());

    // Visit body
    visit(ctx.statement());

    // Exit scope
    symbolTable.exitScope();

    return Type.VOID;
  }

  @Override
  public Type visitStmtPrintf(Av3Parser.StmtPrintfContext ctx) {
    // Visit all arguments to check types
    visit(ctx.printfArgs());
    return Type.VOID;
  }

  @Override
  public Type visitPrintfArgs(Av3Parser.PrintfArgsContext ctx) {
    // Visit all expressions
    for (Av3Parser.ExpressionContext expr : ctx.expression()) {
      visit(expr);
    }
    return Type.VOID;
  }

  @Override
  public Type visitStmtScanf(Av3Parser.StmtScanfContext ctx) {
    String varName = ctx.ID().getText();

    // Check if variable is declared
    Symbol symbol = symbolTable.lookup(varName);
    if (symbol == null) {
      addError(SemanticError.ErrorType.UNDECLARED_VARIABLE,
          String.format("Variável '%s' não foi declarada", varName),
          ctx);
    } else {
      // Mark as initialized since scanf assigns a value
      symbol.setInitialized(true);
    }

    return Type.VOID;
  }

  @Override
  public Type visitStmtBlock(Av3Parser.StmtBlockContext ctx) {
    visit(ctx.block());
    return Type.VOID;
  }

  @Override
  public Type visitBlock(Av3Parser.BlockContext ctx) {
    // Enter new scope
    symbolTable.enterScope();

    // Visit all declarations and statements
    for (ParseTree child : ctx.children) {
      if (child instanceof Av3Parser.DeclarationContext ||
          child instanceof Av3Parser.StatementContext) {
        visit(child);
      }
    }

    // Exit scope
    symbolTable.exitScope();

    return Type.VOID;
  }

  // ==================== EXPRESSIONS ====================

  @Override
  public Type visitOrExpression(Av3Parser.OrExpressionContext ctx) {
    if (ctx.andExpression().size() == 1) {
      return visit(ctx.andExpression(0));
    }

    Type resultType = visit(ctx.andExpression(0));
    for (int i = 1; i < ctx.andExpression().size(); i++) {
      Type rightType = visit(ctx.andExpression(i));
      resultType = Type.getLogicalResultType(resultType, rightType);

      if (resultType == Type.ERROR) {
        addError(SemanticError.ErrorType.INVALID_OPERATION,
            "Operador '||' requer operandos do tipo 'bool'",
            ctx);
      }
    }

    return resultType;
  }

  @Override
  public Type visitAndExpression(Av3Parser.AndExpressionContext ctx) {
    if (ctx.eqExpression().size() == 1) {
      return visit(ctx.eqExpression(0));
    }

    Type resultType = visit(ctx.eqExpression(0));
    for (int i = 1; i < ctx.eqExpression().size(); i++) {
      Type rightType = visit(ctx.eqExpression(i));
      resultType = Type.getLogicalResultType(resultType, rightType);

      if (resultType == Type.ERROR) {
        addError(SemanticError.ErrorType.INVALID_OPERATION,
            "Operador '&&' requer operandos do tipo 'bool'",
            ctx);
      }
    }

    return resultType;
  }

  @Override
  public Type visitEqExpression(Av3Parser.EqExpressionContext ctx) {
    if (ctx.relExpression().size() == 1) {
      return visit(ctx.relExpression(0));
    }

    Type leftType = visit(ctx.relExpression(0));
    for (int i = 1; i < ctx.relExpression().size(); i++) {
      Type rightType = visit(ctx.relExpression(i));
      Type resultType = Type.getRelationalResultType(leftType, rightType);

      if (resultType == Type.ERROR) {
        String op = ctx.getChild(2 * i - 1).getText();
        addError(SemanticError.ErrorType.INVALID_OPERATION,
            String.format("Operador '%s' não pode ser aplicado a operandos dos tipos '%s' e '%s'",
                op, leftType, rightType),
            ctx);
      }
      leftType = resultType;
    }

    return leftType;
  }

  @Override
  public Type visitRelExpression(Av3Parser.RelExpressionContext ctx) {
    if (ctx.addExpression().size() == 1) {
      return visit(ctx.addExpression(0));
    }

    Type leftType = visit(ctx.addExpression(0));
    for (int i = 1; i < ctx.addExpression().size(); i++) {
      Type rightType = visit(ctx.addExpression(i));
      Type resultType = Type.getRelationalResultType(leftType, rightType);

      if (resultType == Type.ERROR) {
        String op = ctx.getChild(2 * i - 1).getText();
        addError(SemanticError.ErrorType.INVALID_OPERATION,
            String.format("Operador '%s' não pode ser aplicado a operandos dos tipos '%s' e '%s'",
                op, leftType, rightType),
            ctx);
      }
      leftType = resultType;
    }

    return leftType;
  }

  @Override
  public Type visitAddExpression(Av3Parser.AddExpressionContext ctx) {
    if (ctx.mulExpression().size() == 1) {
      return visit(ctx.mulExpression(0));
    }

    Type leftType = visit(ctx.mulExpression(0));
    for (int i = 1; i < ctx.mulExpression().size(); i++) {
      Type rightType = visit(ctx.mulExpression(i));
      Type resultType = Type.getArithmeticResultType(leftType, rightType);

      if (resultType == Type.ERROR) {
        String op = ctx.getChild(2 * i - 1).getText();
        addError(SemanticError.ErrorType.INVALID_OPERATION,
            String.format("Operador '%s' não pode ser aplicado a operandos dos tipos '%s' e '%s'",
                op, leftType, rightType),
            ctx);
      }
      leftType = resultType;
    }

    return leftType;
  }

  @Override
  public Type visitMulExpression(Av3Parser.MulExpressionContext ctx) {
    if (ctx.unaryExpression().size() == 1) {
      return visit(ctx.unaryExpression(0));
    }

    Type leftType = visit(ctx.unaryExpression(0));
    for (int i = 1; i < ctx.unaryExpression().size(); i++) {
      Type rightType = visit(ctx.unaryExpression(i));
      Type resultType = Type.getArithmeticResultType(leftType, rightType);

      if (resultType == Type.ERROR) {
        String op = ctx.getChild(2 * i - 1).getText();
        addError(SemanticError.ErrorType.INVALID_OPERATION,
            String.format("Operador '%s' não pode ser aplicado a operandos dos tipos '%s' e '%s'",
                op, leftType, rightType),
            ctx);
      }
      leftType = resultType;
    }

    return leftType;
  }

  @Override
  public Type visitUnaryExpression(Av3Parser.UnaryExpressionContext ctx) {
    if (ctx.primary() != null) {
      return visit(ctx.primary());
    }

    // Unary operator
    String op = ctx.getChild(0).getText();
    Type operandType = visit(ctx.unaryExpression());

    if (op.equals("!")) {
      // Logical NOT requires boolean
      if (operandType != Type.BOOL && operandType != Type.ERROR) {
        addError(SemanticError.ErrorType.INVALID_OPERATION,
            String.format("Operador '!' requer operando do tipo 'bool', mas recebeu '%s'",
                operandType),
            ctx);
        return Type.ERROR;
      }
      return Type.BOOL;
    } else if (op.equals("+") || op.equals("-")) {
      // Unary +/- requires numeric type
      if (operandType != Type.INT && operandType != Type.DOUBLE && operandType != Type.ERROR) {
        addError(SemanticError.ErrorType.INVALID_OPERATION,
            String.format("Operador unário '%s' requer operando numérico, mas recebeu '%s'",
                op, operandType),
            ctx);
        return Type.ERROR;
      }
      return operandType;
    }

    return Type.ERROR;
  }

  @Override
  public Type visitPrimary(Av3Parser.PrimaryContext ctx) {
    if (ctx.expression() != null) {
      // Parenthesized expression
      return visit(ctx.expression());
    } else if (ctx.literal() != null) {
      return visit(ctx.literal());
    } else if (ctx.ID() != null) {
      // Variable reference
      String varName = ctx.ID().getText();
      Symbol symbol = symbolTable.lookup(varName);

      if (symbol == null) {
        addError(SemanticError.ErrorType.UNDECLARED_VARIABLE,
            String.format("Variável '%s' não foi declarada", varName),
            ctx);
        return Type.ERROR;
      }

      return symbol.getType();
    }

    return Type.ERROR;
  }

  @Override
  public Type visitLiteral(Av3Parser.LiteralContext ctx) {
    if (ctx.INT_LIT() != null) {
      return Type.INT;
    } else if (ctx.DOUBLE_LIT() != null) {
      return Type.DOUBLE;
    } else if (ctx.bool_lit() != null) {
      return Type.BOOL;
    }
    return Type.ERROR;
  }

  // ==================== HELPER METHODS ====================

  private Type getTypeFromContext(Av3Parser.TypeContext ctx) {
    if (ctx.INT_T() != null) {
      return Type.INT;
    } else if (ctx.DOUBLE_T() != null) {
      return Type.DOUBLE;
    } else if (ctx.BOOL_T() != null) {
      return Type.BOOL;
    }
    return Type.ERROR;
  }

  /**
   * Print all errors to console
   */
  public void printErrors() {
    if (errors.isEmpty()) {
      System.out.println("Nenhum erro semântico encontrado.");
      return;
    }

    System.out.println("Erros semânticos encontrados: " + errors.size());
    System.out.println("═".repeat(70));
    for (int i = 0; i < errors.size(); i++) {
      System.out.println((i + 1) + ". " + errors.get(i).toString());
    }
    System.out.println("═".repeat(70));
  }

  /**
   * Print symbol table
   */
  public void printSymbolTable() {
    System.out.println("\nTabela de Símbolos:");
    System.out.println("═".repeat(70));
    System.out.println(symbolTable);
    System.out.println("═".repeat(70));
  }
}
