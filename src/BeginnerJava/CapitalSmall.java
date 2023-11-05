package BeginnerJava;

import java.util.Scanner;

public class CapitalSmall {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter  a letter");
        ch = input.next().charAt(0);

        if (ch>='a' && ch<='z')
        {
             System.out.print("Small");
        }
        else if ((ch>='A' && ch<='Z'))
        {System.out.print("Capital");}
        else {System.out.print("Not a letter");}

    }
}
