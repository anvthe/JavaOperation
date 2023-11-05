package BeginnerJava;

import java.util.Scanner;

public class TemperatureDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double cels;
        double farn;

        System.out.print("Celsious = ");
        cels = input.nextDouble();


        farn = 1.8 * cels + 32;

        System.out.print("Farhanheit : " +String.format("%.2f", farn));


    }
}
