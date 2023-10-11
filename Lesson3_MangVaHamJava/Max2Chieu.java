package Lesson3_MangVaHamJava;

import java.util.Scanner;

public class Max2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang thu nhat: ");
        int n = sc.nextInt();
        System.out.print("nhap so phan tu cua mang thu hai: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("arr[" + i + "]" + "[" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.printf("Mang cua ban la: arr[%d][%d]: ",n,m);
        for (int i = 0; i < n; i++) {
            System.out.print(" {");
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.print("} ");
        }


        int maxx = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maxx < arr[i][j]) {
                    maxx = arr[i][j];
                }
            }
        }
        System.out.println("\n"+maxx);
    }
}
