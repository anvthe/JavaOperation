package BeginnerJava;

import java.util.Scanner;

public class CallCenterAssign9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int digit;
        System.out.print("Enter 1 to 3 digit for select your language : ");
        digit = input.nextInt();

        switch (digit) {

            case 1: System.out.print("Selected bangla language");
                break;
            case 2: System.out.print("Selected hindi language");
                break;

            case 3: System.out.print("Selected urdu language");
                break;
            default: System.out.print("Selected english language");
                break;

        }


    }

}
