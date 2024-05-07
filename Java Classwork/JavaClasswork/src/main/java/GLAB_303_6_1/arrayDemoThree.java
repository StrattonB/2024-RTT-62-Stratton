package GLAB_303_6_1;

public class arrayDemoThree {
    public static void main(String[] args){
        int[] numbers = {2,-9,0,5,12,-25,22,9,8,12};
        int sum = 0;
        double average;
        //access all elements using for each Loop
        //add each element in sum
        for(int number:numbers){
            sum+=number;
        }
        //get total number of elements
        int arrayLength = numbers.length;
        //calculate the average
        //convert the average from int to double
        average = ((double)sum/(double)arrayLength);
        System.out.println("Sum = "+ sum);
        System.out.println("Average - " + average);
    }
}
