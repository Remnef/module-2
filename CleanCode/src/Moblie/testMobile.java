package Moblie;
import java.util.Scanner;
public class testMobile {
    public static void main(String[] args) {
        Mobile mobile[] = new Mobile[255];
        mobile[0] = new Mobile("Iphone", "Red", true, 78);
        mobile[1] = new Mobile("Samsung", "Blue", true, 73);
        System.out.println("Choose the phone");
        System.out.println("1." + mobile[0].getName());
        System.out.println("2." + mobile[1].getName());
        Scanner input = new Scanner(System.in);
        System.out.print("Your choose: ");
        int id = input.nextInt();
        id--;
        int work = 0,size =1;
        do {
            System.out.println("Menu:");
            System.out.println("0.Exit");
            System.out.println("1.get info: ");
            System.out.println("2.make mess");
            System.out.println("3.check mess");
            System.out.print("Choose: ");
            work = input.nextInt();

            switch (work){
                case 1:
                    System.out.println(mobile[id].toString());
                    break;
                case 2:
                {
                    System.out.print("Enter the mess: ");
                    String mess = input.next();
                    System.out.println();
                    int id2=0;
                    for( int i =0; i<=size;i++)
                        if (i!=id) id2 = i;
                    mobile[id].getMess(mess,mobile[id2]);
                    break;
                }
                case 3:
                {
                    System.out.println("Thu den:");
                    mobile[id].checkMessed();
                    System.out.println("Thu di:");
                    mobile[id].checkMessing();
                }
            }
        } while (work != 0);
    }

}