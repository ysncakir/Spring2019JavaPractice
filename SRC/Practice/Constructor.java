package Practice;

public class Constructor {
	
	public Constructor() {
		System.out.println("default");
	}
	
	public Constructor (double a) {
		System.out.println("Constructor with argument double: " + a);
	}

	public static void main(String[] args) {
		
		Constructor obj = new Constructor (); 
		
		Constructor obj2 = new Constructor (45);
		
	}
}
