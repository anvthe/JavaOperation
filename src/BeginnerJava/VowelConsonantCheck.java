package BeginnerJava;

import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         char ch;
         System.out.print("Enter any Letter : ");
         ch = input.next().charAt(0);

         if (ch=='a')
        {System.out.print("Vowel");}
        if (ch=='A')
        {System.out.print("Vowel");}
        else if (ch=='e')
         {System.out.print("Vowel");}
         else if (ch=='i')
         {System.out.print("Vowel");}
         else if (ch=='o')
        {System.out.print("Vowel");}
         else if (ch=='u')
         {System.out.print("Vowel");}

         else
         {System.out.print("Consonant");}

    }
}
