package day24_Recap;

public class warmUp1 {

public static void main(String[] args) {
	
	
	 /*	1. write a program that can return the maximum value from an int array
		2. write a program that can return the second maximum value from an int array
		3. write a program that return the minimum value from an int array
		4. write a program that return the second minimum valye from an int array

	  */


// task 1:
	int [] arr = {20, 200, 30, 40, 50, 500}; 
	
	

	int max = 0 ; //max=20, 200, 500
	
	for (int i =0; i<arr.length; i++) {
		
		if (arr[i] > max) {
			max = arr[i]; 
		}
	}
	System.out.println("Maximum number is: "+ max);

// task 2
	int secondMax= 0; 
	
for (int j =0; j<arr.length; j++) {
		
		if (arr[j] > secondMax && arr[j]!= max) {
			secondMax = arr[j]; 
		}
}
	System.out.println("Second maximum number is:" + secondMax);
	
	










	}
}
