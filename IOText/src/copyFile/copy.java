package copyFile;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class copy {
    String line="";
    public String readFile(String pathFile){
        try{
            File file = new File(pathFile);
            Scanner readf = new Scanner(file);
            String s;
            while(readf.hasNextLine()){
                s = readf.nextLine();
                line=line + s +"\n";
            }
            readf.close();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        return line;
    }
}
