package day46_SuperKeyword;

class parent{
	
	public parent (int a) { // C A
		this("A"); // C
		System.out.println("A"); // A
	}
	
	public parent (String b) {
		System.out.println("C");
	}
}

public class practice extends parent {
	
	/*
	 * public practice(){
	 * 	super();
	 * }
	 */
	 
	public practice() { //  C A B
		// super("yasin");
		super(6); // cannot call two constructor at the same time ; CA
		System.out.println("B");
		
	}
public static void main(String[] args) {
	practice obj = new practice();
}	
	
}


