package Lesson7_XayDungLopHinhhoc;

import java.lang.Math;

public class Circle extends Shape implements Area, Perimeter {
    private double radius;

    Circle() {
        this.radius = 1.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setFilled(String filled) {
        this.filled = filled;
    }

    String getColor() {
        return this.color;
    }

    String getFilled() {
        return this.filled;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return (Math.pow(this.radius, 2)) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }
}
