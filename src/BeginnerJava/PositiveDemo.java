package BeginnerJava;

import java.util.Scanner;

public class PositiveDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any integer Number = ");
        num = input.nextInt();
        if (num>0)
        {
            System.out.print("Positive");
        }
        else if (num<0){System.out.print("Negative");}

        else {System.out.print("Equal to zero");}

    }

}