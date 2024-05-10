package GLAB_303_10_2;

public class Rectangle extends Shape{
    public Rectangle(String color){
        super(color);
    }
    public Rectangle(){
    }
    public Rectangle(String color, double area, double base, double width, double height){
        super(color, area, base, width, height);
    }
    @Override
    public void setBase(double base){
        super.base = base;
    }
    @Override
    public void setWidth(double width){
        super.width = width;
    }
    @Override
    public double getArea(){
        return width * height;
    }
    public double perimeter(){
        super.area = super.width * super.height;
        return super.area;
    }
    //Overriding method of base class with different implementation
    public String toString(){
        return "Rectandle[height=" + height+",width="+width+","+super.toString()+"]";
    }
}
