package day40_staticKeyword;

public class StaticKeyword {
	
	int a; // instance variable, instance variables belong to object 
	
	static int b; // static variable; can be shared with class and all other objects  
	
	
	public static void main(String[] args) {
		
		StaticKeyword obj1= new StaticKeyword(); 
		obj1.a= 100; 
		
	
		StaticKeyword obj2= new StaticKeyword(); 
		obj2.a= 200; 
		
		System.out.println(obj1.a); // 100
		System.out.println(obj2.a);
		// each object has its own copy of instance variables
		
		double num = 100.5; // local variable 
		obj1.b = 900; 
		
		System.out.println(StaticKeyword.b); //900
		System.out.println(obj1.b); // 900
		System.out.println(obj2.b); // 900
		
		StaticKeyword obj3= new StaticKeyword(); 
		obj3.a= 100; 
		
		System.out.println(obj3.a); // 100
		
		StaticKeyword obj4= new StaticKeyword(); 
		System.out.println(obj4.a); // 0, we did not initiliaze
		
		obj3.b =400; 
		
		System.out.println(obj3.b); // 400, static variable
		
		System.out.println(obj4.b); // 400 same copy 
		
		StaticPractice.method1();
		
	}
	
	public static void method1() {
		// System.out.println(num); double num is local variable
		
	}

	public static void printHello() {
		System.out.println("Hello cybertek");
	}
	
	
	
	
}
