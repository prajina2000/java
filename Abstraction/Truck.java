package com.xworkz.Abstraction;

public class Truck extends Vehicle {
    @Override
    void startEngine() {
        System.out.println(getVehicleType() + " engine started.");
    }
    
    @Override
    void stopEngine() {
        System.out.println(getVehicleType() + " engine stopped.");
    }
    
    @Override
    String getVehicleType() {
        return "Truck";
    }
}