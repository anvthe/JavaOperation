package OOP_3.LinkedList.Part_2;

import java.security.interfaces.RSAKey;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        LinkedList<String> country = new LinkedList<>();

        country.add("Bangladesh");
        country.add("USA");
        country.add("Argentina");
        country.add("Pakistan");
        country.add("Russia");
        country.add(5, "Hansha");
        country.addFirst("Australia");
        country.addLast("Japan");
        country.set(5,"China");
//        country.remove(7);
//        country.removeFirst();
//        country.removeLast();

        for (String count : country){
            System.out.println(count);
        }
        System.out.println("Size of index list : "+country.size());
        System.out.println(country.getFirst());
        System.out.println(country.getLast());
        country.clear();
        System.out.println(country);
        //System.out.println(+country.set(5, ));

    }
}
