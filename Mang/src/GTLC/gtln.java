package GTLC;
import java.util.Scanner;
public class gtln {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input size= ");
        int size = input.nextInt();
        float[] arr = new float[size];
        for (int i=0; i<size ; i++)
        {
            System.out.print("Arr["+i+"]= ");
            arr[i]=input.nextFloat();
        }
        float max = arr[0];
        for ( int i=0; i<size ; i++)
        {
            if (max<arr[i]) max=arr[i];
        }
        System.out.println("GTLN = "+max);
    }
}
