package day46_SuperKeyword;

class A {
	String name = "Madina"; 
	
	public void methodA () {
		
	}
	
	public A (int a) {
		
	}
}


	public class SuperKeyword extends A{
				// sub			 super
	// super. = used for calling instances (variable and methods) that are in the super class
	
	/* 
	 * String name = "Madina";  
	 */
	
		public SuperKeyword (int a ) {
			super(5);// we have to call this constructor to use constructor in this class
			
		}
	
	public void method() {
		super.name = "Mahir";  // we need inheritance, we must have super and sub classes 
		this.name = "Ihsan"; // we do not need inheritance 
		super.methodA();
		this.methodA();
		
	/*
	 * Constructor : at least one constructor from the super class has to be called in the subclass 	
	 */
		
	
	}
}
