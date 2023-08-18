package com.practice.solidprinciples;
abstract class Vehicle
{
    abstract int getSpeed();
}
class Car extends Vehicle
{

    @Override
    int getSpeed() {
        return 80;
    }
}
class Bike extends Vehicle
{

    @Override
    int getSpeed() {
        return 60;
    }
}
public class LiskovSubstitution
{
    public static void main(String[] args)
    {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        int carSpeed = car.getSpeed();
        int bikSpeed = bike.getSpeed();

        System.out.println(carSpeed);
        System.out.println(bikSpeed);
    }
}
