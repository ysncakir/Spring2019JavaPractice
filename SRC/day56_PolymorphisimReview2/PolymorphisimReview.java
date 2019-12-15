package day56_PolymorphisimReview2;

class A{
	protected void methodA() {
		System.out.println("method A");
	}
	
	public static void methodC() {
		System.out.println("method C from A class");
	}
}

class B extends A{
	public void methodB() {
	System.out.println(" method B");	
	}
	
	@Override
	public void methodA() {
		System.out.println( "method A from B class");
	}
	
	public static void methodC(int a) {
		System.out.println("Method C from B class");
	}
}

public class PolymorphisimReview {
	
public static void main(String[] args) {
	
		A obj = new A();
		A obj2 = new B(); 
		obj2.methodA();
		 // obj2.mehtodB();   not possible
		
		B obj3 = new B();
		// B obj4 = new A();  not possible 
			
		// C obj4 = new C(); abstract is not concrete and cannot have object
		
		C obj5 = new D(); // D MUST be non abstract 
		
		E obj6 = new D(); 
		
	//	D obj7 = new E(); we cannot create an object from interface
		
	// 	C obj8 = new E(); 
		
	//	E obj7 = new F();  it is abstract 
		
		A obj8 = new B(); 
		obj8.methodA(); //overriden one will be executed 
		obj8.methodC(); // if not overriden, reference type will be executed
		
		
	}
}

abstract class C{
	
}

class D extends C implements E{
	
}


interface E {
	
}


abstract class F implements E{
	
}