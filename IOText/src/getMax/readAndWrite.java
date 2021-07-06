package getMax;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class readAndWrite {
    public double readFile(String pathFile){
        double max = 0;
        boolean check = true;
        try{
            File file = new File(pathFile);
//            FileReader readf = new FileReader(file);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()){
                double i = Float.parseFloat(input.nextLine());
                if (check){
                    max = i;
                    check = false;
                }
                if (max < i ){
                    max = i;
                }
            }
            input.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return max;
    }
    public void writeFile(double max){
        try{
            File file = new File("E:\\module 2\\IOText\\src\\getMax\\max.txt");
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter writef = new FileWriter(file);
            writef.write(""+max);
            writef.close();
        }catch (Exception e){
            System.err.println("404");
        }
    }
}
