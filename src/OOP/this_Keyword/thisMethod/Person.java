package OOP.this_Keyword.thisMethod;

public class Person {

    void message(){
        System.out.println("I am message method");
    }
    void display(){
        this.message();
        System.out.println("I am dispaly method");
    }


}
