# AV3 Java Compiler

Um analisador léxico, sintático e compilador baseado em ANTLR para a linguagem de programação AV3.

## Grupo

| Participantes                    | RA          |
| -------------------------------- | ----------- |
| Gabriel Henrique de Santos Sousa | 12523218344 |
| Mariana Selene Fidelis da Silva  | 323210602   |
| Caique da Silva Miranda Santos   | 12723216257 |
| Sergio Sacramento Souza Junior   | 12725156371 |
| Ewerton Vinicius Turco           | 122522517   |

**Link do Projeto no GitHub:** https://github.com/caiquemiranda/av3-java-compiler

## Visão Geral

Este projeto implementa um analisador léxico e sintático para AV3, uma linguagem de programação semelhante a C com suporte para:

- Declarações de variáveis (int, double, bool)
- Instruções de controle de fluxo (if-else, while, do-while, for)
- Expressões com precedência de operadores adequada
- Operações de entrada/saída (printf, scanf)
- Comentários (de linha e de bloco)

## Pré-requisitos

Para compilar e executar este projeto, você precisa ter instalado:

### Instalando Java no macOS

Você tem várias opções:

**Opção 1: Usando o Homebrew**

```bash
brew install openjdk@11
```

Após a instalação, adicione o Java ao seu PATH.:

```bash
echo 'export PATH="/opt/homebrew/opt/openjdk@11/bin:$PATH"' >> ~/.zshrc
source ~/.zshrc
```

