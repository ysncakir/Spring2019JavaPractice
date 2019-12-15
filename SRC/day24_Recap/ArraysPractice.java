package day24_Recap;

import java.util.Scanner;

public class ArraysPractice {

public static void main(String[] args) {
	
	
	/* ask user to enter 5 numbers
	 *  find the sum of those numbers
	 *  must use array
	 * 
	 */
	
	Scanner scan = new Scanner(System.in); 
	
	int [] numbers = new int [5]; 
	
	for (int i =0; i<numbers.length; i++) {
		System.out.println("Enter a number");  
		   numbers[i]= scan.nextInt();        // assign user values to array indexes
	}
	
	int sum =0; 
	for (int i =0; i<numbers.length; i++) {
		System.out.print(numbers[i]+" ");  
		sum+=numbers[i]; 
	}
	
	System.out.println();
	System.out.println(sum);
	
	
	/* ask user to enter five names
	 * return the longest name
	 */
	
	String [] names = {"seyfo", "asiya", "myra", "Hubert Blaine Wolfeschlegelsteinhausenbergerdorff"}; 
	
	int max =0; 
	String LongestName=""; 
	
	for (int i =0; i< names.length; i++){
		if (names[i].length()>max) {
			max = names[i].length(); 
			LongestName = names[i]; 
		}
	}
		
		System.out.println(max);
		System.out.println(LongestName);
	
	
	
	
	
	
	}
}
