package Lesson3_MangVaHamJava;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("nhap phan tu thu %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        System.out.print("mang cua ban gom: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nnhap so can them: ");
        int X = sc.nextInt();
        System.out.print("nhap vi tri can them vao mang: ");
        int index = sc.nextInt();
        if (index <= -1 || index > arr.length - 1) {
            System.out.print("khong chen duoc vao mang");
        }

        int[] a = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i];
        }

        for (int i = a.length - 1; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = X;
        System.out.printf("mang sau khi them so %d la: ", X);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
