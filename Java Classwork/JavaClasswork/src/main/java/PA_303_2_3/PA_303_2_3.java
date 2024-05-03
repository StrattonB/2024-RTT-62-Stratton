package PA_303_2_3;

public class PA_303_2_3 {
    public static void main(String[] args) {
//    Write a program that declares an integer a variable x, assigns the value 2 to it,
//    and prints out the binary string version of the number
//    ( Integer.toBinaryString(x) ).
//    Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
//    Before printing the results,
//    write a comment with the predicted decimal value and binary string.
//    Now, print out x in decimal form and in binary notation.

        System.out.println("----------Task 1----------");
        int x = 2;
        System.out.println("The Binary value of the integer 2 is: "+ Integer.toBinaryString(x));
        x = x << 1;
        // Predicted decimal: 3
        // Predicted Binary: 100
        System.out.println("The decimal value is now: " + x);
        System.out.println("The binary value is now: " + Integer.toBinaryString(x));


//        Write a program that declares a variable x, and assigns 150 to it,
//        and prints out the binary string version of the number.
//        Now use the right shift operator (>>) to shift by 2 and assign
//        the result to x.
//        Write a comment indicating what you anticipate the decimal
//        and binary values to be. Now print the value of x and the binary string.

        System.out.println("----------Task 2----------");
        x = 150;
        System.out.println("The Binary value of the integer 2 is: "+ Integer.toBinaryString(x));
        x = x >> 1;
        // Predicted decimal: 42
        // Predicted Binary: 100100
        System.out.println("The decimal value is now: " + x);
        System.out.println("The binary value is now: " + Integer.toBinaryString(x));

//        Write a program that declares three int variables: x, y, and z.
//        Assign 7 to x and 17 to y.
//        Write a comment that indicates what you predict will be the result
//        of the bitwise and operation on x and y.
//        Now use the bitwise AND (&) operator to derive the decimal and
//        binary values, and assign the result to z.

        System.out.println("----------Task 3----------");
        x = 7;
        int y =17;
        //binary for x
        //binary for y
        int z = x & y;
        System.out.println("x & y = " + z);

//        Now, with the preceding values,
//        use the bitwise and operator to calculate the “or” value between x and y.
//        As before, write a comment that indicates what you predict the values
//        to be before printing them out.
        System.out.println("----------Task 4----------");
        z = x | y;
        System.out.println("x | y = " + z);

//        Write a program that declares an integer variable,
//        assigns a number, and uses a postfix increment operator to
//        increase the value. Print the value before and after the increment operator.

        System.out.println("----------Task 5----------");
        int num1 = 5;
        System.out.println("num1 = "+ num1);
        num1++;
        System.out.println("num1++ = "+ num1);

//        Write a program that demonstrates at least three ways to increment
//        a variable by 1 and does this multiple times.
//        Assign a value to an integer variable, print it,
//        increment by 1, print it again, increment by 1, and then print it again.

        int num2 = 10;
        num2++;
        System.out.println(num2);
        num2 = (num2+1);
        System.out.println(num2);
        num2+=1;
        System.out.println(num2);
    }
}
