package Tut15Polymorphism_MethodOverloading;

public class AdditionMain {
    public static void main(String[] args) {
        Addition add = new Addition();

        add.sum(); // 1st method invocation

        add.sum(100, 200); //2nd method invocation

        add.sum(10,10.5); //3rd method invocation

        add.sum(5.5,10); // 4th method invocation

        add.sum(5,8,12); //5th method invocation
    }
}
