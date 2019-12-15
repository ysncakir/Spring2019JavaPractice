package day43_Recap;

public class Test {
	
	
	static int a; int b; 
	
	long total =100; // 200 oldu , 175
	
	
	
	public Test() {
		total-=50; // 200-50 =150
	}
	
	public Test(int total) {   // test obj ile ilgili bunu kullanacak (2)
		this();  // 150
		this.total += total; // 150+25 =175
	}
	
	{
		total*=2;    // test obj ile ilgili bunu da kullanacak (1) ve total 200 olacak
	}
	
	static {           // it does not affect static variable
		int total =200; 
		total/=2; 
			
	}
	
	
	
	public static void main(String[] args) {
		
		
		// static variable that's shared by class and objects, there is only one copy
		
		// instance variable: belongs the object, each object has its own copy 
		
		// constructor and instance variable depends on the creation of object
		
		// order: 1. static, 2. instance blocks, 3. constructor
		
	
		Test obj = new Test(); 
		
		obj.b =10; 
		obj.a = 20; 
		
		Test obj2 = new Test(); 
		obj2.b=30;
		obj.a = 40; 
		
		System.out.println(obj.b); // 10
		
		System.out.println(obj2.b); // before assigning new value = 0, if it was static, it would be 10
									// 30
		
		System.out.println(obj.a); 	// 20 , 40
		System.out.println(a);		// 20 , 40
		System.out.println(obj2.a); // 20 , 40
		
		
		
		Test test = new Test (25); 
		System.out.println(test.total);
		
		
		
	}

}
