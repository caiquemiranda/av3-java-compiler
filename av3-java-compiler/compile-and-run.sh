#!/bin/bash

# Script to compile and run the AV3 Lexer Demo

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
JAVA_HOME="$SCRIPT_DIR/tools/jdk-11.0.2.jdk/Contents/Home"
JAVA="$JAVA_HOME/bin/java"
JAVAC="$JAVA_HOME/bin/javac"
ANTLR_JAR="$SCRIPT_DIR/tools/antlr-4.13.1-complete.jar"
GENERATED_DIR="$SCRIPT_DIR/generated"
SRC_DIR="$SCRIPT_DIR/src/main/java"
BIN_DIR="$SCRIPT_DIR/bin"

echo "=== AV3 Compiler - Compile and Run ==="
echo ""

# Create bin directory if it doesn't exist
mkdir -p "$BIN_DIR"

# Step 1: Compile generated parser and lexer
echo "[1/3] Compiling generated ANTLR files..."
"$JAVAC" -cp "$ANTLR_JAR" -d "$BIN_DIR" "$GENERATED_DIR"/*.java

if [ $? -ne 0 ]; then
    echo "✗ Failed to compile generated ANTLR files"
    exit 1
fi
echo "✓ Generated files compiled successfully"
echo ""

# Step 2: Compile the demo application
echo "[2/3] Compiling LexerDemo.java..."
"$JAVAC" -cp "$ANTLR_JAR:$BIN_DIR" -d "$BIN_DIR" "$SRC_DIR/com/teoria_computacao/av3/LexerDemo.java"

if [ $? -ne 0 ]; then
    echo "✗ Failed to compile LexerDemo"
    exit 1
fi
echo "✓ LexerDemo compiled successfully"
echo ""

# Step 3: Run the demo
echo "[3/3] Running LexerDemo..."
echo ""
"$JAVA" -cp "$ANTLR_JAR:$BIN_DIR" com.teoria_computacao.av3.LexerDemo "$@"
