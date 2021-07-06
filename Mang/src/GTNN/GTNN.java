package GTNN;

public class GTNN {
    public static void main(String[] args) {
        int []arr = {4,12,7,1,6,9};
        int index = minValue(arr);
        System.out.println("The smallest in the array is: "+arr[index]);
    }
    static int minValue(int[] arr)
    {
        int min=arr[0];
        int id = 0;
        for (int i=0;i<arr.length;i++)
        {
            if (min>arr[i])
            {
                min=arr[i];
                id=i;
            }
        }
        return id;
    }
}
