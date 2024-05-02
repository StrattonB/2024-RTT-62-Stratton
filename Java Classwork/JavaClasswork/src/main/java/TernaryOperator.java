public class TernaryOperator {
    public static void main(String[] args){
//        int age =18;
//        String result;
//        if(age < 100){
//            result = "Less than 100";
//        }else{
//            result = "Greater than 100";
//        }
//        System.out.println(result);

        //Ternary
        int age = 18;
        String result = age < 100 ?
                "Less than 100" : "Greater than 100";
        System.out.println(result);
    }
}
