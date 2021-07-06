import com.sun.tools.javac.Main;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {
    public static void main(String[] args) throws IOException {
        File file = new File("test1.txt");
        if (file.isFile()){
            System.out.println("File: "+file.getAbsolutePath());
        }else{
            System.out.println("NOT FOUND!");
            file.createNewFile();
        }
//        file.delete();
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input N= ");
//        int n = input.nextInt();

//        DataInputStream input = new DataInputStream(System.in);
//        System.out.print("Input N= ");
//        String n = input.readLine();
//        int n = System.console().readLine();
//        System.out.println(n);
        FileInputStream fileInput = null;



        try{
            fileInput = new FileInputStream("test1.txt");
            int ch;
            while ((ch = fileInput.read()) != -1){
                System.out.println(ch);
                break;
            }
        }catch (IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fileInput != null){
                try{
                    fileInput.close();
                }catch (IOException ex){
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
