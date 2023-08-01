package com.practice.objectorientedprogramming;

//Dynamic method dispatch
class Parent
{
    public void show()
    {
        System.out.println("In parent");
    }
}
class Child extends Parent
{

}
class GrandChild extends Parent
{

}
public class Polymorphism {
    public static void main(String [] args)
    {
       Parent obj = new Parent();

       obj = new Child();

       obj = new GrandChild();  // based on instance creation, characteristics changed. It is polymorphism

       obj.show();
    }
}
