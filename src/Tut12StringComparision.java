import java.util.Arrays;

public class Tut12StringComparision {
    public static void main(String[] args) {

        // String comparison
        // what is difference between == and .equals()?
        // what is difference between String s = "WELCOME" & String s = new String ("WELCOME)?


        //scenario 1
        String s1 = "welcome";
        String s2 = "welcome";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        //scenario 2
        String s3 = new String("welcome");
        String s4 = new String( "welcome");
        System.out.println(s3==s4); // false because == compares object (here with new created 2 diff objects)
        System.out.println(s3.equals(s4));// true because .equals() compares values inside the objects


        //scenario 3
        System.out.println("scenario 3");
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = str2;

        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));// true
        System.out.println(str2==str3);//true
        System.out.println(str2.equals(str3));//true
        System.out.println(str1==str3);// flase
        System.out.println(str1. equals(str3));//true




    }
}
