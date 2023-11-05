package BeginnerJava;

import java.util.Scanner;

public class Product {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int id;
        String title;
        float price;
        String description;
        String category;

        System.out.println("Enter product details:");

        id = input.nextInt();
        title = input.next();
        price = input.nextFloat();
        input.nextLine();
        description = input.nextLine();
        input.nextLine();
        category = input.nextLine();


        System.out.println("ID =" +id);
        System.out.println("Title = " +title);
        System.out.println("Price = " +price);
        System.out.println("Description = "+description);
        System.out.println("Category = " +category);





    }
}
