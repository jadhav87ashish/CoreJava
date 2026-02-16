public class Tut05_ControlStatements_ConditionalLoops {
    public static void main(String[] args) {
        //conditional
        // if

        int age = 25;
        if (age>=18)
        {
            System.out.println("Eligible for vote");
        }

        // if else
        int newAge= 18;
        if (newAge>=18)
        {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible for vote");
        }



        // even or odd
        int i = 1201;

        if (i%2==0)
        {
            System.out.println("Number is even");
        }
        else {
            System.out.println("number is odd");
        }


        // if else ladder
        //check number is even, odd or zero

        int x =0;
        if (x>0){
            System.out.println("Number is positive");
        }
        else if (x<0){
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }


        // find largest of 3 numbers
        int a=5, b=10, c=7;
        if (a>b && a>c){
            System.out.println("a is largest");
        } else if (b>a && b>c) {
            System.out.println("b is largest");
        }
        else {
            System.out.println("c is largest");
        }


        // if else ladder
        // display week day based on week number
        int p =14;
        if(p==1){
            System.out.println("its Monday");
        } else if (p==2) {
            System.out.println("its Tuesday");
        } else if (p==3) {
            System.out.println("its Wednesday");
        } else if (p==4) {
            System.out.println("its Thursday");
        } else if (p==5) {
            System.out.println("its Friday");
        } else if (p==6) {
            System.out.println("its Saturday");
        } else if (p==7) {
            System.out.println("its Sunday");
        }else {
            System.out.println("invalid week day");
        }


        // switch case statements
        
        int day = 5;
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursaday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid day");

        }


        //Assignment: find largest of 2 numbers using if else
        int g = 110;
        int h = 11;
        if (g>h){
            System.out.println("g is largest");
        }
        else {
            System.out.println("h is largest");
        }

        //Assignment: find largest of 2 numbers using TERNARY operator

        String res = g>h? "g":"h";
        System.out.println(res+ " is largest");



        //assignment: smallest of three numbers
        // using if else
        int u = 10;
        int v = 15;
        int w = 20;

        if (u<v && u<w){
            System.out.println("u is smallest");
        } else if (v<u && v<w) {
            System.out.println("v is smallest");
        }else {
            System.out.println("w is smallest");
        }

        //Assignment: print day from given dayname using swich case

        String dayname = "Saturday";
        switch (dayname)
        {
            case "Monday":
                System.out.println("Its day 1");
                break;
            case "Tuesday":
                System.out.println("Its day 2");
                break;
            case "Wednesday":
                System.out.println("Its day 3");
                break;
            case "Thursday":
                System.out.println("Its day 4");
                break;
            case "Friday":
                System.out.println("Its day 5");
                break;
            case "Saturday":
                System.out.println("Its day 6");
                break;
            case "Sunday":
                System.out.println("Its day 7");
                break;
            default:
                System.out.println("Invalid day name");

        }


    }
}
