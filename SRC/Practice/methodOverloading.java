package Practice;

import java.util.Arrays;

public class methodOverloading {

	
	// multiples methods within the same method name, different parameters

	public static void main(String[] args) {
		
		
		double  total =sum (8, 7, 7); 
		System.out.println(total);
		
		int total2 = sum(9,6); 
		System.out.println(sum(9, 6));
		System.out.println(total2);
		

		System.out.println(sum(8.7, 3.2));
		
		
		int [] arr = {3,4,5,6,7};
		Sort(arr); 
		
		char [] arr2 = {'a', 'b', 'c'};
		Sort(arr2); 
	}
	
	
	
	
	public static int sum (int a, int b) {
		int sum = a+b; 
		return sum;
	}

	public static int sum (int a, int b, int c) {
		return a+b+c;
	}


	// public static int sum (int a, int b) {
		//return a+b;
	
	public static double sum (double a, double b) {
		return a+b;
		
	}


	public static void Sort (int [] arr) {
		
		Arrays.sort(arr);
		
		for (int i= arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
			
		}
		
	}

public static void Sort (char [] arr) {
		
		Arrays.sort(arr);
		
		for (int i= arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
			
		}
		
	}
	
	
}















