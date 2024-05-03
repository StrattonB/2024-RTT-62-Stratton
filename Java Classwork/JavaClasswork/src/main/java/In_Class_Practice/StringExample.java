package In_Class_Practice;

public class StringExample {
    public static void main(String[] args){
        String str = "This is a string. The more text I add, the length will increase";


        System.out.println("The length of the string = " + str.length());
        System.out.println("The string is empty : " + str.isEmpty());
        System.out.println("Converted to upper case: " + str.toUpperCase());
        System.out.println("Converted to lower case: " + str.toLowerCase());

        String fileName = "document.pdf";
        System.out.println("The file name is " + fileName + "and the length is " + fileName.length());
        System.out.println("The period is at the index " + fileName.indexOf('.'));
        System.out.println("The file extension is " + fileName.substring(fileName.indexOf('.')+1));
        System.out.println("The name of the file is " + fileName.substring(2, fileName.indexOf('.')));
    }
}
