package operators;

/*
    Class is a blueprint for an object. Before creating an object we first need to define a class.

    Create a class using 'class' keyword. Example

    AccessSpecifier class ClassName {
        // Variables
        // Methods
    }

    Variables: Also called as Fields. Fields are used to store data
    methods: Methods are used to perform an operation

    In the below class,
    Arithmetic class is used to perform operations add, subtract, multiply and so on.
    Arithmetic class does not have fields.
 */
public class Arithmetic {

    /*** BEGIN Variables ***/

    int sum;
    int difference;
    int product;

    /*** END Variables ***/

    /*** BEGIN Methods ***/

    public int add(int number1, int number2) {
        sum = number1 + number2;
        return sum;
    }

    public int subtract(int number1, int number2) {
        difference = number1 - number2;
        return difference;
    }

    public int multiply(int number1, int number2) {
        product = number1 * number2;
        return product;
    }

    public int divide(int dividend, int divisor) {
        int quotient;
        quotient = dividend / divisor;
        return quotient;
    }

    public int modulus(int dividend, int divisor) {
        int remainder;
        remainder = dividend % divisor;
        return remainder;
    }

    public int increment(int number) {
        int incrementByOne;
        incrementByOne = number++;  // This is the short form of: incrementByOne = number + 1;
        return incrementByOne;
    }

    public int decrement(int number) {
        int decrementByOne;
        decrementByOne = number--;  // This is the short form of: incrementByOne = number -1 1;
        return decrementByOne;
    }

    /*** END Methods ***/
}
