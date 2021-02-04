package operators;

public class Arithmetic {

    public int add(int number1, int number2) {
        int sum;
        sum = number1 + number2;
        return sum;
    }

    public  int subtract(int number1, int number2) {
        int difference;
        difference = number1 - number2;
        return difference;
    }

    public  int multiply(int number1, int number2) {
        int product;
        product = number1 * number2;
        return product;
    }
    
    public  int divide(int dividend, int divisor) {
        int quotient;
        quotient = dividend / divisor;
        return quotient;
    }
    
    public  int modulus(int dividend, int divisor) {
        int remainder;
        remainder = dividend % divisor;
        return remainder;
    }
    
    public  int increment(int number) {
        int incrementByOne;
        incrementByOne = number++;  // This is the short form of: incrementByOne = number + 1;
        return incrementByOne;
    }
    
    public  int decrement(int number) {
        int decrementByOne;
        decrementByOne = number--;  // This is the short form of: incrementByOne = number -1 1;
        return decrementByOne;
    }
}
