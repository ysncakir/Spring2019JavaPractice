package day24_Recap;

public class ArraysClass {

public static void main(String[] args) {
	
	
	/*
	 *  1. Datatype [] VariableName = {value1, 2,3,4.....}; 
	 *  2. Datatype VAriableName[] = {value 1, 2, 3,.....};  
	 * 
	 * Arrays have index numbers starting from 0. 
	 * Arrays size is fix, and the size must be initialized. 
	 * one is regular, other one is new method. 
	 */
	
	int [] num = { 3, 4, 5, 6, 8}; 
	
	int num2[] = { 10, 20, 30}; 
	
	
	char [] arry= {'A', 'B', 'C'};
	
	
	String [] arry2 = {"yasin", "arzu", "ihsan onur", "kerem"}; 
	
	
	System.out.println(arry2[3]); 
	
	
	//OR
	
	String name = arry2[2]; 
	
	System.out.println(name);
	
	// initialize the size of array: int [] arr = new int [size number]
	
	
	boolean [] myNumber = new boolean [5]; 
	for (int i=0; i< myNumber.length; i++) {
		System.out.println(myNumber[i]); // gives us default value 0
		
	}
	// default values :
		// int, byte, short, long ==> 0 
		// double & float ==> 0.0 
		// boolean ==> false
		// char ==> space
		// String ==> null
	
	//  Assigning values; 
	
	int ch[] = new int[3]; // it means this can store 3 elements 
	
	ch[0]= 10; 
	ch[1]= 20; 
	ch[2]= 30; 
	
	// ch[3]= 40; // out of bounds
	
	for (int i =0; i<ch.length; i++) {
		System.out.println(ch[i]);
	
	}
	System.out.println( );
	
	ch = new int[4]; // reinitialized its size, previous values are lost
	
	for (int j =0; j<ch.length; j++) {
		System.out.print(ch[j]);
	
	}
	System.out.println();
	
	int [] array1= {1,2,3,9}; 
	int [] array2= {4,5,6,7}; 
	
	int [] array3 = new int[array1.length + array2.length]; 
	
	for (int i=0; i<array1.length; i++) {
		array3[i]= array1[i]; // assigning all values of array1 to array3
		
	}
	
	for (int i =0; i< array2.length; i++ ) {
		       array3[i+array1.length]= array2[i];
	} // assigning all values of array2 to array3's remaining index
					
	for (int i =0; i< array3.length; i++) {
			
		
		System.out.print(array3[i]+ " ");
	}
	
	
	
	
	
	}
}
