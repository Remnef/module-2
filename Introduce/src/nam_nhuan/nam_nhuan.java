package nam_nhuan;
import java.util.Scanner;
public class nam_nhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input year = ");
        int year = input.nextByte();
        if ( year % 4 == 0){
            System.out.println(+year+" là năm nhuận");
        }else{
            System.out.println(+year+" không phải năm nhuân");
        }
    }
}
