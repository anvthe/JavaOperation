package BeginnerJava;

import java.util.Scanner;

public class LogicalANDAssign {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char ans1;
        char ans2;

        System.out.print("Have you completed your masters? (y/n):");
        ans1 = input.next().charAt(0);

        System.out.print("Are you fluent in english? (y/n):");
        ans2 = input.next().charAt(0);

        if(ans1 =='y' && ans2=='y')
        {
            System.out.print("you are eligible for interview");
        }

        else if (ans1=='n' && ans2=='n')
        {
            System.out.print("you are not eligible for interview");
        }

        /*else if (ans1=='y' && ans2=='n')
        {
            System.out.print("you are not eligible for interview");
        }
*/
        else {System.out.print("Sorry");}

    }
}
