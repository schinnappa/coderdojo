package operators;

/*
    Logical operators are used to check whether an expression is true or false (boolean).

    A       B       |   A || B  A && B  ~A
    -------------------------------------------
    false	false   |   false   false   true
    true	false   |   true    false   false
    false	true    |   true    false   true
    true	true    |   true    true    false
    -------------------------------------------

    Zero represents false and any non-zero number is true

    A   B   |   A || B  A && B 	~A
    -------------------------------------------
    0	0   |   false   false   true
    1	0   |   true    false   false
    0	1   |   true    false   true
    1	1   |   true    true    false
    -------------------------------------------
 */

public class Logical {

    public boolean and(boolean operand1, boolean operand2) {

        // result is true if both operands are true. If atLeast one operand is false then result is false.

        boolean result = operand1 && operand2;
        return result;
    }

    public boolean or(boolean operand1, boolean operand2) {

        // result is true if at least one operand is true.

        boolean result = operand1 || operand2;
        return result;
    }


    public boolean not(boolean operand) {
        // Reverses the logical state on its operand
        return !operand;
    }
}
