package ProblemSlovingHackerRank;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        //String s = "Good job";

        n = input.nextInt();
        String s = Integer.toString(n);
        if(n==Integer.parseInt(s))
        {
            System.out.println("Good job");
        }
        else
        {
            System.out.println("Wrong answer.");
        }
    }



    }

