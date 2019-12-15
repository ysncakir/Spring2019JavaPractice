package day18_StringClass_Continue;

import java.util.Scanner;

public class WarmUp2 {
	
	/* mUhTaR
	 * cYBerTeK
	 * output should be : Muhtar, Cybertek
	 * 
	 * 
	 * 
	 * 
	 */
public static void main(String[] args) {
	
	
	System.out.println("Enter your first name and lastname");
	
	Scanner input = new Scanner(System.in); 
	String firstname = input.nextLine(); // mUhtAr
	String lastname = input.nextLine(); 
	
		firstname = firstname.substring(0,1).toUpperCase() + firstname.substring(1).toLowerCase();
		lastname = lastname.substring(0,1).toUpperCase() + lastname.substring(1).toLowerCase(); 
				
		
		System.out.println(firstname + ""+ lastname);
	
	String firstname2 = input.nextLine(); 
	firstname2 = ""+ firstname2.charAt(0); 
	firstname2 = firstname2.toUpperCase(); 
	
	
	
	
	
	
	
	
	}
}
