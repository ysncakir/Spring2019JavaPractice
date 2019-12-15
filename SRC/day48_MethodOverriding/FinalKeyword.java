package day48_MethodOverriding;

class Credentials{
	
	private final String UserName = "Cybertek";
	private final String PassWord = " Batch12"; 
	
	public void setUSerName(String UserName) {
	//	this.UserName = UserName; // final variables cannot be reassigned
		
	}
	
	public String getUserName() {   // get method only read the variable, that's why it is possible to use it while it is final
		return UserName; 
	}
}

class Holly{
	final public void printName() {
		System.out.println("Erhan");
	}
}

public class FinalKeyword extends Holly{
	
	/*
	 * Final: constant, cannot be changed or modified
	 * 
	 * Final key word can only be applied to:
	 * 			variables : we cannot reassign it
	 * 						instance variables and static variables MUST be assigned immediately 
	 * 						local variable needs to be assigned before use
	 * 
	 * 			methods: implementation of the method cannot be changed
	 * 					final methods cannot override
	 * 					final methods can be overload
	 * 					main method can be final 
	 * 
	 * 
	 * 			classes: 	
	 *  
	 */		
	

	
	

//	@Override
//	public void printName() {       // final method cannot be override
//		System.out.println("yasin");
//	}

	int AGE; 
	
	public static void main(String[] args) {
		
		
		
		final String SSN = "123456";
		
		System.out.println(SSN);
		
		
		final String DateOfBirth; 
		// System.out.println(DateOfBirth);
		
		FinalKeyword obj = new FinalKeyword(); 
		System.out.println(obj.AGE);
	
	
	}
	
	
	
	
}
	
	
