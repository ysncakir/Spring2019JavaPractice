package Practice;

public class ConstructorCalls {

	public ConstructorCalls() {
		// this(); not possible 
		// this(true); cannot call itself
		System.out.println("A");
	}
	
	public ConstructorCalls(boolean a) {
		// this(true); // cannot call itself
		this(); // default constructor
		System.out.println("boolean");
	}
	
	
	public ConstructorCalls(int a) {
		this(); // calling default constructor first 
		System.out.println("B");
	}
	
	public ConstructorCalls(double b) {   // A B C
		this(4); // we are calling constructor with parameter int 
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		method1(); 
		
		ConstructorCalls obj = new ConstructorCalls();  // A
		ConstructorCalls obj2 = new ConstructorCalls(3); // A B
		ConstructorCalls obj3 = new ConstructorCalls(3.4); // A B C
		ConstructorCalls obj4 = new ConstructorCalls(5>4); 
	}
	
	public static void method1() {
		
	}
	
	public static void method2() {
		
	}
}
