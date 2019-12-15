package day56_PolymorphisimReview2;

class Animal{
	
	public void method1() {
		
	}
}

class Dog extends Animal{
	
	public void method2() {
		
	}
	
}

public class UpCasting {
	public static void main(String[] args) {
		
		System.out.println((double)10);
	
		Dog obj = new Dog(); 
		obj.method1();
		obj.method2();
		
		Animal obj2 = (Animal)obj;  
		
	
	}
}
