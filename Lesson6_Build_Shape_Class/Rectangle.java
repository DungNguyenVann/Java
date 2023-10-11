package Lesson6_Build_Shape_Class;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double getArea() {
        return this.width * this.length;
    }

    double getPerimeter() {
        return 2 * (this.width + this.length);
    }
}
