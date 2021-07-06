package Student;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Student Loc = new Student();
        Scanner input = new Scanner(System.in);
        Loc.printInfo();
        System.out.print("Input name: ");
        String name = input.nextLine();
        System.out.print("Input classes: ");
        String classes = input.nextLine();
        Loc.setName(name);
        Loc.setClasses(classes);
        Loc.printInfo();
    }
}
