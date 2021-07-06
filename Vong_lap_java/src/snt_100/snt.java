package snt_100;

public class snt {
    public static void main(String[] args) {
        int i,j;
        boolean check;
        for ( i=2; i<=100; i++)
        {
            check=true;
            for ( j=2; j<=Math.sqrt(i); j++)
                if ( i%j == 0) check=false;
            if (check==true)
                System.out.print(i+" ");
        }
    }
}
