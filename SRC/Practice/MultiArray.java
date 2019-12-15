package Practice;

import java.util.Arrays;

public class MultiArray {
	
	// n dimensional array : contains (n-1) dimensional arrays
	
	public static void main(String[] args) {
		
	
			int [] arr1D = {1,2,3};
			int [][] arr2D = {{1,2,3}, {4,5,6}};
			
			System.out.println(arr2D.length); //2 
			
			
			System.out.println(arr2D[0][2]);
			
			System.out.println(Arrays.toString(arr2D[1])); // 
			
			System.out.println(Arrays.deepToString(arr2D));
			
		
			
			char [] ch = {'a','b', 'c', 'd'}; 
			
			for (char each : ch) {
				if (each =='c') {
					continue; // skip c, does not accept any statement after it 
					
				}
				System.out.print(each+ " ");
			}
			
			
			System.out.println();
			
			String [] [] names = {{"Yasin", "Arzu", "John"}, {"Ihsan", "Kerem"}}; 
			
			for ( String [] each: names) {
				// System.out.println(Arrays.toString(each));
				for (String eachValue: each) {
					if (eachValue.equals("John")) {
						continue;
					}
					System.out.print (eachValue+ " ");
				}
				
			}
			
			
			
			
			
			
	}
}
