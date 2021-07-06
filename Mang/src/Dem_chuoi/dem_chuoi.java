package Dem_chuoi;

import java.util.Scanner;

public class dem_chuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.print("Input = ");
        String s= input.next();
        System.out.print("Char: ");
        char c = input.next().charAt(0);
        int count = 0;
        for (char x:s.toCharArray())
        {
            if (x==c) count++;
        }
        System.out.println(count);

    }
}
