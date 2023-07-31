package com.practice.objectorientedprogramming;

class A extends Object // this extension is always there hiding
{
    public A()
    {
        super();
        System.out.println("In A");
    }
    public A(int n)
    {
        super();
        System.out.println("ParaConstructor A");
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("In B");
    }
    public B(int n) // if you want to pass a parameterized constructor, specify the parameters else it will call the default constructor
    {
        this (); // this will call both the constructor in class B and call the default constructor in A
        System.out.println("ParaConstructor B");
    }
}

public class ThisAndSuper
{
    public static void main(String[]args)
    {
        B obj = new B(2);
    }
}