package Practice;

import java.util.Arrays;

public class returnMethod {

	
	public static void main(String[] args) {
		
		String str = name(); // String value
		
		
		System.out.println(str);
		
		byte a = (byte)num(); // it was int
		System.out.println(a);
		
		
		sum (10,20); 
		
		int sum1= addition(18, 23);
		System.out.println(sum1);
		System.out.println(addition(10,20));
		
		
		double Max= max(76, 200, 98);
		System.out.println(Max);
		
		System.out.println(max(76, 200, 98));
		
		 
		int [] arr = {20, 30, 1, 2 ,3, 5, 9} ;
		
		int maxArray=maximum(arr); 
		
		System.out.println(maxArray);
		
		
		int [] arr2 = {1000, 4000, 35000, 658, -1, 87}; 
		
		System.out.println(maximum(arr2));
		
		
		String [] names = {"Yasin", "Akerke", "Abdurrahman", "Arzu"};
	
		
		longest(names); 
		
		System.out.println(longest(names));
		
		
		int [] array = {1,2,3,4,5,6,7}; 
		
		int [] nums = sortDes(array); 
		
		System.out.println(Arrays.toString(nums));
	}
	
	
	
	
	public static void method1() {
		System.out.println("Hello");
	}
	
	
	public static String name() {
		
		return  "Batch12";
	}
	
	
	public static boolean result() {
		
		return 10>9; 
	}

	public static int num () {
		
		return 3747; 
	}
	
	
	public static void sum (int a, int b) {
		
		System.out.println((a+b));
		
	}
	
	
	
	public static int addition (int x, int y) {
		
		return x+y; 
	}
	
	
	
	public static double max (int num1, int num2, int num3) {
		
		int [] arr = {num1, num2, num3};
		
		Arrays.sort(arr); 
		
		return arr[arr.length-1];
	}
	
	
	public static int maximum(int [] arr) {
		Arrays.sort(arr); 
		
		return arr[arr.length-1];
	}
	
	
	public static String longest (String [] arr) {
		
		String longWord = ""; 
		
		int max= 0; 
		 for(int i=0; i < arr.length; i++) {
	            if( arr[i].length()>max ) {
	                max = arr[i].length();
	                longWord = arr[i];
	            }
	        }
	         return longWord;
	         
	}
	 
	// write a method accepts int array and sorts it then returns an array 
	
	public static int [] sortDes (int []  arr) {
		Arrays.sort(arr); 
	
		
		int [] numbers = new int[arr.length]; 
		
		int z =0;
		for(int i =arr.length-1; i>=0; i--) {
			numbers[z] = arr[i]; 
			z++; 
			
			
		}
		return numbers;
	}
	
	
}
