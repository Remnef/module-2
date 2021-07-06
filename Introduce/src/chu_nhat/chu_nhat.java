package chu_nhat;
import java.util.Scanner;
public class chu_nhat {
    public static void main(String[] args) {
        float width;
        float height,area;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter width :");
        width = scanner.nextFloat();
        System.out.print("Enter height :");
        height = scanner.nextFloat();
        area = width*height;
        System.out.println("Area : "+area);
    }
}
