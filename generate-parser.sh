#!/bin/bash

# Script to generate ANTLR lexer and parser from grammar file

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
JAVA_HOME="$SCRIPT_DIR/tools/jdk-11.0.2.jdk/Contents/Home"
JAVA="$JAVA_HOME/bin/java"
ANTLR_JAR="$SCRIPT_DIR/tools/antlr-4.13.1-complete.jar"
GRAMMAR_FILE="$SCRIPT_DIR/grammar/Av3.g4"
OUTPUT_DIR="$SCRIPT_DIR/generated"
PACKAGE="com.teoria_computacao.av3.parser"

echo "Generating ANTLR lexer and parser..."
echo "Grammar file: $GRAMMAR_FILE"
echo "Output directory: $OUTPUT_DIR"
echo "Package: $PACKAGE"
echo ""

# Create output directory if it doesn't exist
mkdir -p "$OUTPUT_DIR"

# Generate lexer and parser
"$JAVA" -jar "$ANTLR_JAR" \
    -o "$OUTPUT_DIR" \
    -package "$PACKAGE" \
    -visitor \
    -listener \
    "$GRAMMAR_FILE"

if [ $? -eq 0 ]; then
    echo ""
    echo "✓ Successfully generated lexer and parser!"
    echo ""
    echo "Generated files:"
    ls -la "$OUTPUT_DIR"
else
    echo ""
    echo "✗ Failed to generate lexer and parser"
    exit 1
fi
