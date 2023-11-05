package BeginnerJava;

import java.util.Scanner;

public class UpperLowerCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        System.out.print("Enter a Character : ");
        ch = input.next().charAt(0);

        if (Character.isUpperCase(ch))
        { System.out.print( ch+ " is Upper case ");}

        else if (Character.isLowerCase(ch))
        { System.out.print( ch+ " is Lower case ");}

        else {System.out.print("Not a Letter");}

    }

}
