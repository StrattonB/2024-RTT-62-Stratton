package PA_303_7_1;

import java.util.Arrays;
import java.util.Scanner;

public class PA_303_7_1 {
    public static void main(String[] args) {
        System.out.println("---------- Task 1 ----------");

//  Write a program that creates an array of integers with a length of 3.
//  Assign the values 1, 2, and 3 to the indexes.
//  Print out each array element.

        int[] array = {1, 2, 3};
        for (int pos = 0; pos < array.length; pos++) {
            System.out.println("position " + pos + " " + "value " + array[pos]);
        }

        System.out.println("---------- Task 2 ----------");

//  Write a program that returns the middle element in an array.
//  Give the following values to the integer array: {13, 5, 7, 68, 2}
//  and produce the following output: 7

        int[] array2 = {13, 5, 7, 68, 2};
        if (array2.length % 2 != 0) {

            System.out.println(array2[array2.length / 2]);
        } else {
            System.out.println(array2[array2.length / 2 - 1]);
        }

        System.out.println("---------- Task 3 ----------");

//  Write a program that creates an array of String type
//  and initializes it with the strings “red,” “green,” “blue,” and “yellow.”
//  Print out the array length. Make a copy using the clone( ) method.
//  Use the Arrays.toString( ) method on the new array to verify
//  that the original array was copied.

        String[] array3 = {"red", "green", "blue", "yellow"};
        System.out.println(array3.length);
        String[] newArray = array3.clone();
        System.out.println(Arrays.toString(newArray));

        System.out.println("---------- Task 4 ----------");

//  Write a program that creates an integer array with 5 elements
//  (i.e., numbers). The numbers can be any integers.

        int[] array4 = {13, 64, 75, 24, 96};

//  Print out the value at the first index and the last index using length - 1
//  as the index. Now try printing the value at index = length
//  (e.g., myArray[myArray.length] ).

        System.out.println("First index: " + array4[0]);
        System.out.println("Last index: " + (array4[array4.length - 1]));
        System.out.println("Index = length: " + array4[array.length]);

        System.out.println("---------- Task 5 ----------");

//  Write a program where you create an integer array with a length of 5.
//  Loop through the array and assign the value of the loop control variable
//  (e.g., i) to the corresponding index in the array.

        int[] array5 = {23, 56, 24, 87, 98};
        for (int pos = 0; pos < array5.length; pos++) {
            System.out.print("index = " + pos);
            System.out.println(" value = " + array5[pos]);
        }

        System.out.println("---------- Task 6 -----------");
//  Write a program where you create an integer array of 5 numbers.
//  Loop through the array and assign the value of the loop control
//  variable multiplied by 2 to the corresponding index in the array.

        int[] array6 = {28, 39, 47, 52, 85};
        for (int pos = 0; pos < array6.length; pos++) {
            System.out.println("Before calculations:");
            System.out.println("position: " + pos + " value: " + array6[pos]);
            array6[pos] = (pos * 2);
            System.out.println("After calculations:");
            System.out.println("position: " + pos + " value: " + array6[pos]);
        }

        System.out.println("---------- Task 7 ----------");

//  Write a program where you create an array of 5 elements.
//  Loop through the array and print the value of each element,
//  except for the middle (index 2) element.

        int[] array7 = {83, 52, 47, 39, 10};
        for (int pos = 0; pos < array7.length; pos++) {
            if (pos != 2) {
                System.out.println("index: " + pos + " value: " + array7[pos]);
            }

        }

        System.out.println("---------- Task 8 ----------");
//  Write a program that creates a String array of 5 elements and swaps the first element
//  with the middle element without creating a new array.

        String[] array8 = {"one", "two", "three", "four", "five"};
        System.out.println("original array: " + Arrays.toString(array8));
        int middle = array8.length / 2;
        String temp = array8[0];
        array8[0] = array8[middle];
        array8[middle] = temp;
        System.out.println("array after swapping: " + Arrays.toString(array8));

        System.out.println("---------- Task 9 ----------");

//  Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
//  Print the array in ascending order, and print the smallest and the largest element of the array.
//  The output will look like the following:
//  Array in ascending order: 0, 1, 2, 4, 9, 13
//  The smallest number is 0
//  The biggest number is 13

        int[] array9 = {4, 2, 9, 13, 1, 0};
        for (int outer = 0; outer < array9.length; outer++) {
            for (int pos = 0; pos < array9.length - 1; pos++) {
                if (array9[pos] > array9[pos + 1]) {
                    int temp2 = array9[pos];
                    array9[pos] = array9[pos + 1];
                    array9[pos + 1] = temp2;
                }
            }
            System.out.println(Arrays.toString(array9));
        }

        System.out.println("---------- Task 10 ----------");
//  Create an array that includes an integer, 3 strings, and 1 double. Print the array.

        Object[] array10 = {10, "hello", "I'm", "Ben", 3.14};

        System.out.println("Array:");
        for (Object element : array10) {
            System.out.println(element);
        }

        System.out.println("---------- Task 10 ----------");
//  Write some Java code that asks the user how many favorite things they have.
        Scanner scan = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int numOfFavs = scan.nextInt();
//  Based on their answer, you should create a String array of the correct size.
        String[] favs = new String[numOfFavs];
//  Then ask the user to enter the things and store them in the array you created.
        for (int pos = 0; pos < numOfFavs; pos++) {
            System.out.println("Enter favorite thing # " + (pos + 1) + ": ");
            favs[pos] = scan.next();
        }
//  Finally, print out the contents of the array.
        for (String thing : favs) {
            System.out.println(thing);
        }


    }
}
