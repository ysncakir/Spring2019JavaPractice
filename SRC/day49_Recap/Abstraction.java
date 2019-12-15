package day49_Recap;

public abstract class Abstraction {
	
	
	/* Abstraction: concerating on essentials/important things, not worrying about details/implementation
	 * 				hiding the implementation details
	 * 
	 * abstract method : a method without body/ implementation
	 * 
	 * 				public abstract start();
	 * it is a method that's meant to be override( cannot be final, private)
	 * Only instance methods can be override and can be abstract 
	 * Abstract method can only be declared in ABSTRACT class and interface
	 * 
	 * abstract class : abstract is something not concrete 
	 * 					we cannot create object from
	 * 					a class meant to be extended
	 * 					abstract class cannot be final, immutable
	 * 					class' access modifiers can only public or default
	 * Access modifiers : public, protected, default
	 * return type: void, primitives, non-primitives(object)
	 * name : can be any name
	 * 
	 * Overriding: same method name, same parameter, same return-type
	 * 				access modifier Must be same or more visible 
	 * 				Must override in sub class
	 * 				@Override must be applicable
	 */

	public abstract void startTheCar(); 
	
}

 class Toyota extends Abstraction{
	 
	@Override 
	public void startTheCar() {
		System.out.println("Brake");
		System.out.println("Push the start button");
		System.out.println("Release the brake"); 
	 }
	
	public static void main(String[] args) {
		// Abstraction obj = new Abstraction();  // not possible 
	}
	
	
}
 
 
 class Tesla extends Abstraction{
	 
	 @Override
	 public void startTheCar() {
		 System.out.println("Voice control");
		 System.out.println("driver");
		 
	 }
	 
 }
