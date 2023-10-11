package BTMang2Chieu;

import java.util.Scanner;

public class iN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang thu nhat: ");
        int n = sc.nextInt();
        System.out.print("nhap so phan tu cua mang thu hai: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("arr[%d][%d] :", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.printf("mang [%d][%d]: ", n, m);
        for (int i = 0; i < n; i++) {
            System.out.print("{");
            for (int j = 0; j < m; j++) {
                System.out.printf(arr[i][j] + " ");

            }
            System.out.print("}");
        }
//tinh so nho nhat trong mang hai chieu
//        int minnn=arr[0][0];
//        for(int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                if(minnn> arr[i][j]){
//                    minnn=arr[i][j] ;
//                }
//            }
//        }
//        System.out.println("\nson nho nhat trong mang hai chieu la: "+minnn);

//tong cac so trong mang hai chieu
//        int sum = 0;
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j < m; j++) {
//                sum = sum + arr[i][j];
//            }
//        }
//        System.out.println("\ntong cac so trong mang hai chieu la: " + sum);



    }

}
