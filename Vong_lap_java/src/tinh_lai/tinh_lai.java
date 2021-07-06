package tinh_lai;
import java.util.Scanner;
public class tinh_lai {
    public static void main(String[] args) {
        double inputMoney,outputMoney=1.0,total;
        byte month;
        Scanner input = new Scanner(System.in);
        System.out.print("Input money : ");
        inputMoney = input.nextFloat();
        System.out.print("Input month : ");
        month = input.nextByte();
        System.out.print("Input total : ");
        total = input.nextFloat();
        outputMoney=inputMoney*(total/100)/12 *month;
        System.out.println("Output money : "+outputMoney);
    }
}
