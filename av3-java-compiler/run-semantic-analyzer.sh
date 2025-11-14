#!/bin/bash

# Script to run the Semantic Analyzer Demo

# Find ANTLR jar
if [ -f "tools/antlr-4.13.1-complete.jar" ]; then
    ANTLR_JAR="tools/antlr-4.13.1-complete.jar"
elif [ -f "../tools/antlr-4.13.1-complete.jar" ]; then
    ANTLR_JAR="../tools/antlr-4.13.1-complete.jar"
else
    echo "Erro: ANTLR JAR não encontrado"
    exit 1
fi

# Check if compiled
if [ ! -f "bin/com/teoria_computacao/av3/SemanticAnalyzerDemo.class" ]; then
    echo "Analisador semântico não compilado. Compilando..."
    ./compile-semantic-analyzer.sh
    if [ $? -ne 0 ]; then
        exit 1
    fi
fi

# Run the demo
java -cp "$ANTLR_JAR:bin" com.teoria_computacao.av3.SemanticAnalyzerDemo "$@"

