package day25_ArraysContinue;

import java.util.Arrays;

public class ArraysMethods {

public static void main(String[] args) {
	
	
	

	// Arrays.toString(variablename): converts an array to string value
	

	// Arrays class is presented in Arrays class.  


		String [] names = {"yasin", "arzu", "ihsan onur", "kerem"}; 
		
		System.out.println(names[0]);

		System.out.println(Arrays.toString(names));

	/*
	 * Arrays.sort(variablenme); 
	 * 		sorts values of the arrays in acsending order (smallest to largest)
	 */
		int [] numbers = {9,8,100, 300, 4, 5, 6}; 
		
		System.out.println(Arrays.toString(numbers));

		
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("Maximum: "+ numbers[numbers.length-1]);
		
		System.out.println("Minimum: "+ numbers[0]);
	



		String [] nameList = {"Alma", "Enes", "Mira", "Smith", "Sarah", "Ihsan", "Abdullah"}; 

		Arrays.sort(nameList); 
		
		System.out.println(Arrays.toString(nameList));
		



		char [] ch = {'0', '9', '8', '5', '3', '2', '1'}; 

		Arrays.sort(ch); 
		System.out.println(Arrays.toString(ch));
		
		System.out.println(ch);

		int [] arr = {2000, 90, 89, 78, 65, 5555, 444, -5 };

		Arrays.sort(arr); // smallest to largest
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("minimum number is: " + arr[0]);
		System.out.println("maximum number is: " + arr[arr.length-1]);
		System.out.println("Second maximum number is "+ arr[arr.length-2]);
		System.out.println("Second minimum number is: " + arr[1]);
		

		// write a program that can sort the arrays in Decsending order (largest to smallest)

		int [] myNumbers = { 99, 10, 200, 3000, 40, 50, 5000};
		Arrays.sort(myNumbers);
		// 10, 40, 50, 99, 200, 3000, 5000
// index    0   1   2   3   4    5     6
		System.out.println(Arrays.toString(myNumbers));
		String result ="["; 
		
		for (int i=myNumbers.length-1; i>=0; i--) {
			result+= myNumbers[i] +", "; 
		}
		
		result = result.trim().substring(0, result.length()-2); 
		result = result+"]"; 
		 
		System.out.println(result);
		
		
		int[] arr2 = { 99,10,200, 3000, 40, 50, 5000};
        Arrays.sort(arr2);  //  array will be sorted in Acsending order
    //  arr2 -> [10, 40, 50, 99, 200, 3000, 5000]
        //        0  1   2    3   4    5     6
        
        int[] Decedning = new int[arr2.length];
        /*
            Descending[0] = arr2[6];
            Descending[1] = arr2[5];
            Descending[2] = arr2[4];
            Descending[3] = arr2[3];
            Descending[4] = arr2[2];
            Descending[5] = arr2[1];
            Descending[6] = arr2[0];
        */
        
        int z=0;
        for(int i = arr2.length-1; i >=0; i-- ) {
            Decedning[ z ] = arr2[i];
            z++;
        }
        
        System.out.println( "Acsending order: "+ Arrays.toString(arr2));
    
        System.out.println("Descedning order: "+Arrays.toString(Decedning));
                
                
                
                
                
        
		
		
	}



}
