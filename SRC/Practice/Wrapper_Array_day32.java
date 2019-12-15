package Practice;

import java.util.Arrays;

public class Wrapper_Array_day32 {
	
	// Wrapper class can only accept its own primitive values. 
	
	// Double ==>double, Integer==> int 

	public static void main(String[] args) {
		
	dosum (10.0, 20.0); 
	dosum(10, 20); 
	Integer x =10; 
	Integer y = 20; 
	dosum (x, y);
	
	int [] arr = {30, 20, 10, 5, 0};
	
	Arrays.sort(arr); 
	
	int count =0; 
	
	for (int i =0; i<arr.length; i++) {
		if (arr[i]==30) {
			continue; 
		}
		System.out.println(arr[i]+ " ");
	}
	
	int a = 5; 
	while (isAvailable(a)) {
		a--; 
		System.out.print(a); //43210
	}
	
	
	}
	public static int num (int a, int b) {
		return a+b;  // it exists the method 
		// System.out.println(a+b);
	}
	
	public static boolean isAvailable( int num) {
		return num-- >0 ? true : false ; 
		
		
	}
	
	
	public static void dosum (double x, double y) {
		System.out.println("double sum " + (x+y));
	}
	
	public static void dosum (int x, int y) {
		System.out.println("int sum " + (x+y));
	}
	
	public static void dosum (float x, float y) {
		System.out.println("float sum" + (x+y));
	}
	
	public static void dosum (Integer x, Integer y) {
		System.out.println("Integer sum " + (x+y));
	}
	
}
