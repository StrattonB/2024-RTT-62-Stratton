package In_Class_Practice;

import java.util.Arrays;

public class ArrayDeleteFunction {
    public static int[] delete(int[] source, int deletedPosition){
        int[] result = new int[source.length-1];
        for(int pos = 0; pos < source.length; pos++){
            if(pos != deletedPosition){
                result[pos]=source[pos];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        int deletedPosition = 4;

        array=delete(array, deletedPosition);
        System.out.println(Arrays.toString(array));
    }
}
