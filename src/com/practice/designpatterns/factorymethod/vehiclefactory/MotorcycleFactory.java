package com.practice.designpatterns.factorymethod.vehiclefactory;

import com.practice.designpatterns.factorymethod.vehicle.Motorcycle;
import com.practice.designpatterns.factorymethod.vehicle.Vehicle;

public class MotorcycleFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
