package UCLN;
import java.util.Scanner;
public class UCLN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Input a= ");
        a = input.nextInt();
        System.out.print("Input b= ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        while (a!=b){
            if (a>b) a-=b;
            else b-=a;
        }
        System.out.println("UCLN : "+a);
    }
}
