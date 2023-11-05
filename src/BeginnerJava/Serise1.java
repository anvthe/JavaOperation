package BeginnerJava;

import java.util.Scanner;

public class Serise1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int sum = 0;
        //double sum = 0;
        System.out.print("Enter the last number = ");
        n = input.nextInt();
        for (int i = 1; i <= n; i = i + 1)
            //for (int i = 2; i <= n; i = i + 2)
                //for (double i = 1.5; i <= n; i = i + 2)
        {

            sum = sum + i;
            //sum = sum + i*i;

            System.out.print(i + " ");
            //System.out.print( i + "X" + i + " ");

        }
        System.out.println();
        System.out.println(sum);

    }
}





   /* public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        int n  ;
        n = input.nextInt();
        for (int i=n; i>0; i--)

        //if (i%2==0)

        { System.out.println(+i);}*/



