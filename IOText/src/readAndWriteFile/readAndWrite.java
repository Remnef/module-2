package readAndWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readAndWrite {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try{
           File file = new File(filePath);
            Scanner input = new Scanner(file);
            int data;
            while (input.hasNextLine()){
                data = Integer.parseInt(input.nextLine());
                numbers.add(data);
            }
            input.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occurred");
        }
        return numbers;
    }
    public void writeFile(int max){
        try{
            File f = new File("Write.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            System.out.println(f.getAbsoluteFile());
            FileWriter Write = new FileWriter(f,true);
            Write.write("\n"+max);
            Write.close();
        }catch (Exception e){
            System.out.println("404");
        }
    }

    public static void main(String[] args) {
        System.out.print("Input filePath: ");
        Scanner input = new Scanner(System.in);
        String filePath = input.nextLine();
        readAndWrite read = new readAndWrite();
        readAndWrite Write = new readAndWrite();
        List<Integer> lists = read.readFile(filePath);
        int sum=0;
        for (int i=0; i < lists.size(); i++){
            sum+= lists.get(i);
        }
        System.out.println(sum);
        Write.writeFile(sum);
    }
}
