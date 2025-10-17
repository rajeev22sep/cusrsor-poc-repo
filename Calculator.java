/**
 * A simple calculator class that performs basic arithmetic operations.
 * Supports addition, subtraction, multiplication, division, and modulo operations.
 */
public class Calculator {
    
    /**
     * Adds two numbers
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Subtracts second number from first
     * @param a First number
     * @param b Second number
     * @return Difference of a and b
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplies two numbers
     * @param a First number
     * @param b Second number
     * @return Product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Divides first number by second
     * @param a First number (numerator)
     * @param b Second number (denominator)
     * @return Quotient of a and b
     * @throws ArithmeticException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
    
    /**
     * Calculates modulo (remainder) of first number divided by second
     * @param a First number
     * @param b Second number
     * @return Remainder of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public double modulo(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot perform modulo with zero!");
        }
        return a % b;
    }
    
    /**
     * Calculates power of a number
     * @param base Base number
     * @param exponent Exponent
     * @return base raised to the power of exponent
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    /**
     * Calculates square root of a number
     * @param a Number to find square root of
     * @return Square root of a
     * @throws ArithmeticException if a is negative
     */
    public double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot calculate square root of negative number!");
        }
        return Math.sqrt(a);
    }
    
    /**
     * Calculates percentage of a number
     * @param percentage The percentage value (e.g., 25 for 25%)
     * @param number The number to calculate percentage of
     * @return The percentage value (e.g., 25% of 200 = 50)
     */
    public double percentage(double percentage, double number) {
        return (percentage / 100) * number;
    }
}
