package com.practice.fundamentals;

class A
{
     public void show()
     {
         System.out.print("java");
     }
}
class B extends A
{

}

public class Sample {
    public static void main(String[] args)
    {
        A obj = new B();
        obj.show();
    }
}