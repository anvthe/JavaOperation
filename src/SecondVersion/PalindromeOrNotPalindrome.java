package SecondVersion;

import java.util.Scanner;

public class PalindromeOrNotPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int r;
        int sum =0;
        int temp;

        System.out.print("Enter a number : ");
        num = input.nextInt();

        temp = num;
        while (temp!=0)
        {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }
        if (num == sum)
        {
            System.out.print("Palindrome number");

        }
        else { System.out.print("Not Palindrome number");

        }



    }
}
