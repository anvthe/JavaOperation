package OOP_3.LinkedList.Part_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>(10);

        name.add("rko");
        name.add("rko");
        name.add("rko");
        name.add("rko");
        name.add("rko");
        name.add("rko");
        System.out.println(name);


        LinkedList<String> countryName = new LinkedList<>();

        countryName.add("Bangladesh");
        countryName.add("USA");
        countryName.add("Argentina");
        countryName.add("Pakistan");
        countryName.add("Russia");
        System.out.println(countryName);


    }
}
