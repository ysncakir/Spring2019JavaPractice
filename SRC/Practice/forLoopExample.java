package Practice;

public class forLoopExample {
	
	public static void main(String[] args) {
	
		String str ="yyyyaaaasiiinnnny"; 
		
		String removeDup= ""; 
		
		for (int i=0; i<str.length(); i++) {
			if (!removeDup.contains(str.substring(i, i+1))){
				removeDup+=str.substring(i, i+1); 
			}  
			
		}
	
		// str = yyyyaaaasiiinnnny"				removeDup = yasin 
		String result="";
	for(int j=0; j<removeDup.length(); j++) {
		
		int count=0; 
		for(int i=0; i<str.length(); i++) {
			if(str.substring(i, i+1).equals(removeDup.substring(j, j+1))) {
				count++; 
			
			}
		}
		
		result+=removeDup.substring(j, j+1)+count; 
		
	}
		System.out.println(result);
		
		
		System.out.println("=================================");
	
		
		String input = "XXXXXYYYYZZZ"; 
		
		// expected result X5Y4Z3
						//letters XYZ
		
		String nonDuplicates =""; // to remove the duplicates and store 
						//X,Y,Z
		
		for (int i=0; i<input.length(); i++) {
			
			if (!nonDuplicates.contains(""+input.charAt(i))) {
				nonDuplicates+=input.charAt(i);
			}
			
			
		}
		System.out.println(nonDuplicates);
		
		//input = "XXXXXYYYYZZZ"; 			nonDuplicates ="XYZ"
		String expResult ="";
		 // to count the occurrence of each index of input
		
	for(int j=0; j<nonDuplicates.length(); j++){	
		int times =0;
		for (int i=0; i<input.length(); i++) {
			if(input.charAt(i) ==nonDuplicates.charAt(j)) {
				times++; 
			}
			
		}
		
		expResult+= nonDuplicates.charAt(j) + ""+times; 
	}
		
		System.out.println(expResult);
		
	}
}
