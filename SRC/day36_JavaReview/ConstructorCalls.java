package day36_JavaReview;

public class ConstructorCalls {


public ConstructorCalls() {
	System.out.println("A");
}

public ConstructorCalls(int a) {
	this();// A
	System.out.println("B");
	
}

public ConstructorCalls(double a) {
	this(10); // needs to give argument // A B
	System.out.println("C"); // C
	
}



public static void main(String[] args) {
	method1(); 
	// ConstructorCalls(); ONLY A CONSTRUCTOR CAN CALL ANOTHER CONSTRUCTOR
	// BUT Constructor's object can be created anywhere
	// Constructor cannot be called by constructor name. Instead, we have to use "this()" keyword in current class
	// Constructor call (this) must be first step 
	// One constructor can call only one constructor. Cannot contain more than one constructor. 
	
	ConstructorCalls obj = new ConstructorCalls(10.5); // A B C
	
	

}



public static void method1() {
	
}


public static void method2() {

}







}
