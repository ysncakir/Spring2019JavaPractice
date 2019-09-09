package day15_Scanner_String;

import java.util.Scanner;

public class StringInput {

/* next vs nextLine (); // next means string // next just can be used one single word 
 * 						even though nextline returns whole text as a string value 
 * 
 * variableName. nextLine(): returns user input as string value
 * 
 * 
 */

public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your first name"); // returns the user input as string value
	String firstname	= scan.next();
		System.out.println(firstname);
	
	
	System.out.println("Enter your last name");
		String lastname = scan.next(); 
	
	
	System.out.println("first name is : " + firstname);
	System.out.println("last name is :" + lastname);
	
	
	System.out.println("Enter char value");
	
	char ch = scan.next().charAt(0); // day 15 from string method
	
}

}
