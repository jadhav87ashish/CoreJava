package Tut17Inheritance;

//method overriding demo
//parent
class Bank
{
    double roi(){
        return 0;
    }
}


//child1
class ICICI extends Bank
{
    double roi(){
        return 10.5;
    }
}

//child2
class SBI extends Bank
{
    double roi(){
        return 11.5;
    }
}




public class L3_MethodOverriding {
    public static void main(String[] args) {

        ICICI ic = new ICICI();
        System.out.println(ic.roi());// method of parent class overriden

        SBI sb = new SBI();
        System.out.println(sb.roi());// method of parent class overriden





    }
}
