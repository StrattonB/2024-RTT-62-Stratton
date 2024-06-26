package coffeeshop;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    List<Product> products = new ArrayList<>();

    public void initProducts() {
        Product smallCoffee = new Product();
        smallCoffee.setPrice(5.46);
        smallCoffee.setName("Small Coffee");
        smallCoffee.setBeverage(true);
        products.add(smallCoffee);

        Product largeCoffee = new Product();
        largeCoffee.setPrice(9.46);
        largeCoffee.setName("Large Coffee");
        largeCoffee.setBeverage(true);
        products.add(largeCoffee);

        Product cakePop = new Product();
        cakePop.setPrice(3.86);
        cakePop.setName("Cake Pop");
        cakePop.setBeverage(false);
        products.add(cakePop);

        Product eggSandwich = new Product(7.89, "Egg Sandwich", false);
        products.add(eggSandwich);
    }
    public void printProducts(){
        for(int pos = 0; pos < products.size(); pos++){
            Product product = products.get(pos);
            System.out.println((pos+1) + ") " + product.getName() + "\t" + product.getPrice());

        }
    }
}
