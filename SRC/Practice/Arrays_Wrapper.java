package Practice;

import java.util.Arrays;

public class Arrays_Wrapper {

	public static void main(String[] args) {
		int num =10; 
		
		int [] arr = {10}; // size of 1 
		
		//arr[1] = 20; 
		
		// System.out.println(arr[1]); // out of size
		
		int [] numbers = new int [2]; // 0, 0 
	
		numbers [0] = 1; 
		numbers [1] = 2; 
		
		
		System.out.println(numbers[1]);
		
		String [] cars = new String [5]; 
		
		cars[0] = "toyota"; 
		cars[1] = "tesla"; 
		cars[2] = "infiniti"; 
		cars[3] = "subaru"; 
		cars[4] = "honda"; 
		
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+ " ");
		}
		
		System.out.println();
		
		
		cars = new String [10]; 
	
		cars[5] = "ford"; 
		
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+ " ");
		}
		System.out.println();
		
		boolean [] bool = {10>9, "Mikray".equals("Yasin")}; 
		
		boolean b1 = bool[0]; 
		
		boolean b2 = bool[1]; 
		
		System.out.println(b2);
		
		System.out.println(Arrays.toString(bool));
		
		String str  = Arrays.toString(bool);
		
		System.out.println(str);
		
		double [] dArray= {1000, 900, 800, 799, 688}; 
		
		Arrays.sort (dArray); 
		
		System.out.println(Arrays.toString(dArray)); 
		
		
		int [] Numbers = {200, 300, 20, 7890, 40, -9, -1000}; 
		
		Arrays.sort(Numbers); 
		System.out.println(Arrays.toString(Numbers));
		
		
		String result = ""; 
		for (int i =Numbers.length-1; i>=0; i--) {
			result += Numbers[i]+ ", ";
			
		}
		result = result.trim();
		result = result.substring(0,result.lastIndexOf(",")); 
		System.out.println(result);
		
	}
	
	
	
}
