package operators;

public class Main {

    // Main method: When this class is run, the starting point of execution is this method
    public static void main(String[] args) {

        // Create an abject of type Arithmetic
        Arithmetic math = new Arithmetic();

        // Call methods in Arithmetic class using "math" object
        int addValue = math.add(1, 2);
        System.out.println("Sum of 1 and 2: " + addValue);

        int subtractedValue = math.subtract(4, 3);
        System.out.println("Subtraction of 4 from 3: " + subtractedValue);

        // Calling methods directly inside System.out.println
        System.out.println("Multiplication of 4 and 3: " + math.multiply(4, 3));
        System.out.println("Division of 4 by 3: " + math.divide(4, 3));
        System.out.println("Remainder when 4 is divided by 3: " + math.modulus(4, 3));
        System.out.println("Increment 4 by 1: " + math.increment(4));
        System.out.println("Decrement 4 by 1: " + math.decrement(4));
        // ...
        // ...

        // Create an abject of type Relational
        Relational relation = new Relational();

        // Call methods in Relational class using "relation" object
        System.out.println("Is 4 equals 3: " + relation.isGreaterThan(4, 3));
        System.out.println("Is 4 greater than 3: " + relation.isGreaterThan(4, 3));
        System.out.println("Is 4 less than 3: " + relation.isLessThan(4, 3));

        // ...
        // ...

        // Create an abject of type Bitwise
        Logical logical = new Logical();

        // Call methods in Bitwise class using "bitwise" object
        System.out.println("Logical And of true and true: " + logical.and(true, true));
        System.out.println("Logical And of true and false: " + logical.and(true, false));
        System.out.println("Logical Or of true and true: " + logical.or(true, true));
        System.out.println("Logical Or of true and true: " + logical.or(true, false));
        System.out.println("Logical Not of true: " + logical.not(true));
        System.out.println("Logical Not of false: " + logical.not(false));

        // ...
        // ...
        // Create an abject of type Bitwise
        Bitwise bitwise = new Bitwise();

        // Call methods in Bitwise class using "bitwise" object
        System.out.println("Bitwise And on 4 and 3: " + bitwise.and(4, 3));
        System.out.println("Bitwise Or on 4 and 3: " + bitwise.or(4, 3));
        System.out.println("Bitwise Exclusive OR on 4 and 3: " + bitwise.exclusiveOr(4, 3));
        System.out.println("Bitwise Complement of 4: " + bitwise.complement(4));

        // ...
        // ...
    }
}
