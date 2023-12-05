package BeginnerJava;

public class StringComparision {
    public static void main(String[] args) {
        String password1 = "rko123";
        String password2 = "Rko123";
        String password3 = new String( "rko123");
        String password4 = new String( "rko123");


        System.out.println(password1.equalsIgnoreCase(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password2==password4);

    }







}
