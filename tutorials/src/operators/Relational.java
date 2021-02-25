package operators;

/*

  Relational operators are used to check the relationship between two operands
  Returns true or false (boolean)

  Example
  boolean twoGreaterThanOne = 2 > 1;

  value of twoGreaterThanOne is true.

  2 > 1: 2 and 1 are called operands, > is the operator

 */
public class Relational {

  public boolean isEquals(int a, int b) {
    // == is the equality operator. This returns true if both the operands have same value, otherwise false.
    boolean result = (a == b);
    return result;
  }

  public boolean isNotEquals(int a, int b) {
    // != is for non-equality operator. It returns true if both the operands are referring to the different objects, otherwise false.
    boolean result = (a != b);
    return result;
  }

  public boolean isGreaterThan(int a, int b) {
    // > is greater than operator.
    boolean result = (a > b);
    return result;
  }

  public boolean isLessThan(int a, int b) {
    // < is less than operator.
    boolean result = (a < b);
    return result;
  }

  public boolean isLessThanOrEquals(int a, int b) {
    // <= is less than or equal to operator.
    boolean result = (a <= b);
    return result;
  }

  public boolean isGreaterThanOrEquals(int a, int b) {
    // >= is greater than or equal to operator.
    boolean result = (a >= b);
    return result;
  }
}
