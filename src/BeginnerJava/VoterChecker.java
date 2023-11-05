package BeginnerJava;

import java.util.Scanner;

public class VoterChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        System.out.print("Enter Your Age = ");
        age = input.nextInt();

        if (age>=18) {System.out.print("Valid Voter");}

        else {System.out.print("Invalid Voter");}

    }
}