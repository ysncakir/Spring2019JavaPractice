package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		
		for (int i=100; i>=97; i--) {
			System.out.println(i);
		}
		
		for (int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		for (int i=1; i<=10; i++) {
			if(i%2!=0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println("=============================");
		
		String language = "java"; 
		for (int i =0; i<language.length(); i++) {
			System.out.println(language.charAt(i));
		}
		
		
		for (int i =0; i<language.length(); i++) {
			System.out.println(language.substring(i, i+1));
		}
		
		System.out.println();
		
		for (int i= language.length()-1; i>=0; i--) {
			System.out.println(language.charAt(i));
		}
		
		String [] cars = {"bmw", "wv", "audi"};
		
		System.out.println(cars[0]);
		
		int [] numbers = {3,4,5,6,7};
		
		int [] cash = new int[6]; 
		
		int [] bookpages; 
		
		bookpages= new int [4]; 
		
		bookpages[0]= 45; 
		bookpages[1]= 46; 
		bookpages[2]= 47; 
		bookpages[3]= 48; 
		
		
		System.out.println(Arrays.toString(bookpages));
		
		for (int each:bookpages) {
			System.out.print(each + " ");
		}
		System.out.println();
		int [][] nums = {
				
				{10,20,30},
				{40, 50, 60},
				{70, 80}
		}; 
		
		System.out.println(nums[2][1]);
		System.out.println(Arrays.toString(nums[2]));
		
		System.out.println(Arrays.deepToString(nums));
		
		
		for (int [] each: nums) {     // multi dimensional
			for(int each2:each)
			System.out.println(each2);
		}
		
		System.out.println("Please enter a sentence");
		Scanner scan = new Scanner(System.in);
		
		String sentence = scan.nextLine(); 
		
		
		
		
	}
	
}
