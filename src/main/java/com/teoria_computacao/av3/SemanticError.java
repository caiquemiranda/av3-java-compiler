package com.teoria_computacao.av3;

/**
 * Represents a semantic error found during analysis
 */
public class SemanticError {
  private final String message;
  private final int line;
  private final int column;
  private final ErrorType type;

  public enum ErrorType {
    UNDECLARED_VARIABLE,
    REDECLARED_VARIABLE,
    TYPE_MISMATCH,
    INCOMPATIBLE_TYPES,
    UNINITIALIZED_VARIABLE,
    INVALID_CONDITION_TYPE,
    INVALID_OPERATION,
    OTHER
  }

  public SemanticError(ErrorType type, String message, int line, int column) {
    this.type = type;
    this.message = message;
    this.line = line;
    this.column = column;
  }

  public ErrorType getType() {
    return type;
  }

  public String getMessage() {
    return message;
  }

  public int getLine() {
    return line;
  }

  public int getColumn() {
    return column;
  }

  @Override
  public String toString() {
    return String.format("[Erro Semântico] Linha %d, Coluna %d: %s - %s",
        line, column, type, message);
  }

  public String toFormattedString() {
    return String.format("Erro Semântico [%s]\n" +
        "   Localização: Linha %d, Coluna %d\n" +
        "   Mensagem: %s\n",
        type, line, column, message);
  }
}
