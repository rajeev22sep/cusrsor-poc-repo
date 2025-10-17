# cusrsor-poc-repo

## Java Calculator Application

A simple command-line calculator application in Java that performs all basic arithmetic operations.

### Features

- **Addition** (+): Add two numbers
- **Subtraction** (-): Subtract two numbers
- **Multiplication** (×): Multiply two numbers
- **Division** (÷): Divide two numbers with zero-division error handling
- **Modulo** (%): Calculate remainder
- **Power** (^): Raise a number to a power
- **Square Root** (√): Calculate square root with negative number error handling
- **Percentage**: Calculate percentage of a number (e.g., 25% of 200)
- **Factorial** (!): Calculate factorial of a non-negative integer (0! to 20!)
- **Interactive Menu**: User-friendly command-line interface
- **Demo Mode**: Demonstrates all operations with sample values

### Files

- `Calculator.java` - Core calculator class with all arithmetic operations
- `CalculatorMain.java` - Main application with interactive menu

### How to Run

1. Compile the Java files:
```bash
javac Calculator.java CalculatorMain.java
```

2. Run the application:
```bash
java CalculatorMain
```

3. Follow the interactive menu to perform calculations or select option 8 to see a demo of all operations.

### Example Usage

```
=================================
   Simple Calculator Application
=================================

---------------------------------
Calculator Operations:
---------------------------------
1. Addition (+)
2. Subtraction (-)
3. Multiplication (×)
4. Division (÷)
5. Modulo (%)
6. Power (^)
7. Square Root (√)
8. Percentage
9. Factorial (!)
10. Demo - Show all operations
11. Exit

Enter your choice (1-11): 1
Enter first number: 15
Enter second number: 7
Result: 15.0 + 7.0 = 22.0
```