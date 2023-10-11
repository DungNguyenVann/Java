package Lesson6_Shape;

public class Square extends Rectangle {

    Square() {

    }

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    void setSide(int side) {
        setLength(side);
        setWidth(side);
    }

    double getSide() {
        return getWidth();
    }

    @Override
    public String toString() {
        return "A Square with side: "
                + getWidth()
                + ",which is a subclass of "
                + super.toString();
    }
}
