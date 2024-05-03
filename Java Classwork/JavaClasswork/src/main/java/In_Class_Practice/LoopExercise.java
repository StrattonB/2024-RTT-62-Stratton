package In_Class_Practice;

public class LoopExercise {
    public static void main(String[] args) {

        for (int count = 10; count > 0; count--) {
            if ( count % 2 == 0 ) {
                System.out.println("This is an even number");

                for (int d = 0 ; d < 5 ; d++ ) {
                    System.out.println("The count = " + count + "." + d);
                }
            }
        }

    }
}
