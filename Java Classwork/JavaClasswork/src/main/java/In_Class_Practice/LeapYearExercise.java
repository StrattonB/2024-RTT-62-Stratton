package In_Class_Practice;

import java.util.Scanner;

import static java.lang.System.out;

public class LeapYearExercise {
    public static void main(String[] args) {
        out.println("Enter a year");
        calculateLeapYear();
    }

    private static void calculateLeapYear() {
        boolean leapYear = false;
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0)) {
            leapYear = true;
            out.println(year +" is a leap year");
        } else if (year % 400 == 0) {
            leapYear = true;
            out.println(year+ " is a leap year");
        } else {
            leapYear = false;
            out.println(year +" is not a leap year");
            out.println();
        }
        scanner.close();
    }

    }

