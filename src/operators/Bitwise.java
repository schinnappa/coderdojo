package operators;

/*
    Bitwise operators work on binary equivalent of decimal numbers and perform operations on them bit by bit.

    First, the operands are converted to their binary representation
    Next, the operator is applied to each binary number and the result is calculated
    Finally, the result is converted back to its decimal representation

    decimal     binary
    ------------------
    0           0
    1           1
    2           10
    3           11
    4           100
    5           101
    6           110
    7           111
    8           1000
    9           1001
    10          1010
    11          1011
    12          1100
    13          1101
    14          1110
    15          1111
    ...
    ...
    ...
    
    A   B   |   A|B     A&B 	A^B 	~A
    -------------------------------------------
    0	0   |   0	    0	    0	    1
    1	0   |   1	    0	    1	    0
    0	1   |   1	    0	    1	    1
    1	1   |   1	    1	    0	    0
    -------------------------------------------
    
    Let's understand with an example; let's take two integers:

    int operand1 = 6;
    int operand2 = 5;
    
    Next, let's apply a bitwise OR operator on these numbers:

    int result = 6 | 5;
    
    To perform this operation, first, the binary representation of these numbers will be calculated:

    Binary number of operand1 = 0110
    Binary number of operand2 = 0101
    
    Then the operation will be applied to each bit. The result returns a new binary number:

    0110
    0101
    -----
    0111
    
    Finally, the result 0111 will be converted back to decimal which is equal to 7:

    result : 7
    
    ---------------
    shift operators
    ---------------

    Binary shift operators shift all the bits of the input value either to the left or right based on the shift operator.

    Lets understand with an example of left shifting value 12
    
    Let's take the value 12 as the input value.

    Now, we will move it by 2 places to the left (12 << 2) and see what will be the final result.

    The binary equivalent of 12 is 00001100. After shifting to the left by 2 places, the result is 00110000, which is equivalent to 48 in decimal
    
    Decimal to binary converter: https://www.rapidtables.com/convert/number/decimal-to-binary.html
    credits: https://www.baeldung.com/java-bitwise-operators
*/

public class Bitwise {

  public int bitwiseAnd(int operand1, int operand2) {
    
    // The AND operator compares each binary digit of two integers and gives back 1 if both are 1, otherwise it returns 0.
    
    int result = operand1 & operand2;
    return result;
  }

  public int bitwiseOr(int operand1, int operand2) {
    
    // The OR operator compares each binary digit of two integers and gives back 1 if either of them is 1.
    
    int result = operand1 | operand2;
    return result;
  }
  
  public int bitwiseExclusiveOr(int operand1, int operand2) {
    
    // The XOR operator compares each binary digit of two integers and gives back 1 if both the compared bits are different. 
    // This means that if bits of both the integers are 1 or 0 the result will be 0; otherwise, the result will be 1
    
    int result = operand1 ^ operand2;
    return result;
  }
  
  public int bitwiseComplement(int operand) {
    
    // Bitwise Not or Complement operator simply means the negation of each bit of the input value. It takes only one integer and it's equivalent to the ! operator.
    
    int result = !operand;
    return result;
  }
  
  public int signedLeftShift(int operand, int numberOfTimes) {
    /*
      The left shift operator shifts the bits to the left by the number of times specified. After the left shift, the empty space in the right is filled with 0.
      Another important point to note is that left shifting a number by one is equivalent to multiplying it by 2, or, in general, left shifting a number by n positions is equivalent to multiplication by 2^n.
    */
    
    int result = operand << numberOfTimes;
    return result;
  }
  
  public int signedRightShift(int operand, int numberOfTimes) {
    /*
        The right shift operator shifts all the bits to the right. The empty space in the left side is filled depending on the input number:

        When an input number is negative, where the leftmost bit is 1, then the empty spaces will be filled with 1
        When an input number is positive, where the leftmost bit is 0, then the empty spaces will be filled with 0
   */
   
    int result = operand >> numberOfTimes;
    return result;
  }
  
  public int unsignedRightShift(int operand, int numberOfTimes) {
    /*
        This operator is very similar to the signed right shift operator. 
        The only difference is that the empty spaces in the left are filled with 0 irrespective of whether the number is positive or negative. Therefore, the result will always be a positive integer.
   */
   
    int result = operand >>> numberOfTimes;
    return result;
  }
}
