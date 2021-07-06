package CalculationExample;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input x= ");
        int x = input.nextInt();
        System.out.print("Input y=");;
        int y = input.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);
    }
    private  void calculate(int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        }catch(Exception e){
            System.err.println("Xay ra ngoai le: "+e.getMessage());
        }
    }
}
