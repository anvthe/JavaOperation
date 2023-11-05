package ProblemSlovingHackerRank;

import java.util.Scanner;

public class Solution1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        //System.out.println("Enter Number=");
        n = input.nextInt();

        if (n % 2 == 0 || n>=2 && n<=5 )


       /* {

            System.out.print("Weird");
        }
         if (n >=6 && n<=20 || n>20)
        {
            System.out.print("Not Weird");
        }*/




        /*{
            if(n >= 2 && n<=5){
                System.out.print("Not Wierd");
            }
            if(n >= 6 && n<=20){
                System.out.print("Wierd");
            }
            if(n > 20){
                System.out.print("Not Wierd");
            }
        }else {
            System.out.print("Weird");
        }*/





        /*if (n % 2 == 0 || n < 6 && n > 20) {
                System.out.print("Weird");
        } else if (n > 20 || n > 2 && n < 5) {
                System.out.print("Not Weird");
        }*/
        input.close();
    }
}
