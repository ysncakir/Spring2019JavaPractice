package day20_Recap;

import java.util.Scanner;

public class StringMethods {
public static void main(String[] args) {
	

/* methods:
 *  substring, indexOf, lastIndexOf, replace, replaceFirst, equals, 
 *  equalIgnoreCase, contains, startWith, endsWith, charAt, 
 *  trim, length, concat, isempty, toLowerCase, toUpperCase
 * 
 * 
 * 
 * 
 * 
 * 
 */

// substring : creating the sub value of the String; ending index is excluded

	String str = "Cybertek School"; // String literals
	
	str = str.substring(0,str.indexOf(" ")); // or str.substring(0,str.indexOf("k")+1)

	System.out.println(str); // cybertek
	
	
	String str2 = "Cybertek School"; 
	
	str2 =str2.substring(str2.indexOf("S")); 
	
	
	System.out.println(str2);
	
	
// indexOf = returns the first occurred value's index number
	
	String s1 = "Java is a fun language, I love Java"; 
	
	 
	System.out.println(s1.indexOf("ag"));	// 19	
	
	
// lastIndexOf: returns the last occurred value's index number
	
    int l = s1.lastIndexOf("a");

    System.out.println(l);
    
    System.out.println(s1.lastIndexOf("ava")); // last ava, first 'a'
    
    
    
// replace = replaces old value with a new one; 
    
    String name = "Cybertek School Batch 12"; 
    
    int length = name.length();
    
    name = name.replace(" ", ""); 
    
    System.out.println(name.length()); // without spaces 
    
    name = name.replace("e", "a"); 
    System.out.println(name);
    
    
 // replaceFirst : replaces the first occurred old character with the new one
    
    String A1 = "Java is the fun, Java is object oriented"; 
    
    A1= A1.replaceFirst("Java", "C++"); 
    
    System.out.println(A1);
    
          
    
  //    == , equals,  equalIgnoreCase 
      String R1 ="Cybertek";  // String pool
      String R2 =new String("Cybertek");  // heap
                   
      String R3 = new String("cybertek"); // heap
                   
                   
      System.out.println(R1 == R2); // false, different location
                   
      System.out.println(R1.equals(R2) ); //true, visibile texts are same
                   
      System.out.println( R1.equals(R3) ); // false, case sensitivity
                   
      System.out.println( R1.equalsIgnoreCase(R3) );
               // true, it checks the visible text without case sensitivity
                   
                   
  
    
    // trim(): remove unused spaces
    
    String spaces = "                M           "; 
    spaces = spaces.trim(); //M
    
    System.out.println(spaces); 
    
    String N1 = "       ";
    N1= N1.trim();
    System.out.println(N1.isEmpty());
    
    
    String N2 = "Tomorrow is gonna be a great day to do repl.its"; 
    N2 = N2.trim(); 
    System.out.println(N2);
    N2= N2.replace(" ", "");
    System.out.println(N2);
    
    
    
  // charAt; returns a specific character from the String 
    String C2 = "Please do more exercise tomorrow"; 
    char ch2 = C2.charAt(C2.lastIndexOf("w")); 
    System.out.println(ch2);
    
    String sentences = "tomorrow we do not have class"; 
    
    System.out.println(sentences.charAt(0));
    System.out.println(sentences.length()-1);
    String result = ""+ (sentences.charAt(0) + sentences.length()-1);
    
    System.out.println(result);
    
    
    // startsWith& endWith ; 
    
    String gmail = "cybertekSchool.gmail.com"; 
    boolean R= gmail.endsWith("gmail.com"); 
    System.out.println(R);
    
    Scanner scan = new Scanner(System.in); 
    System.out.println("please enter a email");
    String gmailAdress= scan.nextLine(); 
     
    if (gmailAdress.endsWith("gmail.com")) {
    	System.out.println("It is a valid gmail address");
    }
    else {
    	System.out.println("invalid address");
    }
    
    
    // contains : checks if the given value is contained or not;
    			//	returns a boolean expression
    
    String salary = "$1000"; 
    
    boolean result2 = salary.contains("$"); // true
    
    System.out.println(result2);
    
    
    
    // concat : combines 2 strings 
    
    String schoolName = "Cybertek"; 
    schoolName= schoolName.concat(" school"); // you can only assign string value
    System.out.println(schoolName);
    
    String SchoolName = "Cybertek"+1231; //+ concates any value to the String 
    System.out.println(SchoolName);
    
    
    
    System.out.println("Enter full name"); 
    String fullname= scan.nextLine(); 
    String name1 = "Max Payne"; 
    String name2 = "Alan Wake"; 
    boolean Name = fullname.equalsIgnoreCase(name1);
    boolean Name2 = fullname.equalsIgnoreCase(name2); 
    	if (Name || Name2 ){
      System.out.println("User found!"); 
    	}else{
      System.out.println("User not found!"); 
    	}
   
    
    	String word = scan.nextLine();
        String sentence = scan.nextLine();
        
        boolean ws = sentence.contains(word);
        
        System.out.println(ws);
        
    
	}
}