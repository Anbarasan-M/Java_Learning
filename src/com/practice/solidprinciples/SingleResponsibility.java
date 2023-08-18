package com.practice.solidprinciples;

//class Demo1
//{
//    public void printDetails()
//    {
//        System.out.println("Print details");
//    }public void grade()
//    {
//        System.out.println("grade details");
//    }public void result()
//    {
//        System.out.println("result details");
//    }
//}  Defining several methods in a same class should be avoided, instead
class Pen
{
    public void write()
    {
        System.out.println("Used to take notes");
    }
}class Eraser
{
    public void erase()
    {
        System.out.println("Used to erase mistakes made");
    }
}class Ruler
{
    public void measure()
    {
        System.out.println("Used to measure length");
    }
}

public class SingleResponsibility
{
    public static void main(String[] args)
    {
        Pen obj1 = new Pen();
        Eraser obj2 = new Eraser();
        Ruler obj3 = new Ruler();

        obj1.write();
        obj2.erase();
        obj3.measure();
    }
}
