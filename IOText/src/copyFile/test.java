package copyFile;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.print("Input pathFile: ");
        Scanner input = new Scanner(System.in);
        String pathFile = input.nextLine();
        copy Copy = new copy();
        paste Paste = new paste();
        String line = Copy.readFile(pathFile);
        System.out.println(line);
        Paste.getTheCopiedFile("E:\\module 2\\IOText\\src\\copyFile\\theCopiedFile.txt",line);
    }
}
