package Lesson6_Point_And_MoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint() {
    }

    void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    float getXSpeed() {
        return this.xSpeed;
    }

    void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    float getYSpeed() {
        return this.ySpeed;
    }

    void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    float[] getSpeed() {
        float[] b = {getXSpeed(), getYSpeed()};
        return b;
    }

    @Override
    public String toString() {
        return super.toString()
                + ",speed = ("
                + getXSpeed()
                + "," + getYSpeed()
                + ")";
    }

//    MovablePoint move() {
//        float a = this.getX();
//        float b = this.getY();
//        a += xSpeed;
//        b += ySpeed;
//
//    }
}
