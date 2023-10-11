package PTBH;

import java.lang.Math;

public class PTBH {
    private int a;
    private int b;
    private int c;

    PTBH() {
    }


    PTBH(int a, int b, int c) {
        this.a = a;
        this.b = b;
    }

    int getA() {
        return this.a;
    }

    int getB() {
        return this.b;
    }

    int getC() {
        return this.c;
    }

    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    void setC(int c) {
        this.c = c;
    }

    int getDelTa() {
        return (this.b * this.b) - (4 * (this.a) * (this.c));
    }

    void getPhuongTrinh() {
        if (this.a == 0) {
            if (this.b == 0) {
                if (this.c == 0) {
                    System.out.println("vo so nghiem");
                } else {
                    System.out.println("vo nghiem");
                }
            } else {
                System.out.println("phuong trinh co nghiem la: " + (-c) / a);
            }
        }
        if (this.a != 0 && this.getDelTa() < 0) {
            System.out.println("vo nghiem");
        } else if (this.a != 0 && this.getDelTa() == 0) {
            System.out.println("phuong trinh co 1 nghiem duy nhat: " + (-b / (2 * a)));
        } else if (this.a != 0 && this.getDelTa() > 0) {
            System.out.printf("phuong trinh co 2 nghiem phan biet : x1=%d   x2=%d", (-b - Math.pow(this.getDelTa(), 1 / 2)) / 2 * a, (-b + Math.pow(this.getDelTa(), 1 / 2)) / 2 * a);
        }
    }
}

