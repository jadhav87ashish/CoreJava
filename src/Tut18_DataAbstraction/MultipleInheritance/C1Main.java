package Tut18_DataAbstraction.MultipleInheritance;

public class C1Main extends C2 implements I1, I2 {
    public void m1(){           // un-implemented method from interface 1 (I1) implemented here
        System.out.println(x);
    }
    public void m2(){  // un-implemented method from interface 2 (I2) implemented here
        System.out.println(y);
    }

    public static void main(String[] args) {
        C1Main objc1 = new C1Main();
        objc1.m1(); // multiple inheritance
        objc1.m2(); // multiple inheritance
        objc1.m3(); // hybrid inheritance
    }

}
