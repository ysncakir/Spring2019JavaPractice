package day24_Recap;

public class warmUp2 {

public static void main(String[] args) {
	
	
	/*	
	3. write a program that return the minimum value from an int array
	4. write a program that return the second minimum valye from an int array

	*/

	
	
	
	int [] arr = {20, 200, 30, 40, 50, 500, -2, -2}; 

	int min =99999999; // min=20, 
	
	for (int i=0; i<arr.length; i++) {
		
		if ( arr[i]<min ) {
			 min =arr[i]; 
		}
	}
	System.out.println(min);
	

	int secondMin =99999999; // min=20, 
	
	for (int j=0; j<arr.length; j++) {
		
		if ( arr[j]<secondMin && arr[j]>min ) {
			 secondMin =arr[j]; 
		}
	}
	
	System.out.println(secondMin);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
