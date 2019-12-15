package Practice;

import java.util.Arrays;

public class InterviewQuestions {

	// Find Max Number of Array
	
	
	public static int MaxNum (int [] n) {
		
		int max= Integer.MIN_VALUE;
		
		for(int each: n ) {
			if(each>max) {
				max=each;
			}
		}
		
		return max; 
		
	}
	
	public static int MaxNumber (int [] x) {
		
		Arrays.sort(x);
		int max = x[x.length-1];
		
		return max;
		
	}
	
	// Find the unique values
	
	public static String Unique(String str) {
		
		String [] arr = str.split("");
		String UniqueValues = "";
		
	for(int j=0; j<arr.length; j++) {	
		int num=0;
		for (int i =0; i<arr.length; i++) {
			if (arr[i] == arr[j]) {
				num++;
			}
		}
		if(num==1);
		UniqueValues+=arr[j];
	}	
		
		return UniqueValues;
	}
		
	
	// Numbers-FINRA
	
	public static void FINRA() {
		String result ="";
		
		for(int i=1; i<=30; i++) {
			result+= (i%3==0 && i%5==0)?"FINRA ": (i%3==0)?"FIN ": (i%5==0)?"RA ": i+" ";
			
		}
		
		System.out.println(result);
	}
	
 
	
	
	
	/*
	 * Write a method which prints out the numbers from 
	 * 1 to 30 but for numbers which are a multiple of 3, 
	 * print "FIN" instead of the number and for numbers which are a multiple of 5, 
	 * print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, 
	 * print "FINRA" instead of the number.
	 * 
	 * 
	 * 
	 */
	
	public static void method1() {
		String result2 ="";
		
	for (int i =1; i<=30; i++) {
	
		
		result2+= (i%3==0 &&i%5==0)?"FINRA ":(i%3==0)?"FIN ": (i%5==0)?"RA ":i+" ";
		
	
	}
	
	
	System.out.print(result2);
	
	}
	
	
	public static void main(String[] args) {
		
		method1();
	}
	
	
	
	}
	
	
	
	
	

