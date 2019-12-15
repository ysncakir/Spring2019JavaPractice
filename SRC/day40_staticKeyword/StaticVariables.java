package day40_staticKeyword;

public class StaticVariables {
	
	static String name; // static variable
	
	static double staticNum; 
	
	int num1; 
	
	public static void method1() {
		System.out.println("Open the browser");
	}
	
	public static void main(String[] args) {
		
		// System.out.println(num1); // only accepts class members
		
		StaticVariables.method1();  // static method we can call it through the class
		
		// System.out.println(num1); // static method only accepts class members
		
		StaticVariables objectA = new StaticVariables(); 
		System.out.println(objectA.num1); // 0
		
		StaticVariables obj1 = new StaticVariables(); 
		obj1.name = "Omer"; 
		System.out.println(obj1.name); // first omer 
		
		StaticVariables obj2 = new StaticVariables(); 
		System.out.println(obj2.name);// static variable has only one copy
		
		obj2.name= "Kursad";// reassigned static variable as kursad
		System.out.println(obj2.name);
		
		System.out.println(obj1.name); // kursad, static variable has only one copy, we reinitiliazed it
		
		System.out.println("======================================================");
		
		System.out.println(StaticVariables.staticNum);  // 0.0
		
		StaticVariables object1 = new StaticVariables(); 
			object1.staticNum = 4.5; 
 		System.out.println(object1.staticNum); // 0.0, 4.5
		
		StaticVariables object2 = new StaticVariables(); 
		System.out.println(object2.staticNum);     // 0.0, 4.5
		
		
		StaticKeyword.printHello(); // it is coming from the other class. 
		
		
		
		
	}
	
	
	

}
