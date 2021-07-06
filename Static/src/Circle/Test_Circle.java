package Circle;
import java.util.Scanner;
public class Test_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input radius: ");
        double r = input.nextDouble();
        Circle circle1 = new Circle(r);
        System.out.println("Radius: "+circle1.getRadius());
        System.out.println("Area: "+circle1.getArea());
    }
}
