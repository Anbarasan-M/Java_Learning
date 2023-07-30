package com.practice.objectorientedprogramming;

class Demo
{
    String name;
    int age;

    public Demo()
    {
        System.out.print("Default Constructor");
    }

//    Constructor name always should be like class name
    public Demo(int a, String n) // Parameterised constructor
    {
        name = n;
        age = a;
        System.out.println("Constructor called");
    }
}
public class Constructor
{
    public static void main(String []args)
    {
//        A constructor is always called everytime an object is created - it is a default operation
        Demo obj = new Demo(21, "Anbu");
        System.out.println(obj.age + " " + obj.name);
    }
}