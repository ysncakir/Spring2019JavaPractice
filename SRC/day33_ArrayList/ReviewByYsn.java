package day33_ArrayList;

import java.util.Arrays;

public class ReviewByYsn {



public static void main(String[] args) {
	
	int [] arr = {10, 20, 30,40,50,60,799,987, 1005}; 
	
		arr = SortDes(arr); 
		
	System.out.println(Arrays.toString(arr));
	
	double[] arr3 = {45.3, 34.6, 20.4, 12.4, 79.98, 10.7}; 
	
		arr3=SortDes(arr3);
	
	System.out.println(Arrays.toString(arr3));
}

public static int [] SortDes(int[] arr) {
	Arrays.sort(arr);
	
	int [] arr2= new int[arr.length];
	
	int j =0; 
	for (int i =arr.length-1; i>=0; i--) {
		arr2[j]=arr[i]; 
		j++; 
	}
	
	
	return arr2; 
	
	
	
}

public static double [] SortDes(double[]arr) {
	double [] arr2 = new double[arr.length];
	int j =0; 
	for (int i =arr.length-1; i>=0; i--) {
		arr2[j] = arr[i];
		j++; 
	}	
		
		return arr2; 
	}

public static Integer [] SortDes(Integer[]arr) {
	Integer [] arr2 = new Integer[arr.length];
	int j =0; 
	for (int i =arr.length-1; i>=0; i--) {
		arr2[j] = arr[i];
		j++; 
	}	
		
		return arr2; 
	}


	int i = Integer.parseInt("1234"); 
	


}