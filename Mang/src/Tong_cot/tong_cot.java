package Tong_cot;
import java.util.Scanner;
public class tong_cot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input x= ");
        int x = input.nextInt();
        System.out.print("Input y= ");
        int y = input.nextInt();
        float arr[][]= new float[x][y];
        float sum=0;
        for(int i=0; i<x; i++)
            for (int j=0; j<y; j++)
            {
                System.out.print("A["+i+","+j+"]= ");
                arr[i][j]= input.nextFloat();
            }
        for(int i=0; i<x; i++)
        {
            for (int j = 0; j < y; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        System.out.print("Input cot: ");
        int id = input.nextInt();
        for(int i=0; i<x; i++)
            for (int j=0; j<y; j++)
                if (j==id-1) sum+=arr[i][j];
        System.out.println("Tong cot: "+sum);
    }
}
