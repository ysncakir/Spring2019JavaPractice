package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {

	
	public static void main(String[] args) {
		// ask user to enter 3 numbers 
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("How many numbers?");
		int number= scan.nextInt(); 
		int [] arr = new int [number]; 
		
	for (int i =0; i<number; i++)	{
		System.out.println("Enter a number ");
		arr[i] = scan.nextInt(); 
	}	
		
		
		/*
		System.out.println("Enter a number ");
		arr[1] = scan.nextInt(); 
		System.out.println("Enter a number ");
		arr[2] = scan.nextInt(); 
		*/
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("Mininmum value is " + arr[0]);
		System.out.println("Maximum value is " + arr[arr.length-1]);
		
		
		
		
		
		
		
	}
}
