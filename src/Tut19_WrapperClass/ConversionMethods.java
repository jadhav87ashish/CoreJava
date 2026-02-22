package Tut19_WrapperClass;

public class ConversionMethods {
    public static void main(String[] args) {

        // Scenario 1: String to other primitive
        //string to int
//        String s = "welcome"; // this gives NumberFormatException
        String s11 = "12345";
        int sint = Integer.parseInt(s11);
        System.out.println(sint);


        String price1 = "100";
        String price2 = "200";
        System.out.println(Integer.parseInt(price1)+Integer.parseInt(price2));

        // String to double
        String s1 = "10.5";
        String s2 = "20.0";
        System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));

        //String to boolean
        String sb = "Ashish";
        System.out.println(Boolean.parseBoolean(sb));// anything other than true will be returned as false
        String sb1 = "true";
        System.out.println(Boolean.parseBoolean(sb1));



        // Scenario 2 : Other primitive to String conversion
        int a = 10;
        double d = 10.5;
        char c = 'A';
        boolean b = true;

        String s = String.valueOf(a);
        System.out.println(s);

        s = String.valueOf(d);
        System.out.println(s);

        s = String.valueOf(c);
        System.out.println(s);

        s = String.valueOf(b);
        System.out.println(s);







    }
}
