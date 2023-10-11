package BaiTap_DongGoi;

import java.util.Scanner;

public class MainClasses {
    static classes[] dsl = new classes[100];

    public static void main(String[] args) {
        dsl[1].setName("lllll");
        dsl[1].setIdClass(123);
        System.out.println(dsl[1]);

    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu :");
        System.out.println("1.Hien thi danh sach lop ");
        System.out.println("2.Them lop hoc");
        System.out.println("3.cap nhat thong tin lop hoc");
        System.out.println("4.xoa lop hoc");
        System.out.print("moi ban nhap chuc nang: ");
        int a = sc.nextInt();
        while (a > 5) {
            System.out.print("khong hop le, moi ban nhap lai (1->5): ");
            a = sc.nextInt();
        }
//        switch (a) {
//            case (1): {
//                dsl.inLop();
//                break;
//            }
//        }
    }


}
