package Practice;
import java.util.Scanner; 
public class persInfo {
public static void main(String[] args) {
	
	
	  System.out.println("Welcome to the patient portal!"); 
	  System.out.println("Please enter your personal information"); 
	  System.out.println("Enter your first name"); 
	  Scanner scan = new Scanner(System.in); 
	  String firstName = scan.nextLine(); 
	  
	  System.out.println("Enter your last name"); 
	  String lastName = scan.nextLine(); 
	  
	  System.out.println("Enter your email"); 
	  String email = scan.nextLine(); 
	  
	  System.out.println("Enter your street"); 
	  String street = scan.nextLine(); 
	  
	  System.out.println("Enter your city"); 
	  String city = scan.nextLine(); 
	  
	  System.out.println("Enter your state"); 
	  String state = scan.nextLine(); 
	  
	  System.out.println("Enter your zip code"); 
	  int zipcode = scan.nextInt(); 
	  
	  System.out.println("Enter your work phone number"); 
	  long workPhoneNumber = scan.nextLong(); 
	  
	  System.out.println("Enter your personal phone number"); 
	  long personalPhoneNumber = scan.nextLong(); 
	   
	  System.out.println("Enter your age"); 
	  int age = scan.nextInt(); 
	  
	  System.out.println("Enter your height"); 
	  double height = scan.nextDouble(); 
	  
	  System.out.println("Enter your weight"); 
	  double weight = scan.nextDouble(); 
	  
	  System.out.println("Are you married?"); 
	  boolean isMarried= scan.nextBoolean(); 
	  
	  String contacts = "work phone number - " +workPhoneNumber+","+ "work phone number - "+
	  ","+ " email: " +email; 
	
	  System.out.println(contacts);
	
	
	
	
	
	
	
	
	
	
	
}
}
