package day52_Interface;


class A{
	public A() {
		System.out.println("A");
	}
}

class B extends A{
	public B() {    // default constructor will be called automatically 
		System.out.println("B");
	}
	
class C extends B{
		public C() {
			System.out.println("C");
		}
}
}
public class Quiz {
	
	public static void main(String[] args) {
		B obj = new B(); 
		
		
	}

	}


