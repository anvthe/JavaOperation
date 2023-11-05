package SecondVersion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*int sum = 0;
        int num;
        int temp;
        int r;*/

        int sum=0,r,num,temp;
        System.out.print("Enter a number : ");
        num = input.nextInt();

        temp = num;

        while (temp!=0)
        {
            r = temp % 10;
            sum = sum + r;
            temp = temp/10;
        }

        System.out.print("Sum of digits : "+sum);

    }
}
