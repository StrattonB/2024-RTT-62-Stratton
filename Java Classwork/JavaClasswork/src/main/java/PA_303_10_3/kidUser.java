package PA_303_10_3;

public class kidUser implements libraryUser{
    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if (age> 11){
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        } else if(age <= 11){
            System.out.println("You have successfully registered under a Kids Account.");
        }
    }

    @Override
    public void requestBook() {
        if (bookType == "Kids"){
            System.out.println("Book issued successfully, please return the book within 10 days.");
        } else{
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }




}
