package readFileExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class readFileExample {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum+= Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum= "+sum);
        }catch(Exception e){
            System.out.println("404");
        }
    }

    public static void main(String[] args) {
        System.out.println("Input FilePath: ");
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        readFileExample readfileEx = new readFileExample();

        readfileEx.readFileText(path);
    }
}
