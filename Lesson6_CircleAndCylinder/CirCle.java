package Lesson6_CircleAndCylinder;

public class CirCle {
    private double radius;
    private String color;

    public CirCle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    void setColor(String color) {
        this.color = color;
    }

    double getRadius() {
        return this.radius;
    }

    String getColor(){
        return this.color;
    }
    double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString(){
        return "A Circle with radius= "+ getRadius() + "color : "+ getColor();
    }
}
