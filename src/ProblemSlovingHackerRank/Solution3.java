package ProblemSlovingHackerRank;

import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1;
            s1 = input.next();
            int x = input.nextInt();
            System.out.printf("%-14s %03d\n", s1, x);
        }
        System.out.println("================================");

    }
}
