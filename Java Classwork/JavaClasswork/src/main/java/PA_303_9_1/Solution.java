package PA_303_9_1;

public class Solution {
    public static void main(String[] args){
    class Animal{
        void walk(){
            System.out.println("I am walking");
        }
    }
     class Bird extends Animal {
        void fly() {
            System.out.println("I am flying");
        }
        void sing(){
            System.out.println("I am singing");
        }
    }

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
