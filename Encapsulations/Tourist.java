package com.xworkz.Encapsulation;

public class Tourist {
	private String name;
    private int age;
    private String nationality;
    private String passportNumber;
    private String contactNumber;
    private String email;
    private String address;
    private String emergencyContact;
    private String travelAgency;
    private String tourPackage;
    private String destination;
    private String travelDate;
    private String returnDate;
    private double budget;
    private String hotelName;
    private String roomType;
    private int roomNumber;
    private String guideName;
    private String preferredLanguage;
    private boolean specialNeeds;

   
    public Tourist(String name, int age, String nationality, String passportNumber, String contactNumber,
                   String email, String address, String emergencyContact, String travelAgency, String tourPackage,
                   String destination, String travelDate, String returnDate, double budget, String hotelName,
                   String roomType, int roomNumber, String guideName, String preferredLanguage, boolean specialNeeds) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.passportNumber = passportNumber;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
        this.emergencyContact = emergencyContact;
        this.travelAgency = travelAgency;
        this.tourPackage = tourPackage;
        this.destination = destination;
        this.travelDate = travelDate;
        this.returnDate = returnDate;
        this.budget = budget;
        this.hotelName = hotelName;
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.guideName = guideName;
        this.preferredLanguage = preferredLanguage;
        this.specialNeeds = specialNeeds;
    }

    public String getName() {
    	return name; 
    	}
    public void setName(String name) {
    	this.name = name; 
    	}

    public int getAge() { 
    	return age;
    	}
    public void setAge(int age) {
        if (age > 0) {  // Only set if age is positive
            this.age = age;
        }
    }
    

    public String getNationality() {
    	return nationality;
    	}
    public void setNationality(String nationality) {
    	this.nationality = nationality;
    	}

    public String getPassportNumber() {
    	return passportNumber; 
    	}
    public void setPassportNumber(String passportNumber) { 
    	this.passportNumber = passportNumber;
    	}

    public String getContactNumber() {
    	return contactNumber;
    	}
    public void setContactNumber(String contactNumber) { 
    	this.contactNumber = contactNumber;
    	}

    public String getEmail() {
    	return email; 
    	}
    public void setEmail(String email) {
    	this.email = email;
    	}

    public String getAddress() { return address; }
    public void setAddress(String address) { 
    	this.address = address;
    	}

    public String getEmergencyContact() {
    	return emergencyContact;
    	}
    public void setEmergencyContact(String emergencyContact) { 
    	this.emergencyContact = emergencyContact;
    	}

    public String getTravelAgency() {
    	return travelAgency; 
    	}
    public void setTravelAgency(String travelAgency) {
    	this.travelAgency = travelAgency;
    	}

    public String getTourPackage() {
    	return tourPackage;
    	}
    public void setTourPackage(String tourPackage) {
    	this.tourPackage = tourPackage;
    	}

    public String getDestination() {
    	return destination;
    	}
    public void setDestination(String destination) {
    	this.destination = destination; 
    	}

    public String getTravelDate() {
    	return travelDate;
    	}
    public void setTravelDate(String travelDate) {
    	this.travelDate = travelDate; 
    	}

    public String getReturnDate() {
    	return returnDate;
    	}
    public void setReturnDate(String returnDate) { 
    	this.returnDate = returnDate; 
    	}

    public double getBudget() { 
    	return budget;
    	}
    public void setBudget(double budget) {
        if (budget > 0) {  
            this.budget = budget;
        }
    }

    public String getHotelName() {
    	return hotelName;
    	}
    public void setHotelName(String hotelName) { 
    	this.hotelName = hotelName;
    	}

    public String getRoomType() {
    	return roomType;
    	}
    public void setRoomType(String roomType) {
    	this.roomType = roomType; 
    	}

    public int getRoomNumber() {
    	return roomNumber;
    	}
    public void setRoomNumber(int roomNumber) {
    	this.roomNumber = roomNumber;
    	}

    public String getGuideName() {
    	return guideName;
    	}
    public void setGuideName(String guideName) {
    	this.guideName = guideName; 
    	}

    public String getPreferredLanguage() { 
    	return preferredLanguage;
    	}
    public void setPreferredLanguage(String preferredLanguage) {
    	this.preferredLanguage = preferredLanguage;
    	}

    public boolean hasSpecialNeeds() {
    	return specialNeeds; 
    	}
    public void setSpecialNeeds(boolean specialNeeds) {
    	this.specialNeeds = specialNeeds; 
    	}

    
    public void displayInfo() {
        System.out.println("Tourist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Destination: " + destination);
        System.out.println("Travel Date: " + travelDate);
        System.out.println("Return Date: " + returnDate);
    }

    public double calculateRemainingBudget(double spentAmount) {
        return budget - spentAmount;
    }

    public void updateTravelDetails(String newDestination, String newTravelDate, String newReturnDate) {
        destination = newDestination;
        travelDate = newTravelDate;
        returnDate = newReturnDate;
    }

}
