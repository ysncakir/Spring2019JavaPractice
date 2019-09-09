package day13_Review;

public class AssesmentQuiz3 {


	public static void main(String[] args) {

	
		// Q3; 
		
		char grade ='A';

		boolean Passed = grade == 'A' || grade =='B';
				//		true		  ||	false	==> true

		boolean Passed2 =grade == 'C' || grade =='D';
				//			false			false	==> false
		 	

		if( Passed || Passed2) {
			// true		false		==> true
		System.out.println("You've passed the exam"); // this line will be executed

		}

		else {

		System.out.println("You failed");

		}
		
		
		// Q5; 
		
		boolean result = true;

		if(result) {

		System.out.println("it's true");

		}

		else {

		System.out.println("it's false");

		}

		/*
		else if(result) { // compile error, order of multi branch is wrong, cannot end with else if statement 
		System.out.println("None of the above");

		}
		*/


		
		
		
		
		
		
		
		
		
		

		}
	
}
	






















	