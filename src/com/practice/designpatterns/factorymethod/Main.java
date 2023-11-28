package com.practice.designpatterns.factorymethod;

import com.practice.designpatterns.factorymethod.vehicle.Vehicle;
import com.practice.designpatterns.factorymethod.vehiclefactory.CarFactory;
import com.practice.designpatterns.factorymethod.vehiclefactory.MotorcycleFactory;
import com.practice.designpatterns.factorymethod.vehiclefactory.VehicleFactory;

public class Main {
    public static void main(String[] args){
        VehicleFactory createCar = new CarFactory();
        Vehicle car = createCar.createVehicle();
        car.start();
        car.stop();

        VehicleFactory createMotorcycle = new MotorcycleFactory();
        Vehicle motorcycle = createMotorcycle.createVehicle();
        motorcycle.start();
        motorcycle.stop();
    }
}
