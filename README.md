# Postfix Notation Calculator

## Overview

This Java program evaluates expressions written in postfix notation. Postfix notation, also known as Reverse Polish Notation (RPN), is a mathematical notation in which every operator follows all of its operands. For example, while the infix notation "3 + 4" places the operator (+) between the operands (3 and 4), the postfix notation would be "3 4 +".

## How Postfix Notation Works

Postfix notation eliminates the need for parentheses and prioritizes the order of operations. The evaluation process follows these steps:

1. Start scanning the expression from left to right.
2. If an operand is encountered, push it onto the stack.
3. If an operator is encountered, pop the required number of operands from the stack, perform the operation, and push the result back onto the stack.
4. Continue scanning until the entire expression is evaluated, and the final result is the only value left on the stack.

## Program Structure

The program consists of three main classes: `Main`, `Calculator`, and `OperandStack`.

### `Main` Class

The `Main` class serves as the entry point of the program. It reads expressions from a file or provides them directly, then calls the `evaluateExpression` method of the `Calculator` class to evaluate each expression.

### `Calculator` Class

The `Calculator` class evaluates expressions in postfix notation. It uses an instance of the `OperandStack` class to manage operands. The `evaluateExpression` method takes a postfix expression as input, evaluates it, and returns the result.

### `OperandStack` Class

The `OperandStack` class implements a stack data structure to manage operands during expression evaluation. It provides methods to push operands onto the stack, pop operands from the stack, and check if the stack is empty.

## How to Use

Clone this repo:
```
git clone https://github.com/juampam/posix-calculator
```
To use the program, follow these steps:

1. Compile the Java files using a Java compiler.
   
   ```
   javac src/main/java/posixCalculator/*.java

   ```
3. Run the compiled `Main` class.
   ```
   cd src/main/java/posixCalculator
   java Main
   ```
5. Provide postfix expressions to evaluate either through a file or directly in the program, you can use this code to fill the file whit some examples:
   ```
   echo "" > datos.txt && echo -e "2 3 * 4 +\n5 1 2 + 4 * +\n9 3 / 2 +\n7 2 - 3 *\n8 2 / 2 *" > datos.txt
   ```
7. The program will output the result of each expression.

## Examples

Consider the following postfix expressions:

1. Expression: "2 3 * 4 +"
   - Evaluation: (2 * 3) + 4
   - Result: 10

2. Expression: "5 1 2 + 4 * +"
   - Evaluation: 5 + (1 + 2) * 4
   - Result: 15

3. Expression: "9 3 / 2 +"
   - Evaluation: (9 / 3) + 2
   - Result: 5

4. Expression: "7 2 - 3 *"
   - Evaluation: (7 - 2) * 3
   - Result: 15

5. Expression: "8 2 / 2 *"
   - Evaluation: (8 / 2) * 2
   - Result: 8
