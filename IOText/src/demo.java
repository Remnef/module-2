import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.Scanner;
public class demo {
    public static void main(String[] args) throws IOException {
//        //Create file
//        try {
//            File f = new File("filename2.txt");
//            if (f.createNewFile()) {
//                System.out.println("File created: " + f.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//
        //Read file
        try{
            File f = new File("filename.txt");

            if(f.createNewFile()){
                System.out.printf("File f is create!");
            }else {
                System.out.printf("File f is exist.\n");
            }

            Scanner fReader = new Scanner(f);

            while (fReader.hasNextLine()) {
                String data = fReader.nextLine();
                System.out.println(data);
            }

            fReader.close();

        }catch (ExportException e){
            e.printStackTrace();
        }

//
//
      try {

        FileWriter fWrite = new FileWriter("filename.txt");
          fWrite.write("Files in Java might be tricky, but it is fun enough!");
          fWrite.close();

        System.out.println("Successfully wrote to the file.");

    } catch (IOException e) {

        System.out.println("An error occurred.");
        e.printStackTrace();

        }
//        Delete file
//        File myObj = new File("filename2.txt");
//        myObj.createNewFile();
//        if (myObj.delete()) {
//            System.out.println("Deleted the file: " + myObj.getName());
//        } else {
//            System.out.println("Failed to delete the file.");
//        }
    }
}