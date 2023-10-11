
import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static void main(String[] argg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu thu nhat cua mang: ");
        int a = sc.nextInt();
        System.out.print("nhap chieu thu hau cua mang: ");
        int b = sc.nextInt();

        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("Nhap phan tu cua mang [%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
            System.out.print("Các phần tử của mảng: ");
            show(arr);
    }
    public static void show(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}