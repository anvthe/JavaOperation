/*
package beginnerjava;

import java.util.Scanner;

public class FactorialNumAssign {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        double fact = 1;
        System.out.print("Enter a Number :");
        num = input.nextInt();
        for(int i=1; i<=num; i++)
            fact = i*fact;
        System.out.print("Factorial n Number: " +fact);

    }
}
*/


package BeginnerJava;

import java.util.Scanner;

public class FactorialNumAssign {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.print("Enter a positive number");
        num = input.nextInt();
        for(int i = num; i>=1; i--)
        {
            fact = fact*i;
        }

        System.out.print("Factorial of "+num + " = " +fact);
    }


}