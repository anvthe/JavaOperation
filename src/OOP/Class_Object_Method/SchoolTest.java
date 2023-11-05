package OOP.Class_Object_Method;

public class SchoolTest {
    public static void main(String[] args) {
        School school1 = new School(); //object declear and object create
        /*school1.name = "Anirban";
        school1.build = 1991;*/

        school1.setInformation("Anirban",1991);
        school1.displayInformation();

        /*System.out.println("Name: "+school1.name);
        System.out.println("Year: "+school1.build);*/

        System.out.println();

        School school2 = new School();
       /* school2.name = "Miler";
        school2.build = 1990;*/
        school2.setInformation("Miller", 1970);
        school2.displayInformation();

        /*System.out.println("Name: "+school2.name);
        System.out.println("Year: "+school2.build);*/
    }


}
