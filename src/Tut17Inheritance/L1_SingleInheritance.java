package Tut17Inheritance;


class A
{
    int a = 100;
    void display() {
        System.out.println(a);
    }
}

//single
class B extends A
{
    int b = 456;
    void show(){
        System.out.println(b);
    }
}

//multi-level
class C extends B
{
    int c = 555;
    void print(){
        System.out.println(c);
    }
}



public class L1_SingleInheritance {
    public static void main(String[] args) {

//        //Single Inheritance
//        B objb = new B();
//
//        System.out.println(objb.b);
//        System.out.println(objb.a); // without creating object of class A, its variable accessed via its child class B
//
//        objb.show();
//        objb.display();//  without creating object of class A, its method accessed via its child class B


            // Multilevel Inheritance
        C objc = new C();
        System.out.println(objc.c);
        System.out.println(objc.b); //without creating object of class B, its variable accessed via its child class c
        System.out.println(objc.a); //without creating object of class A, its variable accessed via its child class c through B

        objc.print();
        objc.show(); //without creating object of class B, its method accessed via its child class c
        objc.display(); //without creating object of class A, its method accessed via its child class c through B
        objc.display(); //without creating object of class A, its method accessed via its child class c through B
    }
}
