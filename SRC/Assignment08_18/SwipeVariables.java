package Assignment08_18;

public class SwipeVariables {
	
	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 15; 
		
		System.out.println("=== BEFORE SWITCH ====");
		System.out.println("A= " + a);
		System.out.println("B= " + b);
		
		a = a+b; 
		b = a-b; 
		a = a-b;
		
		System.out.println( "=== AFTER SWITCH===");
		System.out.println("A= " + a);
		System.out.println("B= " + b);
		
	}
	
	

}
