package OOP.Returning_Value_Method;

import javax.xml.transform.Result;
import java.util.Scanner;

public class ReturnTest {
    public static void main(String[] args) {
       ReturningValueDemo ob1 = new ReturningValueDemo();
       //int result = ob1.square(5);
        System.out.println("Result: "+ob1.square(7));

    }
}


/*
    //int result = ob1.square();
    Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
                int value = input.nextInt();

                int result = ob1.square();
                System.out.println("Result: " +result+ "=" +value*value);*/
