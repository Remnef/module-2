package Kiem_tra_thang;
import java.util.Scanner;
public class kiem_tra_thang {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Nhap thang : ");
        byte i = input.nextByte();
        String day;
        switch (i){
            case 2:
                day = "28 or 29";
                break;
            case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
                day = "31";
                break;
            case 4: case 9: case 6: case 11:
                day="30";
                break;
            default:day="";
        }
        if (day!=""){
            System.out.println("Thang "+i+" co "+day+" ngay");
        }else{
            System.out.println("Invalid input!");
        }

    }
}
