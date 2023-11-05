package OOP.Static_Keyword;

public class Student_StaticVariable {
    String name;
    int id;
    static String universityName="LU";

    Student_StaticVariable(String n, int i)
    {
        name = n;
        id = i;
    }

    void displayInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University: "+universityName);
    }

}
