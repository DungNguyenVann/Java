package BaiTap_DongGoi;

import java.lang.Math;

public class Cricle {
    private double radius = 1.0;
    private String color = "red";

    Cricle() {
    }

    ;

    Cricle(int radius) {
        this.radius = radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    void setColor(String color) {
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    String getColor() {
        return color;
    }

    double getArea() {
        return this.radius * Math.PI;
    }

    public static void main(String[] args) {
        Cricle a = new Cricle();
        a.setColor("yellow");
        a.setRadius(2.0);
        System.out.println(a.getColor());
        System.out.println(a.getRadius());
        System.out.println(a.getArea());
    }
}
