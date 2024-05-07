package In_Class_Practice;

public class smallestValue {
    public static void main(String[] args){
        int[] myArray = {0,2,4,6,8,10};

        int minVal=myArray[0];
        for(int i=0; i<myArray.length; i++){
            minVal = myArray[i];
        }
        System.out.println("minVal = " + minVal);
    }
}
