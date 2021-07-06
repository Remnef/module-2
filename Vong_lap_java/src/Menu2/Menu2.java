package Menu2;
import java.util.Scanner;
public class Menu2 {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1.Hinh chu nhat");
        System.out.println("2.Tam giac vuong");
        System.out.println("3.Tam giac can");
        System.out.print("Input choice : ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice){
            case 1 :
            {
                System.out.print("Input high: ");
                int high = input.nextInt();
                System.out.print("Input width: ");
                int width = input.nextInt();
                for (int i = 1; i < high;i++) {
                    for (int j = 1; j <= width; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            case 2:
                {
                    System.out.print("Input high: ");
                    int high = input.nextInt();
                    for(int i=1;i <= high;i++){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
            case 3:
            {
                System.out.print("Input high: ");
                int hight = input.nextInt();
                int k=0;
                for (int i = 1; i <= hight; ++i, k = 0) {
                    for (int space = 1; space <= hight - i; ++space) {
                        System.out.print("  ");
                    }
                    while (k != 2 * i - 1) {
                        System.out.print("* ");
                        ++k;
                    }
                    System.out.println();
                }
            }
        }
    }
}
