package Tut23_TypeCastingToObjects;

public class TypeCastingObjectMain {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.parentMethod();

        Child c = new Child();
        c.childMethod();

        //Upcasting
        Parent p1 = new Child();
        p1.parentMethod();
        //p1.childMethod(); //Compile time error
    }
}
