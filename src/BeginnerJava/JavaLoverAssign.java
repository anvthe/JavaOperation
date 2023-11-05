package BeginnerJava;

import java.util.Scanner;

public class JavaLoverAssign {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char ch;
        System.out.print("Do you love java?");
        ch = input.next().charAt(0);

        if (ch=='Y' || ch=='y') { System.out.print("you are java lover");}

        else if (ch=='N' || ch=='n') { System.out.print("you are not");}

        else {System.out.print("Invalid answer");}

    }
}
