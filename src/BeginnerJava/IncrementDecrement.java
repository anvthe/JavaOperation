package BeginnerJava;

public class IncrementDecrement {
    public static void main(String[] args) {

        int x = 25;
        int y;

        y= ++x; //pre increment
        System.out.println("Y = " +y);

        y = x++; //post increment
        System.out.println("Y = " +y);
        // y=x;

        y= --x; //pre decrement
        System.out.println("Y = " +y);

        y= x--; //post decrement
        System.out.println("Y = " +y);
        //y=x;


    }

}
