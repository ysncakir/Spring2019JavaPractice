package day54_Polymorphisim;

// Polymorphisim: objects to behave in multiple forms. It occurs when the super class is reference type and the object is crated 
// from the classes that is A relation with the super class

// Is A relation = is inherited relationship between classes
	//		Ex: class Dog extends Animal						Dog is animal
	//			class Husky extends Dog							Husky is a Dog and Animal


// Has A relation : instance of the class (object) is used in another class

				

/*
 * Create a class called Animal (Do not use abstraction for now):
 
    Actions: Talk()
create sub classes of Animal class:
    1. Tiger:
            Actions: Hunts()
    2. Octopus:
            Actions: Swim()
override super class' instance method Talk()
create a class called Zoo:
Create Arrays of Tiger
Create Arrays of Octopus
*/

class Animal{
	public void Talk() {
		System.out.println("Animal is talking");
	}
}

class Tiger extends Animal{
	public void Hunt() {
		System.out.println("Tiger is hunting");
	}
	
	public void Talk() {
		System.out.println("Tiger is talking====>Roar");
	}
}

class Octopus extends Animal{
	public void Swim() {
		System.out.println("Octopus is swimming");
	}
	
	public void Talk() {
		System.out.println("Octopus is talking===>gologolo");
	}
}


public class Zoo {
	
	public static void main(String[] args) {
		
		Tiger tiger1= new Tiger(); 
		Tiger[] Tigers = {tiger1, new Tiger()};
		
		Octopus octopus1= new Octopus(); 
		Octopus[] octopus = {octopus1, new Octopus()};
		
		Animal 			animal = 		new Tiger();
//    reference type	reference name 	 object 
		animal.Talk();
//		animal.Hunt(); Hunt method is not exist in reference type(Animal class)
		
		Animal animal2 = new Octopus();
		
	}

}
