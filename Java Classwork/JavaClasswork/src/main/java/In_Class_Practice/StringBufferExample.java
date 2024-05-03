package In_Class_Practice;

public class StringBufferExample {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("filename.txt");
        sb.insert(0,"new_");

        System.out.println(sb);

        sb.replace(0,4,"old_");
//The thing to memorize for KBA is that replace is going to first delete the items
// from 0-4 and then insert the new string at index 0.
        System.out.println(sb);

        sb.replace(0, 4, "very_old_");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
