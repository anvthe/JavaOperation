package OOP.Static_Block;

public class StaticBlock {

    static int id;
    static String name;

    static {
        id = 101;
        name = "Jalal";
    }
    static void display()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }

    public static void main(String[] args) {
        StaticBlock.display();
    }
}
