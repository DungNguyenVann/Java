package btHam;

import java.util.Scanner;

public class ham {
    public static void main(String[] args) {
        System.out.print("nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        showArray(a);
        System.out.print("\ntong cua cac so trong mang la: " + sumArray(a));
        System.out.print("\nso nho nhat trong mang la: " + minArray(a));
        findEl(a);
    }

    public static Scanner sc = new Scanner(System.in);

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("nhap phan tu thu %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        System.out.print("mang cua ban gom: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void findEl(int[] arr) {
        System.out.print("\nnhap so ban can tim: ");
        int x = sc.nextInt();
        int a = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.print("so nay co trong mang ");
                a = i;
            }
        }
        if (a == -1) {
            System.out.print("so nay khong co trong mang");
        }
    }

}
