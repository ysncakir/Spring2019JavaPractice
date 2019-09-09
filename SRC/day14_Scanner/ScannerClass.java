package day14_Scanner;

import java.util.Scanner;


public class ScannerClass {


public static void main(String[] args) {
	
	/*  it is a class provides the methods 
	 * 		to get user inputs
	 * Scanner class presented in package 
	 * 	"java.util"
	 * 
	 * Must be placed between package and class name 
		
		declaration of scanner 
		Scanner VariableName = new Scanner(System.in);
	
		VariableName = can reference an object of the scanner class
		new Scanner(System.in) : creates the object of the scanner class
	
	*   VariableName.nextByte(): allows user to enter Byte value
	*
	*/
	
	
	Scanner input = new Scanner (System.in);
	System.out.println("Enter a byte value");
		byte byteNum = input.nextByte();
		

	System.out.println("You have entered " + byteNum);
	
	
	
	Scanner enter = new Scanner (System.in); 
	System.out.println("Enter your phone number");
	double doubleNum = enter.nextDouble(); 
	
	System.out.println("Your phone number is " + doubleNum);
	
	
	Scanner num = new Scanner(System.in); 
	System.out.println("Please enter three numbers");
	int intNum = num.nextInt(); 
	int intNum2 = num.nextInt(); 
	int intNum3= num.nextInt(); 
	
	if (intNum>intNum2 && intNum>intNum3) {
		System.out.println("The largest number is " + intNum );
		
	} else if (intNum2>intNum3 && intNum2>intNum) {
		System.out.println("The largest number is " + intNum2 );

	} else {
		System.out.println("The largest number is " + intNum3 );

	}
	
	
	Scanner name = new Scanner(System.in); 
	
	System.out.println("Enter your first name");
	
	String firstname= name.nextLine(); 
	System.out.println("Enter your last name");		
	String lastname = name.nextLine(); 
	
	String fullname = firstname + " "+ lastname; 
	
	System.out.println(fullname);
	
	
	
	
	
	
	
	}

}
