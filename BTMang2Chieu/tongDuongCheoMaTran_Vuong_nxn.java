package BTMang2Chieu;

import java.util.Scanner;

public class tongDuongCheoMaTran_Vuong_nxn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so hang va cot cua ma tran vuong : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" {");
            for (int j = 0; j < n; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.print("} ");
            System.out.println();
        }
        //tong cac phan tu tren duong cheo chinh cua ma tran
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum = sum + arr[i][i];
//        }
//        System.out.println("tong cac phan tu tren duong cheo chinh la: " + sum);

        //tong cac so tren duong cheo phu:
        int sum=0;
        for(int i=0;i<n;i++){
            sum+= arr[i][n-i-1];
        }
        System.out.println("\n"+sum);

    }

}
