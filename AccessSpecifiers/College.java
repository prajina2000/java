package com.xworkz.AccessSpecifiers;

public class College {
    
    public String collegeName;
    protected int establishedYear;
    String location;
  
     College() {
        this.collegeName = "SDM College";
        this.establishedYear = 1997;
        this.location = "manglore";
        System.out.println("collage Details");
    }

  
    public void admitStudent() {
        System.out.println("Student admitted to the college.");
    }

 
    protected void conductExam() {
        System.out.println("Exam conducted.");
    }

    
    void announceResults() {
        System.out.println("Results announced.");
    }
}
