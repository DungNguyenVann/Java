package Lesson3_MangVaHamJava;

import java.util.Scanner;

public class tongCacSochiahetcho4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("nhap so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] arr = intputArray(n);
        int summ = tongchiahetcho4(arr);
        System.out.print("tong cac chu so trong mang la: " + summ);
    }


    public static int tongchiahetcho4(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 4 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static int[] intputArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("moi ban nhap phan tu thu %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
