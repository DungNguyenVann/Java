package Lesson7_XayDungLopHinhhoc;

public class Rectangle extends Shape implements Area, Perimeter {
    private int weight;
    private int height;

    Rectangle() {
        this.height = 1;
        this.weight = 1;
    }

    Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }


    void setColor(String color) {
        this.color = color;
    }

    void setFilled(String filled) {
        this.filled = filled;
    }

    void setHeight(int height) {
        this.height = height;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    String getColor() {
        return this.color;
    }

    String getFilled() {
        return this.filled;
    }

    @Override
    public double getArea() {
        return this.height*this.weight;
    }

    @Override
    public double getPerimeter() {
        return (this.height+this.weight)*2;
    }
}
