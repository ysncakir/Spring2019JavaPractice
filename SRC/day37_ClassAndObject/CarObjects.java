package day37_ClassAndObject;

public class CarObjects {
// public is access modifier

	public static void main(String[] args) {
		
		
	Car 		car1 =    new        Car();	
// Classname	objName	  keyword	constructor	
		
		car1.brand = "BMW";
		car1.color = "White"; 
		car1.milage = 100000;
		car1.model = "X5";
		car1.price = 15.899; 		
		car1.year = 2000; 
		
		
		System.out.println(car1.brand); //bmw
		System.out.println(car1.color); // white
		System.out.println(car1.milage);
		System.out.println(car1.model);
		System.out.println(car1.price);
		System.out.println(car1.year);
		
		System.out.println("=======================================");
		
	Car car2 = new Car(); 
	
		System.out.println(car2.brand); // null
		
		car2.brand = "Toyota";
		car2.model = "Accord";
		car2.color = "Champaign pearl";
		car2.milage = 150000;
		car2.year = 2006; 
		car2.price = 4750; 
		
		System.out.println(car2.brand); //toyota
		System.out.println(car2.color); // pearl
		System.out.println(car2.milage);
		System.out.println(car2.model);
		System.out.println(car2.price);
		System.out.println(car2.year);
		
		
		car1.drive();   // Driving BMW
        car2.drive();  // Driving Toyota
        
        car1.start();  // BMW is starting
        car2.start(); // toyota corolla is starting
        
        car2.getInfo();
		
		
        Car car3 = new Car(); 
        
        car3.getInfo();
        
        car3.brand = "Lexus"; 
        car3.model = "RX350"; 
        car3.year = 2020; 
        car3.color = "pearl"; 
        car3.milage = 25000; 
        car3.price = 22.275; 
        
        car3.getInfo();
        
        
	}

}
