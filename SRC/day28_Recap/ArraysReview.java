package day28_Recap;

import java.util.Arrays;

public class ArraysReview {

public static void main(String[] args) {
		
	
/*
 single dimensional array: 
	int [] arr1D = {1, 2, 3,4}; 
	int arr1D [] = {1, 2, 3,4}; 
	int [] arr1D = new int[]{1,2,3,4}; 
*/


int [] arr1D = {1, 2, 3,4}; 
// index===>	0  1  2 3

System.out.println(arr1D[2]);//3



int [] arr = new int [3]; // max size is 3, cannot contain more than 3
arr[1] = 20; 
arr[0] = 30; 
arr[2] = 40; 
System.out.println(Arrays.toString(arr)); // [0, 0, 0] if do not initialize array any value


int [] numbers = { 10, 20, 30, 40}; 

for (int eachValues: numbers) {
	if(eachValues ==20) {
	continue; // skips every single statement after continue
	
	}
	
	System.out.print(eachValues + " ");
	break; // exists the loop immediately
}

System.out.println();

int [] nums = {100, 200, 300, 400}; 
for (int i=0; i<nums.length; i++) {
	if(nums[i]==300) {
	break;
	}
	System.out.println(nums[i]);
	/*
	 * if(nums[i]==300) {
		break;       // 100 200 300
	}
	 */
}	
	/*
	 * Arrays util class : toString(), sort(), deeptoString()
	 * 
	 * toString: converts single dimensional array to String
	 * sort(): sorts single dimensional array in ascending order
	 * deepToString(); converting Multi-dimensional array to String
	 */


	// sort:

	long [] Larr = {20, 400, 500, 3000, 10, 25}; 

	Arrays.sort(Larr); 
	
	System.out.println(Arrays.toString(Larr));



	// deepToString(); 
	
	int [][] arr2D = {{1, 2}, {3,4}}; 
	// index=====>       0		1

	System.out.println(Arrays.deepToString(arr2D));
	
// 	int 2nd array : index number of 1D arrays	
	
	// print 3,4 
	
	System.out.println(arr2D[1]); // needs to be converted to String
	System.out.println(Arrays.toString(arr2D[1]));
	
	
	// print 4:
	
	System.out.println(arr2D[1][1]); // needs to be converted to String

	
	
	for (int [] each1DArray : arr2D) {
		for ( int eachValue: each1DArray ) {
		System.out.println(eachValue);	
		} 
		// System.out.println(Arrays.toString(each1DArray));
		
		
	}
	
	
	
	
	
	
	

	}
}