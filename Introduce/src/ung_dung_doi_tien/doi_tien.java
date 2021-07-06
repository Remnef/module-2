package ung_dung_doi_tien;
import java.util.Scanner;
public class doi_tien {
    public static void main(String[] args) {
        System.out.print("Input USD= ");
        Scanner input = new Scanner(System.in);
        float usd = input.nextFloat();
        float vnd = usd*23000;
        System.out.println("Output VND= "+vnd);
    }
}
