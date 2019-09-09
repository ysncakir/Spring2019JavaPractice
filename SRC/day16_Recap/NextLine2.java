package day16_Recap;

import java.util.Scanner; 

public class NextLine2 {
public static void main(String[] args) {
	
/* write a program that accepts zipcode, city, state, phone number
 * and then display all those gathered information
 * 	do not use next() method
 */
	
	Scanner input = new Scanner(System.in); 
	
	System.out.println("Please enter your Zip-Code");
	
	int zipcode = input.nextInt(); 
	// 75013
	
	input.nextLine(); // eliminate the enter button above
	System.out.println("Please your city name");
	
	String city = input.nextLine(); 
	
	System.out.println("zip code is " + zipcode);
	System.out.println("city name is "+ city);
	
	
	System.out.println("enter your phone number");
	int pn = input.nextInt(); 
	
	System.out.println("enter your state name");
	String state = input.nextLine(); 
	
	
	System.out.println();
	
	
	
	
}
}
