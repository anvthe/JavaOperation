package Array_Demo;

public class Array1 {
    public static void main(String[] args) {
       /* int [] number;
        number = new int[10];*/
        int [] number = new int[5];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

         int sum = number[0] + number[1] + number[2];
         System.out.println(sum);
        int len = number.length;
        System.out.println(len);

    }

}
