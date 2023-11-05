package OOP.Class_Object_Method;

public class School {
    String name;
    int yera;

    void setInformation(String s, int y) //parameterized method
    {
       name = s;
       yera = y;
    }
    void displayInformation() //method call
    {
        System.out.println("Name: "+name);
        System.out.println("Year: "+yera);
    }
}
