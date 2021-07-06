package GTNN2;
import java.util.Scanner;
public class GTNN2 {
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
        float min = arr[0];
        for ( int i=0; i<size ; i++)
        {
            if (min>arr[i]) min=arr[i];
        }
        System.out.println("GTNN = "+min);
    }
}
