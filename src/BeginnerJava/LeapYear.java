package BeginnerJava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year;
        System.out.print("Enter a Year");
        year = input.nextInt();

        if (year%400==0) {System.out.print("Leap Year");}
        else if (year%4==0 && year%100!=0) {System.out.print("Leap Year");}
        else {System.out.print("Not Leap Year");}


    }
}
