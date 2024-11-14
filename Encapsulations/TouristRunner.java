package com.xworkz.Encapsulation;

public class TouristRunner {
	 public static void main(String[] args) {
	     
	        Tourist tourist1 = new Tourist("Anu", 30, "American", "A12345678", "123-456-7890",
	                                       "alice@example.com", "123 Maple beach", "098-765-4321", 
	                                       "Holiday Travels", "Premium Package", "surat", "2024-12-10", 
	                                       "2024-12-20", 5000.00, "Grand Hotel", "Suite", 101, 
	                                       "John ", "English", false);

	        Tourist tourist2 = new Tourist("Boby", 40, "British", "B87654321", "234-567-8901",
	                                       "boby@example.com", "456 Oak Avenue", "987-654-3210", 
	                                       "Explore Tours", "Standard Package", "ladak", "2025-01-05", 
	                                       "2025-01-15", 3000.00, "Lay ladak", "Deluxe", 202, 
	                                       "Sara", "english", true);

	
	        tourist1.displayInfo();
	        System.out.println("Remaining Budget (Tourist 1): $" + tourist1.calculateRemainingBudget(1000.00));
	        
	        System.out.println(tourist1.getAge());
	        tourist1.setAge(0);
	        System.out.println(tourist1.getAge());
	        System.out.println(tourist2.getBudget());
	        tourist2.setBudget(0);
	        System.out.println(tourist2.getBudget());
	    }

}
