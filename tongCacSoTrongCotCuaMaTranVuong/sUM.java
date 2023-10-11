package tongCacSoTrongCotCuaMaTranVuong;

import java.util.Scanner;

public class sUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("moi ban nhap so hang va so cot cua ma tran vuong: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" {");
            for (int j = 0; j < arr.length; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.print("} ");
            System.out.println();
        }
        int sum=0;
        System.out.print("nhap cot muon tinh tong: ");
        int x= sc.nextInt();
        for (int i=0;i<arr.length;i++){
            sum+= arr[i][x-1];
        }
        System.out.printf("tong cot %d cua ma tran vuong la %d",x,sum);
    }
}
