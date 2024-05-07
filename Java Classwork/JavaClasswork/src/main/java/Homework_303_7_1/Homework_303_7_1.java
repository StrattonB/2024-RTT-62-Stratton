package Homework_303_7_1;

import java.util.Arrays;

public class Homework_303_7_1 {
    public static void main(String[] args) {
        //create an in array of length 10
        //initialize the array to random integers

        int[] array = {13, 29, 6, 96, 45, 32, 57, 83, 75, 39};

        //get the smallest integer in the array
        //get the largest integer in the array

        int smallest = array[0];
        int largest = array[0];
        int total = 0;


        //only use a single for loop
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
            total += num;
        }
        //calculate the average of the array as a double.
        double average = (double) total / array.length;
        System.out.println(Arrays.toString(array));
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println("Average: " + average);

    }
}
