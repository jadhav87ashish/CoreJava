package Tut15Polymorphism_MethodAndConstructorOverloading;

public class BoxMain {
    public static void main(String[] args) {

        Box b1 = new Box(); // 1st Constructor invoked
        System.out.println(b1.volume());


        Box b2 = new Box(10.5,15.5,5.0); // 1st Constructor invoked
        System.out.println(b2.volume());


        Box b3 = new Box(10.75); // 1st Constructor invoked
        System.out.println(b3.volume());





    }
}
