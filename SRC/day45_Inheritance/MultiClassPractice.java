package day45_Inheritance;

class Data{
	
	public String name; 
	private String age; 
	String ID; 
	protected String DOB; // it is not visible outside the package
	
	public void Hello (){  // public 
		Hola(); // since it is private, we can only use it within the class
		System.out.println("Hello");
	}
	
	private void Hola () { // private
		System.out.println("Hola");
	}
	
	void Aloha () {        // default
		System.out.println("Aloha");  
	}
}

public class MultiClassPractice {

		public static void main(String[] args) {
			Data obj = new Data(); 
			obj.name = "Yasin"; // public is visible at everywhere; 
			// obj.age= "67"; // not visible outside the class
			obj.ID = "3747"; // default is visible to the classes that are in the same package
		
		obj.Hello();
		// obj.Hola(); it is private
		obj.Aloha(); // default 
		
		
		}
}

