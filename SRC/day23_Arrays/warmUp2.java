package day23_Arrays;

public class warmUp2 {

public static void main(String[] args) {

	
	// write a program that can find the unique character 
	
	
	
	
	String str = "All the letters"; 
	
			//	  i, i+1, i+2.....	
	String Unique = ""; // to store all unique characters 
	
		
	
	
	
	
	for (int j =0; j< str.length(); j++) {
	
		int count =0; // count how many times the character appears
	
		for (int i =0; i< str.length(); i++) {
		//					highest value of i will be last index of the String 
		
			if(str.substring(i, i+1).equals(""+str.charAt(j))) {
					count++; 	
		}
	}
	
	

	
	if (count==1) {
		Unique+=""+str.charAt(j); 
	}
	
	
	
	
	}
	
	System.out.println("Unique characters are: "+Unique);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
