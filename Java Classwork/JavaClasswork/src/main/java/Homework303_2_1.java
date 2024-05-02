import java.text.DecimalFormat;

public class Homework303_2_1 {
        
    public static void main(String[] args){

//        Write a program that declares two integer variables, assigns an integer to each, and adds them together.
//        Assign the sum to a variable. Print out the result.
           System.out.print("1. ");
            int num1 = 10;
            int num2 = 20;

            int sum = num1+num2;
            System.out.println("Sum of Integers = " + sum);
            System.out.println(" ");

//        Write a program that declares two integer variables, assigns an integer to each, and adds them together.
//        Assign the sum to a variable. Print out the result.
            System.out.print("2. ");
            double dNum1 = 42.6d;
            double dNum2 = 78.4d;

            double dSum = dNum1+dNum2;
            System.out.println("Sum of Doubles = " + dSum);
            System.out.println(" ");

//        Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
//        Assign the sum to a variable. Print out the result. What variable type must the sum be?
            System.out.print("3. ");
            int num3 = 13;
            double dNum3 = 65.5d;

            double dSum2 = num3+dNum3;
            System.out.println("Sum of Integer and Double = " + dSum2 +". The sum must be variable type double.");
            System.out.println(" ");

//        Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
//        Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens?
//        What corrections are needed?
            System.out.print("4. ");

            int num4 = 35;
            int num5 = 30;

            int divi = num4/num5;
            System.out.println("The result of dividing two integers is " + divi);
            System.out.println(" ");

//         Write a program that declares two double variables, assigns a number to each,
//         and divides the larger by the smaller number. Assign the result to a variable.
//         Print out the result. Now, cast the result to an integer. Print out the result again.
            System.out.print("5. ");
            double d1 = 47.6;
            double d2 = 989.5;

            double divi2 = d2/d1;
            System.out.println("The result of dividing two integers is " + (int)divi2);

            int diviInt = (int)d2/(int)d1;
            System.out.println("The result of casting to integer then dividing is " + diviInt);
            System.out.println(" ");

//            Write a program that declares two integer variables, x and y,
//            and assigns the number 5 to x and the number 6 to y.
//            Declare a variable q and assign y/x to it and print q.
//            Now, cast y to a double and assign it to q. Print q again.
            System.out.print("6. ");
            int x = 5;
            int y = 6;
            double q = y/x;
            System.out.println("Q = " + q);
            q=(double)y;
            System.out.println("Q now = " + q);
            System.out.println(" ");

//            Write a program that declares a named constant and uses it in a calculation. Print the result.
            System.out.print("7. ");
            final double PI = 3.14;
            double diameter = 18;
            double circumference = PI * diameter;
            System.out.println("The circumference of a circle with a diameter of "+ diameter + "= " + PI);
            System.out.println(" ");
            

//            Write a program where you create three variables that represent products at a cafe.
//            The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
//            Assign prices to each product.
//            Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product,
//            four items of the second product, and two items of the third product. Add them all together to calculate the subtotal.
//            Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
//            Be sure to format the results to two decimal places.
            System.out.print("8. ");
            double coffee = 2.50;
            double cappuccino = 3.50;
            double espresso = 4.50;

            double subtotal=(coffee *3) + (cappuccino *4) + (espresso *2);
            final double SALES_TAX = 0.06*subtotal;
            double total = subtotal + SALES_TAX;
            DecimalFormat df= new DecimalFormat("0.00");
            System.out.println("Subtotal: $" + df.format(subtotal));
            System.out.println("Sales tax: $"+df.format(SALES_TAX));
            System.out.println("Total Cost $" + df.format(total));


    }
}
