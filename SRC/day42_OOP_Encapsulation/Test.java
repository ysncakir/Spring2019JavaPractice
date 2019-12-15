package day42_OOP_Encapsulation;

public class Test {

	public static void main(String[] args) {
		
		TestData obj = new TestData(); 
			// System.out.println(obj.Name); // data was private
		
		System.out.println(obj.getName()); 
		
		String str = obj.getName();
		
		System.out.println(obj.getID());
		int a = obj.getID(); 
		
		obj.setName("Muhtar");
		
		System.out.println(obj.getName()); // we need to use getter to print modified date out
		
		obj.setID(400); 
		System.out.println(obj.getID());
		
	}
	
}
