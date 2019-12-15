package day26_ForEach;

import java.util.Arrays;

public class ForEach {

public static void main(String[] args) {
	
	
	/*
	for each loop: used to access the value in the collection of values
	its a loop that's already been iterated. 
	syntax of for each loop: 
	for (datatype variablename : variablename of collection
					each is preferable
	*/
	
	
	int [] arr = {1,2,3,4,5}; 
	for (int i =0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	
	System.out.println("=====================");
	
	for (int each :arr) {
		System.out.println(each);
	}
	
	
	
	
	String [] str1 = {"yasin", "arzu", "ihsan", "kerem"}; 
	
	
	for (String peach:str1) {
		System.out.println(peach);
	}
	
	for (int i=0; i<str1.length;i++) {
		System.out.println(str1[i]);
	}
	
	char [] ch = {'z', 'x', 'y', 'c','a', 'b'}; 
	Arrays.sort(ch);
	
	
	for (char each:ch) {
		System.out.print(each);
	}
	System.out.println();
	
	int [] arr1 = {1,2,3,4,5,6,7,8,9,10}; // print only even numbers
	
	for (int even: arr1) {
		if(even%2==0) {
		System.out.print(even + " ");
	}
}	
	
	for (int odd: arr1) {
		if(odd%2!=0) {
		System.out.print(odd + " ");
	
		}
	}
	
	// print out 1 ~1000 
	
	
	
	
	
	
	
	
	
	
	
	}	
	
}
