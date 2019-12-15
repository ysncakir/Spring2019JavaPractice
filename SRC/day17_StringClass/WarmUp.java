package day17_StringClass;

import java.util.Scanner; 

public class WarmUp {

	public static void main(String[] args) {
		
	System.out.println("Enter your first name and lastname");	
	
	Scanner scan= new Scanner(System.in); 
	
	String firstname = scan.nextLine(); 
	
	String lastname = scan.nextLine(); 
	
	String fullname = firstname.concat(""+ lastname);  // you can only give String variable in concat
		
    int totalNumber = fullname.length(); 		
    
    System.out.println(fullname + " contains " + totalNumber + " characters");
    
    int lastindexnum = fullname.charAt(fullname.length()-1); 
    
    System.out.println(fullname.charAt(lastindexnum));
    
    
    scan.close(); 
    
	}
}
