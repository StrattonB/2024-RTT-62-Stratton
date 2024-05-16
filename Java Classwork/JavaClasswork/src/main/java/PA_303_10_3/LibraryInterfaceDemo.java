package PA_303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args){
        kidUser newKid = new kidUser();
        newKid.age = 10;
        newKid.bookType = "Kids";
        newKid.registerAccount();
        newKid.requestBook();

        kidUser newKid2 = new kidUser();
        newKid2.age = 18;
        newKid2.bookType = "Fiction";
        newKid2.registerAccount();
        newKid2.requestBook();

        adultUser newUser = new adultUser();
        newUser.age = 5;
        newUser.bookType = "Kids";
        newUser.registerAccount();
        newUser.requestBook();

        adultUser newUser2 = new adultUser();
        newUser2.age = 23;
        newUser2.bookType = "Fiction";
        newUser2.registerAccount();
        newUser2.requestBook();
    }
}
