package OOP.Method_Overriding;

public class Teacher extends Person{

    int rank;

    @Override
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Rank : "+rank);
    }
}
