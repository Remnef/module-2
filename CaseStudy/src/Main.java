import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        final String pathFile = "E:\\module 2\\CaseStudy\\src\\data\\Drinks.txt";
        final String pathFeedback="E:\\module 2\\CaseStudy\\src\\data\\feedback.txt";
        final String pathOrder="E:\\module 2\\CaseStudy\\src\\data\\Order.txt";
        Working working = new Working();
        List<Drink> drinks = working.readf(pathFile);
        int choice = 0;
        String str="";
        do{
            System.out.println();
            System.out.println("----------------------------------Welcome---------------------------------");
            System.out.println("                               Who are you ?");
            System.out.println("\t1.Client");
            System.out.println("\t2.Admin");
            System.out.println("\t0.exit");
            do {
                System.out.print("\tYour choice is : ");
                str = new Scanner(System.in).nextLine();
            }while (!working.checkRegex(str,"([0|1|2])"));
            choice = Integer.parseInt(str);
            switch (choice){
                case 1:
                    int clientChoice=0;
                    do {
                        working.showList(drinks);
                        clientChoice = working.menuClient();
                        switch (clientChoice) {
                            case 1: {
                                int bill = 0;
                                String check = "";
                                do {
                                    int id = 0;
                                    do {
                                        System.out.print("\n\tWhat drink you wanna (please get choice by Id) : ");
                                        str = new Scanner(System.in).nextLine();
                                        id = Integer.parseInt(str);
                                    }while(!working.checkRegex(str,"\\d*") || id < 0 || id > drinks.size());
                                    System.out.print("\n\tAnd amount: ");
                                    drinks.get(id-1).setAmount(new Scanner(System.in).nextByte());
                                    bill += drinks.get(id-1).getBill();
                                    System.out.print("\n\tYour choice is :");
                                    System.out.println(drinks.get(id - 1).toString());
                                    working.writeAdmin(pathOrder, drinks.get(id - 1).toString());
                                    System.out.println("\tWe are got your order. Thank you! ^^");
                                    do {
                                        System.out.print("\tDo you wanna get some drinks else ? (Y/N) : ");
                                        check = new Scanner(System.in).nextLine();
                                    }while(!working.checkRegex(check,"([Y|N])"));
                                    if (check.equals("N")){
                                        System.out.println("\tYour bill is: "+bill);
                                    }
                                } while (check.equals("Y"));
                                break;
                            }
                            case 2: {
                                boolean doing = false;
                                do {
                                    System.out.println("\tWelcome your feedback ! ^^");
                                    System.out.print("\tWhat you wanna say: ");
                                    String feedback = new Scanner(System.in).nextLine();
                                    feedback += "\n";
                                    System.out.println("\tThank you for your feedback ! ^^\n");
                                    working.writeAdmin(pathFeedback, feedback);
                                    String check = "";
                                    do {
                                        System.out.print("\tDo you wanna say something else (Y/N)?:");
                                        check = new Scanner(System.in).nextLine();
                                    }while (!working.checkRegex(check,"([Y|N])"));
                                    doing = check.equals("Y");
                                }while(doing);
                                break;
                            }
                            case 0: break;
                            default:
                                break;
                        }
                    }while (clientChoice != 0);
                    break;
                case 2:
                {
                    int adminChoice = 0;
                    do{
                        adminChoice = working.menuAdmin();
                        switch (adminChoice)
                        {
                            case 1:
                            {
                                String feedback = working.readAdmin(pathFeedback);
                                System.out.println("\tThe feedbacks is: ");
                                System.out.println(feedback);
                                String check = "";
                                do {
                                    System.out.print("\tDo you wanna delete it (Y/N) :");
                                    check = new Scanner(System.in).nextLine();
                                }while (!working.checkRegex(check,"([Y|N])"));
                                if (check.equals("Y")){
                                    File file = new File(pathFeedback);
                                    file.delete();
                                    file.createNewFile();
                                }
                                break;
                            }
                            case 2:
                            {
                                String order = working.readAdmin(pathOrder);
                                System.out.println("\tThe Order is is: ");
                                System.out.println(order);
                                String check = "";
                                do {
                                    System.out.print("\tDo you wanna delete it (Y/N) :");
                                    check = new Scanner(System.in).nextLine();
                                }while (!working.checkRegex(check,"([Y|N])"));
                                if (check.equals("Y")){
                                    File file = new File(pathOrder);
                                    file.delete();
                                    file.createNewFile();
                                }
                                break;
                            }
                            case 3:
                            {
                                boolean doing = false;
                                do {
                                    System.out.print("\n\tHow much drinks do you wanna add: ");
                                    int count = new Scanner(System.in).nextByte();
                                    for (int i = 0; i < count; i++) {
                                        Drink drink = new Drink();
                                        System.out.print("\t\t-Name: ");
                                        drink.setName(new Scanner(System.in).nextLine());
                                        System.out.print("\t\t-Cost: ");
                                        drink.setCost(new Scanner(System.in).nextInt());
                                        System.out.print("\t\t-Type: ");
                                        drink.setType(new Scanner(System.in).nextLine());
                                        drinks.add(drink);
                                        System.out.println("\tThe drink is added!\n");
                                    }
                                    System.out.println("\n\tYou have successfully added " + count + ((count > 1) ? " drinks" : " drink"));
                                    working.sortDrinks(drinks);
                                    working.writef(pathFile, drinks);
                                    System.out.println("\n\tThe new menu is:");
                                    working.showList(drinks);
                                    String check = "";
                                    do {
                                        System.out.print("\n\t So you wanna add something else (Y/N)? : ");
                                        check = new Scanner(System.in).nextLine();
                                    }while(!working.checkRegex(check,"([Y|N])"));
                                    doing = check.equals("Y");
                                }while(doing);
                                break;
                            }
                            case 4:
                            {
                                boolean doing = false;
                                do{
                                    working.showList(drinks);
                                    System.out.print("\n\tHow much drinks do you wanna delete: ");
                                    int count = new Scanner(System.in).nextByte();
                                    for (int i = 0; i < count; i++) {
                                        System.out.print("\t\tThe number "+(i+1)+" id is: ");
                                        int id = new Scanner(System.in).nextInt();
                                        drinks.remove(id-1);
                                        System.out.println("\tThe drink is deleted!");
                                    }
                                    working.sortDrinks(drinks);
                                    working.writef(pathFile,drinks);
                                    working.showList(drinks);
                                    String check = "";
                                    do {
                                        System.out.print("\n\t So you wanna delete something else (Y/N)? : ");
                                        check = new Scanner(System.in).nextLine();
                                    }while(!working.checkRegex(check,"([Y|N])"));
                                    doing = check.equals("Y");

                                }while (doing);
                                break;
                            }
                            case 5:
                            {
                                boolean doing = false;
                                do{
                                    working.showList(drinks);
                                    System.out.print("\n\tHow much drinks do you wanna edit: ");
                                    int count = new Scanner(System.in).nextByte();
                                    for (int i = 0; i < count; i++) {
                                        System.out.print("\t\tThe number "+(i+1)+" id is: ");
                                        int id = new Scanner(System.in).nextInt();
                                        System.out.print("\t\t-New name: ");
                                        drinks.get(id-1).setName(new Scanner(System.in).nextLine());
                                        System.out.print("\t\t-New cost: ");
                                        drinks.get(id-1).setCost(new Scanner(System.in).nextInt());
                                        System.out.print("\t\t-New type: ");
                                        drinks.get(id-1).setType(new Scanner(System.in).nextLine());
                                        System.out.println("\tThe drink is edited!");
                                    }
                                    working.sortDrinks(drinks);
                                    working.writef(pathFile,drinks);
                                    working.showList(drinks);
                                    String check = "";
                                    do {
                                        System.out.print("\n\t So you wanna edit something else (Y/N)? : ");
                                        check = new Scanner(System.in).nextLine();
                                    }while(!working.checkRegex(check,"([Y|N])"));
                                    doing = check.equals("Y");

                                }while (doing);
                                break;
                            }
                            case 0:break;
                            default:break;
                        }
                    }while (adminChoice !=0);
                }
                default:break;
            }

        }while(choice !=0);
    }

}
