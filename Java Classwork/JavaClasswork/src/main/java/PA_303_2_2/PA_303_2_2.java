package PA_303_2_2;

import java.util.Scanner;

public class PA_303_2_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = scan.nextInt();
        System.out.println("Enter a decimal: ");
        double d = scan.nextDouble();
        System.out.println("Please input your name: ");
        String s = scan.next();
        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
