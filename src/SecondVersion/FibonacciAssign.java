package SecondVersion;

import java.util.Scanner;

public class FibonacciAssign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input your number : ");
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        int fiboni = 0;

        for (int i = 3; i<=n; i++)
        {
            fiboni = first + second;
            first = second;
            second = fiboni;

        }
        System.out.print(+fiboni);
    }
}
