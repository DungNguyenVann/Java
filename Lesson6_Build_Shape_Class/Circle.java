package Lesson6_Build_Shape_Class;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
       return super.getColor();
    }

    public void setColor(String color) {
       super.setColor(color);
    }

    public boolean istFilled() {
        return super.isFilled();
    }

    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    double getPerimeter() {
        return Math.PI * this.radius * 2;
    }
}
