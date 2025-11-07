# AV3 Java Compiler

An ANTLR-based lexical parser and compiler for the AV3 programming language.

## Team

|Participantes | RA|
|---|---|
|Gabriel Henrique de Santos Sousa |12523218344|
|Mariana Selene Fidelis da Silva |323210602|
|Caique da Silva Miranda Santos |Null|
| Sergio Sacramento Souza Junior | Null | 

## Overview

This project implements a lexer and parser for AV3, a C-like programming language with support for:
- Variable declarations (int, double, bool)
- Control flow statements (if-else, while, do-while, for)
- Expressions with proper operator precedence
- I/O operations (printf, scanf)
- Comments (line and block)

## Prerequisites

Before you can use this compiler, you need to install Java:

### Installing Java on macOS

You have several options:

**Option 1: Using Homebrew**
```bash
brew install openjdk@11
```

After installation, add Java to your PATH:
```bash
echo 'export PATH="/opt/homebrew/opt/openjdk@11/bin:$PATH"' >> ~/.zshrc
source ~/.zshrc
```

**Option 2: Download from Oracle**
Visit [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/) and download Java 11 or later.

**Option 3: Using SDKMAN**
```bash
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 11.0.20-tem
```

### Verify Java Installation

After installation, verify Java is available:
```bash
java -version
```

## Project Structure

```
av3-java-compiler/
├── grammar/
│   └── Av3.g4              # ANTLR grammar file
├── tools/
│   └── antlr-4.13.1-complete.jar  # ANTLR tool
├── generated/              # Generated lexer/parser (after running generate-parser.sh)
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── teoria_computacao/
│                   └── av3/
│                       └── LexerDemo.java  # Demo application
├── examples/
│   └── sample.av3          # Sample AV3 program
├── bin/                    # Compiled classes
├── generate-parser.sh      # Script to generate lexer/parser from grammar
├── compile-and-run.sh      # Script to compile and run the demo
└── pom.xml                 # Maven configuration (optional)
```

## Quick Start

### 1. Generate Lexer and Parser

Run the generation script to create the lexer and parser from the grammar:

```bash
./generate-parser.sh
```

This will generate the following files in the `generated/` directory:
- `Av3Lexer.java` - The lexical analyzer
- `Av3Parser.java` - The parser
- `Av3BaseListener.java` - Base listener for tree walking
- `Av3BaseVisitor.java` - Base visitor for tree walking
- `Av3Listener.java` - Listener interface
- `Av3Visitor.java` - Visitor interface

### 2. Compile and Run

Compile the generated files and run the demo:

```bash
./compile-and-run.sh
```

This will:
1. Compile the generated ANTLR files
2. Compile the LexerDemo application
3. Run the demo with sample AV3 code

### 3. Tokenize a Custom File

You can also tokenize your own AV3 source file:

```bash
./compile-and-run.sh examples/sample.av3
```

## Manual Compilation (Alternative)

If you prefer to compile manually:

### Generate Parser and Lexer
```bash
java -jar tools/antlr-4.13.1-complete.jar \
    -o generated \
    -package com.teoria_computacao.av3.parser \
    -visitor \
    -listener \
    grammar/Av3.g4
```

### Compile Generated Files
```bash
mkdir -p bin
javac -cp tools/antlr-4.13.1-complete.jar \
    -d bin \
    generated/*.java
```

### Compile Demo Application
```bash
javac -cp tools/antlr-4.13.1-complete.jar:bin \
    -d bin \
    src/main/java/com/teoria_computacao/av3/LexerDemo.java
```

### Run Demo
```bash
java -cp tools/antlr-4.13.1-complete.jar:bin \
    com.teoria_computacao.av3.LexerDemo
```

## Using Maven (Optional)

If you have Maven installed, you can use it instead:

```bash
# Generate lexer and parser
mvn clean generate-sources

# Compile and run
mvn compile exec:java
```

## AV3 Language Features

### Data Types
- `int` - Integer numbers
- `double` - Floating-point numbers
- `bool` - Boolean values (true/false)

### Control Flow
```c
// If-else
if (x > 10) {
    printf("Greater");
} else {
    printf("Not greater");
}

// While loop
while (x < 100) {
    x = x + 1;
}

// Do-while loop
do {
    x = x - 1;
} while (x > 0);

// For loop
for (int i = 0; i < 10; i = i + 1) {
    printf("Iteration: ", i);
}
```

### Operators

Precedence (highest to lowest):
1. Unary: `+x`, `-x`, `!x`
2. Multiplicative: `*`, `/`, `%`
3. Additive: `+`, `-`
4. Relational: `<`, `<=`, `>`, `>=`
5. Equality: `==`, `!=`
6. Logical AND: `&&`
7. Logical OR: `||`

### Example Program

```c
// Calculate factorial
int n = 5;
int factorial = 1;

for (int i = 1; i <= n; i = i + 1) {
    factorial = factorial * i;
}

printf("Factorial of ", n, " is ", factorial);
```

## Lexer Demo Output

The `LexerDemo` class tokenizes AV3 code and displays each token with:
- Token type (e.g., INT_T, ID, PLUS)
- Token text (the actual characters)
- Line number
- Column position

Example output:
```
1  : INT_T          'int'                [Line:  1, Col:  0]
2  : ID             'x'                  [Line:  1, Col:  4]
3  : ASSIGN         '='                  [Line:  1, Col:  6]
4  : INT_LIT        '42'                 [Line:  1, Col:  8]
5  : SEMI           ';'                  [Line:  1, Col: 10]
```

## Troubleshooting

### "Unable to locate a Java Runtime"
Make sure Java is installed and in your PATH. Run `java -version` to verify.

### Permission Denied
Make the scripts executable:
```bash
chmod +x generate-parser.sh compile-and-run.sh
```

### ANTLR JAR not found
The ANTLR JAR should be in `tools/antlr-4.13.1-complete.jar`. If missing, download it:
```bash
mkdir -p tools
cd tools
curl -O https://www.antlr.org/download/antlr-4.13.1-complete.jar
```

## Next Steps

- Implement semantic analysis
- Add symbol table management
- Generate intermediate code
- Add code optimization
- Implement code generation for a target platform

## Resources

- [ANTLR Documentation](https://www.antlr.org/)
- [ANTLR 4 Grammar](https://github.com/antlr/grammars-v4)
- Grammar file: `grammar/Av3.g4`
