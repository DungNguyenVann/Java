package Lesson9_UngDungQuanLySach;

public class Pen extends Product{
    private String color;

    public Pen(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
