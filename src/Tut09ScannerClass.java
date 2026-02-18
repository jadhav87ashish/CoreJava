import java.util.Arrays;
import java.util.Scanner;

public class Tut09ScannerClass {
    public static void main(String[] args) {

        //scanner class
        // takes input from system keyboard

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter String");
        String str = sc.next();
        System.out.println("You entered "+str);

        //nextInt()
        System.out.println("Enter Integer");
        int num = sc.nextInt();
        System.out.println("You entered "+num);

        // if data type is not known
        System.out.println("Enter Any data type");
        Object obj = sc.next();
        System.out.println("You entered "+obj.toString());


        //Addition of two numbers
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        System.out.println("Addition of the numbers is: "+ (a+b));


        // Reading input and writing in to the array
        int arr[] = new int[5];
        for (int i = 0; i<=arr.length-1; i++){
            System.out.println("Enter a value to be inserted in index: "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("Array contents are "+ Arrays.toString(arr));

    }
}
