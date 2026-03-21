package Tut22_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // Type Casting in Java refers to converting a variable from one data type to another. There are two types of type casting:
        // 1. Implicit Type Casting (Widening): This happens when a smaller data type is automatically converted to a larger data type. For example, converting an int to a double.
        // 2. Explicit Type Casting (Narrowing): This happens when a larger data
        // type is manually converted to a smaller data type. For example, converting a double to an int.
        // Example of both types of type casting:
        // Implicit Type Casting (Widening)
        int num = 100;
        double doubleNum = num; // int to double
        System.out.println("Implicit Type Casting (int to double): " + doubleNum);

        // Explicit Type Casting (Narrowing)
        double pi = 3.14159;
        int intPi = (int) pi; // double to int
        System.out.println("Explicit Type Casting (double to int): " + intPi);
    }
}
