package day45_Inheritance;

public class MultiClass {
	
	/* public access modifier : visible at anywhere
	 * private access modifier : only visible within the class
	 * default access modifier : visible within the package, not visible outside the package
	 * if we don't give public, private or protected keywords, then the default access modifier will be given by default						
	 * 				ex: package A
	 * 						class a{
	 * 						int num =100; (default access modifier)
	 * 						}
	 * 					package B
	 * 						public class b{
	 * 						num is not visible in this class
	 * 						}	
	 * 
	 * 
	 * Multiple classes : to create other classes in the current class but they are supposed to have default access modifier
	 * We can only have one public class in the classes we created 
	 */ 					
	public static void main(String[] args) {
		System.out.println("Main public class");
	}

}

class A{
	public static void main(String[] args) {
		System.out.println("default class");
	}
	
}
class B{
	public static void main(String[] args) {
		System.out.println("default class B");
	}
			

}
