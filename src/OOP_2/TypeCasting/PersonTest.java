package OOP_2.TypeCasting;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Teacher();
        p.display();

        Teacher t = (Teacher) new Person();
        t.display();
    }
}
