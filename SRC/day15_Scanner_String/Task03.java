package day15_Scanner_String;

import java.util.Scanner; 

public class Task03 {

public static void main(String[] args) {
	
	/* write a program that ask users to enter first name and then last name. 
	 * At the end system should display user full name
	 * 
	 * 
	 */
	
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println(" Enter your first name");
			String firstname = input.next(); 
	
	System.out.println(" Enter your last name");
			String lastname = input.next(); 
			
			String fullName = lastname + " " + firstname; 
	
	System.out.println("Your full name is " + fullName);
	
	
	input.close(); // it is used to close scanner class
	
	}
}
