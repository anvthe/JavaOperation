package OOP_JAVA.Abstraction;

public class Test {
    public static void main(String[] args) {
        MobileUser mu; //reference variable
        mu = new Roney();
        mu.call();
        mu.sendMessage();
        mu = new Sonia();
        mu.sendMessage();

    }
}
