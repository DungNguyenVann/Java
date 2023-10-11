package Lesson6_Shape;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getWidth() {
        return this.width;
    }

    double getLength() {
        return this.length;
    }

    double getArea() {
        return this.width * this.length;
    }

    double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public String toString(){
        return "A Rectangle with "
                +"width =  "+ getWidth()
                +"length= "+ getLength()
                +",which is a subclass of "
                +super.toString();
    }
}
