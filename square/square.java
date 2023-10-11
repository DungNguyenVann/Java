package square;

public class square {
    private int a;


    square() {
    }

    square(int b) {
        this.a = b;
    }

    void setA(int a) {
        this.a = a;
    }

    int getA() {
        return a;
    }

    int getArea(int b) {
        return (this.a * this.a);
    }
    int getChuVi(int b){
        return this.a*4;
    }
}
