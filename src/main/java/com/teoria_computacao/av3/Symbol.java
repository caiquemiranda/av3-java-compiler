package com.teoria_computacao.av3;

/**
 * Represents a symbol (variable) in the symbol table
 */
public class Symbol {
  private final String name;
  private final Type type;
  private final int line;
  private final int column;
  private boolean initialized;

  public Symbol(String name, Type type, int line, int column) {
    this.name = name;
    this.type = type;
    this.line = line;
    this.column = column;
    this.initialized = false;
  }

  public Symbol(String name, Type type, int line, int column, boolean initialized) {
    this.name = name;
    this.type = type;
    this.line = line;
    this.column = column;
    this.initialized = initialized;
  }

  public String getName() {
    return name;
  }

  public Type getType() {
    return type;
  }

  public int getLine() {
    return line;
  }

  public int getColumn() {
    return column;
  }

  public boolean isInitialized() {
    return initialized;
  }

  public void setInitialized(boolean initialized) {
    this.initialized = initialized;
  }

  @Override
  public String toString() {
    return String.format("Symbol{name='%s', type=%s, line=%d, col=%d, initialized=%s}",
        name, type, line, column, initialized);
  }
}
