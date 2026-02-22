package Tut18_DataAbstraction;

//interface
interface Shape {
    int length = 10; // final and static variable
    int width = 20; //final and static variable

    void circle(); // Abstract method: Un-implemented

    //default method supported from java 8
    default void square() {
        System.out.println("This a squre");
    }


    //static supported from java 8
    static void rectangle() {
        System.out.println("This is Rectangle");
    }
}



public class InterfaceDemo implements Shape{
    public void circle(){
        System.out.println("This is circle");
    }

    public static void main(String[] args) {

        //scenario 1: class reference => class object
        InterfaceDemo obji = new InterfaceDemo();
        obji.circle();
        obji.square();
//        rectangle();// Error: Static method may only be called on its containing interface
        Shape.rectangle();

        //scenario 2: interface reference => class object
        Shape shIntrf = new InterfaceDemo();
        shIntrf.circle();
        shIntrf.square();
        Shape.rectangle();

    }
}
