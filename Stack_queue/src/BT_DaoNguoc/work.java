package BT_DaoNguoc;

import java.util.Scanner;
import java.util.Stack;

public class work {
    public static void main(String[] args) {
        //dao nguoc so
        Stack<Integer> stack= new Stack<>();
        System.out.print("Input n= ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for( int i=0; i<n; i++){
            System.out.print("a["+i+"]= ");
            stack.push(input.nextInt());
        }
        System.out.println();
        for( int i=0; i<n; i++){
            System.out.print(stack.pop()+"  ");
        }
        //dao nguoc chuoi

        Stack<String> wstack = new Stack<>();
        System.out.println();
        System.out.print("input s1: ");
        String s1 = input.nextLine();
        String[] words = s1.split("\\s");
        for (String w : words){
            wstack.push(w);
        }

        while (!wstack.empty()){
            System.out.print(wstack.pop()+" ");
        }
    }
}
