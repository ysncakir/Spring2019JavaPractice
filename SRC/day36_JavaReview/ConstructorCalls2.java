package day36_JavaReview;

public class ConstructorCalls2 {

	public ConstructorCalls2 () {
		// this(); constructor cannot call constructor itself 
	
		this (true); //constructor cannot call contain itself 
		System.out.println("default");
	}
	
	
	public ConstructorCalls2(boolean a) {
		//this(true); // cannot call itself
		//this ();
		System.out.println("boolean");
	}
	
	
	
	public ConstructorCalls2 (String name) {
		// this("Yasin"); cannot call itself
		this('y'); 
		System.out.println("String");
	}
	
	public ConstructorCalls2 (char ch) { // can accept more than one parameter
		this();
		// this("yasin"); //because this constructor contain char itself, it is not allowed to call it
		System.out.println("char");
	}
	
	
	public static void main(String[] args) {
		ConstructorCalls2 obj = new ConstructorCalls2 ("yasin"); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
