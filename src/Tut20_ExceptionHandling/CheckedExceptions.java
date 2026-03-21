package Tut20_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        System.out.println("Prog started");

        //Approach1: Using try catch
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


        //Approach 2: Using throw keyword in  main method
        Thread.sleep(100);
        FileInputStream file = new FileInputStream("C:\\text.txt");


    }
}
