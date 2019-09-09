package day10_ifStatement;

public class single_ifStatement {

public static void main(String[] args) {
	/*\
	 * 
	 *  if (boolean expression) {
	 * 
	 * }
	 * 
	 */
	
	
	if (9>8) {
	// true
		System.out.println("9 is greater than 8");
		
	}
	
	if (9 <8) {
		
		System.out.println(" 8 is greater than 9"); // did not print since the if statement is incorrect. 
		
	}
	
	System.out.println("Test Completed"); // outside of of blocks, that's why it gets executed
	
	// Task 1
	
	int num1= 100; 
	int num2= 300; 
	int max = 0; // local valuables need to be initialized 
	
	if (num1 > num2) { // num1 is greater than num2
		// max= num1; 
		max += num1; // because max is 0
	}
	
	if (num2 > num1) {
		max += num2; 
			
	}
	
	if ( num1 == num2)
	System.out.println("Maximum number is max");
	
			
			
			
			// Task 2
			
			int hours = 14; // 2 pm =14-12
			int minutes= 45; 
			int seconds= 30; 
			
			String amOrPm = "am"; 
			
			// System.out.println(hours + ":" + minutes + ":" + seconds + " " amOrPm);
			
			System.out.println( hours + ":" +minutes + ":"+seconds+" "+amOrPm ); 
			
			
			// Task 3
			
			int n1=15000, n2=5000, n3=900 ; 
			int maximum = 0; 
			
			// in order to n1 be the max ; n1 > n2 && n1 > n3
			// in order to n2 be the max ; n2 > n1 && n2 > n3
			// in order to n3 be the max ; n3 > n1 && n3 > n2
			
			if (n1 > n2 && n1 > n3) {
				maximum = n1; 
			}
			if (n2 > n1 && n2 > n3) {
				maximum = n2; 
			}
			if (n3 > n1 && n3 > n2) {
				maximum = n3; 
				
			} 
			
			String result = "Maximum number between " +n1+ ","+n2+ ","+ "and " +n3+ " is "+ maximum;
			
			
			System.out.println(result);
			
					// solution is 2; 
			
			if (n1 >n2 && n1 >n3) {
				System.out.println("Maximum number is " +n1);
			}
			
			if (n2>n1 && n2 >n3) {
				System.out.println("Maximum number is " +n2);
			}	
				
			if (n3>n1 && n3>n1) {
				System.out.println("Maximum number is " +n3);
			}
			
			double B; 
			
			B= 100; 

			if (true) {
				
			}
			System.out.println(B);
			
			
		//	Task 04; 
			
			int StatusCode = 503; 
			String finalResult = "";
			
			if (StatusCode ==200){
				finalResult = "OK"; 
			}
			if (StatusCode ==201){
				finalResult = "Created"; 	
			}
				
			if (StatusCode ==202){
				finalResult = "Accepted"; 
			}
			
			if (StatusCode ==301){
				finalResult = "Moved Permanently"; 
			}
			if (StatusCode ==303){
				finalResult = "See Other"; 
			}
			if (StatusCode ==307){
				finalResult = "Temproary Redirect"; 
			}
			if (StatusCode ==400){
				finalResult = "Bad Request"; 
			}
			if (StatusCode ==401){
				finalResult = "Unathorized"; 
			}
			if (StatusCode ==404){
				finalResult = "Not Found"; 
			}
			if (StatusCode ==500){
				finalResult = "Internal Service Error"; 
			}
			if (StatusCode ==503){
				finalResult = "Service Unavailable"; 
			}
				
			System.out.println("Status code " + StatusCode + " is: " + finalResult);
				
			
		// Task 5 ;

		int number = 5000; 
		
		
		if (number > 0) {
		System.out.println("Positive");
		}
		
		if (number<0) {
		System.out.println("Negative");
		}
		
		if (number ==0) {
		System.out.println("Zero");
		}
		
}
}

		