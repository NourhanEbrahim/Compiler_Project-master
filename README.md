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
![lexer](https://user-images.githubusercontent.com/38635461/58596372-11534d80-8274-11e9-8aa7-9d27ebfb1648.PNG)


### Regular Expressions:

The lexical analyzer needs to scan and identify only a finite set of valid string/token/lexeme that belong to the language in hand. It searches for the pattern defined by the language rules.
Regular expressions have the capability to express finite languages by defining a pattern for finite strings of symbols. The grammar defined by regular expressions is known as regular grammar.
The language defined by regular grammar is known as regular language.
Regular expression is an important notation for specifying patterns. 
Each pattern matches a set of strings, so regular expressions serve as names for a set of strings. Programming language tokens can be described by regular languages. The specification of regular expressions is an example of a recursive definition. Regular languages are easy to understand and have efficient implementation.
There are a number of algebraic laws that are obeyed by regular expressions, which can be used to manipulate regular expressions into equivalent forms.
For more info, 
please check: https://www.tutorialspoint.com/compiler_design/compiler_design_regular_expressions.htm
### Code:
