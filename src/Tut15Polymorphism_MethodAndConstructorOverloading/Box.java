package Tut15Polymorphism_MethodAndConstructorOverloading;

public class Box {
    double width, hieght, depth;

    //Constructor 1
    Box(){
        width=hieght=depth=0;
    }

    //Constructor 2
    Box(double w, double h, double d){
        width=w;
        hieght=h;
        depth=d;
    }

    //Constructor 3
    Box(double len){
        width=hieght=depth=len;
    }

    double volume(){
        return (width*hieght*depth);
    }


}
