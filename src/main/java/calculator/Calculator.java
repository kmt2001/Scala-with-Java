package calculator;

public class Calculator {

    // This method adds two integers a and b, and returns their sum
    // If the result exceeds the maximum value of int, it returns Integer.MAX_VALUE
    public static int add(int a, int b) {
        try {
            return Math.addExact(a, b);
        } catch (ArithmeticException e) {
            System.err.println("Integer overflow: " + e.getMessage());
            return Integer.MAX_VALUE;
        }
    }

    // This method subtracts integer b from integer a, and returns the difference
    // If the result is less than the minimum value of int, it returns Integer.MIN_VALUE
    public static int subtract(int a, int b) {
        try {
            return Math.subtractExact(a, b);
        } catch (ArithmeticException e) {
            System.err.println("Integer overflow: " + e.getMessage());
            return Integer.MIN_VALUE;
        }
    }

    // This method multiplies two integers a and b, and returns their product
    // If the result exceeds the maximum value of int, it returns Integer.MAX_VALUE
    public static int multiply(int a, int b) {
        try {
            return Math.multiplyExact(a, b);
        } catch (ArithmeticException e) {
            System.err.println("Integer overflow: " + e.getMessage());
            return Integer.MAX_VALUE;
        }
    }

    // This method divides integer a by integer b, and returns the result as a double
    // If b is zero, it throws an IllegalArgumentException with message "Cannot divide by zero"
    // If an IllegalArgumentException is thrown, it returns Double.NaN
    public static double divide(int a, int b) {
        try {
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return (double) a / b;
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return Double.NaN;
        }
    }
}
