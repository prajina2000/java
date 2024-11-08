package com.xworkz.AccessSpecifier;
import java.util.*;  

public class SecondLargest {
	

	  public static void main(String[] args) {
	 
	 
	        Scanner scan=new Scanner(System.in); 
	        //taking input
	        System.out.print("Enter the first number:");
	        int num1 = scan.nextInt(); 
	        System.out.print("Enter the second number:");
	        int num2 = scan.nextInt();
	        System.out.print("Enter the third number:");
	        int num3 =scan.nextInt(); 
	        //checking for the second largest number
	        if (num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2)
	            System.out.println("The second largest number is "+num1);
	        else if (num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1)
	            System.out.println("The second largest number is "+num2);
	        else
	            System.out.println("The second largest number is "+num3);
	    
	  
	}

}