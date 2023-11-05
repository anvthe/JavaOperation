package OOP.Constructor;

public class Teacher_Overloding {
    String name, gender;
    int id;

    Teacher_Overloding()
    {
        System.out.println("No Information");
    }
    Teacher_Overloding(String n, String g)
    {
        name = n;
        gender = g;
    }
    Teacher_Overloding(String n, int i) //constructor overloing
    {
        name = n;
        id = i;
    }

    void displayInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("ID: "+id);
    }

}
