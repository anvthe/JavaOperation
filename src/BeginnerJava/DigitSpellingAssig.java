package BeginnerJava;

import java.util.Scanner;

public class DigitSpellingAssig {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a Number = ");
        n = input.nextInt();

        if (n<10)

        {   if (n==0) {System.out.print("Zero");}
            if (n==1) {System.out.print("One");}
            if (n==2) {System.out.print("Two");}
            if (n==3) {System.out.print("Three");}
            if (n==4) {System.out.print("Four");}
            if (n==5) {System.out.print("Five");}
            if (n==6) {System.out.print("Six");}
            if (n==7) {System.out.print("Seven");}
            if (n==8) {System.out.print("Eight");}
            if (n==9) {System.out.print("Nine");}
        }
        else{ System.out.print("Invalid Digit");}

    }
}
