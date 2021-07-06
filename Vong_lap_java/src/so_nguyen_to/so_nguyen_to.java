package so_nguyen_to;
import java.util.Scanner;
public class so_nguyen_to {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number= ");
        int number = input.nextInt();
        boolean check=true;
        for (int i=2;i <= Math.sqrt(number);i++){
            if (number % i ==0) check=false;
        }
        if (check==true){
            System.out.println(number+" is a prime");
        }
        else System.out.println(number+" is not a prime");
    }
}
