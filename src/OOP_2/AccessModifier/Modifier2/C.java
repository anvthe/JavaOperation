package OOP_2.AccessModifier.Modifier2;
import OOP_2.AccessModifier.Modifier1.A;
public class C extends A {
    public static void main(String[] args) {
        A ob = new A();
        ob.display();
        C ob2 = new C();
        ob2.display2();
    }
}
