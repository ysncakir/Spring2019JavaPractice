package day29_ReturnMethods;

public class WarmUp {

	public static void main(String[] args) {
		
		
		// write a program that can find the frequency of characters in String
		
		// Ex: XXXYYYZZZ
		// output: X3Y3Z3
		
		
		String str = "aabbaaabbbccccc";
				//	expected result: a5b5c5
					// letters: "abcd"
				
		
		String str2 = ""; // to store non-duplicated values
		
		for (int i=0; i<str.length(); i++) {
			if(!str2.contains(str.substring(i, i+1))) {
				str2+=str.substring(i, i+1);
			}
		}
		
		System.out.println(str2);
		// abc ==>removed duplicates
		// j, j+1, j+2
		
		String result = ""; // to store expected results
		
		 // count the number of appearances
	for(int j=0; j<str2.length();j++) {
		int count =0;
		for (int i =0; i<str.length(); i++) {
			if(str.substring(i, i+1).equals(str2.substring(j, j+1))) {
				count++; 
			}
		}
		result +=str2.substring(j, j+1)+ count;
		
		
	}
		System.out.println(result);
		
		
		System.out.println("========================================");
		
		
		
		String input = "XXXYYYZZZ"; 
		String output = "";
		
		String nonDuplicates= ""; // remove the duplicates and store it
		
		
		for (int i =0; i<input.length(); i++) {
			if(!nonDuplicates.contains(""+input.charAt(i))){
				nonDuplicates+= ""+input.charAt(i);
				
			}
		}
		
		System.out.println(nonDuplicates);
		
		// nonduplicates = XYZ 				input ="XXXYYYZZZ";
		//		     expected result= X3Y3Z3
		
		int times= 0; 
	for(int j=0; j<nonDuplicates.length();j++) {
		for(int i=0; i<input.length();i++) {
			if(input.charAt(i) == nonDuplicates.charAt(j)){
				// input.substring(i,i+1).equals(nonDuplicates.substring(j, j+1)))
				times++;
			}
	
		output= ""+nonDuplicates.charAt(j)+times;
		}
	
		System.out.print(output);
		
			
	}
	
	
	}
}


