package BeginnerJava;

import java.util.Scanner;

public class InstallmentCalclution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double phonePrice;
        int numberOfInstallment;
        double installmentPerMonth;

        //float installmentPerMonth2;


        System.out.println("EnterPhonePrice");
        phonePrice = input.nextInt();



        System.out.println("EnterInstallment");
        numberOfInstallment = input.nextInt();

        installmentPerMonth = phonePrice / numberOfInstallment;

        //rounded = round(installmentPerMonth, 2);
        System.out.print("Installment Per Month = " + installmentPerMonth);




    }

}
