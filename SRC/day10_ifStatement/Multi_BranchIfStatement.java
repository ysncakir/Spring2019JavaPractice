package day10_ifStatement;

public class Multi_BranchIfStatement { 
	
	/*
	 * if else :
	 * if (condition 1) {
	 * 		//A ==> if condition1 is true 
	 * }
	 * 
	 * else if (condition 2){
	 * 			//B ==> if condition1 is false and condition2 id true 
	 * }
	 * 
	 * else { 
	 *	// C ==> both condition1 and condition2 are false
	 * }
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		
		if (false) {
			System.out.println("if block");
		}
		
		else if (false) {
			System.out.println("else if block");
		}
		else {
			System.out.println("else block");
			
		}
		
		// Task 1
		
	/*   90 <= grade ==> A
	 * 	 80 <= grade <90 ==>B
	 * 	 70 <= grade <80 ==> C
	 * 	 60 <= grade <70 ==> D
	 * 		else ==> F			
	 */

		int grade = 90; 
		
		if (grade>=90 && grade<=100) {
			System.out.println( "You made A, Great Job"); //90...1000
		}
		
		else if (grade<90 && grade>=80) {
			System.out.println(" You made B, Good "); // 80......89
		}
		else if (grade<80 && grade>=70) {
			System.out.println(" You made C, That's okay "); // 70...79
		}
		else if (grade<70 && grade>=60) {
			System.out.println(" You made D, Really? "); //60......69
		}
		else {
			System.out.println( "You made F, Study more");
		}
		
	// find the bug ==> we can only get D and F. 
		
		int grade2 = 85; 
		
		if (grade2>= 60) {
		System.out.println("D");
		}
		else if (grade2>=70) {
			System.out.println("C");
		}
		else if (grade2>= 80) {
			System.out.println("B");
		}
		else if (grade2>= 90) {
			System.out.println("A");
		}
		else {
			System.out.println("F");
		}
		
	
	// Task 2
		
		/* write a program that :
		 * 				1. 0 ~ 12 ==> good morning 
		 * 				2. 12 ~15 ==> good afternoon 
		 * 				3. 15 ~23 ==> good afternoon 
		 */
	
		
		int hour = 9; 
		
		if (hour>0 && hour <12) {
			System.out.println("Good Morning");
		}
		else if (hour>12 && hour <=15) {
			System.out.println("Good Afternon");
		}
		else if (hour>15 && hour <=23) {
			System.out.println("Good Night");
		}
		else {
			System.out.println("noon");
		}
	
	
	
	
	
	
	
	
	}
	
	
	
}
