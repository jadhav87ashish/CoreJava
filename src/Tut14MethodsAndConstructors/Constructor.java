package Tut14MethodsAndConstructors;

public class Constructor {
    int x,y;
    // default constructor
    Constructor(){
        x=100;
        y=200;
    }

    //parameterized constructor
    Constructor(int a, int b){
        x=a;
        y=b;
    }

    //Additional method
    void sum(){
        System.out.println(x+y);
    }
}

