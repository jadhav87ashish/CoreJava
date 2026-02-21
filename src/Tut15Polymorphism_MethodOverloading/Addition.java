package Tut15Polymorphism_MethodOverloading;

public class Addition {
    int a =20, b= 30;

    //1st method
    void sum(){
        System.out.println(a+b);
    }

    //2nd Method
    void sum (int x,int y){
        System.out.println(x+y);
    }

    //3rd method
    void sum(int x, double y){
        System.out.println(x+y);
    }

    // 4th method
    void sum (double x, int y){
        System.out.println(x+y);
    }

    // 5th method
    void sum (int a, int b, int c){
        System.out.println(a+b+c);
    }



}
