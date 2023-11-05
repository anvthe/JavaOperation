package BeginnerJava;

import java.util.Scanner;

public class VowelConsonantDemo2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter a letter");
        ch = input.next().charAt(0);
        if(ch=='a' || ch=='A'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.print("Vowel");
        }
        else {System.out.print("Consonant");}
    }

}
