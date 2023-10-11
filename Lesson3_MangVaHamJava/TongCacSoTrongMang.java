package Lesson3_MangVaHamJava;

import java.util.Scanner;

public class TongCacSoTrongMang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("moi ban nhap phan tu thu [%d]: ", i + 1);
            arr[i] = sc.nextInt();
        }

        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }
        System.out.printf("tong cac phan tu trong mang la : "+sumArr);
    }

    public static void sum(int[] a, int s) {
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
    }
}
