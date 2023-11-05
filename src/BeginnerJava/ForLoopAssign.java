package BeginnerJava;

public class ForLoopAssign {

    public static void main(String[] args) {

        /*int i; int sum = 0;
        for( i = 1; i<=10; i++)
        {  sum = sum + i;
            System.out.println(sum);
        }*/

        for (int i = 1; i<=100; i=i+2)
        {
            if  (i==10)
                break;
            System.out.println(i);
        }

    }
}
