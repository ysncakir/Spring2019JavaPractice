package day17_StringClass;

public class StringMethods {

public static void main(String[] args) {
	
	
	/* String class: 
	 * 	1. String is an object: There are 2 ways we can create String class' object:
	 * 				a) String literals : They are located in string pool within the Java Heap Memory
	 * 					String str = "Cybertek"; 
	 * 
	 * 				b) by using "new" keyword: 
	 * 					String str = new String("Cybertek")
	 * 
	 * 		Java Heap: a memory location where all the objects will be saved. 
	 * 		String Pool : Located in Java Heap memory. It is a very special memory location for string literals.
	 * 					One memory will be shared with another object.  
	 * 
	 * 
	 * 		every time if the String object is created by using new keyword, the object will be saved at Heap Memory,
	 * 		outside String pool. 
	 */
	
	
	
	String str1 = "Hello Javengers"; 
	String str2 = "Hello Javengers"; 
	
	boolean R1 = str1==str2; // true, same location 
	System.out.println(R1);
	
	String str3 = new String("public pool"); 
	String str4 = new String("public pool"); // they have different locations in Heap memory
	
	boolean R2 = str3==str4; // false
	System.out.println(R2);
	
	
	
	boolean R3= str1== str3; // false, they are in two different locations
	System.out.println(R3);
	
	/* Methods:
	 * 1. concat, 2. length, 3. CharAt, 4. toUpperCase, 5.toLowerCase; 
	 * concat : it takes and combines 2 strings and returns a new string value
	 * String is immutable, we have to assign a new variable to display new string. 
	*/
	
	String a = "Cybertek"; 
		   a = a.concat(" School"); // cybertek school
	
	System.out.println(a);
	
	String name = "Muhtar";
				// starts from 0
	
		char ch= name.charAt(5); 
	
	System.out.println(ch);
	
	String name2 = "CYBERTEK"; 
			name2 = name2.toLowerCase(); 
			
	System.out.println(name2);
	
	String name3 = "cybertek"; 
	name3 = name3.toUpperCase();
	System.out.println(name3);
	
	// Method trim(): it is used for removing unused spaces. 
	
	String s1 = "             Hello                 "; 
		   s1 = s1.trim(); 
		   System.out.println(s1);
		   
	String s2 = "Cybertek            School"; 
		   s2 = s2.trim(); 
		   
		System.out.println(s2);   // if there are words between word, spaces will not be removed
		   
	String s3 = "        "; 
		   s3 = s3.trim(); 
		System.out.println(s3);
		   
	String s4 = "     Cybertek       School"; 
		   s4 = s4.trim();
		System.out.println(s4);
			
		   
		   
	/* substring (beginning index)	: it creates sub value of the string from the 
									beginning index till the last index
									and returns as a new String value
									
	*/
		
	String Str= "Cybertek School";
	//           0123456789
	 	   Str= Str.substring(9); 
		System.out.println(Str);
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}

}
