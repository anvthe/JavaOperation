package BeginnerJava;

import java.util.Scanner;

public class TemperatureDemo2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double farn;
        double cels;

        System.out.print("Fahrenheit = ");
        farn = input.nextDouble();

        cels = 0.5556 * (farn-32);

        System.out.print("Celsious = " + String.format("%.2f", cels));


    }
}
