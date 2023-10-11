package Lesson3_MangVaHamJava;

import java.util.Scanner;

public class Xoaphantukhoimang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("moi ban nhap phan tu thu %d : ", i + 1);
            arr[i] = sc.nextInt();
        }
        System.out.print("mang cua ban la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nnhap so can xoa: ");
        int x = sc.nextInt();
        int index_del = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index_del = i;
            }
        }
         for(int i=0; i<arr.length-1;i++){
             arr[index_del]=arr[index_del+1];
             n=arr.length-1;
         }


        System.out.print("\ncac phan tu cua mang sau khi xoa la: ");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
