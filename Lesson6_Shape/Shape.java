package Lesson6_Shape;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    Shape() {
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    String getColor() {
        return this.color = color;
    }

    boolean getFilled() {
        return this.filled = filled;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of"
                + getColor()
                + "and"
                + (isFilled() ? "filled" : " not filled");
    }

}
