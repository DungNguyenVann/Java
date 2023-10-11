public class Rectangle {
    private int weight;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        this.weight = a;
        this.height = b;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public int getArea() {
        return this.weight * this.height;
    }

    public int getChuVi() {
        return (this.weight + this.height) * 2;
    }
}
