package day25_ArraysContinue;

public class WarmUp {

public static void main(String[] args) {
	
	// write a program that can print out the unique values from an int Array
	
	
	
	
	int [] arr = {1,1,2,2,2,2,2,3,4,5,4,8,7,9}; 
	
	
	
	for (int j=0; j< arr.length; j++) { // 
	
		int count = 0; // to find out how many time a value is appeared in the array
	
		for (int i=0; i<arr.length;i++) {
		if (arr[i]==arr[j]) { // compares each index of the array with the given value
		count++; // every time if the value is occured in the array,  count 
		}
	}
	

	if (count==1) { // if any of the index appears once, it will print that value out 
		System.out.println(arr[j]);
	}
		
	}
	
	
	
	// write a program that can print out the unique values from an int Array
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
