package Practice;

import java.util.Scanner;

public class Optinal2 {

public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in); 
	
	String word1= scan.nextLine(); 
	
	String word2= scan.nextLine(); 
	
	char last= word1.charAt(word1.length()-1); 
	
	char first = word2.charAt(0); 
	
	if(last==first) {
		
		System.out.println(word1.concat(word2.substring(1)));  
							// ikinci kelimenin ilk harfini yazma
		
	}
	// task x leri yazma 
	
	System.out.println("Enter a word");
	String word3 = scan.nextLine(); 

	if (word3.charAt(0)=='x' || word3.charAt(1)=='x' || word3.substring(0,2)=="xx") {
		if (word3.charAt(0)=='x' && word3.charAt(1)=='x') {
				System.out.println(word3.substring(2));
		} else if(word3.charAt(1) =='x') {
			System.out.println(word3.substring(0,1).concat(word3.substring(2)));
		} else if (word3.charAt(0)=='x') {
			System.out.println(word3.substring(1));
		} 
		
	}
	else {
		System.out.println(word3);
	}
	
	
		
	
	
	
	
	
	
	
	
	
	}
}
