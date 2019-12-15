package day25_ArraysContinue;

import java.util.Arrays;

public class StringMethods {

public static void main(String[] args) {
	
	
	/*
	 * split (str): splits the string by the given value and 
	 * returns it as String Array
	 * 
	 * 
	 * 
	 * toCharArray():
	 * 
	 */
	
	
	String sentence = "Today is great day, Good day to learn Java"; 
	
		String [] arr = sentence.split(" "); 
	
		System.out.println(Arrays.toString(arr));
	
	
	String email = "FirstName_LastName";
	String [] arr2 = email.split("_"); 
	
	System.out.println(Arrays.toString(arr2));
	
	
	String str = Arrays.toString(arr2); 
	
	System.out.println(str.replace("[", "").replace("]", ""));
	
	String fullname = "Cybertek School Batch12"; 
	
	String [] array1 = fullname.split(" "); 
	
	System.out.println(Arrays.toString(array1));
	
	
	String sentences = "I love Java and Java is fun, Java is life Java "; 
					//  I love |    and   | is fun, | is Life |
	
	String [] myJava= sentences.split("Java"); 
	
	System.out.println(Arrays.toString(myJava));
	
	System.out.println(myJava.length-1); // java is occurred 3 times in the sentence
	
	
	
	String Python = " Python is good, I love Python, Python is life "; 
		String [] array3= Python.split("Python");  
		System.out.println(array3.length-1);
	
	}
}
