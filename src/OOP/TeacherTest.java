package OOP;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher1; //object declare
        teacher1 = new Teacher(); //object create

        Teacher teacher2 = new Teacher();

        teacher1.name = "Ron";
        teacher1.gender = "male";
        teacher1.age = 26;
        teacher1.phone= 17;

        teacher2.name = "Roney";
        teacher2.gender = "male";
        teacher2.age = 28;
        teacher2.phone= 16;

        System.out.println("Name: " +teacher1.name);
        System.out.println("Gender: " +teacher1.gender);
        System.out.println("Age: " +teacher1.age);
        System.out.println("Phone: " +teacher1.phone);

        System.out.println();

        System.out.println("Name: " +teacher2.name);
        System.out.println("Gender: " +teacher2.gender);
        System.out.println("Age: " +teacher2.age);
        System.out.println("Phone: " +teacher2.phone);


    }
}
