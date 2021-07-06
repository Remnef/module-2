package getMax;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        readAndWrite rAw = new readAndWrite();
        Scanner input = new Scanner(System.in);
        System.out.print("Input pathFile: ");
        String pathFile = input.nextLine();
        double max = rAw.readFile(pathFile);
        rAw.writeFile(max);
    }
}
