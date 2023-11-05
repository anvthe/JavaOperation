package BeginnerJava;

import java.util.Scanner;

public class TriangleDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double base;
        double height;
        double area;

        System.out.print("Enter Base: ");
        base = input.nextDouble();

        System.out.print("Enter Height: ");
        height = input.nextDouble();

        area = 0.5 * base * height;

        System.out.print("Area of Tringle: " +area);















    }
}
