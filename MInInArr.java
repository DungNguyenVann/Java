import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class MInInArr {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap so phan tu trong mang: ");
        int n= sc.nextInt();
        int[] a= new int[n];
        for (int i=0;i<n;i++){
            System.out.printf("moi ban nhap phan tu thu [%d]: ",i+1);
            a[i]= sc.nextInt();
        }

        int c= min(a);
        System.out.printf("so nho nhat trong mang la: "+a[c]);

    }
    public static int min(int[] arr) {
        int minn=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<arr[minn]){
                minn=arr[i];
            }
        }
            return minn;
    }
}
