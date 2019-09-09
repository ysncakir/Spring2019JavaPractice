package Practice;

import java.util.Scanner; 

public class StringMethods {

public static void main(String[] args) {
	
	String str = "Cybertek"; 
	
	str.charAt(7); 

System.out.println(str.charAt(7));

char ch = str.charAt(6); 

System.out.println(ch);
	


	String address = "1089 W Exchange Pkwy Apt 4202 Allen TX 75013"; 


	
	System.out.println(address.length());
	
	int address2 = address.length(); 

		System.out.println(address2);
	
		
	String 	name = "Yasin"; 
	System.out.println("name");	
	String names = name.concat(" Kerem and Ihsan"); 
		
		System.out.println(names);
		
	String U = names.toUpperCase();	
		System.out.println(U);
	String l = names.toLowerCase(); 	
	System.out.println(l);	
	
	Scanner scan = new Scanner(System.in); 
	String word = scan.next(); 
	
	char first = word.charAt(0); 
	char last = word.charAt(word.length() -1);
	
	System.out.print(first);
	System.out.print(last);
	
	
	Scanner scan1 = new Scanner(System.in);
    String word1 = scan.next();
    String word2 = scan.next();
	
	int a = word1.length(); 
	int b = word2.length(); 
	
	
	if (a>b) {
		System.out.println(word1);
		
	}
	else {
		System.out.println(word2);
		
	}
	
	
	
	
	}

}