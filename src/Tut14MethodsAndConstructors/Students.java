package Tut14MethodsAndConstructors;

public class Students {
    //Q. In how many ways we can store data in variables


    // class variables
    int sid;
    String sName;
    char grade;



    //method
    //Approach1: Store data using object reference
    void printStudentData(){
        System.out.println(sid+" "+sName+" "+grade);
    }

    //Approach2: Using direct method
    void setStudentData(int id, String name, char gr)
    {
        sid=id;
        sName=name;
        grade=gr;
    }

    // Approach3: Using constructor
    // constructor is part of class
    // syntax ius same as methods
    //name is same as a class name
    //constructor never return any value
    // it even do not require void
    // constructor is auto invoked when object is created

    Students (int id, String name, char gr){
        sid=id;
        sName=name;
        grade=gr;
    }








}
