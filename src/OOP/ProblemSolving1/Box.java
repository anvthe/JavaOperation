package OOP.ProblemSolving1;

public class Box {
    double height,width,depth; //instance variable
    Box(double h, double w, double d) //local variable
    {
      height = h;
      width = w;
      depth = d;
    }
    void dispalyVol()
    {   double vol = height * width * depth;
        System.out.println("Volume is: "+vol);
    }

}

/* instance variable hide with this keyword
public class Box {
    double height, width, depth; //instance variable

    Box(double height, double width, double depth) //local variable
    {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
}*/
