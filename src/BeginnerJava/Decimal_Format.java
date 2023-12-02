package BeginnerJava;

import java.text.DecimalFormat;

public class Decimal_Format {
    public static void main(String[] args)
    {
        double x = 2.8453736;
        System.out.printf("X = %.2f",x);
        System.out.println();

        DecimalFormat ob = new DecimalFormat("0.000");
        System.out.println("X : "+ob.format(x));

        System.out.println();

        System.out.println("i love u sonia");
    }

}
