package day10_ifStatement;

public class Nested_if {

	/*
	 nested if:
	 		if (condition 1) {
	 			//A	
	 				if (condition2){
	 					//B
	 				}
	 			}
		A : as long as condition1 is true
	 */ 	
	
	
	public static void main(String[] args) {
	
	if (true) {
		if(true) {
			System.out.println("Hello World");
		}
	}
		
		
		if (true) {
			System.out.println("Hello batch 12");
			if (false) {
				System.out.println("Hello Programmers");
			}
				else {
					System.out.println("hello Team SDET");
				}
			}
		
		
		/*
		 * 60<=grade <70 ==> D
		 * 70 <= grade <80==> C
		 * 80 <= grade <90==>B
		 * 90 <= grade <100 ==>A
		 * 
		 * 50<= grade <60 ==> F
		 * 40<= grade <50 ==>G
		 * 30<= grade <40 ==> H
		 * 20<= grade < 30 ==>I
		 * 10<= grade < 20 ==>J
		 * 0<= grade < 10 ==>K
		 * 
		 * 
		 */
		int grade= 99;
			
		if (grade>=60 && grade <=100) {
			System.out.println("You Passed the Exam");
			if(grade>=90 && grade<=100) {
				System.out.println("\twith a grade of A");
			}
			else if (grade >=80 && grade <90) {
				System.out.println("twith a grade of B");
				
			}
			else if (grade>=70 && grade <80) {
				System.out.println("\t with a grade of C");
			}
		
			else {
			System.out.println("\t with a grade of D");
		}
	
	}
		
		else { // either less than 60 or greater than 100
			if (grade< 60) {
				System.out.println("You failed with a grade of F");
			}
			else { // greater than 100
				System.out.println("Invalid Score, error 404");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
}	