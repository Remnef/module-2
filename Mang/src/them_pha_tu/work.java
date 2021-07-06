package them_pha_tu;
import java.util.Scanner;
public class work {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Size= ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for( int i=0; i<size; i++)
        {
            System.out.print("A["+i+"]= ");
            arr[i]= input.nextInt();
        }
        System.out.print("Input X= ");
        int x = input.nextInt();
        System.out.print("Input index: ");
        int id = input.nextInt();
        add(arr,x,id);
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static void add(int[] arr, int x, int id)
    {
        if ((id<=1)||(id>=arr.length-1)) System.out.println("Cannt");
        else
        {
            for (int i=arr.length-1;i>id;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[id]=x;
        }
    }
}
