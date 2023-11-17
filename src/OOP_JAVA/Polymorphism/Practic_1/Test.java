package OOP_JAVA.Polymorphism.Practic_1;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();


        p = new Teacher();
        p.display();
        p = new Student();
        p.display();



    }
}
