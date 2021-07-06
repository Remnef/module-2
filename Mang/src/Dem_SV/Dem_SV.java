package Dem_SV;

import java.util.Scanner;

public class Dem_SV {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter the size");
            size = input.nextInt();
            if (size>30)
                System.out.println("Size should not exceed 30");
        }while (size>30);
        array = new int[size];
        int i = 0;
        while (i< array.length)
        {
            System.out.println("Enter a mark for student"+(i+1)+": ");
            array[i] = input.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("lIST OF MARK: ");
        for (int j = 0; j < array.length; j++)
        {
            System.out.print(array[j]+"\t");
            if (array[j] >=5 && array[j] <=10)
                count++;
        }
        System.out.println("\n The number of student passing the exam is "+count);

    }


}
