package com.xworkz.AccessSpecifiers;

import com.xworkz.AccessSpecifiers.details.Student;

public class CollegeRunner extends Student {

    public static void main(String[] args) {
        
        
        College college = new College();
        System.out.println("College Name: " + college.collegeName);
        System.out.println("Established Year: " + college.establishedYear);
        System.out.println("Location: " + college.location);
        college.admitStudent(); 
        college.conductExam();
        college.announceResults();

      
        Student student = new Student();
        System.out.println("Student Name: " + student.name);
        student.attendClass();
        //student.displayCgpa();

      
        CollegeRunner runner = new CollegeRunner();
        System.out.println("Student Age: " + runner.age);
        runner.submitAssignment();
    }
}
