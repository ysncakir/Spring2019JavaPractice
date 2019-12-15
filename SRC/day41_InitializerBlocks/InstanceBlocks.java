package day41_InitializerBlocks;

public class InstanceBlocks {
	
	/*
		it is used for initializing instance variables, belongs to object
	
		declaration: declared in the class, outside any methods
		
		each objects has its own copy of instance variables
		
		{
			statements;
		}
		
		instance blocks execution depends on the creation of object. If there is more than one objects, instance blocks
		will be executed as much as how many object we have  
		
		once object is created, instance blocks run first then constructor if there is
		
		It is possible to use multiple instance blocks
		
		

	*/
	
	
	{
		System.out.println("instance blocks1"); // will be executed 3 times before the constructor
	}
	
	{
		System.out.println("instance blocks2"); // will be executed 3 times before the constructor
	}
	
	{
		System.out.println("instance blocks3"); // will be executed 3 times before the constructor
	}
	
	public InstanceBlocks() {
	System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		
		InstanceBlocks obj = new InstanceBlocks(); // will execute 3 blocks 
		InstanceBlocks obj1 = new InstanceBlocks(); // will execute 3 blocks 
		InstanceBlocks obj2 = new InstanceBlocks(); // will execute 3 blocks 
	}
	
	
	
	
}
