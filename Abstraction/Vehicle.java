package com.xworkz.Abstraction;

public abstract class Vehicle {
	// Abstract methods
    abstract void startEngine();
    abstract void stopEngine();
    abstract String getVehicleType();
    
    // Concrete method
    public void displayVehicleInfo() {
        System.out.println("This is a type of vehicle.");
    }

}
