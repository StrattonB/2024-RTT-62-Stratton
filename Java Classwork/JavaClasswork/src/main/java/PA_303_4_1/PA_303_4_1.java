package PA_303_4_1;

import java.util.Scanner;

import static java.lang.System.out;

public class PA_303_4_1 {
    public static void main(String[] args) {

        out.println("---------- Task 1 ----------");
//  Write a program that declares 1 integer variable x,
//  and then assigns 7 to it.
        int x = 7;
//  Write an if statement to print out “Less than 10”
//  if x is less than 10.
        if (x < 10) {
            out.println("Less than 10");
        }
//  Change x to equal 15,
        x = 15;
//  and notice the result
//  (console should not display anything)

        out.println("---------- Task 2 ----------");
//  Write a program that declares 1 integer variable x,
//  and then assigns 7 to it.
        int y = 7;
//  Write an if-else statement that prints out “Less than 10”
//  if x is less than 10, and “Greater than 10”
//  if x is greater than 10.
        if (y < 10) {
            out.println("Less than 10");
        } else {
            out.println("Greater than 10");
        }
//  Change x to 15 and notice the result.

        y = 15;
        if (y < 10) {
            out.println("Less than 10");
        } else {
            out.println("Greater than 10");
        }
        out.println("---------- Task 3 ----------");
//  Write a program that declares 1 integer variable x,
//  and then assigns 15 to it.
        int z = 15;
//  Write an if-else-if statement that prints out “Less than 10”
//  if x is less than 10;
        if (z < 10) {
            out.println("Less than 10");
        }
//  “Between 10 and 20”
//  if x is greater than 10 but less than 20,
        else if ((z > 10) && (z < 20)) {
            out.println("Between 10 and 20");
        }
//  and “Greater than or equal to 20” if x is greater than
//  or equal to 20.
        else if (z >= 20) {
            out.println("Greater than or equal to 20");
        }
//  Change x to 50 and notice the result.
        z = 50;
        if (z < 10) {
            out.println("Less than 10");
        } else if ((z > 10) && (z < 20)) {
            out.println("Between 10 and 20");
        } else if (z >= 20) {
            out.println("Greater than or equal to 20");
        }


        out.println("---------- Task 4 ----------");
//  Write a program that declares 1 integer variable x,
//  and then assigns 15 to it.
        int a = 15;
//  Write an if-else statement that prints “Out of range”
//  if the number is less than 10 or greater than 20
        if (a < 10 || a > 20) {
            out.println("Out of range");
        }
//  and prints “In range” if the number is between 10 and 20
//  (including equal to 10 or 20).
        else if (a >= 10 || a <= 20) {
            out.println("In range");
//  Change x to 5 and notice the result.
            a = 5;
            if (a < 10 || a > 20) {
                out.println("Out of range");
            } else if (a >= 10 || a <= 20) {
                out.println("In range");
            }

            out.println("---------- Task 5 ----------");
//  Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
//  A: 90-100
//  B: 80-89
//  C: 70-79
//  D: 60-69
//  F: <60
//  Use the Scanner class to accept a number score from the user to determine the letter grade. Print out “Score out of range” if the score is less than 0 or greater than 100.

            Scanner scan = new Scanner(System.in);
            out.println("Enter a student's grade");
            int studentGrade = scan.nextInt();
            if (studentGrade < 60) {
                out.println("Student's grade: F - " + studentGrade + "%");
            } else if ((studentGrade >= 60) && (studentGrade <= 69)) {
                out.println("Student's grade: D - " + studentGrade + "%");
            } else if ((studentGrade >= 70) && (studentGrade <= 79)) {
                out.println("Student's grade: C - " + studentGrade + "%");
            } else if ((studentGrade >= 80) && (studentGrade <= 89)) {
                out.println("Student's grade: B - " + studentGrade + "%");
            } else if ((studentGrade >= 90) && (studentGrade <= 100)) {
                out.println("Student's grade: A - " + studentGrade + "%");
            } else if ((studentGrade < 0) || (studentGrade > 100)) {
                out.println("Out of Range");
            }

            out.println("---------- Task 6 ----------");
//  Write a program that accepts an integer
//  between 1 and 7 from the user.
//  Use a switch statement to print out the corresponding weekday.
//  Print “Out of range” if the number is less than 1 or greater than 7.
//  Do not forget to include “break” statements in each of your cases.

            out.println("Enter a number between 1-7");
            int day = scan.nextInt();
            switch (day) {
                case 1:
                    out.println("Sunday");
                    break;

                case 2:
                    out.println("Monday");
                    break;
                case 3:
                    out.println("Tuesday");
                    break;
                case 4:
                    out.println("Wednesday");
                    break;
                case 5:
                    out.println("Thursday");
                    break;
                case 6:
                    out.println("Friday");
                    break;
                case 7:
                    out.println("Saturday");
                    break;
                default:
                    out.println("Out of Range");
            }
            out.println("---------- Task 7 ----------");

        }
    }
}
