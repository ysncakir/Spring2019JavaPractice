package day42_OOP_Encapsulation;

public class AmericanAirline {
	
	 public static void main(String[] args) {
	        
	        EmployeeInfo emrah = new EmployeeInfo();
	            //  emrah.Name = "Emrah";   // private data is not visible outside the class
	            emrah.setName("Emrah");
	            
	        //  System.out.println( emrah.Name );  //  // private data is not visible outside the class
	        
	            System.out.println( emrah.getName() ); // Emrah
	        
	            emrah.setSSN(1234546);
	            System.out.println(emrah.getSSN()); 
	            
	            emrah.setAge((byte)35); 
	            
	            System.out.println(emrah.getAge());
	            
	            emrah.setSalary(120000);
	            
	            System.out.println(emrah.getSalary());
	            
	            System.out.println("===============================");
	            
	            
	            
	           EmployeeInfo Shirin = new EmployeeInfo();
	           
	           	Shirin.setName("Shirin"); 
		        Shirin.setSSN(357764);
		        Shirin.setSalary(98000);
		        Shirin.setAge((byte)30);
		        
		        System.out.println(Shirin.getName());
		        System.out.println(Shirin.getSSN());
		        System.out.println(Shirin.getAge());
		        System.out.println(Shirin.getSalary());
		        
		        System.out.println("===============================");
		        
		        EmployeeInfo Rohan = new EmployeeInfo();
		        
		        	Rohan.setInfo("Rohan", 67453, (byte)27, 67.890);
		        System.out.println(Rohan.getName());
		        System.out.println(Rohan.getSSN());
		        System.out.println(Rohan.getAge());
		        System.out.println(Rohan.getSalary());
		        
	 } 

}
