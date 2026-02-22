package Tut17Inheritance;

//Parent
class ABC
{
    void m1(int a){
        System.out.println(a);
    }

    void m2(int b){
        System.out.println(b);
    }
}


//Child
class XYZ extends ABC
{
    void m1 (int a){
        System.out.println(a*a); // overriding: implementation of parent method is altered
    }

    void m2 (int a , int b){
        System.out.println(a+b);// Overloading:
    }
}



public class L4_OverloadingVsOverriding {
    public static void main(String[] args) {
        XYZ objx = new XYZ();
        objx.m1(10); // 100, Overriding: child changed implementation
        objx.m2(20);
        objx.m2(30,50);
    }
}
