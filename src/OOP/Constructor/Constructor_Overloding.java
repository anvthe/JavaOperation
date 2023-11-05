package OOP.Constructor;

public class Constructor_Overloding {
    public static void main(String[] args) {
        Teacher_Overloding teacher1 = new Teacher_Overloding("Roney", "male");
        teacher1.displayInfo();

        System.out.println();

        Teacher_Overloding teacher2 = new Teacher_Overloding("Ronnie", 13);
        teacher2.displayInfo();

        System.out.println();

        Teacher_Overloding teacher3 = new Teacher_Overloding();
        //teacher2.displayInfo();
    }
}
