package SecondVersion;

import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m, n;
        int count=0;
        int numOfPrime=0;
        System.out.print("Enter initial number : ");
        m = input.nextInt();
        System.out.print("Enter end number : ");
        n = input.nextInt();

        for(int i = m; i<=n; i++)
        {
            for(int j=2; j<=i-1; j++)
            {
                if (i%j==0)
                {
                    count++;
                    break;
                }
            }

            if (count==0) {
                System.out.println(i);
                numOfPrime++;
            }
            count = 0;
        }
        System.out.println("Total number of Prime="+numOfPrime );
    }

}
