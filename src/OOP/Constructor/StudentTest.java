package OOP.Constructor;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("Roney",13); //constructor value initialize to object
        student1.displayInfo();

        System.out.println();

        Student student2 = new Student("Ronnie",19); //constructor value initialize to object
        student2.displayInfo();

        System.out.println();
        
        Student student3 = new Student();
        student3.displayInfo();


    }
}
