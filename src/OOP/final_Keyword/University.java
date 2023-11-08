package OOP.final_Keyword;

import java.util.Scanner;

public class University {
    final String name = "KK";
    static final int fee; //static blank final variable;

    static {
        fee = 2700;
    }

    void  display(){
        System.out.println(name);
        System.out.println(fee);
    }

}
