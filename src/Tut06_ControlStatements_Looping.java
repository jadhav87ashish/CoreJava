public class Tut06_ControlStatements_Looping {
    public static void main(String[] args) {
        // while loop
        // conditional check at start
        // print 1 to 10

        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }


        // print hello message 10 times
        int j = 1;
        while (j<=10){
            System.out.println("hello");
            j++;
        }

        // print even numbers between 1 and 10
        int k =2;
        while (k<=10){
            System.out.println(k);
            k+=2;
        }
        // print even numbers between 1 and 10 using modulo
        int f = 1;
        while (f<=10){
            if(f%2==0){
                System.out.println(f);
            }
            f++;
        }


        // print odd numbers between 1 and 10 using modulo
        int g = 1;
        while (g<=10){
            if(g%2==1){
                System.out.println(g);
            }
            g++;
        }


        // print 10 to 1 in decending order
        int p = 10;
        while(p>=1){
            System.out.println(p);
            p--;
        }


        // do while loops
        // conditional check at end
        // print 1 to 10 numbers

        int y = 1;
        do{
            System.out.println(y);
            y++;
        }while (y<=10);



        // print 10 to 1 numbers

        int z = 10;
        do{
            System.out.println(z);
            z--;
        }while (z>=1);


        // for loops
        // print 1 to 10 using for loop

        for (int r=1; r<=10; r++ ){
            System.out.println("For loop "+r);
        }


        // print 1 to 10 only even numbers using for loop
        for (int l = 1; l<=10;l++){
            if (l%2==0){
                System.out.println("Even numbers in for loop "+l);
            }
        }

        // print 1 to 10 all numbers with even or odd
        for (int q = 1; q<=10; q++){
            if (q%2==0){
                System.out.println(q+ " is a EVEN number");
            }
            else {
                System.out.println(q+ " is a ODD numbers");
            }
        }


        // print 10 to 1 in descending order using for loop
        for (int b = 10; b>=1; b--){
            System.out.println(b + " for loop in descending order");
        }



    }
}
