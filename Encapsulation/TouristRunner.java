package com.xworkz.Encapsulation;

public class TouristRunner {
	 public static void main(String[] args) {
	     
	        Tourist tourist1 = new Tourist("Alice", 30, "American", "A12345678", "123-456-7890",
	                                       "alice@example.com", "123 Maple Street", "098-765-4321", 
	                                       "Holiday Travels", "Premium Package", "Paris", "2024-12-10", 
	                                       "2024-12-20", 5000.00, "Grand Hotel", "Suite", 101, 
	                                       "John Smith", "English", false);

	        Tourist tourist2 = new Tourist("Bob", 40, "British", "B87654321", "234-567-8901",
	                                       "bob@example.com", "456 Oak Avenue", "987-654-3210", 
	                                       "Explore Tours", "Standard Package", "Tokyo", "2025-01-05", 
	                                       "2025-01-15", 3000.00, "Tokyo Inn", "Deluxe", 202, 
	                                       "Sara Lee", "Japanese", true);

	
	        tourist1.displayInfo();
	        System.out.println("Remaining Budget (Tourist 1): $" + tourist1.calculateRemainingBudget(1000.00));
	        
	        tourist2.displayInfo();
	        tourist2.updateTravelDetails("Kyoto", "2025-01-10", "2025-01-20");
	        tourist2.displayInfo();
	    }

}
