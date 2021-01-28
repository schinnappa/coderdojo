import operators.Arithmetic;

public class main {

    public static void main(String[] args) {

        Arithmetic math = new Arithmetic();

        int s = math.add(1, 2);
        System.out.println("Sum of 1 and 2 is " + s);

        int sub = math.subtraction(4, 3);
        System.out.println("Subtraction of 4 and 3 is " + sub);

    }
}
