package BeginnerJava;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radious;
        double area;

        System.out.print("Enter radious = ");
        radious = input.nextDouble();

        area = 3.1416 * radious * radious; //Math.pow(radious,radious);

        System.out.print("Area of Circle = " +area);





    }

}
