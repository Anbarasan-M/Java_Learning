package com.practice.objectorientedprogramming;

//Using abstract class and inner class in same program
/* Online Java Compiler and Editor */
abstract class Temp{
    public abstract void show();
    public abstract void config();
}
public class AbstractClass{

    public static void main(String []args){
        Temp obj = new Temp()
        {
            public void show(){
                System.out.println("This is in a show");
            }
            public void config(){
                System.out.println("This is in a config");
            }
        };
        obj.show();
        obj.config();
        System.out.println("Hello, World!");
    }
}
