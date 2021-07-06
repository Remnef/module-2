package ArrayExample;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatRandom(){
        Random rd = new Random();
            Integer[] arr = new Integer[100];
        System.out.println("List of element: ");
        for(int i=0; i < 100; i++){
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+"\t");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arr = new ArrayExample();
        Integer arr1[] = arr.creatRandom();
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Input index: ");
        int id = input.nextInt();
        try{
            System.out.println("Arr["+id+"]= "+ arr1[id]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("NOT FOUND");
        }
    }
}
