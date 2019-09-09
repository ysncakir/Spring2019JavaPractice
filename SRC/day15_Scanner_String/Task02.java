package day15_Scanner_String;

import java.util.Scanner;

public class Task02 {

public static void main(String[] args) {
	


	// 2. write a program that asks user to enter 3 numbers and returns the lasrgest number
	 
		 
			Scanner input = new Scanner (System.in); 
			
	System.out.println("Enter three numbers ");		
	
		double n1 = input.nextDouble (); 
	
		double n2 = input.nextDouble (); 
	
		double n3 = input.nextDouble (); 
	
		double Largest = (n1 > n2 && n1>n3) ? n1 
					:(n2>n1 && n2>n3) ? n2
					: n3; 		
	
	
	System.out.println("Largest number is " + Largest);
	
	
	
	
	}
}