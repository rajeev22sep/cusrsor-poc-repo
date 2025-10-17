import java.util.Scanner;

/**
 * Main class to demonstrate the Calculator functionality
 * Provides an interactive menu for users to perform calculations
 */
public class CalculatorMain {
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("=================================");
        System.out.println("   Simple Calculator Application");
        System.out.println("=================================");
        
        while (running) {
            displayMenu();
            
            System.out.print("\nEnter your choice (1-11): ");
            int choice = scanner.nextInt();
            
            if (choice == 11) {
                running = false;
                System.out.println("Thank you for using the calculator. Goodbye!");
                break;
            }
            
            double num1, num2, result;
            
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = calculator.add(num1, num2);
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                        
                    case 2:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = calculator.subtract(num1, num2);
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                        
                    case 3:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = calculator.multiply(num1, num2);
                        System.out.println("Result: " + num1 + " × " + num2 + " = " + result);
                        break;
                        
                    case 4:
                        System.out.print("Enter numerator: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter denominator: ");
                        num2 = scanner.nextDouble();
                        result = calculator.divide(num1, num2);
                        System.out.println("Result: " + num1 + " ÷ " + num2 + " = " + result);
                        break;
                        
                    case 5:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = calculator.modulo(num1, num2);
                        System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                        break;
                        
                    case 6:
                        System.out.print("Enter base: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        num2 = scanner.nextDouble();
                        result = calculator.power(num1, num2);
                        System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                        break;
                        
                    case 7:
                        System.out.print("Enter number: ");
                        num1 = scanner.nextDouble();
                        result = calculator.squareRoot(num1);
                        System.out.println("Result: √" + num1 + " = " + result);
                        break;
                        
                    case 8:
                        System.out.print("Enter percentage (e.g., 25 for 25%): ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter number: ");
                        num2 = scanner.nextDouble();
                        result = calculator.percentage(num1, num2);
                        System.out.println("Result: " + num1 + "% of " + num2 + " = " + result);
                        break;
                        
                    case 9:
                        System.out.print("Enter a non-negative integer: ");
                        int factNum = scanner.nextInt();
                        long factResult = calculator.factorial(factNum);
                        System.out.println("Result: " + factNum + "! = " + factResult);
                        break;
                        
                    case 10:
                        demonstrateAllOperations(calculator);
                        break;
                        
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 11.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter valid numbers.");
                scanner.nextLine(); // Clear the buffer
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
    
    /**
     * Displays the calculator menu
     */
    private static void displayMenu() {
        System.out.println("\n---------------------------------");
        System.out.println("Calculator Operations:");
        System.out.println("---------------------------------");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (×)");
        System.out.println("4. Division (÷)");
        System.out.println("5. Modulo (%)");
        System.out.println("6. Power (^)");
        System.out.println("7. Square Root (√)");
        System.out.println("8. Percentage");
        System.out.println("9. Factorial (!)");
        System.out.println("10. Demo - Show all operations");
        System.out.println("11. Exit");
    }
    
    /**
     * Demonstrates all calculator operations with example values
     */
    private static void demonstrateAllOperations(Calculator calculator) {
        System.out.println("\n=================================");
        System.out.println("   Demonstrating All Operations");
        System.out.println("=================================");
        
        double a = 20;
        double b = 5;
        
        System.out.println("Using numbers: a = " + a + ", b = " + b);
        System.out.println();
        
        System.out.println("Addition: " + a + " + " + b + " = " + calculator.add(a, b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + calculator.subtract(a, b));
        System.out.println("Multiplication: " + a + " × " + b + " = " + calculator.multiply(a, b));
        System.out.println("Division: " + a + " ÷ " + b + " = " + calculator.divide(a, b));
        System.out.println("Modulo: " + a + " % " + b + " = " + calculator.modulo(a, b));
        System.out.println("Power: " + b + " ^ 2 = " + calculator.power(b, 2));
        System.out.println("Square Root: √" + b + " = " + calculator.squareRoot(b));
        System.out.println("Percentage: 25% of " + a + " = " + calculator.percentage(25, a));
        System.out.println("Factorial: 5! = " + calculator.factorial(5));
        
        System.out.println("\nEdge case - Division by zero:");
        try {
            calculator.divide(a, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}
