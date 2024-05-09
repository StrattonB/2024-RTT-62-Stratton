package In_Class_Practice;

public class SBA1Practice {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // part 1 - create a for loop to print each character of the string s on its own line
        // you can use the s.charAt(pos) function

        /*
          A
          B
          C
          D
          E
          F
          G
          ...
         */
        System.out.println("---------- Task 1 ----------");
        for (int pos = 0; pos < s.length(); pos++) {
            char letter = s.charAt(pos);
            System.out.println(letter);
        }
        System.out.println("---------- Task 2 ----------");
        // part 2
        // Given the following Strings convert them to integer values   Integer.valueOf()
        String ten = "10";
        String hundred = "100";
        int iTen = Integer.valueOf(ten);
        System.out.println(iTen);
        int iHundred = Integer.valueOf(hundred);
        System.out.println(iHundred);
        // part 3
        // given an integer array find the sum of all the integers in the array
        System.out.println("---------- Task 3 ----------");
        int[] array = {2, 4, 5, 6, 7, 8, 10};
        int sum = 0;
        for (int pos = 0; pos < array.length; pos++) {
            sum += array[pos];
        }
        System.out.println("Sum of array = " + sum);
        // part 4
        // given the array of string covert them to numbers and print the sum
        System.out.println("---------- Task 4 ----------");
        String[] nums = {"2", "4", "5", "6", "7", "8", "10"};
        int sum2 = 0;
        for (int pos = 0; pos < nums.length; pos++) {
            int num = Integer.valueOf(nums[pos]);
            sum2 += num;
        }
        System.out.println("sum of array = "+sum2);
    }


}
