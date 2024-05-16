package GLAB_303_11_1;

public class myRunner {
    public static void main(String[] args){
        //initialize the class with Integer data
        DemoClass d0bj = new DemoClass();
        d0bj.genericsMethod(25);//passing int
        d0bj.genericsMethod("Per Scholas");//passing String
        d0bj.genericsMethod(2563.5);//passing float
        d0bj.genericsMethod('H'); // passing Char
    }
}
