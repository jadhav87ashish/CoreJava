package Tut14MethodsAndConstructors;

public class Greetings {
    //method types

    // 1. no param<=>no return value
    void method1(){
        System.out.println("Hello");
    }


    // 2. no param<=> return value
    String method2(){
        return "Hello World";
    }

    // 3. Take param <=> no return
    void method3(String name){
        System.out.println("Hello "+ name);
    }

    // 4. Take param <=> return Value
    String method4(String name1){
        return ("Hello"+name1);
    }

}
