package day46_SuperKeyword;

import day45_Protected_Default.ProtectedVariables;

class Data{
	
	public  int num1 = 10; 
	protected int num2 =20; 
	private int num3= 30; 
	int num4 =40; 
		
}


public class InheritanceReview extends Data{
				// sub					super
/*	
	public static int num1 = 10; 
	protected static int num2 =20; 
	static int num4 =40; 
*/
	
	static int staticNum; 
		   int insNum; 
		
	public void method() {   // this is not static 
		System.out.println(this.insNum);
	}
	
		   
	public static void main(String[] args) {
		
		// System.out.println(this.insNum); // in order to call instance, we MUST have object

		InheritanceReview obj = new InheritanceReview(); 
		
		/*
		System.out.println(num1);
		System.out.println(num2);      They can be inherited if data are static 
		System.out.println(num4);
		*/
		// System.out.println(num3); access modifier of num3 is private
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.num4);
		
		
		Data obj2 = new Data(); 
		
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
		System.out.println(obj2.num4);
		
		ProtectedVariables obj3 = new ProtectedVariables (); 
		// System.out.println(obj3.nameProtected); // it is private variable
		System.out.println(obj3.namePublic); // from different package, it is public variable 
		
		InheritanceReview objA = new InheritanceReview(); 
				objA.staticNum = 100; 
				objA.insNum =200; 
				
		InheritanceReview objB = new InheritanceReview(); 		
				objB.staticNum = 300; 
				objB.insNum =400; 
			System.out.println(objB.insNum); // 0, it will change with each object
			System.out.println(objB.staticNum); //100, only one copy shared with static
			System.out.println(objA.insNum); // 200
			
			System.out.println(objA.staticNum); //300
			System.out.println(objB.staticNum);
	}
	
	
}
