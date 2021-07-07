import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Working {
    public Working() {
    }

    public List<Drink> readf(String path){
        List<Drink> list = new ArrayList<>();
        try{
            File file = new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (ArrayList<Drink>) ois.readObject();
            ois.close();
            fis.close();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        return list;
    }

    public void writef(String path,List<Drink> list){
        try{
            File file = new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void showList(List<Drink> list){
        Working working = new Working();
        working.sortDrinks(list);
        System.out.println("----------------------------------------Menu-------------------------------------");
        System.out.println();
        System.out.println("\tToday we have :\n");
        System.out.format("%20s| %19s| %19s| %19s","Type","Name","Cost","Id");
        System.out.println();
        for( int i =0; i < list.size();i++){
            Drink drink = list.get(i);
            if (i!=0 && drink.getType().equals(list.get(i-1).getType())){
                System.out.format("%20s|","");
            }else {
                System.out.format("%20s|", drink.getType());
            }
            System.out.format("%20s|",drink.getName());
            System.out.format(String.format("%,20d VND|",drink.getCost()));
            System.out.format("%20d|",(i+1));
            System.out.println();
        }
    }

    public String getMessage(Drink drink){
        return drink.getType() +
                "-[ " + drink.getName()+
                ",cost: " + drink.getCost() +
                " ]\n";
    }

    public String readAdmin(String path){
        String line="";
        try{
            File file = new File(path);
            Scanner input = new Scanner(file);
            int data;
            while (input.hasNextLine()){
                String s = input.nextLine();
                line += "\t\t+  " +s+"\n";
            }
            input.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occurred");
        }
        return line;
    }

    public void writeAdmin(String path, String line){
        try{
            File f = new File(path);
            if(!f.exists()){
                f.createNewFile();
            }
            FileWriter Write = new FileWriter(f,true);
            Write.write(line);
            Write.close();
        }catch (Exception e){
            System.out.println("404");
        }
    }

    public boolean checkRegex(String str,String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public void sortDrinks(List<Drink> list){
        Collections.sort(list,new sortByType());
    }

    public int menuClient(){
        System.out.println("");
        System.out.println("\tYou have some choice: ");
        System.out.println("\t\t1.Order Dink by id.");
        System.out.println("\t\t2.Write the feedback.");
        System.out.println("\t\t0.Back!\n");
        int choice = 0;
        boolean check = false;
        String str = "";
        Working working = new Working();
        do{
            if (check){
                System.out.println("\tPlease get the choice in menu!!!\n");
            }
            check = true;
            do {
                System.out.print("\tYour choice is : ");
                str = new Scanner(System.in).nextLine();
            }while (!working.checkRegex(str,"([0|1|2])"));
            choice = Integer.parseInt(str);
        }while (choice != 0 && choice !=1 && choice != 2);
        return choice;
    }

    public int menuAdmin(){
        System.out.println("----------------------------------Welcome Admin------------------------------");
        System.out.println("\n\tSomething you can do: ");
        System.out.println("\t\t1.Get feedback.");
        System.out.println("\t\t2.Get order.");
        System.out.println("\t\t3.Add drink");
        System.out.println("\t\t4.Delete drink by Id.");
        System.out.println("\t\t5.Edit drink by Id.");
        System.out.println("\t\t0.Back.");
        Working working = new Working();
        String str = "";
        do {
            System.out.print("\tYour choice is: ");
            str = new Scanner(System.in).nextLine();
        }while(!working.checkRegex(str,"([0|1|2|3|4|5])"));
        int choice = Integer.parseInt(str);
        return choice;
    }

    public boolean checkName(String name, List<Drink> list){
        boolean check = false;
        for(int i = 0; i<list.size(); i++){
            if (name.equals(list.get(i).getName())){
                check = true;
            }
        }
        return  check;
    }

}
