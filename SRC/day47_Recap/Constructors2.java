package day47_Recap;

class ErdalBakkal{
	
	public ErdalBakkal (int a) {
		System.out.println("A");
	}
	
	public ErdalBakkal (double b) {
		System.out.println("B");
	}
	
	public ErdalBakkal (String str) {
		System.out.println("C");
	}
	
//	public ErdalBakkal() {
		
//	}
}


public class Constructors2 extends ErdalBakkal{
	
	public Constructors2 () {
		super("a"); 
		
	}
	
	public static void main(String[] args) {
		Constructors2 obj = new Constructors2(); 
	}
}
