package Lesson3_MangVaHamJava;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.print("nhap kich thuoc cua mang: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("kich thuoc ko hop le(>20), moi ban nhap lai: ");
            }
        } while(size > 20);

        arr =new int [size];
        int i=0;
        while (i<arr.length){
            System.out.printf("moi ban nhap phan tu thu %d: ",i+1);
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.print("mang cua ban la: ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"  ");
        }

        for(int j=0;j<arr.length/2 ;j++){
            int x=arr[j];
            arr[j]=arr[arr.length-1-j];
            arr[arr.length-1-j]=x;
        }
        System.out.print("\nmang cua ban sau khi dao nguoc la: ");
        for(int j=0;j< arr.length;j++){
            System.out.print(arr[j]+"   ");
        }

    }
}
