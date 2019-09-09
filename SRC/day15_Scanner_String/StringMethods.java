package day15_Scanner_String;

public class StringMethods {

public static void main(String[] args) {
	/*
	 * String methods
	 * 	charAt : it takes the index number and returns its character as char value
	 * 			Ex: String str = "Cybertek"
	 * 				index num :	  01234567
	 * 			str.charAt(5)==returns t	
	 * 
	 * length() : returns the total number of character as an int value
	 * 
	 * 
	 * concat (str) : it takes a String and concats it to the String variable, 
	 * 				and returns a NEW String value
	 * 
	 * toUpperCase () : converts to upper case 
	 * 
	 * toLowerCase () : converts to lowercase
	 * 
	 * 
	 */
	
	String str = "Cybertek";
// index numbers :01234567
	
	// charAt (index):
	
	System.out.println(str.charAt(5));
	
	
	char ch = str.charAt(4); 
	
	System.out.println(ch);
	
	String str2 = "Mu htar"; 
	// Indexnumber:0123456
	
	System.out.println(str.charAt(2));
	
	// length();
	
	String name = "Donald J Trump"; 
		 int n = (name.length());
	

	// concat() :
		 
		 String s1 = "Cybertek";  // String is immutable
		 	    s1.concat("School");
		 System.out.println(s1);
		 
		 s1 = s1.concat(" School"); 
		 System.out.println(s1);
		 
	// toUppercase ; 
		 
		 String N = "cybertek"; 
		 		N.toUpperCase(); 

		 System.out.println(N);  // string is immutable
		 	N = N.toUpperCase();
		 System.out.println(N);
		 
	// toLowerCase :
		 
		 String name1 = "ABDURRAHMAN"; 
		 		name1.toLowerCase();
		 		
		 System.out.println(name1);
		 	name1 = name1.toLowerCase();
	 		
		 System.out.println(name1);	
		 
		 System.out.println("==========================");
	// Examples :
		 
		 String a = "Batch 12 Javengers";  // starts from 0
		 // index :  0123456789....
		 	char ch1 = a.charAt(14); 
		 			
		 System.out.println(ch1);
		 
		 		int Length = a.length(); // starts from 1 
		 System.out.println(Length);
		 
		 int HighestIndexNumber = a.length() -1; 
		 System.out.println(HighestIndexNumber);
		 
		 String b = "Cybertek"; 
		 	b.concat("Batch 12 Javengers"); 
		 
		 System.out.println(b);
		 
		 	b = b.concat("Batch 12 Javengers"); 
		 System.out.println(b);
		 
		 
		 String d = "book"; 
		 
		 System.out.println(d.toUpperCase());
		 
		 System.out.println(d);
		 
		 		d = d.toUpperCase(); 
		 
		 System.out.println(d);
		 
		 String e = "JAVA IS FUN"; 
		 e.toLowerCase(); 
		 System.out.println(e);
		 
		 String f= e.toLowerCase();
		 System.out.println(f);
		 
		 e = e.toLowerCase();
		 System.out.println(e);
	

	
		 
		 
		 

	}
}
