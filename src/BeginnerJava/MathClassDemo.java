package BeginnerJava;

public class MathClassDemo {
    public static void main(String[] args) {

   int x = 20;
   int y = 10;
   int result;
   result=Math.max(x,y);
   //result=Math.ceilDiv(x,y);

   int absolute = Math.abs(y);
   System.out.println("Maximum:"+ result);
   //System.out.print("Maximum:"+ result);
   System.out.println("Absoulate:"+ absolute);


   double power = Math.pow(x,y);

   System.out.println(+power);

   int round = Math.round(9.50f);
    System.out.println("Round " +round);

    double pi = Math.PI;
    System.out.print( + pi);
    }
}
