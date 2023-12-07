package OOP_3.HashMap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <Integer,String> customer = new HashMap<Integer,String >();

        customer.put(101, "rko");
        customer.put(102, "okr");
        customer.put(103, "kro");

        System.out.println(customer.get(101));
    }
}
