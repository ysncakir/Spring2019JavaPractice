package day22_NestedLoop;

public class warmUp2 {

public static void main(String[] args) {
	
	// write a program that can check if the String is palindrome. 
	
	// if its print true, otherwise print false
	
	
	
	String original = "ey edip adanada pide ye ".trim(); 
					// 0123456
				// reverse:6543210	
	String reverse = ""; // "gfedcba
	
	/*for (int i = original.length()-1; i>=0; i--) {
		
		reverse+= original.substring(i, i+1); 
		
		
	}*/
	
	int i = original.length()-1; 
	
	while (i>0) {
		
		reverse+= original.substring(i, i+1); 
		
		i--; 
	}
		
	
	boolean result = original.equals(reverse); 
	System.out.println(result);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
