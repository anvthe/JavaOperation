package String_Demo;

import java.util.Locale;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "Khan";
        String s2 = new String ("Roney Khan");
        char[] s3 = {'r', 'o', 'n'};

        System.out.println(s2);
        System.out.println(s3);


       int len = s1.length();
        //int i = Integer.parseInt(s1.toLowerCase(Locale.forLanguageTag(s1)));

        System.out.println(len);

        

    }
}
