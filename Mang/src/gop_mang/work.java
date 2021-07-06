package gop_mang;
import java.util.Scanner;
public class work {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Size1= ");
        int size1 = input.nextInt();
        int[] arr1 = new int [size1];
        for (int i=0; i<size1; i++)
        {
            System.out.print("A["+i+"]= ");
            arr1[i] = input.nextInt();
        }
        System.out.print("Input Size2= ");
        int size2 = input.nextInt();
        int[] arr2 = new int [size2];
        for (int i=0; i<size2; i++)
        {
            System.out.print("A["+i+"]= ");
            arr2[i] = input.nextInt();
        }
        int[] arr3 = new int[size1+size2];
        int size3 = size1+size2;
        for(int i=0; i<size3; i++)
        {
            if (i<size1) arr3[i]=arr1[i];
            else arr3[i]=arr2[i-size1];
            System.out.print(arr3[i]+" ");
        }

    }
}
