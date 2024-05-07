package In_Class_Practice;

public class ArrayInsert {
    public static void main(String[] args) {
        //original array
        //pos 01234
        //val 12345
        int[] array = {1, 2, 3, 4, 5};
        //array after inserting
        //pos 012345
        //val 12 345

        //insert an element into the array at position 2
        // 1) create a new array of size +1
        int[] insert = new int[array.length + 1];

        // 2) copy the first part of the array (before position 2) from the old to the new
        for (int pos = 0; pos < 2; pos++) {
            insert[pos] = array[pos];
        }
        // 3) insert the value we want in position 2
        insert[2] = 9;
        //4)copy over the rest of the array
        for (int pos = 2; pos < array.length; pos++) {
            insert[pos + 1] = array[pos];
        }
        for (int value : insert) {
            System.out.println(value);
        }
    }
}
