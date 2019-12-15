package day47_Recap;

class Ysn{
	
	public Ysn() {
		System.out.println("Mehmet");
	}
	
}

class Arz extends Ysn{  // Ysn default cons will be called in this class as default
	public Arz() {
		// super(); automatically
		System.out.println("Resul");
	}
}

class Ckr extends Arz{
	public Ckr () {  
		// super();  // this will call the other 2 first automatically
		System.out.println("Viktoria");
	}
}

public class Constructors {

	public static void main(String[] args) {
		
		Arz obj = new Arz();
			
		Ckr obj2 = new Ckr();
		
	}
}
