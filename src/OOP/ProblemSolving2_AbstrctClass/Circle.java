package OOP.ProblemSolving2_AbstrctClass;

public class Circle extends Shape {
    Circle(double r){
        super(r,r);
    }
    void area(){
        double result = Math.PI * dim1 * dim2;

        System.out.println("Circle area : "+String.format("%.2f", result));

    }

}
