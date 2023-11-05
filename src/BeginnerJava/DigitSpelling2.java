package BeginnerJava;

import java.util.Scanner;

public class DigitSpelling2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int digit;
        System.out.print("Enter a digit : ");
        digit = input.nextInt();
        switch (digit){

            case 0: System.out.print("Zero");
            break;
            case 1: System.out.print("One");
            break;
            case 2: System.out.print("Two");
            break;
            case 3: System.out.print("Three");
            break;

            default:  System.out.print("Thank you");


        }

    }
}
