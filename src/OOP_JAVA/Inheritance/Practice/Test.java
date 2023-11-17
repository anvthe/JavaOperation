package OOP_JAVA.Inheritance.Practice;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Sonia";
        t1.age = 25;
        t1.rank = 1;
        t1.dispalyInformation2();
        t1.dispalyInformation1();

        System.out.println();

        Student s1 = new Student();
        s1.name = "Sonia";
        s1.age = 25;
        s1.rank = 1;
        s1.id = 1;
        s1.dispalyInformation2();
        s1.dispalyInformation1();
        s1.dispalyInformation3();


    }

}
