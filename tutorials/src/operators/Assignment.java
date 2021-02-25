package operators;

/*
    Assignment operators are used to assign values to variables.

    Operator	Example	    Same As
    ---------------------------------
    =	        x = 5	    x = 5               Assigns values from right side operands to left side operand
    +=	        x += 3	    x = x + 3
    -=	        x -= 3	    x = x - 3
    *=	        x *= 3	    x = x * 3
    /=	        x /= 3	    x = x / 3
    %=	        x %= 3	    x = x % 3
    &=	        x &= 3	    x = x & 3
    |=	        x |= 3	    x = x | 3
    ^=	        x ^= 3	    x = x ^ 3
    >>=	x       >>= 3	    x = x >> 3
    <<=	x       <<= 3	    x = x << 3
 */

public class Assignment {

    public int add(int number1, int number2) {
        number1 += number2;     // Same as number1 = number1 + number2
        return number1;
    }

    public int subtract(int number1, int number2) {
        number1 -= number2;     // Same as number1 = number1 - number2
        return number1;
    }

    public int multiply(int number1, int number2) {
        number1 *= number2;     // Same as number1 = number1 * number2
        return number1;
    }

    public int divide(int number1, int number2) {
        number1 /= number2;     // Same as number1 = number1 / number2
        return number1;
    }

    public int modulus(int number1, int number2) {
        number1 %= number2;     // Same as number1 = number1 * number2
        return number1;
    }

    public int and(int operand1, int operand2) {
        operand1 &= operand2;   // Same as operand1 = operand1 & operand2;
        return operand1;
    }

    public int or(int operand1, int operand2) {
        operand1 |= operand2;   // Same as operand1 = operand1 | operand2;
        return operand1;
    }

    public int exclusiveOr(int operand1, int operand2) {
        operand1 ^= operand2;   // Same as operand1 = operand1 ^ operand2;
        return operand1;
    }

    public int signedLeftShift(int operand, int numberOfTimes) {
        operand <<= numberOfTimes;   // Same as operand = operand << numberOfTimes;
        return operand;
    }

    public int signedRightShift(int operand, int numberOfTimes) {
        operand >>= numberOfTimes;   // Same as operand = operand >> numberOfTimes;
        return operand;
    }
}
