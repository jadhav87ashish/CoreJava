package Tut13ClassAndObjects;

public class Employees {
    // class is collection of attribute and behaviours
    // class is collection of variables and methods
    // object is an instance of a class

    // variables
    int empId;
    String empName;
    String empJob;
    int empSal;


    // method 1 (user defined)
    void display(){
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(empJob);
        System.out.println(empSal);
    }


    // method 2 (default main method)
    public static void main(String[] args) {

        //object creation
        //constructor
        Employees emp1 = new Employees();
        emp1.empId=1;
        emp1.empName="Ashish";
        emp1.empJob="QA";
        emp1.empSal= 5000;
        emp1.display();

    }

}
