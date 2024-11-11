package com.xworkz.AccessSpecifiers.details;

public class Student {

    public String name;
    protected int age;
    String rollNumber;
    private double cgpa;

    
    public Student() {
        this.name = "Amal";
        this.rollNumber = "4SH22MCO1";
        this.cgpa=7.1;
        System.out.println("Student detailas");
    }
    private void displayCgpa() {
    	System.out.println("cgpa is:"+cgpa);
    }
  
    public void attendClass() {
        System.out.println(name + " attended the class.");
    }

 
    protected void submitAssignment() {
        System.out.println(name+" submitted Assignment.");
    }

   
    void participateInEvent() {
        System.out.println(name+" is Participated in college event.");
    }
}
