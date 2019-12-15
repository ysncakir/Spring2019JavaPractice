package day40_staticKeyword;

public class StaticPractice {
	
	static long num1; // static variable
	
    long num2; // instance variable

    public static void main(String[] args) {
 
    		System.out.println( num1 );// 0
    		System.out.println( StaticPractice.num1 ); // 0
 
    		//  System.out.println( num2 ); // instance variables must be called with object
    		//  System.out.println( StaticPractice.num2 ); // instance variable belongs to the object
 
 
    		StaticPractice.method1(); // static method
 
    		// StaticPractice.method2(); // this is not static method
 
    		StaticPractice obj = new StaticPractice();
    		obj.method2();// we have to create object for this method execution
     
    		obj.method1(); // does not give error but not preferable
    		
    		
    		StaticKeyword.method1();
    }


    	public static void method1() {
    		System.out.println("A");
    	}

    	public void method2() {
    		System.out.println("B");
}

}
