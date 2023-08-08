package com.practice.objectorientedprogramming;

// class to class --> extends
// interface to class --> implements
// interface to interface --> extends
interface AA
{
    int price = 1000;  //By default, the variables are static and final here
    String name = "iphone";

    void show();
    void config();
}

interface X
{
    void run();
}

interface Y extends X
{

}

class BB implements AA, Y // implement is the keyword for  inheritance here --> Multiole inheritance is supported in interface
{
    public void show(){
        System.out.println("In show");
    }
    public void config(){
        System.out.println("In config");
    }
    public void run(){
        System.out.println("In run");
    }
}

public class Interface{

    public static void main(String []args){
        // A obj = new A() //cannot instantiate interface
        AA obj;
        obj = new BB();
        obj.show();
        obj.config();
        // we cannot call it with obj
        X obj1 = (X) new B();
        obj1.run();
    }
}