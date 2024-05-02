public class Homework303_2_1 {
    public static void main(String[] args){
//        Write a program that declares two integer variables, assigns an integer to each, and adds them together.
//        Assign the sum to a variable. Print out the result.
            int num1 = 10;
            int num2 = 20;

            int sum = num1+num2;
            System.out.println("Sum of Integers = " + sum);

//        Write a program that declares two integer variables, assigns an integer to each, and adds them together.
//        Assign the sum to a variable. Print out the result.
            double dNum1 = 42.6d;
            double dNum2 = 78.4d;

            double dSum = dNum1+dNum2;
            System.out.println("Sum of Doubles = " + dSum);

//        Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
//        Assign the sum to a variable. Print out the result. What variable type must the sum be?
            int num3 = 13;
            double dNum3 = 65.5d;

            double dSum2 = num3+dNum3;
            System.out.println("Sum of Integer and Double = " + dSum2 +". The sum must be variable type double.");

//        Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
//        Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens?
//        What corrections are needed?

            int num4 = 35;
            int num5 = 30;

            int divi = num4/num5;
            System.out.println("The result of dividing two integers is " + divi);

            

            System.out.println("The result is now "+ divi);


//         Write a program that declares two double variables, assigns a number to each,
//         and divides the larger by the smaller number. Assign the result to a variable.
//         Print out the result. Now, cast the result to an integer. Print out the result again.

            double d1 = 47.6;
            double d2 = 989.5;

            double divi2 = d2/d1;
            System.out.println("The result of dividing two integers is " + (int)divi2);

//            Write a program that declares two integer variables, x and y,
//            and assigns the number 5 to x and the number 6 to y.
//            Declare a variable q and assign y/x to it and print q.
//            Now, cast y to a double and assign it to q. Print q again.


    }
}
