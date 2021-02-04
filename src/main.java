import operators.Arithmetic;
import operators.Relational;

public class main {

    public static void main(String[] args) {

        Arithmetic math = new Arithmetic();

        int s = math.add(1, 2);
        System.out.println("Sum of 1 and 2: " + s);

        int sub = math.subtract(4, 3);
        System.out.println("Subtraction of 4 from 3: " + sub);
        
        System.out.println("Multiplication of 4 and 3: " + math.multiply(4, 3));
        System.out.println("Division of 4 by 3: " + math.divide(4, 3));
        System.out.println("Remainder when 4 is divided by 3: " + math.modulus(4, 3));
        System.out.println("Increment 4 by 1: " + math.increment(4));
        System.out.println("Decrement 4 by 1: " + math.decrement(4));
        // ...
        // ...
            
        Relational relation = new Relational();
        
        System.out.println("is 4 equals 3: " + relation.isGreaterThan(4, 3));
        System.out.println("is 4 greater than 3: " + relation.isGreaterThan(4, 3));
        System.out.println("is 4 less than 3: " + relation.isLessThan(4, 3));
        
        // ...
        // ...
        
        Bitwise bitwise = new Bitwise();
        
        System.out.println("Bitwise And on 4 and 3: " + bitwise.and(4, 3));
        System.out.println("Bitwise Or on 4 and 3: " + bitwise.or(4, 3));
        System.out.println("Bitwise Exclusive OR on 4 and 3: " + bitwise.exclusiveOr(4, 3));
        System.out.println("Bitwise complement of 4: " + bitwise.complement(4, 3));
        
        // ...
        // ...
        
        
            
        
    }
}
