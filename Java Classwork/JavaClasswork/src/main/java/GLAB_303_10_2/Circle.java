package GLAB_303_10_2;

public class Circle extends Shape {
    protected double radius;
    private final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }

    @Override
    public double getArea() {
        //double area = PI * this.radius * this.radius;
        super.area = PI * Math.pow(this.radius, 2); // initializing value
        // in parent class variable
        return super.area; // reference to parent class variable
    }

    @Override
    public void displayShapeName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }

    @Override
    public String toString() {
        return "Circle [ radius = " + radius + super.toString() + "]";
    }
}
