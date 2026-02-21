package Tut13ClassAndObjects;

import Tut13Students.StudentsWithDOB;

public class StudentsMain {
    // method 2 (default main method)
    public static void main(String[] args) {

        //object creation
        //constructor
        Students stu1 = new Students();
        stu1.rollNo = 1;
        stu1.sName = "Ashish";
        stu1.grade = 'A';
        stu1.printStudent();

        Students stu2 = new Students();
        stu2.rollNo = 2;
        stu2.sName = "Amit";
        stu2.grade = 'A';
        stu2.printStudent();


        // calling a class from another package
        StudentsWithDOB birthDayBoy = new StudentsWithDOB();
        birthDayBoy.sName = "Amit";
        birthDayBoy.dob = "5th April";
        birthDayBoy.printHBD();

    }
}
