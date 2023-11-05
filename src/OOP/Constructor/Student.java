package OOP.Constructor;

public class Student {
    String name;
    int id;

    Student() //default constructor
    {
        System.out.println("No Value");
    }

    Student (String n, int i) //create constructor parametrized
    {
        name = n;
        id = i;
    }

    void displayInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }


}
