package Practice;

import java.util.Scanner;

public class optinal {

public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in); 
	
	System.out.println("Enter your web address");
	String web= scan.nextLine(); 
	
	boolean start = web.startsWith("www."); 
	
	boolean valid = start && web.endsWith("com") || web.endsWith("net") || web.endsWith("edu")
			|| web.endsWith("org") || web.endsWith("gov"); 
	

	char dot = web.charAt(web.length()-4); 

	System.out.println(dot);


	String domain = web.substring(web.indexOf(".")+1,web.length()-4 ); 

	String extension = web.substring(web.lastIndexOf(".")+1); 

	System.out.println(domain + " " + extension);
	System.out.println();
	
	System.out.println("Enter a word");

	String input = scan.nextLine(); 
	
	if (input.length()%2 ==0) {
		System.out.println(input.substring(input.length()/2-1, input.length()/2+1));
	
	} else { 
		System.out.println(input.charAt(input.length()/2));
	}
	System.out.println();
	System.out.println("enter 3 words");
	String word1= scan.nextLine();
	String word2= scan.nextLine();
	String word3= scan.nextLine();

		if(word1.length()==word2.length() && word1.length()==word3.length()) {
			System.out.println("All words are same length");
		} 
		else if(word1.length()==word2.length() || word1.length()==word3.length()
		|| word2.length() == word3.length()){
			
			System.out.println("Not same nor different lengths");
			
		} else { 
		System.out.println("All different length");	
		} 





	}



}
