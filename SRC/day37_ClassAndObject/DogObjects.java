package day37_ClassAndObject;

public class DogObjects {

	public static void main(String[] args) {
		
		
		
		Dog dog1 = new Dog (); 
			System.out.println(dog1.name);
		
		
		dog1.breed = "Husky"; 
		dog1.size = "small"; 
		dog1.color = "White and Gray"; 
		dog1.age = 25; 
		dog1.name = "Holly"; 
		dog1.gender = 'F'; 
		dog1.food = "Chicken"; 
		 
		
		System.out.println(dog1.name);
		
		dog1.getInfo(); 
		
		Dog dog2 = new Dog(); 
		
		dog2.breed = "Pitbull"; 
		dog2.size = "large"; 
		dog2.color = "gray"; 
		dog2.age = 3; 
		dog2.name = "lyka"; 
		dog2.gender = 'M'; 
		dog2.food = "Sushi"; 
		
		dog2.getInfo(); 
		
		dog2.eat();
		
		dog1.eat();
		
		dog1.play();
		
		dog2.play();
		
		String str = new String ("Hello"); 
			str.toLowerCase();    // instance methods
			
			
			
		/* create a custom class for employees
		 * 		attributes: name, ID, Job title, SSN , gender, salary, 
		 * 
		 * 		actions : 
		 * 				getInfo
		 * 				
		 * 
		 * 
		 */
		 
			
			
		
	}
}
