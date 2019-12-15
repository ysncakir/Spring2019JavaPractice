package day59_Exceptions;

import java.util.NoSuchElementException;

public class Multi_Catch_Blocks {
	
	public static void main(String[] args) {
		
		// we can have multiple catch blocks with one try block
		
		// parents exception type needs to be after its sub exception type
		
		// Exception> RunTimeException> Arithmetic.....
		
		// 
		
		/*
		try {
			System.out.println(9/0);
		} catch(ArithmeticException e) {
			System.out.println("Catch block");
		} catch(RuntimeException e) {
			System.out.println("Catch block 2");
		}
		*/
		/*
		try {
			
		} catch(ArithmeticException e) {
			
		} catch(ArithmeticInstruction e) { // not possible to get same exception twice
			
		}
		*/
		
int [] arr = {1,2,3};
		
		try {
			System.out.println(arr[100]);
			
		}catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");	
			
		} catch( ClassCastException e) {
			System.out.println("Class Cast Exception");
			
		} catch(NoSuchElementException e){
			System.out.println(" No Such Element Exception");
			
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array Out of Bound Exception");
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index of Bound Exception");
		}
		
		System.out.println("=================================");
		
		try {
			System.out.println(11/0);
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic");  // the first one will be executed
			
		} catch(ClassCastException e ) {
			System.out.println("ClassCast");
		
		} catch(RuntimeException e) {
			System.out.println("Runtime");
			
		} catch(Exception e) {
			System.out.println("Exception");
			
	//	} catch(ClassCastException e) {   subclass cannot be after parent class
		}	
		System.out.println("Hello");
	    try {
	        System.out.println(10/0);
	    }catch(Exception e) {
	        // code here
	        System.out.println(" unexpected event occured at line 78");
	    }
	    
	    System.out.println("World");
	    System.out.println("Test completed");
		
		
	}
	
	
	
}
