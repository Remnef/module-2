package snt_20;

public class snt_20 {
    public static void main(String[] args) {
        int count=0,i=2,j;
        boolean check;
        while (count<20)
        {

            check=true;
            for (j=2;j <= Math.sqrt(i);j++)
                if (i % j == 0) check=false;
            if (check==true)
            {
                ++count;
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
