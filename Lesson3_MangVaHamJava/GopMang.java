package Lesson3_MangVaHamJava;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang thu nhat: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("nhap so phan tu cua mang thu hai: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int x=0;
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[x] = arr1[i];
            x++;
        }
        for (int j = 0; j <arr2.length; j++) {
            arr3[x] = arr2[j];
            x++;
        }
        System.out.print("mang sau khi gop la: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }


    }
}
