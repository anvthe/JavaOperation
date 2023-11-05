package BeginnerJava;

import java.util.Scanner;

public class Serise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int result = 1;
        System.out.print("Enter your last number: ");
        n = input.nextInt();

        for (int i = 1; i<=n; i=i+1)
        {
            result = result * i;
        }
        System.out.println(result);
    }
}
