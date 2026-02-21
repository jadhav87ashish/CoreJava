package Tut14MethodsAndConstructors;

public class StudentsMain {
    //Q. In how many ways we can store data in variables

    public static void main(String[] args) {
//        Students stu = new Students();
//
//        //Approach1: Store data using object reference
//        stu.sid=101;
//        stu.sName="Ashish";
//        stu.grade='C';
//        stu.printStudentData();
//
//        //Approach2: Using direct method
//        stu.setStudentData(102, "Amit",'D');
//        stu.printStudentData();



        // Approach3: Using constructor
        // constructor is part of class
        // syntax ius same as methods
        //name is same as a class name
        //constructor never return any value
        // it even do not require void
        // constructor is auto invoked when object is created

        Students stu = new Students(103,"Akash",'E');
        stu.printStudentData();

    }
}
