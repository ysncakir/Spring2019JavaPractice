package day42_OOP_Encapsulation;

public class TestData {
	
	
	/*
	name : data/attributes ====> instance variables
	ID : Action=========> instance methods

	instance variables: belongs to the object. Each object has its own copy of instance variable
	
	Encapsulation : to hide the instance variable (hiding the data) by giving private access modifier
	
	private: hides the instance variable. If the feature is private, the feature is only visible within the class
			Codes outside the class cannot access to the data. Not accessible to any other classes	
			
	Getter and setter : grants other classes get access to the private data 
	
	getter : it is an instance methods that returns the private data for read only 
	
			the return of the method MUST match with the data type of the instance variables
			
			access modifier needs to be public
			
			
	setter (modify): 
			
	*/

	private String Name= "Bekir"; // data is not visible to any other classes
	private int ID = 200; 
	
	// getter: to read the value
	public String getName() {
		return Name; 
	}
	
	public int getID() {
		return ID;
	}
	
	// setter: to change the value
	
	public void setName(String Name) {
		this.Name = Name; 
		
	}	
		
	
	public void setID(int ID) {
		this.ID= ID; 
	}
		
		
		
		
		
		
	
}
