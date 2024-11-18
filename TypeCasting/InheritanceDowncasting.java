package com.xworkz.TypeCasting;

public class InheritanceDowncasting {
	public static void main(String[] args) {
        
        Vehicle vehicle = new Car();
        vehicle.drive(); 
        
        
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.honk(); 
        }
    }

}
class Vehicle {
    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    public void honk() {
        System.out.println("Car is honking");
    }
}
