public class VariableExample {

    /*
        Variables must start with either a letter or an underscore _, or a dollar $ sign

        There are four types of variables
            1. Class variables (Static fields)
            2. Instance variables (Non static fields)
            3. Local variables: Variables declared inside a method
            4. parameters: Variables method expects a value for
    */

    /***** BEGIN class variables *****/

    static double PI = 3.14;

    /***** END class variables *****/

    /***** BEGIN instance variables *****/

    // Declare variable
    int instanceVariable1;

    // Declare and assign variable
    float instanceVariable2;

    /***** END instance variables *****/

    public void method1(int parameter1, boolean parameter2, float parameter3) {
        // parameter1, parameter2 and parameter3 are method parameters

        /***** BEGIN local variables *****/

        boolean localBooleanVariable = true;
        int localIntVariable;

        /***** END local variables *****/
    }
}
