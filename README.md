# Truth Table to DNF and CNF Converter

## Overview
This Java application is designed to convert truth tables into equivalent boolean expressions in Disjunctive Normal Form (DNF) and in Conjunctive Normal Form (CNF). The program reads a truth table from standard input and outputs a boolean expression that represents the same logic. This project is aimed at reinforcing the concept of equivalency between truth tables and boolean expressions.

## Features
- **Truth Table Parsing**: Reads and interprets truth table data from standard input.
- **DNF Conversion**: Converts each line where the output is 1 to a product of variables, considering the input values for each variable.
- **CNF Conversion**: Converts each line where the output is 0 to a product of variables, considering the input values for each variable.
- **Boolean Expression Generation**: Outputs a boolean expression in DNF and CNF, representing the logic of the input truth table.

## Input Format
- The first line lists variable names used in the boolean expression.
- The second line is decorative and can be ignored.
- Subsequent lines list input values, followed by the output value.

## Example
Input:  
>| a | b | c | OUT |
>|---|---|---|-----|
>|---|---|---|-----|
>| 0 | 0 | 0 |  0  |
>| 0 | 0 | 1 |  1  |
>| 0 | 1 | 0 |  1  |
>| 0 | 1 | 1 |  0  |
>| 1 | 0 | 0 |  1  |
>| 1 | 0 | 1 |  0  |
>| 1 | 1 | 0 |  0  |
>| 1 | 1 | 1 |  1  |

Output:  
>DNF: a' b' c + a' b c' + a b' c' + a b c  
>CNF: (a + b + c)(a + b' + c')(a' + b + c')(a' + b' + c)  

## Usage
1. Run the program.
2. Enter the truth table data as per the specified format.
3. The program will output the equivalent boolean expression in DNF and CNF.

## Contributing
Contributions for extending functionality or improving the codebase are welcome. Adherence to existing coding standards is appreciated.
