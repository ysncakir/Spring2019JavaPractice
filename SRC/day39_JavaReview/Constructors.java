package day39_JavaReview;

public class Constructors {

	
	// depends on creation of objects
	
	public Constructors() {
		System.out.println("A");
	}
	
	public Constructors(int a) {
		this(); // constructor call must be first step
		System.out.println("B");
	}
	
	public Constructors(double b) {
		this(10);
		System.out.println("C");
	}
	public static void main(String[] args) {
		
	
	
	Constructors obj = new Constructors(10.8); 

	
	}
}
