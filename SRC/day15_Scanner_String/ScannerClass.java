package day15_Scanner_String;


import java.util.Scanner; // is used to read user inputs // imports scanner class only
		// package name : java.util
		// class name : Scanner 

		// in order to use scanner ewe must import it form its package 

		// import statement must be placed between class and package

		/*  package A
		 * 		import.java.util. Scanner;
		 *  public class b { }
		 */ 

		// wild import 
			/* import java.util.*;
			 * it imports all the classed within the "java.util" package
			 * 
			 */

// import java.util.*; // imports all the classes from Java. 

/* Scanner Methods
 * 		variableName. nextByte(): returns user input as byte value
 *  	variableName. nextShort(): returns user input as short value
 * 		variableName. nextInt(): returns user input as int value
 * 		variableName. nextLong(): returns user input as long value
 * 		variableName. nextBoolean(): returns user input as Boolean value
 * 		variableName. nextFloat(): returns user input as float value
 * 		variableName. nextDouble(): returns user input as double value
 * 		
 */



public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in) ; 
		System.out.println("Enter byte value");
			byte num = input.nextByte(); // returns the user input as byte value
				
			System.out.println(num * 5);
	
		System.out.println("Enter short value"); // returns the user input as short value
			short num2 = input.nextShort();
			
		System.out.println("Enter int value"); // returns the user input as int value
			int num3 = input.nextInt();
			
		System.out.println("Enter long value"); // returns the user input as long value
			long num4 = input.nextLong(); 
			
		System.out.println("Enter boolean value"); // returns the user input as boolean value
			boolean num5 = input.nextBoolean(); 
				
		System.out.println("Enter float value"); // returns the user input as float value
			float num6 = input.nextFloat(); 
			
		System.out.println("Enter double value"); // returns the user input as double value
			double num7= input.nextDouble(); 
								
		
	
	
	}
	
	
}
