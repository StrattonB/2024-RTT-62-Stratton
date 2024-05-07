package coffeeshop;

import java.util.Scanner;

public class Main {
    private CoffeeShop coffeeShop;
    Scanner scan = new Scanner(System.in);

    public void printMenu(){
        System.out.println("0) Exit");
        System.out.println("1) Print the list of products");
        System.out.println("2) Order a product");
    }
    public void runCoffeeShop(){
        coffeeShop = new CoffeeShop();
        coffeeShop.initProducts();
        coffeeShop.printProducts();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.runCoffeeShop();


    }
}
