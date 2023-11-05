package BeginnerJava;

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        String name;

        System.out.println("Enter your love = ");

        number = input.nextInt();
        name = input.nextLine();


        System.out.println("My Love1 is = " +number);
        System.out.println("My Love2 is = " +name);

    }
}
