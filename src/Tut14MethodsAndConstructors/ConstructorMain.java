package Tut14MethodsAndConstructors;

public class ConstructorMain {
    public static void main(String[] args) {

        // Invoke default constructor
        Constructor cr = new Constructor();
        cr.sum();


        //Invoke parameterized constructor
        Constructor cr1 = new Constructor(10,20);
        cr1.sum();


    }
}

