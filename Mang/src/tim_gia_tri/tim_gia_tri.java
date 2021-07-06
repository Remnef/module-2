package tim_gia_tri;
import java.util.Scanner;
public class tim_gia_tri {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.print("Input student's Name : ");
        String name = input.nextLine();
        boolean check = false;
        for (String x:students)
        {
//            if (x==name) check=true;
            if (name.equals(x)==true) check=true;
        }
        if (check==true) System.out.println("The Student "+name+" is in the list");
        else System.out.println("Not found");
    }
}
