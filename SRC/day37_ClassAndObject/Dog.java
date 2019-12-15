package day37_ClassAndObject;

public class Dog {

	String breed; 
	String size; 
	String name; 
	String color; 
	byte age; 
	char gender; 
	String food; 

	
public void getInfo () {
	
	System.out.println(breed + " "+ size+ " "+ age+ " years old, "+ color+ ", Gender is "+ gender+
			", Name is "+ name);
}
	
public void eat() {
	
	System.out.println(name + " is eating "+ food);
}

public void play() {
	
	System.out.println(breed + " is playing");
}


}
