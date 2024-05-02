import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc1.nextInt();
        System.out.println(num1);
        boolean isTrue = (sc1 instanceof Scanner);
        System.out.print("sc1 is a Scanner: "+  isTrue);


    }
}
