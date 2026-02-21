package Tut14MethodsAndConstructors;

public class GreetingsMain {
    public static void main(String[] args) {
        Greetings gr = new Greetings();

        //1. no param<=>no return value
        gr.method1();

        //2. no param<=> return value
        String s = gr.method2();
        System.out.println(s);

        // 3. Take param <=> no return
        gr.method3("Ashish");

        // 4. Take param <=> return Value
        String str = gr.method4("AJ");
        System.out.printf(str);

    }
}
