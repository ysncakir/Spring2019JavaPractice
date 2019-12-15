package day34_Constructors;

public class ConstructorMethods {
	
	
	public ConstructorMethods () {
		
		System.out.println("Hello World");
		System.out.println("I am a Default constractor");
	}
	
	 public ConstructorMethods(int num) {
	        
	        System.out.println("Hello world");
	        System.out.println("I am a constructor with an argument of int: "+num);
	        
	    }
	public static void main(String[] args) {
		
		/*
		
		it is a very special method, used for creating the object of the class
		
		Every single class MUST have a constructor. If we did not give the constructor,
		then the compiler will give the default (without argument) constructor
		
		
		declaration of constructor: 
			access-modifier 	className(){
			
					statements
			}
			
		Constructor cannot have return type and specifier
		Constructor's name MUST be same with the class name
		
		Constructor calls :
				only a constructor can call another constructor; 
		
		
		METHODS
		1. Void
		2. Return
		2. Constructor
		*/
		
		
	ConstructorMethods obj = new ConstructorMethods(); 
		
	ConstructorMethods  obj2 = new ConstructorMethods(8);
    
    
    method1();
    
    
	}


public static void method1() {

ConstructorMethods  obj2 = new ConstructorMethods(8);

}	
		
		
	

}
