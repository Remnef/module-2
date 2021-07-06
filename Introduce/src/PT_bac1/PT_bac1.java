package PT_bac1;
import java.util.Scanner;
public class PT_bac1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input a = ");
        double a = Input.nextDouble();
        System.out.println("Input b = ");
        double b = Input.nextDouble();
        System.out.println("Input c = ");
        double c = Input.nextDouble();
        if (a!=0){
            double solution = (c-b)/a;
            System.out.println("The solution is : "+solution);
        }else {
            if (b == 0) {
                System.out.println("The solution is all x");
            } else {
                System.out.println("No solution");
            }
        }

    }
}
