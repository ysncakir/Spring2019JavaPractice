package Assignment08_18;

public class CompanyInfo {

public static void main(String[] args) {
	
	
	String companyName = "Facebook"; // since this is a text, we can use only string variable to indicate company came. 
	
	String address = "......."; // Like company name, address can be used as a text and 
	
	byte numberofEmployees = 100; // because this is a whole number, we can assign it as a byte value. 
	                              // Also, range of byte is between -128 and 127. 100 can be in this range. 
	
	
	
	
	int AnnualRevenue= 4_000_000; //Like byte, int can take only whole numbers and because 4,000,000 is the 
							      // between range of int, we can assign int value.  
	
	boolean isTechCompany= true; // The only variables can accept true or false expressions is boolean. That's
								 // why we have to use this primitive while assigning isTechCompany. 


	System.out.println(companyName);
	System.out.println(address);
	System.out.println(numberofEmployees);
	System.out.println(AnnualRevenue);
	System.out.println(isTechCompany);

	
}
}
