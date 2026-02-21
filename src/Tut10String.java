import java.util.SortedMap;

public class Tut10String {
    public static void main(String[] args) {

        //declaration Approach 1
        String s1 = "Welcome";
        System.out.println(s1);


        //declaration Approach 2
        String s2 = new String (" to jungle");
        System.out.println(s2);

        // default method
        // length
        System.out.println(s1.length());

        //concatenation
        System.out.println(s1.concat(s2));


        String s3 = " of Ashish";
        System.out.println(s1.concat(s2).concat(s3));

        //or
        System.out.println(s1+s2+s3);

        //or
        System.out.println("Welcome"+s2+s3);


        //trim
        String mainStr= "   Welcome   ";
        System.out.println("Original Length of mainSTR is "+mainStr.length());
        System.out.println("After trim "+ (mainStr.trim()).length());

        //charAt
        System.out.println(s1.charAt(3));
        System.out.println(s1.charAt(0));

        // contains
        System.out.println(s1.contains("we"));
        System.out.println(s1.contains("We"));
        System.out.println(s1.contains("COME"));
        System.out.println(s1.contains("come"));


        //equals and equals ignore case
        System.out.println(s1.equals("Welcome"));
        System.out.println(s1.equals("welcome"));
        System.out.println(s1.equalsIgnoreCase("welcome"));
        System.out.println(s1.equalsIgnoreCase("WELCOME"));


        //replace
        String str = "Wellcome!!! My name is Ashish, Ashish";
        System.out.println(str.replace("Ashish", "Amit"));
        System.out.println(str.replaceAll("Ashish","Amit"));
        System.out.println(str.replace("!!!",""));
        System.out.println(str.replace(" ",""));


        //substring
        System.out.println(s1.substring(0,3));
        System.out.println(s1.substring(1,5));


        //uppercase lowercase
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        //split
        String newStr = "abc_xyz@pqr_com"; // doesnot work with some special chars like . / , ; ' ' [ ]
        String a[]=newStr.split(" ");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);


        


    }
}
