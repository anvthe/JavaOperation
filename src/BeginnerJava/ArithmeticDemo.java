package BeginnerJava;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int result;
        double result2;

        System.out.println("Enter 1st nbr = ");
        num1 = input.nextInt();

        System.out.println("Enter 2nd nbr = ");
        num2 = input.nextInt();


        result = num1 + num2;
        System.out.println("Sum = "+result);

        result = num1 - num2;
        System.out.println("Sub = "+result);

        result = num1 * num2;
        System.out.println("Multi = "+result);

        result2 = num1 / (double) num2;
        System.out.println("Devid = "+result2);

        result = num1 % num2;
        System.out.println("Rminder = "+result);

    }

}
