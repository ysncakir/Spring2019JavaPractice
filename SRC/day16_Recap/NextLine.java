package day16_Recap;

import java.util.Scanner; 

public class NextLine {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in); 
		System.out.println("Enter your phone number");
		// 911 Enter 
		int pn = scan.nextInt (); 
		
		scan.nextLine(); // this will take out the enter
		System.out.println(pn);
		
		System.out.println("Enter your name");
		String name = scan.nextLine(); 
		
		/*
		 * nextline method will take everything in scanner' memory
		 * up to new line 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
