package OOP.ProblemSolving2;

import javax.swing.*;
import java.util.Formatter;

public class Circle extends Shape {
    Circle(double r){
        super(r,r);
    }
    void area(){
        double result = Math.PI * dim1 * dim2;

        System.out.println("Circle area : "+String.format("%.2f", result));

    }

}
