package Tut25_LambdaExpressions;

interface Cab{
    public void bookCab();
}


//class Ola implements Cab{
//    public void bookCab(){
//        System.out.println("Ola cab Booked");
//    }
//}


public class LambdaExpressionDemo1 {
    public static void main(String[] args) {
//        Cab c = new Ola();
//        c.bookCab();

        //Call functional interface
        Cab c = ()-> System.out.println("Ola cab booked");
        c.bookCab();
    }
    
    
}





