package OOP_3.HashSet;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> fruitsName = new HashSet<String>();
        fruitsName.add("Apple");
        fruitsName.add("Orange");
        fruitsName.add("Lemon");
        fruitsName.add("Tomato");

        System.out.println(fruitsName);
        System.out.println("Size : "+fruitsName.size());
        /*System.out.println(fruitsName.remove(3));*/
        fruitsName.remove("Apple");
        System.out.println(fruitsName);
        fruitsName.clear();
        System.out.println();
        boolean value = fruitsName.isEmpty();
        System.out.println(value);


    }
}
