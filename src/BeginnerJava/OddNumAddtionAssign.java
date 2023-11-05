package BeginnerJava;

import java.util.Scanner;

public class OddNumAddtionAssign {

   //EvenNumber
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m;
        int n;
        int sum = 0;

        System.out.print("enter m number");
        m = input.nextInt();

        System.out.print("enter n number");
        n = input.nextInt();

        //if (m>n) {System.out.print("error");}



            for(int i = m; i<=n; i++)

                if (i%2==0)
                {
                    //continue;
                    sum = sum+i;
            System.out.print(" " +i);}

        System.out.println();
        System.out.print("Sum"+sum);


    }
}




//Odd Number

    /* public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m;
        int n;
        int sum=0;
        System.out.print("enter start m number : ");
        m = input.nextInt();

        System.out.print("enter start n number : ");
        n = input.nextInt();
        if(m>n)
        {
            System.out.println("error!!!!!");
        }
        else {
            for (int i = m; i<=n; i++)
            {
                if (i%2!=0)
                    continue;
                sum = sum + i;
            }

            System.out.print("Sum of odd number : " +sum);
        }

    }

}*/
