package day11_IfStatementReview;

public class WarmUp {

public static void main(String[] args) {
	
	// Task 1 : Write a code to check if the year is leap or not 
	// if there is only 2 possibilities, we can use if-else statement. 
	// if statement is only for one possibility
	// else-if more than 2 options
	// else statement MUST be declared with if statement
	// 
	int year= 2001;
	boolean LeapYear = year %4==0;
	if (LeapYear) {
		System.out.println("Year " + year + " is a  leap year");
	
	}
	
	else {
		System.out.println("Year " + year + " is not a leap year");
	}
	
	
	
	// Task 2 
	
	/* A=> 90 ~100
	 * B=> 80 ~89
	 * C=> 70~79
	 * D
	 */

	int grade= -10; 
	boolean A = grade>=90 && grade<=100;
	boolean	B= grade >=80 && grade <90;
	boolean C = grade>=70 && grade <80;
	boolean D = grade>=60 && grade <70;
	boolean ValidGrade = grade>=0 && grade<=100;
	
if (ValidGrade) {
	// in order to multibranch  if gets executed, first ValidGrade has to be true
	if (A) { // 90>grade>100
		System.out.println(" You got A");
	}
	else if (B) { // 80>grade>89
		System.out.println(" You got B");
	}
	else if (C) { // 70>grade>79
		System.out.println(" You got C");
	}
	else if (D) { // 60>grade>69
		System.out.println(" You got D");
	}
	else { // if the grade is less than 60 and is greater than 0
		System.out.println("You got F");
	}
	
 	
}	
else { // if grade is less than 0 or greater than 100
	System.out.println("Invalid Grade");
}
	// Nested if : if condition can be evaluated to multiple scenarios. 
	// If multiple scenarios execution depends on a specific condition
	// If you have a requirement to check in the beginning


}
}
