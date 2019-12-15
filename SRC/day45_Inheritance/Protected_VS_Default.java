package day45_Inheritance;

public class Protected_VS_Default {
	
	protected String name; 
			  String ID; 
			  
	protected void printHello() {
		System.out.println("Hello");
	}

	void printHola() {
		System.out.println("Hola");
	}
}


class cybertek{
	public static void main(String[] args) {
		Protected_VS_Default obj = new Protected_VS_Default();
		
		obj.printHello();
		obj.printHola();
		
	System.out.println(obj.name); // since they are in the same package, we can call all of them 
	System.out.println(obj.ID);	  //  within the different classes
	
		
		
	}
}