package day31_Reviews;

import java.util.Arrays;;

public class ArraysReview {

public static void main(String[] args) {
			
			
	// Array = stores multiple data 		
			
	int num =10; 
	
	//Declaration of Array
	
	int [] arr = {10}; // size of 1 
	// arr[1] = 20; // arrays size is fixed
	// System.out.println(arr[1]);// compile error
	
	// initializing the array size
	int [] arr2 = new int [2]; //[0, 0]
	
	System.out.println(arr2[0]); // default value of array is 0
			
	System.out.println(arr2[1]); // default value of array is 0		
			
	// System.out.println(arr2[2]); // there is no index 2		
			
			
			
	String [] cars = new String [5]; 		
			
		cars[4]= "Subaru"; 	
		cars[2]= "Toyota"; 
		cars[1]= "Audi"; 
		cars[3]= "Jeep";
		cars[0]= "Tesla"; 
		
		for (int i =0; i<=cars.length-1;i++ ) {
			System.out.print(cars[i] + " " );
		}
		System.out.println();
			
		cars = new String [10]; 
				// {Mercedes, BMW, Fiat, Volvo, Renault}; 	
			
		cars[5] = "Mercedes"; 
		
		
		for (int i =0; i<=cars.length-1;i++ ) {
			System.out.print(cars[i] + " " );
		}	
			System.out.println();
			
		boolean [] bool = {10>9, "Yasin".equals("Seyfo"), 10==10}; 
		boolean b1= bool[0]; 
		boolean b2= bool[1]; 
		
		System.out.println(b1);
		System.out.println(b2);	
			
		// Arrays.toString (arrayVariable): Converts array to String	
		System.out.println(bool);	 // hashcode
		
		String str = Arrays.toString(bool); 
		System.out.println(str);
			
		// Arrays.sort(); 
		double [] dArray = {1000, 900, 800, 700, 600}; 
		System.out.println(Arrays.toString(dArray));
		Arrays.sort(dArray); 
		
		System.out.println(Arrays.toString(dArray));
		
		
		
		
		// print each values of the given array in descending order
		
		int [] numbers= {200, 300, 20, 7890, 40, -9, -100}; 
		
		Arrays.sort(numbers); 
		String result = ""; 
		for (int i = numbers.length-1; i>=0; i--) {
			result+=(numbers[i]+ ", ");
			
		}
		
		result = result.substring(0, result.lastIndexOf(","));
		System.out.println(result);
		
		
		
		
		
		
		}
}
