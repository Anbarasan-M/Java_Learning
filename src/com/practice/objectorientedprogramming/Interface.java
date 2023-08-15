package com.practice.objectorientedprogramming;

// class to class --> extends
// interface to class --> implements
// interface to interface --> extends
interface Aa
{
    int price = 1000;        //By default, the variables are static and final here
    String name = "iphone";  //we have to initialize it here

    // Every method is a public interface in abstract
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

//You have to define all the methods in interface to a class otherwise the class become abstract class
class Bb implements Aa, Y // implement is the keyword for  inheritance here --> Multiple inheritance is supported in interface
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

        Aa obj;
        obj = new Bb();
        obj.show();
        obj.config();


        // we cannot call it with obj
//        X obj1 = (X) new B();
//        obj1.run();


    }
}