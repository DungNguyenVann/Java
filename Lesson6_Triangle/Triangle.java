package Lesson6_Triangle;

public class Triangle {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    Triangle() {
    }

    Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    double getPerimeter(){
        return (this.side1 + this.side2 + this.side3);
    }

    double getArea(){
        return Math.sqrt(getPerimeter()*(getPerimeter()-side1)*(getPerimeter()-side2)*(getPerimeter()-side3));
    }

    @Override
    public String toString(){
        return "Triangle with side1 = "
                +getSide1()+",side2= "
                +getSide2()+",side3= "
                +getSide3()+ ",Area= "
                +getArea()+",Perimeter=  "
                +getPerimeter();
    }

}
