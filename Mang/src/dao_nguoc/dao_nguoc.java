package dao_nguoc;
import java.util.Scanner;
public class dao_nguoc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input size = ");
        byte size = input.nextByte();
        float arr[]= new float[size];
        get_array(arr,size);
        show_arr(arr);
        nguoc(arr);
        show_arr(arr);
    }
    static void get_array(float[] arr,byte n)
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<n ; i++)
        {
            System.out.print("A["+i+"]= ");
            arr[i]= input.nextFloat();
        }
    }
    static void show_arr(float[] arr)
    {
        for (byte i=0;i<arr.length;i++)
        {
            System.out.print("A["+i+"]= "+arr[i]+"  ");
        }
        System.out.println();
    }
    static void nguoc(float[] arr)
    {
        for (byte i=0; i<arr.length/2;i++)
        {
            float temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
}
