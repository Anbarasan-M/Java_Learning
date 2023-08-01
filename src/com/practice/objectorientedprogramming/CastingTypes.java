package com.practice.objectorientedprogramming;

class C
{
    public void show()
    {
        System.out.println("In C show");
    }
}
class D extends C{
    public void show1()
    {
        System.out.println("In D show");
    }
}
public class CastingTypes
{
    public static void main(String[] args)
    {
        C obj = new D(); // Downcasting
        obj.show();

        D obj1 = (D) obj; // Upcasting
        obj1.show1();
    }
}
