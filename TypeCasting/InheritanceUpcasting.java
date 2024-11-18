package com.xworkz.TypeCasting;


class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

public class InheritanceUpcasting {
	 public static void main(String[] args) {
	        
	        Animal animal = new Dog();
	        animal.makeSound(); 
	    }

}
