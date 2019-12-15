package day23_Arrays;

import java.util.Scanner;

public class warmUp {

public static void main(String[] args) {
	
	// write a program that can divide two numbers without using (/)
	int x = 10; 
	int y = 3; 

	int count = 0; 
	
	/* 10/3   ==> if we subtract instead of /, we will get the same result
	 * 10-3=7
	 * 7-3 =4
	 * 4-3 =1
	 * 
	 * 
	 * 15/6		==> if we subtract instead of /, we will get the same result
	 * 15-6 =11
	 * 11-6=5   
	 */
	
 
	while (x>=y) {
			x-=y; 
			count++; 
	}
	
	System.out.println(count); // result after dividing 2 numbers 
	System.out.println(x); // remainder
	
	
	Scanner scan =new Scanner (System.in); 
	
	
	

	System.out.println("Enter two numbers");
	
	int num1= scan.nextInt(); 
	int num2= scan.nextInt(); 
	int result =0; 
	if(num2!=0) {
		while (num1>=num2) {
		num1-=num2; 
		result++; 
		}
		System.out.println("devision is: " + result);
		System.out.println("remainder is: "+ num1);
		
	}else {
		System.out.println("Invalid Entry");
	}
	
	
	
	}
}
