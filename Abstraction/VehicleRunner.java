package com.xworkz.Abstraction;

public class VehicleRunner {
	public static void main(String[] args) {
        
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();
        
        
        System.out.println(car.getVehicleType() + " Details:");
        car.startEngine();
        car.displayVehicleInfo();
        car.stopEngine();
        System.out.println();
        
       
        System.out.println(bike.getVehicleType() + " Details:");
        bike.startEngine();
        bike.displayVehicleInfo();
        bike.stopEngine();
        System.out.println();
        
        
        System.out.println(truck.getVehicleType() + " Details:");
        truck.startEngine();
        truck.displayVehicleInfo();
        truck.stopEngine();
    }

}
