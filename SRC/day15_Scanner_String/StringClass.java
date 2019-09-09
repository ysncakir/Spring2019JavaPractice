package day15_Scanner_String;

public class StringClass {

public static void main(String[] args) {
	
	
/* 1. string is an object 
 * there are two ways to create object from string class:
 * 	1. String literals
 * 	2. by using new keyword
 * 		String str = new String
 * 
 * When the string object is created by String literals, that will be saved at String Pool. 
 * 
 * When the string object is created by using "new" keyword, the object will be saved at Java Heap memory 
 * 
 * 2. String object represents the sequences of the characters===> "ABCDEFG"
 * 		Each characters in String has its own index number. Index numbers start from 0
 * 
 * 		String str = "Cybertek"
 * 		index number: 01234567
 * 
 * 3. String is immutable ; 
 * 		Once you declare it, you cannot modify it.
 * 
 * 
 * 		
 * 	
 */

	String str = " Cybertek"; 
	String A = "Cybertek"; 
	String B = "Cybertek"; 
	// System.out.println(A==B); // both string literals are stored at String Pool
	
	
	
	String str2 = new String ("Cybertek"); 
		System.out.println(str==str2); // different memory location

	String str3 = new String ("Cybertek"); // new memory location
		System.out.println(str2==str3);


	String a = "Batch12"; 
	String b = "batch12";

	System.out.println(a==b); // false 
	
	String c= new String("Cybertek"); 
	String d= new String ("cybertek");
	System.out.println(c==d); // different locations
	


	} 


}
