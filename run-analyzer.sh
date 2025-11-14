#!/bin/bash

# Script simplificado para executar o analisador semântico

ANTLR_JAR="/Users/departure/.m2/repository/org/antlr/antlr4-runtime/4.13.1/antlr4-runtime-4.13.1.jar"

# Check if bin directory exists and has compiled files
if [ ! -d "bin" ] || [ ! -f "bin/com/teoria_computacao/av3/SemanticAnalyzerDemo.class" ]; then
    echo "Arquivos não compilados. Compilando..."
    
    # Compile parser
    javac -cp "$ANTLR_JAR" -d bin generated/*.java 2>/dev/null
    
    # Compile semantic analyzer
    javac -cp "$ANTLR_JAR:bin" -d bin \
        src/main/java/com/teoria_computacao/av3/Type.java \
        src/main/java/com/teoria_computacao/av3/Symbol.java \
        src/main/java/com/teoria_computacao/av3/SymbolTable.java \
        src/main/java/com/teoria_computacao/av3/SemanticError.java \
        src/main/java/com/teoria_computacao/av3/SemanticAnalyzer.java \
        src/main/java/com/teoria_computacao/av3/SemanticAnalyzerDemo.java 2>/dev/null
    
    if [ $? -eq 0 ]; then
        echo "Compilação concluída."
        echo ""
    else
        echo "Erro na compilação."
        exit 1
    fi
fi

# Run the semantic analyzer
java -cp "$ANTLR_JAR:bin" com.teoria_computacao.av3.SemanticAnalyzerDemo "$@"

