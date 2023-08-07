package com.practice.objectorientedprogramming;

class AIC
{
    public void method()
    {
        System.out.println("This is in normal class");
    }
}
public class AnonymousInnerClass
{
    public static void main(String [] args) {

        //   This will act like method overriding but here we are using anonymous inner class

        AIC obj = new AIC() {
            public void method() {
                System.out.println("This is in AIC ");
            }

        };
        obj.method();
    }
}
