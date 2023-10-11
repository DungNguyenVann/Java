package Lesson6_CircleAndCylinder;

public class Cylinder extends CirCle {
    private double height;

    Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getHeight() {
        return height;
    }

    double getArea() {
        return super.getArea() * this.getHeight();
    }

    @Override
    public String toString() {
        return "A Cylinder with radius= " + getRadius() +" height : "+ getHeight()+ "color : " + getColor();
    }
}
