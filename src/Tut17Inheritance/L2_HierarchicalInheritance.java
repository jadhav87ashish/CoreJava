package Tut17Inheritance;

class Parent
{
    void displayParentMethod(int a){
        System.out.println(a);
    }
}



class Child1 extends Parent
{
    void displayChild1Method(int c1){
        System.out.println(c1);
    }
}



class Child2 extends Parent
{
    void displayChild2Method(int c2){
        System.out.println(c2);
    }
}


public class L2_HierarchicalInheritance {
    public static void main(String[] args) {

        Child1 ch1 = new Child1();
        ch1.displayChild1Method(111);
        ch1.displayParentMethod(222);


        Child2 ch2 = new Child2();
        ch2.displayChild2Method(444);
        ch2.displayParentMethod(555);
    }
}
