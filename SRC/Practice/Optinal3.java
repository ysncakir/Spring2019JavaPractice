package Practice;

import java.util.Scanner;

public class Optinal3 {
public static void main(String[] args) {
	
	
	System.out.println("Enter two words");
	Scanner scan = new Scanner (System.in); 
	String word1=  scan.nextLine(); 
	String word2=  scan.nextLine(); 

	String half1 = word1.substring(0,word1.length()/2); 
	String half2= word1.substring(word1.length()/2); 
	
	if (word1.length()%2==0) {
		System.out.println(half1+word2+half2);
		
	} else {
		System.out.println("N/A");
	}
	
	
	String word3 = word1.substring(1, word1.length()); 
	
	
	String word4 = word2.substring(1, word2.length()); 
	
	System.out.println(word3.concat(word4));
	
	
	System.out.println();
	System.out.println("enter a word please");
	String user = scan.nextLine(); 
	
	char first = user.charAt(0); 
	char last = user.charAt(user.length()-1); 
	boolean same = first ==last; 
	
	System.out.println(same);
	
	System.out.println();
	System.out.println("enter 2 words");
	String Word1 =scan.nextLine(); 
	

	String ftwo = Word1.substring(0, 2); 
	System.out.println(ftwo);
	
	String Word2 =scan.nextLine(); 
	String ltwo = Word2.substring(Word2.length()-2); 
	System.out.println(ltwo);
	
	if (ltwo==ftwo); 
	
	System.out.println("true");
	
	
	
	
	
	
	if (Word1.length()==Word2.length()) {
		System.out.println(Word1.concat(Word2));
	} else {
		if (Word1.length()>Word2.length()) {
			System.out.println(Word1.substring(0, Word2.length()).concat(Word2));
		} if (Word2.length()>Word1.length()) {
			System.out.println(Word2.substring(0, Word1.length()).concat(Word1));
		}
	}
	
	char Last = user.charAt(user.length()-1); 
	char second = user.charAt(user.length()-2); 
	
	String reverse = (""+last +second);
	String firstTwo = user.substring(0, 2); 
	
	if (user.length()>=2) {
		System.out.println(user.substring(0, user.length()-2).concat(reverse));
		System.out.println(firstTwo.concat(firstTwo).concat(firstTwo));		
		
	} 
	else {
		System.out.println("N/A");
			
		}
	
	
	
	
	
	
	
	
	
	}
}
