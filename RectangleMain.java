import java.util.Scanner;
public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rec_1 = new Rectangle();
        rec_1.setWeight(30);
        rec_1.setHeight(40);
        rec_1.getArea();
        rec_1.getChuVi();
        System.out.println(rec_1.getArea());
        System.out.println(rec_1.getChuVi());
    }
}
