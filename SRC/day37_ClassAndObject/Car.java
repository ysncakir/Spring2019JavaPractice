package day37_ClassAndObject;

public class Car {

	/*  CAR
	 * 		DATA/ATTRIBUTE
	 * 			model, year, brand, color, price, mileage, VIN
	 * 		ACTIONS
	 * 			start, drive, accelerate,stop, drift, brake, get ticket 	
	 * 
	 * 		car1==>Tesla, 2020, ModelS, white, 60K, 10, 12345586kkkmsksnjf	
	 */


		String model; 
		String brand; 
		int year; 
		String color; 
		double price; 
		long milage; 
		
		public void drive() {   
            System.out.println("Driving "+brand);
        }
        
        public void start() {
            System.out.println(brand+" is started ");
        }
        
        // 2020 Toyota corolla, white, 10000 miles,1000$
        public void getInfo() {
        System.out.println(year+" "+brand+" "+model+", " + color + ", " + milage+ " miles"+", $"+price);
        }
		

}
