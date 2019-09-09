package day12_SwitchStatement;

public class ifStatement_withoutCurleyBraces {

public static void main(String[] args) {
	

// without curly brace; a single line of statement, if block cannot hold more than statement

	if (true)
		System.out.println("hello");
	else 
		System.out.println("world");


	if (true)// nested if
		if(true)
			System.out.println("Hello World");
		else 
			System.out.println("Hello Cybertek");
	
	else 
		System.out.println("Invalid");

	
	// multi branch if:
	
	int grade =80; 
	
	if (grade<=100 && grade>=0)
		if (grade>=90) 
			System.out.println("A");
		else if (grade>=80) 
			System.out.println("B");
		else if (grade>=70) 
			System.out.println("C");
		else 
			System.out.println(" ");// this else statement belongs to if-else statement
	else // this belongs to pre-condition
		System.out.println("Invalid");
	




	}
}
