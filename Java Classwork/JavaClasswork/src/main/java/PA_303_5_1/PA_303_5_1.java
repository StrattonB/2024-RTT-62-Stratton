package PA_303_5_1;

import java.util.Scanner;

import static java.lang.System.out;

public class PA_303_5_1 {
    public static void main(String[] args) {
        out.println("---------- Task 1 ----------");
//  Write a program that uses nested for loops to print a multiplication table.
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                int multiple = i * j;
                out.print(multiple);
            }
        }
        out.println("---------- Task 2 ----------");
//  Write a program that prompts the user to enter two positive
//  integers, and find their greatest common divisor (GCD).
        Scanner scan = new Scanner(System.in);
        out.println("Please enter a positive integer");
        int n1 = scan.nextInt();
        out.println("Please enter another positive integer");
        int n2 = scan.nextInt();
        int gcd = n1 < n2 ? n1 :n2;
        while(n1 % gcd != 0 || n2 % gcd != 0){
            gcd--;
        }
        out.println("Greatest Common Divisor between "+n1+" and "+n2+" is " + gcd);

        out.println("---------- Task 3 ----------");
        int tuition = 10000;

        while (tuition < 20000){
            int year = 0;
            tuition+=tuition*1.07;
            System.out.println("year - "+ year +" tuition - " +tuition);
            year++;
        }
    }
}
