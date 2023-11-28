package com.practice.designpatterns.factorymethod.vehiclefactory;

import com.practice.designpatterns.factorymethod.vehicle.Car;
import com.practice.designpatterns.factorymethod.vehicle.Vehicle;

public class CarFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
