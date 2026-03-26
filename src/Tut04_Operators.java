public class Tut04_Operators {
    public static void main(String[] args) {
        //arithmetic
        int a = 10;
        int b = 6;
        System.out.println("arithmetic");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


        //comparison
        int c =10;
        int d = 5;
        System.out.println("comparison");
        System.out.println(c>d);
        System.out.println(c<d);
        System.out.println(c>=d);
        System.out.println(c<=d);
        System.out.println(c!=d);
        System.out.println(c==d);

        //logical operator
        boolean x = true;
        boolean y = false;
        System.out.println("logical operator");
        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(!y);
        System.out.println(!x);

        // increment decrement operator
        int p = 10;
        // pre increment
        System.out.println(p++);
        // post increment
        System.out.println(++p);

        int q = 10;
        // pre decrement
        System.out.println(q--);
        // post decrement
        System.out.println(--q);

        // assignment operators
        int m = 10;
//        m = m+5;
        m += 5;
        System.out.println(m);
        m -=10;
        System.out.println(m);

        m *=2;
        System.out.println(m);

        m /=2;
        System.out.println(m);

        m %=2;
        System.out.println(m);


        // ternary/conditional operator

        int o = 300, r= 200;

        System.out.println(o>r? o:r);
        System.out.println(o<r? o:r);
        System.out.println(1==1? 200:300);
        System.out.println(1==2? 200:300);

        int age = 30;
        String res = (age>=18? "Eligible to vote":"not eligible for vote");
        System.out.println(res);



    }
}
