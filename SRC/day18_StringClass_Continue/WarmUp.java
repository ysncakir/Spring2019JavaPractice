package day18_StringClass_Continue;

import java.util.Scanner;

public class WarmUp {

public static void main(String[] args) {
	
	 
	Scanner input = new Scanner (System.in); 
	 
	
	System.out.println("Enter your first and last name");
	
	String firstname = input.next(); 
	input.nextLine(); // takes out the Enter 
	String lastname = input.nextLine(); 
	
	String initials =firstname.substring(0,1).concat(".")+lastname.substring(0,1); 
		   initials	= initials.toUpperCase(); 
	
	System.out.println(initials);
	
	
	String initials2 = "" + firstname.charAt(0)+ "."+ lastname.charAt(0); 
	
	
	System.out.println(initials2);
	
	int FirstnameIndex = firstname.length()-1;
	int LastnameIndex = lastname.length()-1;
	
	String lastletters = ""+ firstname.charAt(FirstnameIndex) + 
			"."+ lastname.charAt(LastnameIndex); 
			lastletters = lastletters.toLowerCase(); 
	
	System.out.println("Last letters are " + lastletters);
	
	
	String LastLetters = firstname.substring(FirstnameIndex) + lastname.substring(LastnameIndex); 
	
	
	System.out.println("Last Letters are " + LastLetters);
	
	}

}