**Opção 2: Baixar do site da Oracle**
Visite [Oracle Java Downloads](https://www.oracle.com/java/technologies/downloads/) e faça o download do Java 11 ou versões superiores.

**Opção 3: Usando SDKMAN**

```bash
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 11.0.20-tem
```

### Verifique a instalação do Java.

Após a instalação, verifique se o Java está disponível.:

```bash
java -version
```

## Estrutura do Projeto

```
av3-java-compiler/
├── grammar/
│   └── Av3.g4                  # Definição da gramática ANTLR
├── src/
│   └── main/
│       └── java/
│           └── com/teoria_computacao/av3/
│               ├── CodeGenerator.java        # Gerador de Código (Transpilador)
│               ├── Compiler.java             # Classe Principal (Orquestrador)
│               ├── LexerDemo.java            # Demonstração do Lexer
│               ├── SemanticAnalyzer.java     # Lógica do Analisador Semântico
│               ├── SemanticAnalyzerDemo.java # Demonstração da Semântica
│               ├── SemanticError.java        # Estrutura de Erros Semânticos
│               ├── Symbol.java               # Representação de Símbolo (Variável)
│               ├── SymbolTable.java          # Gestão da Tabela de Símbolos
│               └── Type.java                 # Enumeração de Tipos (INT, BOOL, etc.)
│
├── target/                     # Pasta de saída (contém o executável .jar)
├── examples/                   # Exemplos de código fonte AV3
├── generated/                  # Códigos gerados automaticamente pelo ANTLR
├── pom.xml                     # Configuração de dependências Maven
├── README.md                   # Documentação do projeto
└── teste.av3                   # Ficheiro de teste local (na raiz)
```

## Quick Start

### 1. Gere o Lexer e o Parser

Execute o script de geração para criar o analisador léxico e o analisador sintático a partir da gramática:

```bash
./generate-parser.sh
```

Isso irá gerar os seguintes arquivos no diretório `generated/`:

- `Av3Lexer.java` - O analisador léxico
- `Av3Parser.java` - O analisador sintático
- `Av3BaseListener.java` - Listener base para percorrer a árvore
- `Av3BaseVisitor.java` - Visitor base para percorrer a árvore
- `Av3Listener.java` - Interface do listener
- `Av3Visitor.java` - Interface do visitante

### 2. Compile e execute

Compile os arquivos gerados e execute a demonstração:

```bash
./compile-and-run.sh
```

Isso irá:

1. Compilar os arquivos ANTLR gerados
2. Compilar o aplicativo LexerDemo
3. Executar a demonstração com o código AV3 de exemplo

### 3. Tokenizar um arquivo personalizado

Você também pode tokenizar seu próprio arquivo fonte AV3:

```bash
./compile-and-run.sh examples/sample.av3
```

## Compilação manual (alternativa)

Se preferir compilar manualmente:

### Gerar analisador sintático e analisador léxico

```bash
java -jar tools/antlr-4.13.1-complete.jar \
    -o generated \
    -package com.teoria_computacao.av3.parser \
    -visitor \
    -listener \
    grammar/Av3.g4
```

### Compilar arquivos gerados

```bash
mkdir -p bin
javac -cp tools/antlr-4.13.1-complete.jar \
    -d bin \
    generated/*.java
```

### Compilar aplicativo de demonstração

```bash
javac -cp tools/antlr-4.13.1-complete.jar:bin \
    -d bin \
    src/main/java/com/teoria_computacao/av3/LexerDemo.java
```

### Executar demonstração

```bash
java -cp tools/antlr-4.13.1-complete.jar:bin \
    com.teoria_computacao.av3.LexerDemo
```

## Usando o Maven (Opicional)

Se você tiver o Maven instalado, poderá usá-lo em vez disso:

```bash
# Generate lexer and parser
mvn clean generate-sources

# Compile and run
mvn compile exec:java
```

## Recursos da Linguagem AV3

### Data Types

- `int` - Números inteiros
- `double` - Números de ponto flutuante
- `bool` - Valores booleanos (verdadeiro/falso)

### Controle de Fluxo

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

### Operadores

Precedência (da mais alta para a mais baixa):

1. Unary: `+x`, `-x`, `!x`
2. Multiplicative: `*`, `/`, `%`
3. Additive: `+`, `-`
4. Relational: `<`, `<=`, `>`, `>=`
5. Equality: `==`, `!=`
6. Logical AND: `&&`
7. Logical OR: `||`

### Programa de exemplo

```c
// Calcule o fatorial
int n = 5;
int factorial = 1;

for (int i = 1; i <= n; i = i + 1) {
    factorial = factorial * i;
}

printf("Factorial of ", n, " is ", factorial);
```

## Saída da demonstração do Lexer

A classe `LexerDemo` tokeniza o código AV3 e exibe cada token com:

- Tipo de token (ex.: INT_T, ID, PLUS)
- Texto do token (os caracteres reais)
- Número da linha
- Posição da coluna

Exemplo de saída:

```
1  : INT_T          'int'                [Line:  1, Col:  0]
2  : ID             'x'                  [Line:  1, Col:  4]
3  : ASSIGN         '='                  [Line:  1, Col:  6]
4  : INT_LIT        '42'                 [Line:  1, Col:  8]
5  : SEMI           ';'                  [Line:  1, Col: 10]
```

## Solução de problemas

### "Não foi possível localizar um ambiente de execução Java"

Certifique-se de que o Java esteja instalado e no seu PATH. Execute `java -version` para verificar.

### Permissão negada

Torne os scripts executáveis:

```bash
chmod +x generate-parser.sh compile-and-run.sh
```

### ANTLR JAR não encontrado

O arquivo JAR do ANTLR deve estar em `tools/antlr-4.13.1-complete.jar`. Caso não esteja, faça o download:

```bash
mkdir -p tools
cd tools
curl -O https://www.antlr.org/download/antlr-4.13.1-complete.jar
```

## Semantic Analyzer

O analisador semântico do AV3 realiza:

- **Gerenciamento de Tabela de Símbolos** - Rastreamento de variáveis e escopos
- **Verificação de Tipos** - Validação de compatibilidade de tipos
- **Análise de Escopo** - Verificação de visibilidade de variáveis
- **Detecção de Erros** - Variáveis não declaradas, redeclarações, tipos incompatíveis

### Quick Start - Analisador Semântico

```bash
# Executar exemplos de demonstração
./run-analyzer.sh

# Analisar arquivo específico
./run-analyzer.sh examples/simple-test.av3

# Analisar arquivo com erros
./run-analyzer.sh examples/errors-test.av3
```

### Exemplos de Análise

**Código válido:**

```c
int x;
x = 10;
```

**Resultado:** Análise semântica concluída com sucesso!

**Código com erros:**

```c
int x;
y = 20;  // Erro: variável 'y' não declarada
int x;   // Erro: redeclaração de 'x'
```

**Resultado:**

```
Erros semânticos encontrados: 2
1. [UNDECLARED_VARIABLE] Linha 2: Variável 'y' não foi declarada
2. [REDECLARED_VARIABLE] Linha 3: Variável 'x' já foi declarada
```

### Arquivos de Exemplo

- `examples/simple-test.av3` - Programa válido simples
- `examples/errors-test.av3` - Exemplos de erros semânticos
- `examples/sample.av3` - Programa completo (original)

## Code Generator (Transpiler)

O gerador de codigo traduz um código AV3 para um código Java funcional.

- **Tradução Fonte-para-Fonte** - O `CodeGenerator.java` percorre a Árvore Sintática Abstrata.
- **Saída em Código Java** - Converte as estruturas do AV3 para seus equivalentes em Java.
- **Geração de Arquivos** - O `Compiler.java` salva o código traduzido em um arquivo `.java` na pasta raiz do projeto.
- **Nomes Auto-Incrementais** - Para evitar sobre-escrita, os arquivos são nomeados sequencialmente (ProgramaGerado1.java, ProgramaGerado2.java, etc.).

### Quick Start - Compilador

A classe Compiler.java é o ponto de entrada principal, executando todas as fases (Léxica, Sintática, Semântica e Geração de Código). Você pode rodar de duas formas:

### Opção 1: Rodar com o Código de Teste Padrão (Interno)
Apertando "Play" sem configurar nada, o compilador ira usar um codigo de teste interno.
```
# Compila o projeto e executa 'Compiler' (vai usar o código de teste interno)
mvn compile exec:java -Dexec.mainClass="com.teoria_computacao.av3.Compiler"
```

### Opção 2: Rodar Compilando um Arquivo Específico (Recomendado)

#### Pelo Terminal da IDE (IntelliJ):
Crie um arquivo na sua linguagem (ex: meu_teste.av3) na raiz do projeto
```
# Compila e executa o 'Compiler', passando um arquivo para ele traduzir
mvn compile exec:java -Dexec.mainClass="com.teoria_computacao.av3.Compiler" -Dexec.args="meu_teste.av3"
```

### Pela sua IDE (IntelliJ):

1. Vá em **"Run"** -> **"Edit Configurations...".**

2. Selecione a configuração "Compiler".

3. No campo **"Program arguments"**, digite o nome do seu arquivo: meu_teste.av3

4. Clique em "Apply" e rode pelo botão "Play".

### Exemplo de Geração

**Código AV3 de Entrada (meu_teste.av3)**

```
// Código de teste
int x = 10;
if (x > 5) {
    printf("Alto");
}
```
**Arquivo ProgramaGerado1.java Gerado:**

```
public class ProgramaGerado {
	public static void main(String[] args) {

		// Setup...
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		int x = 10;

		if (x > 5) {
			System.out.println("Alto");
		}

		// Close...
		scanner.close();
	}
}
```

## Como Construir o Executável (.jar)

O projeto está configurado para gerar um ficheiro `.jar` único que contém todo o compilador e suas dependências (ANTLR).

### Opção 1: Via Terminal:

1. Abra o terminal na pasta do projeto.


2. Execute o comando Maven:

```
mvn clean package -DskipTests
```

- **clean:** Limpa compilações anteriores.

- **package:** Compila e empacota o projeto.

- **-DskipTests:** Pula os testes unitários ( para agilizar a geração do artefato final).


### Opção 2: Via Painel do Maven (IntelliJ)

Se não conseguir usar o terminal, pode usar a interface gráfica do IntelliJ:

1. Abra a aba Maven na barra lateral direita.

3. Clique no ícone de bloqueio na barra de ferramentas do painel ("Toggle 'Skip Tests' mode"). Isso vai pular os testes unitários.

3. Expanda a pasta Lifecycle.

4. Selecione clean e package (segure Ctrl para selecionar ambos).

5. Clique com o botão direito e escolha "Run 'av3-java-compiler [clean, package]'".

**Resultado:** Em ambas as opções, o arquivo executável será criado em: `target/av3-java-compiler-1.0-SNAPSHOT.jar`.


## Como Usar o Compilador (.jar)

O arquivo `.jar` pode usado em ser em qualquer computador com Java instalado, sem precisar de IDEs ou ferramentas adicionais.

### Passo 1: Preparação

1. Crie uma nova pasta em qualquer lugar do seu computador (ex: na Área de Trabalho) Com o nome que preferir, ex: TesteCompilador.


2. Copie o `arquivo av3-java-compiler-1.0-SNAPSHOT.jar` (que está na pasta `target` do projeto) para dentro dessa nova pasta.


3. Crie um arquivo de texto nessa mesma pasta chamada meu_codigo.txt e escreva um código na linguagem AV3 dentro dele. Exemplo:

```
int n;
int i = 2;
bool isPrime = true;

printf("Digite um numero: ");
scanf(n);

// Números menores que 2 não são primos
if (n < 2) {
    isPrime = false;
} else {
    while (i < n) {
        if (n % i == 0) {
            isPrime = false;
            // força saída do loop
            i = n; 
        } else {
            i = i + 1;
        }
    }
}

if (isPrime == true) {
    printf("O numero e primo: ", n);
} else {
    printf("O numero NAO e primo: ", n);
}

printf("Encerrando calculadora\n");
```

### Passo 2: Abrir o Terminal

1. Abra a pasta TesteCompilador no Explorador de Arquivos.


2. Clique na barra de endereço da pasta, digite cmd e aperte Enter. (Isso abrirá o Prompt de Comando já dentro dessa pasta).
- Alternativa: Abra o terminal manualmente e use o comando cd para chegar até a pasta.

### Passo 3: Executar a Tradução

No terminal, digite o seguinte comando e aperte Enter:

```
java -jar av3-java-compiler-1.0-SNAPSHOT.jar meu_codigo.txt
```

### O que vai acontecer:

1. O compilador vai ler o seu arquivo meu_codigo.txt.

2. Ele vai verificar se há erros.

3. Se tudo estiver certo, ele vai criar um novo arquivo chamado ProgramaGerado1.java na mesma pasta.

### Passo 4: Rodar o Programa Gerado

Com o arquivo `.java` gerado, use o seguinte comando no cmd para rodá-lo:
```
java ProgramaGerado1.java
```
Isso executará o código traduzido e mostrará o resultado final no terminal.

## Resources

- [ANTLR Documentation](https://www.antlr.org/)
- [ANTLR 4 Grammar](https://github.com/antlr/grammars-v4)
- Grammar file: `grammar/Av3.g4`
