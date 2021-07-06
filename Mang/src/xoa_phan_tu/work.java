package xoa_phan_tu;
import java.util.Scanner;
public class work {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Size= ");
        int size = input.nextInt();
        int[] arr = new int [size];
        for (int i=0; i<size; i++)
        {
            System.out.print("A["+i+"]= ");
            arr[i] = input.nextInt();
        }
        System.out.print("Input X= ");
        int x = input.nextInt();
        boolean check = false;
        for (int i=0; i<arr.length; i++)
        {
            if (x==arr[i]) {
                delete(arr, i);
                check = true;
            }
        }
        if (check==false) System.out.println("Not found");
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    static void delete(int[] arr,int id)
    {
        for(int i=id;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
    }
}
