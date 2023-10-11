package Lesson12_StringManagement;

import java.util.Scanner;

public class manageString {
    public static void main(String[] args) {
        String s,r;
        Scanner sc = new Scanner(System.in);
        System.out.print("moi ban nhap 1 chuoi: ");
        s = sc.next();
        System.out.print("moi ban nhap chuoi tiep theo: ");
        r=sc.next();

        System.out.println(s.concat(r));
        //dao nguoc chuoi
        for (int i = s.length(); i > 0; i--) {
            System.out.print(s.charAt(i - 1));
        }
        System.out.println("");
        //hien thi chuoi in hoe
        System.out.println(s.toUpperCase());
        //Alo-->aLO
        for (int i = 0; i < s.length(); i++) {
        }
    }
}
