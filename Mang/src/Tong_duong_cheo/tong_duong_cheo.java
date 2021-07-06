package Tong_duong_cheo;
import java.util.Scanner;
import java.util.Scanner;

public class tong_duong_cheo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input x= ");
        int x = input.nextInt();
        System.out.print("Input y= ");
        int y = input.nextInt();
        int arr[][]= new int[x][y];
        int sum=0;
        for(int i=0; i<x; i++)
            for (int j=0; j<y; j++)
            {
                System.out.print("A["+i+","+j+"]= ");
                arr[i][j]= input.nextInt();
            }
        for(int i=0; i<x; i++)
        {
            for (int j = 0; j < y; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        for(int i=0; i<x; i++)
            for (int j=0; j<y; j++)
                if (i==j) sum+=arr[i][j];
        System.out.println("Tong duong cheo: "+sum);
    }
}
