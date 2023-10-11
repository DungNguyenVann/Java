package Lesson6_Point_And_MoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    Point() {
    }

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    void setX(float x) {
        this.x = x;
    }

    void setY(float y) {
        this.y = y;
    }

    void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float getX() {
        return this.x;
    }

    float getY() {
        return this.y;
    }

    float[] getXY() {
       float[] a = {getX(), getY()};
        return a;
    }

    @Override
    public String toString(){
         return "(x,y)= "+"("+getX()+","+getY()+")";
    }
}
