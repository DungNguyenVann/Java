package square;

public class suqareMain {
    public static void main(String[] args) {
        square a = new square();
        a.setA(5);
        a.getArea(5);
        a.getChuVi(5);
        System.out.println("chu vi: " + a.getChuVi(5));
        System.out.println("dien tich: " + a.getArea(5));
    }
}
