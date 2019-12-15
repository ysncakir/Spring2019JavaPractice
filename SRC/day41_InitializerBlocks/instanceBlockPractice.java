package day41_InitializerBlocks;

public class instanceBlockPractice {

	public String name= "Shirin"; 
	
	
	public instanceBlockPractice(){ // this will be executed after instance blocks
		this(10); // name = Muhtar;
		name = "Dinara"; 
		
	}
	
	public instanceBlockPractice(int a){
		name = "Muhtar"; 
		
	}
	
	{
		name ="Mihray";
	}
	
	{
		name ="Yasin";
	}
	
	
	public static void main(String[] args) {
		
		instanceBlockPractice obj = new instanceBlockPractice(); 
		obj.name = "Aijamal";
		System.out.println(obj.name);
		
		
		instanceBlockPractice obj2 = new instanceBlockPractice(); 
		System.out.println(obj2.name);
		
		
	}
	
	
}
