package day45_Inheritance;

class TestBase{
	
	static String chromeDriver; // default 
	
	public static void TakeScreenShot() {
		System.out.println("Take Screen Shot");
	}
	
	private static void closeBrowser() {
		System.out.println("Browser closed");
	}
	
	class D extends TestBase{
	  // sub		// super
	}
}

public class Inheritance extends TestBase { // inheritance cannot be inherited by any other class
			// sub					super
	
	/* it is used for building relationships between multiple classes
	 * it builds super and sub relationships between classes
	 * 
	 * public class  A   extends 	B
	 * 				sub				super
	 * 
	 * sub class(A): it is gonna inherit all the visible OR protected the from the super class
	 * 	features that have public or protected access modifiers: can be inherited anywhere, even outside the package
	 * 	features that have default access modifiers: can only be inherited to the classes
	 * 															 that are in the same package
	 * 
	 * features that have private access modifiers: can never be inherited
	 * 
	 * protected access modifier : only visible to the classes that are in the same package
	 * 								not visible but inheritable
	 * 
	 * super class (B): called as parent class and cannot inherit any feature from the sub class
	 * 
	 * one class can only extend one class, but one class can be extended by another classes
	 * 
	 *  one super class can have multiple sub classes
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println(chromeDriver);
		TakeScreenShot();
		// closeBrowser(); this is nor visible nor protected 
	}
	
}
