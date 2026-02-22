package Tut20_ExceptionHandling;

import java.util.Scanner;

public class UnCheckedExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Program started");

        Scanner sc = new Scanner(System.in);

        //Ex1
        System.out.println("Enter a number");
        int num =  sc.nextInt();
        System.out.println(100/num); // if user enter 0: leads to ArithmeticException



        //Ex 2
        int a[] = new int[5];
        System.out.println("Enter index 0 to 4"); // if user enter index greater than 4: leads to ArrayIndexOutOfBoundsException
        int pos = sc.nextInt();
        System.out.println("Enter a value");
        int val = sc.nextInt();
        a[pos]=val;
        System.out.println(a[pos]);


        //Ex 3
        String s = "Welcome";// this will throw NumberFormatException
//        String s = "123456";
        int number = Integer.parseInt(s);


//        Ex 4

        String s1 = null; // NullPointerException
        System.out.println(s1.length());



        // How to Handle exceptions

        //Ex1
        System.out.println("Enter a number");
        int num2 =  sc.nextInt();
        try {
            System.out.println(100 / num2); // if user enter 0: leads to ArithmeticException
        }
        catch (ArithmeticException e){
            System.out.println("Invalid data");
        }

        //Approach 1
        // If we dont know, which type of exception, then use multiple catch blocks

        //Ex2
        System.out.println("Enter a number");
        int num3 =  sc.nextInt();
        try {
            System.out.println(100 / num3); // if user enter 0: leads to ArithmeticException
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        //Approach 2
        // Problem: only 3 exceptions are handled, we have 1000 such exceptions and dont know which will occure
        //Solution use parent class of Exception

        System.out.println("Enter a number");
        int num4 =  sc.nextInt();
        try {
            System.out.println(100 / num4); // if user enter 0: leads to ArithmeticException
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        // Approach 3
        // Use finally block which will always get executed

        System.out.println("Enter a number");
        int num5 =  sc.nextInt();
        try {
            System.out.println(100 / num5); // if user enter 0: leads to ArithmeticException
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Close DB connections");
        }



    }
}
