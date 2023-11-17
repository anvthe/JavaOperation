package OOP_JAVA.Polymorphism.Practic_2;

public class Triangle extends Shape{
    double base,height;
  Triangle(double base,double height)
  {
      this.base = base;
      this.height = height;
  }
    @Override
    double area() {
      System.out.print("Triangle are:");
      return 0.5*base*height;
        //return super.area();
    }
}
