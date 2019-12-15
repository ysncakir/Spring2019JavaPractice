package day32_JavaReview;

import java.util.Arrays;

public class AssesmentQuiz {
	// Assessment Quiz 8
	
	
	public static void main(String[] args) {
		
		int num2 = 5; 
		
		while (isAvailable(num2)) {
					//	num2>0					========> Q8 
			
			System.out.print(num2 + " ");
			num2--; 
			
		}
		
		System.out.println();
		
		// Q4; 
		
		int [] arr= {30, 20, 10, 5, 0}; 
		Arrays.sort(arr); // {0, 5, 10, 20, 30}
		int count =0; 
		for(int i=0; i<arr.length; i++) {
			count++; 
			if(arr[i]==30) {
				continue;  // break // return
				//count++; // after continue or break or return, you cannot give any statement
							// Unreachable error
				
			}
			System.out.print(arr[i]+ " ");
			
		}
		
		
		System.out.println();
		
		// Q5;
		
		int [] numbers = { 1, 2, 3, 4};
		
		int max = findmax(numbers); 
		
		
		// Q11: 
		
		dosum(10.0, 20.0); // double sum 
		
		Integer a =10, b=20;
		doSum(a, b);
		
		byte a1=10; 
		Double a2 = (double)a1; // auto boxing ==> wrapper class accepts only its own primitive values
										//	==> primitive accepts any primitive as long as range is all right 
		Integer b1 = 30; 
		long b2 = b1; 		
		
		Integer c1 = 10; 
		
		
	}
	
	public static int findmax (int[]numbers) {
		int max = 0; 
		
	return max; 
	
	
	}
	
	
	public static int num (int a, int b) {
		
		return a+b; 
		// System.out.println(""); // cannot write anything under return statement
		
		
	}
	
	//Q8: 
	
	public static boolean isAvailable (int num) {
		
		return num-->0 ? true : false ; 
		
		
	}
	
	// Q11: 
		// dosum (10, 20): int sum
		// dosum (10.0, 20.0) double sum
		// Integer a =10, b=20; 
	
		public static void dosum(double x, double y) {
        System.out.println("double sum is "+(x+y));
		} 
		
		public static void doSum(Integer x, Integer y) {
         System.out.println("Integer sum is "+(x+y));
		}

		public static void dosum(float x, float y) {
          System.out.println("float sum is "+(x+y));
		}

		public static void dosum(int x, int y) {
            System.out.println("int sum is "+(x+y));
       }

	
	
	
	
}
