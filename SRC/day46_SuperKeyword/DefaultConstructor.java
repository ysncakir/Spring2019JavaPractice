package day46_SuperKeyword;

class B{
	
	public B(int a) {
		System.out.println("super");
	}
}

public class DefaultConstructor extends B{
	//			sub						super
	
	public DefaultConstructor() {
		// super, because of default constructor
		
		super(4);
		System.out.println("sub");
	}
	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor(); 
		
	}
	
	
}