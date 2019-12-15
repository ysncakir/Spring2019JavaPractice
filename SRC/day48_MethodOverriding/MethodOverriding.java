package day48_MethodOverriding;

class student{
	public void printName() {
		System.out.println("Hakan");
	}
}
			//	subclass				// super
public class MethodOverriding extends student{

	// same name, same parameter 
	// why overriding? to implement specific functionality
	// IT CANNOT NEVER HAPPEN IN THE SAME CLASS, IT CAN BU USED WITH INHERITANCE
	
	
	// Example:
	
		// Webdriver driver = new chromeDriver(); 
		// driver.get("URL"): opens the URL in chrome browser
	
		// Webdriver driver = new firefox(); 
		// driver.get("URL"): opens the URL in firefox browser
	
	public void print(String str) {
		
	}
	
	public void print(double a) {
		
	}
	
//	public void print(String str) {     NOT POSSIBLE IN THE SAME CLASS
		
//	}
	
	public void printName() {     // same name, same parameter but different functionality
		System.out.println("Shukran");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding obj = new MethodOverriding(); 
		obj.printName(); // Hakan, it was inherited from super class
		
		student obj2 = new student(); 
		obj2.printName(); // Hakan
		
	}
	
	
}


