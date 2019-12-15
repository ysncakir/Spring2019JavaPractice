package day23_Arrays;

public class ArraysClass {

public static void main(String[] args) {
	
	/*  Arrays : a variable that we can store multiple values
	 * 
	 * regular variable can only have one value; 
	 * 
	 * int a =10; 
	 * 
	 * Arrasys:
	 * 
	 * int[]        arr =        {10, 20,30, 40}; 
	 *  datatype	variablename	
	 *  
	 *  Each values (elements) in an array have their own index number
	 * Array is immutable and array's size can be fixed. 
	 */
	
	
	int[] arr = {10,20, 30, 40, 50}; 
	// index num: 0  1	 2	 3	 4
	// to retrive the data of the array; 
	// arr[4]==>50
	// arr[0] ==>10
	
	String [] names= {"yasin", "arzu", "ihsan", "kerem"};
	
	System.out.println(names[2]); 
	System.out.println(names[3]); 

	
	String son = names[3]; 
	String son2 = names[2];
	
	System.out.println(son+ " "+ son2);
	
	// System.out.println(names[4]);	does not give compile error, only out of border
	
	
	double[] myArray = {1,2,3,4,5,8,0,2}; 
			// index	0 1 2 3 4 5 6 7
	
	for (int i=0; i<8; i++) {
		System.out.print(myArray[i]+" ");
	}
	System.out.println();
	
	int [] numbers = {12, 24, 48, 96, 2, 3, 4, 5, 6, 7, 8, 9,10, 11}; 
	
	
	// length of array :
	
	int B = numbers.length; 
	
	
	System.out.println(B);
	int HighestIndexNum = numbers.length -1; 
	
	for (int i=0; i<numbers.length; i++) {
		System.out.print(numbers[i]+ " "); // or int s1 = numbers[i]; 
	}
	System.out.println();
	char [] myChars = {'A', 'B', 'C', 'D'}; 
	
	int HighestIndexNum2 = myChars.length -1; 
	System.out.println(HighestIndexNum2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
