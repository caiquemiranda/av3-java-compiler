package com.teoria_computacao.av3;

/**
 * Enum representing the types in the AV3 language
 */
public enum Type {
  INT("int"),
  DOUBLE("double"),
  BOOL("bool"),
  VOID("void"), // For statements that don't return a value
  ERROR("error"); // For type errors

  private final String name;

  Type(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  /**
   * Check if two types are compatible for operations
   */
  public boolean isCompatibleWith(Type other) {
    if (this == ERROR || other == ERROR) {
      return true; // Don't cascade errors
    }
    if (this == other) {
      return true;
    }
    // int and double are compatible (with implicit conversion)
    if ((this == INT && other == DOUBLE) || (this == DOUBLE && other == INT)) {
      return true;
    }
    return false;
  }

  /**
   * Get the result type of an arithmetic operation between two types
   */
  public static Type getArithmeticResultType(Type left, Type right) {
    if (left == ERROR || right == ERROR) {
      return ERROR;
    }
    // If either is double, result is double
    if (left == DOUBLE || right == DOUBLE) {
      return DOUBLE;
    }
    // Both int
    if (left == INT && right == INT) {
      return INT;
    }
    // Invalid arithmetic operation
    return ERROR;
  }

  /**
   * Get the result type of a relational operation (always bool)
   */
  public static Type getRelationalResultType(Type left, Type right) {
    if (left == ERROR || right == ERROR) {
      return ERROR;
    }
    // Numeric types can be compared
    if ((left == INT || left == DOUBLE) && (right == INT || right == DOUBLE)) {
      return BOOL;
    }
    // Booleans can be compared with equality operators
    if (left == BOOL && right == BOOL) {
      return BOOL;
    }
    return ERROR;
  }

  /**
   * Get the result type of a logical operation (requires bool operands)
   */
  public static Type getLogicalResultType(Type left, Type right) {
    if (left == ERROR || right == ERROR) {
      return ERROR;
    }
    if (left == BOOL && right == BOOL) {
      return BOOL;
    }
    return ERROR;
  }

  @Override
  public String toString() {
    return name;
  }
}
