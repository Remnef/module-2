package Adapter_;

import java.util.Scanner;

public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String  path){
        long size = fileCalculator.calculateSize(path);
        System.out.println("Size: "+size);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file or folder path: ");
        String path = input.nextLine();
        FileCalculator fileCalculator = new FileCalculatorAdapter();
        Client client = new Client(fileCalculator);
        client.printFileSize(path);
    }
}
