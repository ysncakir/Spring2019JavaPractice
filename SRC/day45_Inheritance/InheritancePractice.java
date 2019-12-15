package day45_Inheritance;

public class InheritancePractice extends ParentClass{
				// sub						super
	
	/*
	protected static String password = "1"; 
	
	public static int age =12; 
	
	static double salary = 100000;

	*/
	
	public static void main(String[] args) {
		// System.out.println(username); // since username is private, it cannot be inherited
		System.out.println(password);
		System.out.println(age);
		System.out.println(salary);
		
	}
}
