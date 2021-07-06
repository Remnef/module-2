package GTLN2chieu;
import java.util.Scanner;
public class GTLN2chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input x= ");
        int x = input.nextInt();
        System.out.print("Input y= ");
        int y = input.nextInt();
        float arr[][]= new float[x][y];
        for(int i=0; i<x; i++)
            for (int j=0; j<y; j++)
            {
                System.out.print("A["+i+","+j+"]= ");
                arr[i][j]= input.nextFloat();
            }
        float max=arr[0][0];
        for(int i=0; i<x; i++)
            for (int j=0; j<y; j++)
                if (max<arr[i][j]) max=arr[i][j];
        System.out.println("GTLN: "+max);

    }
}
