package com.practice.objectorientedprogramming;
abstract class Car                             // Abstract class
{
    public abstract void drive(); // just declaration not defining
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Listening to music");
    }
}
abstract class RollsRoyce extends Car          // Abstract class
{
    public void drive()
    {
        System.out.println("It can be driven");
    }
}
class UpdatedCar extends RollsRoyce              // Concrete Class
{
    public void fly()
    {
        System.out.println("It could fly");
    }
}
public class Abstract
{
    public static void main(String [] args)
    {
        UpdatedCar obj = new UpdatedCar();
        obj.drive();
        obj.fly();
    }
}
