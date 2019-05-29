# Compiler_Project
## Compiler's project overview:

This project will direct you to design and build an interpreter for Cool. Each phase will cover one component of the interpreter:    lexical analysis, parsing, and code generation in three address code. Each phase will ultimately result in a working compiler phase which can interface with the other phases.

## Prerequisites
- Install any  ide such as Intellij, NetBeans, Eclipse (Intellij is preferred )
- then follow this link : https://github.com/antlr/antlr4/blob/master/doc/java-target.md
- bring your grammar (in this project it is COOL.g4)
- press Ctrl+Shift+G

Then our environment is ready  :D
## Structure
## 1)Lexical analysis:
### Introduction :
Lexical analysis is the first phase of a compiler. It takes the modified source code from language preprocessors that are written in the form of sentences. The lexical analyzer breaks these syntaxes into a series of tokens, by removing any whitespace or comments in the source code.
If the lexical analyzer finds a token invalid, it generates an error. The lexical analyzer works closely with the syntax analyzer. It reads character streams from the source code, checks for legal tokens, and passes the data to the syntax analyzer when it demands.


