package BeginnerJava;

import java.util.Scanner;

public class MultipleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int num;
        int m, n;
        System.out.print("Enter initial number");
        //num = input.nextInt();
        m = input.nextInt();

        System.out.print("Enter end number");
        n = input.nextInt();

        //for (int i = 1; i <= 10; i++)
            for (int j = m; j <= n; j++) {


                 for (int i = 1; i <= 10; i++)
                    System.out.println(n +"X" +j + "=" +j*i);
                }

            }
    }

