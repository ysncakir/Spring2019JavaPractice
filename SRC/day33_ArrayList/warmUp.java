package day33_ArrayList;

import java.util.Arrays;

public class warmUp {

public static void main(String[] args) {
	
	int [] arr = {10, 89, 20, 300, 10, 900, 0, 1}; 
	
			arr	= SortDes(arr);
	System.out.println(Arrays.toString(arr));
	
	double [] arr2 = {10.5, 5.5, 300, 2.0, 6.5}; 
			  arr2 = SortDes(arr2);
	
	System.out.println(Arrays.toString(arr2));
	
	System.out.println(Arrays.toString(SortDes(arr2)));
	
	char [] arr3 = {'a', 'd', 'g', 'h', 'j', 'm', 'z'}; 
	
			arr3 = SortDes(arr3);
	System.out.println(Arrays.toString(arr3));
	
	
	String [] names = {"Yasin", "Kerem","Arzu", "Ihsan Onur", "Adem", "Sema","Busra", "Abdullah"}; 
			  names = SortDes(names); 
	System.out.println(Arrays.toString(names));
}

	/*

	Warm up:
    write a return method that accepts an int array and sorts it in descending order
    write a return method that accepts a double array and sorts it in descending order
    write a return method that accepts a char array and sorts it in descending order
    write a return method that accepts a String array and sorts it in descending order
        Hint: method overloading is preferred here


	*/

	// Task 1 :

public static int[] SortDes(int [] arr) {
	
	Arrays.sort(arr); // ascending order
	
	int [] arr2 = new int [arr.length]; // contains all values of arr 
	
	int j=0; 
	for (int i =arr.length-1; i>=0; i-- ) {
		   arr2[j]= arr[i];
		   j++; 
	}
	
	return arr2; 
}
	// Task 2 : 

public static double[] SortDes(double [] arr) {

	Arrays.sort(arr); // ascending order
	
	double [] arr2 = new double [arr.length]; // contains all values of arr 
	
	int j=0; 
	for (int i =arr.length-1; i>=0; i-- ) {
		   arr2[j]= arr[i];
		   j++; 
	}
	
	return arr2;  
}

public static char[] SortDes(char [] arr) {

	Arrays.sort(arr); // ascending order
	
	char [] arr2 = new char [arr.length]; // contains all values of arr 
	
	int j=0; 
	for (int i =arr.length-1; i>=0; i-- ) {
		   arr2[j]= arr[i];
		   j++; 
	}
	
	return arr2;  
}
public static String[] SortDes(String [] arr) {

	Arrays.sort(arr); // ascending order
	
	String [] arr2 = new String [arr.length]; // contains all values of arr 
	
	int j=0; 
	for (int i =arr.length-1; i>=0; i-- ) {
		   arr2[j]= arr[i];
		   j++; 
	}
	
	return arr2;  
	
}

public static Integer[] SortDes(Integer [] arr) {

	Arrays.sort(arr); // ascending order
	
	Integer [] arr2 = new Integer [arr.length]; // contains all values of arr 
	
	int j=0; 
	for (int i =arr.length-1; i>=0; i-- ) {
		   arr2[j]= arr[i];
		   j++; 
	}
	
	return arr2;  
	
}
	









}