package chuyenDoiNhietDo;
import java.util.Scanner;
public class work {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        byte choice = input.nextByte();
        switch (choice)
        {
            case 1:
            {
                FtoC();
                break;
            }
            case 2:
            {
                CtoF();
                break;
            }
            case 0:
            {
                System.exit(0);
            }
            default:
            {
                System.out.println("Input again !");
            }
        }
    }
    static public void FtoC()
    {
        float F,C;
        Scanner input = new Scanner(System.in);
        System.out.print("Input F= ");
        F = input.nextFloat();
        C = (F-32)*5/9;
        System.out.println("C: "+C);
    }
    static public void CtoF()
    {
        float F,C;
        Scanner input = new Scanner(System.in);
        System.out.print("Input C= ");
        C = input.nextFloat();
        F = (C*9/5)+32;
        System.out.println(C);
        System.out.println("F: "+F);
    }
}
