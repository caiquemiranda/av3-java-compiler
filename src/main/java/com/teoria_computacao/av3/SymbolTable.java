package com.teoria_computacao.av3;

import java.util.*;

/**
 * Symbol table with support for nested scopes
 */
public class SymbolTable {
  // Stack of scopes - each scope is a map of variable names to symbols
  private final Deque<Map<String, Symbol>> scopes;

  public SymbolTable() {
    this.scopes = new ArrayDeque<>();
    // Start with global scope
    enterScope();
  }

  /**
   * Enter a new scope (e.g., entering a block)
   */
  public void enterScope() {
    scopes.push(new HashMap<>());
  }

  /**
   * Exit the current scope (e.g., leaving a block)
   */
  public void exitScope() {
    if (scopes.size() > 1) { // Keep at least the global scope
      scopes.pop();
    }
  }

  /**
   * Declare a variable in the current scope
   * 
   * @return true if successful, false if variable already exists in current scope
   */
  public boolean declare(Symbol symbol) {
    Map<String, Symbol> currentScope = scopes.peek();
    if (currentScope == null) {
      return false;
    }

    // Check if variable already exists in current scope
    if (currentScope.containsKey(symbol.getName())) {
      return false;
    }

    currentScope.put(symbol.getName(), symbol);
    return true;
  }

  /**
   * Look up a variable in the symbol table (searches all scopes from innermost to
   * outermost)
   * 
   * @return the Symbol if found, null otherwise
   */
  public Symbol lookup(String name) {
    for (Map<String, Symbol> scope : scopes) {
      if (scope.containsKey(name)) {
        return scope.get(name);
      }
    }
    return null;
  }

  /**
   * Check if a variable exists in the current scope only
   */
  public boolean existsInCurrentScope(String name) {
    Map<String, Symbol> currentScope = scopes.peek();
    return currentScope != null && currentScope.containsKey(name);
  }

  /**
   * Check if a variable exists in any scope
   */
  public boolean exists(String name) {
    return lookup(name) != null;
  }

  /**
   * Get the current scope depth (0 = global, 1+ = nested)
   */
  public int getScopeDepth() {
    return scopes.size() - 1;
  }

  /**
   * Get all symbols in the current scope
   */
  public Collection<Symbol> getCurrentScopeSymbols() {
    Map<String, Symbol> currentScope = scopes.peek();
    return currentScope != null ? currentScope.values() : Collections.emptyList();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Symbol Table (").append(scopes.size()).append(" scopes):\n");
    int depth = scopes.size() - 1;
    for (Map<String, Symbol> scope : scopes) {
      sb.append("  Scope ").append(depth).append(": ");
      if (scope.isEmpty()) {
        sb.append("(empty)");
      } else {
        sb.append(scope.values());
      }
      sb.append("\n");
      depth--;
    }
    return sb.toString();
  }
}
