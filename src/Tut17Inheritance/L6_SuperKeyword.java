package Tut17Inheritance;



class Animal{
    String type = "Wild Animal";
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    String type = "Domestic Animal";
    void printDg(){
        System.out.println(super.type); // Super wth variable
    }

    void sound(){
        super.sound();// super with method
    }

}


public class L6_SuperKeyword {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.printDg();
        dg.sound();
        }
}
