package OOP_JAVA.Polymorphism.Practic_2;

public class Rectangle extends Shape{

    double length,width;

    Rectangle (double length,double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        System.out.print("Rectangle area:");
        return length * width;
        //return super.area();
    }
}
