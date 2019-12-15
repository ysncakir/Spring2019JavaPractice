package day39_JavaReview;

public class CellPhone {

	
	String brand;
	double price; 
	String color; 
	double screensize; 
	String model; 
	
	public CellPhone() {// default values for attributes of the class
		brand ="iphone"; 
		model= "10"; 
		screensize =5.8; 
		color = "white"; 
		price = 700; 
	}
	
	public CellPhone(String brand, double price, String color, double screensize, String model) {
		this.brand=brand; 
		this.price= price; 
		this.color= color;
		this.screensize=screensize; 
		this.model = model; 
	}
	
	public void call(long PhoneNumber) {
		System.out.println(brand + " "+ model+ "is calling "+ PhoneNumber);
	}
	
	
	public void SendMessage(long PhoneNumber) {
		System.out.println("Sending message to "+ PhoneNumber);
	}
	
	public void getInfo() {
		System.out.println(brand+ " "+ model+ " "+ color+ " "+ screensize+ " "+ "$"+price);
	}
	
	// instance variable : created outside the methods, within the class. Belongs to the object
	// it is also called field
	
	
	// instance methods: does not have static specifier but do have return type. It is also belong to the 
	// object
	
	// local variables: They are created within the method. Can only be used within the method.   Not visible outside the method. 
	
	// (this) is used for calling instance variables
	
	
	
	
	
	
	
	
	
	
	
	
	
}
