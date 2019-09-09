package day16_Recap;

import java.util.Scanner; // imports one class

public class WarmUp {


/*

Write a program that asks user to enter first and last names, 
then printout the users full name in all capital letters

*/

public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in); 
	System.out.println("Enter your first name and last name");
	
	
	String firstname = scan.nextLine(),
			lastname = scan.nextLine();
			
	String fullname = firstname.concat(lastname).toUpperCase(); 
		
	
	// String fullname = firstname + " "+ lastname; // second method
		// fullname = fullname.toUpperCase();
			
	System.out.println("Your fullname is: " + fullname);
	

	}
}