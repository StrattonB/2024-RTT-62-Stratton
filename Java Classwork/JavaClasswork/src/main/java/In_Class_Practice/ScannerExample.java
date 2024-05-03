package In_Class_Practice;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        //Ask user to enter a number and capture that number
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter a number between 1-10: ");
        int num1 = sc1.nextInt();
        System.out.println(num1);
        boolean isTrue = (sc1 instanceof Scanner);
        System.out.println("sc1 is a Scanner: "+  isTrue);
        sc1.close();
        //Create a random number guess and compare with Ternary Operator
        //to see if the number equals the number the user input
//        DecimalFormat df= new DecimalFormat("0");
//        double guess = (Math.random()*10);
//        String result;
//        result= guess == num1 ?
//           "I guessed your number!" : "I was wrong.";
//        System.out.println("My guess is: "+ df.format(guess));
//        System.out.println(result);


    }
}
