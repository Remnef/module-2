package copyFile;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class paste {

    public void getTheCopiedFile(String pathFile,String line){
        try {
            File file = new File(pathFile);
            if (file.exists()) {
                System.out.println("File is exists");
                System.out.print("Do you wanna get a new file (T/F) : ");
                Scanner input = new Scanner(System.in);
                String check = input.nextLine();
                if (check == "T"){
                    file.delete();
                    file.createNewFile();
                }else{
                    return;
                }
            }
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write(line);
            writer.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
