package day23_Arrays;

import java.util.Scanner;

public class ArraysPractice {

public static void main(String[] args) {
	
	String student1= "Ibrahim"; 
	String student2= "Zuleyha"; 
	String student3= "Elina"; 
	
	
	
	
	String [] allStudents = {"Ibrahim", "Zuleyha", "Elina"}; 
	
	allStudents[0]= "Marufjon"; 
	// allStudents[3]= "Muhtar"; // array size is fixed
	
	System.out.println(allStudents.length);
	
	
	// initialize the size only without giving value; 
	
	int [] array = new int[4]; // we have not given values yet
	// this array can contain 4 values, its length is 4. 
	
	
	
	// give values to the array; 
	// index 0 is default "0", 
	
	array[1]=100; 
	array[0]=200; 
	System.out.println(array[0]);
	
	Scanner scan = new Scanner (System.in); 
	int [] Inputs  = new int [10]; // we can store 10 elements, highest index number is 9
	
	for (int i=0; i<Inputs.length; i++ ) {
				System.out.println("Enter a number ");
				Inputs [i] = scan.nextInt(); 
	}
	
	for (int i=0; i<Inputs.length; i++ ) {
		System.out.print(Inputs [i] + " ");
		
		
	}
	
	
	
	
	
	
	
	}
}
