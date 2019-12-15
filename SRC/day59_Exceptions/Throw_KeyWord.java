package day59_Exceptions;

public class Throw_KeyWord {
	
	// used for manually throw an exception
	
	public static void main(String[] args) {
		
		RuntimeException name = new RuntimeException();
		
		//throw name;
		  throw new RuntimeException(); // more preferred
		
		// System.out.println("Test Completed");
		
		
		// throw new IOException();
	}

}
