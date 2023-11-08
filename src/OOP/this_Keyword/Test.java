package OOP.this_Keyword;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("rko", 12);
        p1.display();

        System.out.println();

        Person p2 = new Person("KOR", 13, "black");
        p2.display();


    }
}