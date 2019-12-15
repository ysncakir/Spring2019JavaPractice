package day57_Exceptions;

public class ExceptionsClasses {

	
	// unwanted or unexpected events, so there are 2 types
	
	
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		
		System.out.println(arr[4]); // unexpected event or unchecked exception
		
		// checked exception : it will give error immediately
		
		// Thread.sleep(1000); // checked exception, occurs during the compile time 
		
		// RuntimeException class is the parent class of all unchecked exception
		
		
		// Exception Handling
		//1. Try & catch: MUST be declared together
		
		/*
		try { :will be executed if the exception is checked 
			exception code/ statements
		} catch(ExceptionClass name) : will be executed if the exception is unchecked
			statements 
		*/
		}
}
