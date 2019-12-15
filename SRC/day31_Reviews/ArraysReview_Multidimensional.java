package day31_Reviews;

import java.util.Arrays;

import java.util.Scanner;

public class ArraysReview_Multidimensional {

		public static void main(String[] args) {
			
		/*
		 * n dimensional array : contains (n-1) dimensional array
		 */
			
			
		int [] arr1D = {1, 2, 3};
		
				//index    0 1 2    0 1 2
		int [][] arr2D = {{1,2,3}, {4,5,6}}; 
			
			// index		 0		  1
			
			
		System.out.println(arr2D.length); // 2	
			
		//print 2
		
		System.out.println(arr2D[0][1]);
		
		// {4,5,6}
		System.out.println(arr2D[1]); // will give hash code
		
		String str = Arrays.toString(arr2D[1]); 
		System.out.println(str);
		
		
		System.out.println(Arrays.deepToString(arr2D));
		
		char [] ch = {'a', 'b', 'c', 'd'}; 
		
		for (char each : ch) {
			
			if (each=='c') {
				continue; 
			}
			System.out.println(each + " ");
		}
		System.out.println();
		
		
		
		
		
		}
}
