package day09_Review;

public class if_Statement {

public static void main(String[] args) {
	

	/* if statements : 
	 * 
	 * 			single if statement; 
	 * 			if (boolean expression) {
	 * 			// some codes to run
	 * 
	 * 			}
	 * 
	 * 			if block only gets executed if the condition is true. 
	 * 
	 * 
	 * 
	 * 
	 */


	if (9 < 10){
		
		System.out.println("Hello");
		System.out.println("Happy Friday");
		System.out.println("Tomorrow is day off");
	}

	int a = 1000; 
	if ( a++ == 1001){
		// 1000 =1001 // false 
	}
	
		a= 2000; 
		System.out.println( "a is increased");
		
		int X = 987654320; 
		
			
			if (X%2 == 0) {
				// conditon is true, that's why it will be executed
				System.out.println(X);
				System.out.println( " it is an even number");
				
			}	
			
			if (X%2!= 0) {
				// condition is false
				System.out.println(X);
				System.out.println( " it is an odd number");
				
			
			}
			
			int Y = 2345678; 
			
			if (Y%5 == 0){
				// false
				System.out.println(Y + " can be devided by 5");
			}
			
			if (Y%5 != 0){
				// true
				System.out.println(Y + " can't be devided by 5 \n\n");
			}
			
			String CEO = "Main Boss";
			String Kuzzat = "Main Boss"; 
			
			System.out.println(CEO==Kuzzat);
			
			if (Kuzzat==CEO) {
				
				System.out.println("Great Person in the world");
				System.out.println( "First if block ");
			}
			
			if (Kuzzat != CEO) {
				System.out.println(" Great Person in the world");
				System.out.println( "second if block ");
				
			}
	
			
			int TotalNum = 100; 
			boolean Cybertek = true; 
			boolean BestSchool = true; 
			
			if (Cybertek == BestSchool){
				//      true
			TotalNum += 500; 	// total number will be 100 + 500
				
			}
			if (Cybertek != BestSchool) {
				// false
			TotalNum -= 50; 
				
			}
			
			System.out.println(TotalNum);
			
			
			
			/* declare a variable 
			 * initialize user age
			 * write a program if user is eligible to vote for Donald Trump 
			 * vote age is 18
			 * 
			 */
			
	
			byte PersonAge = 18; 
			byte VoteAge = 18; 
			if (PersonAge >= VoteAge ) {
				// true
				System.out.println("\n\n Yes, you are eligible to vote");
				System.out.println(" have fun with building wall");
			}
			
			if (PersonAge < VoteAge) {
				// false
				System.out.println(" You are not eligible to vote yet, please grow up");
				
			}
			
			

				
				
				
			
			
			
			
			
			
			
			
				
				
			
			
			
			
		
			
			
			
					
}
}
	

