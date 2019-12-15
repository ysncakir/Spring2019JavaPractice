package day47_Recap;

/*
 * !!!!!  private is not inheritable
 * Default is inheritable to the classes in the same package
 * public and protected can be inheritable anywhere regardless of the what package it is in.  
 */

class A{
	public String name1= "Ayaz";    // public instance
}

class B extends A{
	public String name2= "Sukran";   // 3 instance variables, not visible but Ayaz is here 
	public String name3= "Erhan";
}


public class Inheritance extends B{   // 5 instance variables. Ayaz, Sukran and Erhan are not visible
	public String name4= "Mehmet";
	public String name5= "Mahribana";
	
	public static void main(String[] args) {
		Inheritance obj  = new Inheritance(); 
		System.out.println(obj.name1); //after creating obj, since main method is static 
		System.out.println(obj.name2);
		System.out.println(obj.name3);
		System.out.println(obj.name4);
		System.out.println(obj.name5);
		
		System.out.println("==========================");
		B obj2 = new B(); 
		
		System.out.println(obj2.name1); 
		System.out.println(obj2.name2);
		System.out.println(obj2.name3);
	//	System.out.println(obj3.name4); // this is not exist in class B, super class cannot inherit anything from sub class
	//	System.out.println(obj4.name5); // this is not exist in class B, super class cannot inherit anything from sub class
		
		System.out.println("==========================");
		
		A obj3 = new A(); 
		System.out.println(obj3.name1);
	//	System.out.println(obj3.name2); // this is not exist in class B, super class cannot inherit anything from sub class
	//	System.out.println(obj3.name3); // this is not exist in class B, super class cannot inherit anything from sub class
	//	System.out.println(obj3.name4); // this is not exist in class B, super class cannot inherit anything from sub class
	//	System.out.println(obj3.name5); // this is not exist in class B, super class cannot inherit anything from sub class
		
	}
	
	
}
