package com.practice.designpatterns.factorymethod.vehicle;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped...");
    }
}
