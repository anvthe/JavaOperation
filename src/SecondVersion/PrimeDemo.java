package SecondVersion;

import java.util.Scanner;

public class PrimeDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive integer");
        int num = input.nextInt();
        int count = 0;

            if (num <=2 /*|| num == 0 || num == 1*/) {
                System.out.println("Not prime");
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        count++;
                        break;
                    }
                }
                {
                    if (count == 0) {
                        System.out.println("Prime number");
                    } else {
                        System.out.println("Not prime");
                    }
                }
            }
        }
    }
