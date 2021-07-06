import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a= ");
        double a = input.nextDouble();
        System.out.print("Input b= ");
        double b = input.nextDouble();
        System.out.print("Input c= ");
        double c = input.nextDouble();
        QuadraticEquation.QuadraticEquation pt1 = new QuadraticEquation.QuadraticEquation(a,b,c);
        System.out.println("Delta : "+pt1.getDiscriminant());
        System.out.println("Nghiem 1 :"+pt1.getRoot1());
        System.out.println("Nghiem 2 :"+pt1.getRoot2());
    }
}
