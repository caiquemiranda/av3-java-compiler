#!/bin/bash

# Script to compile the Semantic Analyzer

echo "╔════════════════════════════════════════════════════════════════╗"
echo "║     Compilando Analisador Semântico AV3                        ║"
echo "╚════════════════════════════════════════════════════════════════╝"
echo ""

# Check if Java is installed
if ! command -v javac &> /dev/null; then
    echo "Erro: Java não está instalado ou não está no PATH"
    echo "Por favor, instale o Java e tente novamente."
    exit 1
fi

echo "Java encontrado: $(java -version 2>&1 | head -n 1)"
echo ""

# Create bin directory if it doesn't exist
mkdir -p bin

# Find ANTLR jar
if [ -f "tools/antlr-4.13.1-complete.jar" ]; then
    ANTLR_JAR="tools/antlr-4.13.1-complete.jar"
elif [ -f "../tools/antlr-4.13.1-complete.jar" ]; then
    ANTLR_JAR="../tools/antlr-4.13.1-complete.jar"
else
    echo "Erro: ANTLR JAR não encontrado"
    echo "Por favor, baixe antlr-4.13.1-complete.jar e coloque no diretório tools/"
    exit 1
fi

echo "ANTLR JAR encontrado: $ANTLR_JAR"
echo ""

# Check if generated parser files exist
if [ ! -f "generated/Av3Parser.java" ]; then
    echo "Parser não encontrado. Gerando..."
    ./generate-parser.sh
    if [ $? -ne 0 ]; then
        echo "Erro ao gerar parser."
        exit 1
    fi
fi

# Compile generated parser files if not already compiled
echo "Compilando parser..."
javac -cp "$ANTLR_JAR" -d bin generated/*.java 2>&1 | grep -v "^Note:"
if [ $? -ne 0 ]; then
    echo "Aviso: alguns avisos de compilação do parser (podem ser ignorados)."
fi

# Compile semantic analyzer files
echo "Compilando analisador semântico..."
javac -cp "$ANTLR_JAR:bin" -d bin \
    src/main/java/com/teoria_computacao/av3/Type.java \
    src/main/java/com/teoria_computacao/av3/Symbol.java \
    src/main/java/com/teoria_computacao/av3/SymbolTable.java \
    src/main/java/com/teoria_computacao/av3/SemanticError.java \
    src/main/java/com/teoria_computacao/av3/SemanticAnalyzer.java \
    src/main/java/com/teoria_computacao/av3/SemanticAnalyzerDemo.java

if [ $? -eq 0 ]; then
    echo ""
    echo "Compilação concluída com sucesso."
    echo ""
    echo "Para executar o analisador semântico:"
    echo "  ./run-semantic-analyzer.sh                    # Executar exemplos de demonstração"
    echo "  ./run-semantic-analyzer.sh examples/sample.av3  # Analisar arquivo específico"
else
    echo ""
    echo "Erro na compilação."
    exit 1
fi

