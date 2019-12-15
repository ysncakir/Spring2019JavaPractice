package day36_JavaReview;

public class ConstructorsReview {

/*

Constructors: special method, used when we create an object of a class. 
			  Every class MUST have constructor
			  if we do not create any constructor, then compiler will give default constructor



Creation object: 
			ConstructorsReview   obj = new ConstructorsReview(); 
			(same with Class name)

			only given constructor will be executed
Declaration of constructor
		default constructor: does not have any arguments	
			acccess-modifier  className(){
			
			}
			
		constructor with arg: 
			acccess-modifier  className(parameter){
			
			}	
			
Constructor's name MUST be same with class name

Constructor's signature there is no return type and specifier. 

In order to execute constructor, we have to create object.

We can create multiple constructors by overloading the constructor. 

*/
	// public method(); not possible, it has to match class name
	
	public ConstructorsReview() { // default constructor
		System.out.println("default constructor");
		
		
	}
	
	public ConstructorsReview(int a) {
		System.out.println("Constructor with argument int:" + a);
	}
	
	public static void main(String[] args) {
		
		ConstructorsReview obj = new ConstructorsReview(); //  provide existing class name
		
		// ConstructorsReview obj = new ConstructorsReview("Batch 12"); // not exist 
		
		ConstructorsReview obj2 = new ConstructorsReview(10); // argument should be matched with parameter
			
		
	}












}
