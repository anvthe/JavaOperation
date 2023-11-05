package BeginnerJava;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Enter a Number = ");
        n = input.nextInt();

        if (n %2 == 0)
        {
            System.out.print("Number is Even");
        }
        else
        {
            System.out.print("Number is Odd");
        }

    }

}
