package day30_WrapperClass_ArrayList;

import java.util.Arrays;

public class WrapperClass {

	/*
		primitives 							wrapper class			Default Values
			byte			Auto-Boxing			byte					null
			short			==========>			Short					null
			int 							    Integer					null
			long 				    			Long					null
			float			  Unboxing			Float					null
			double 			<============		Double					null
			char								Character				null





	*/

	public static void main(String[] args) {
		
	int numInt = 10; 
	Integer numInteger =10; // wrapper class
	
	double numdouble = 5.5; 
	Double numDouble =5.5; // wrapper class
	
	long numlong =20L; 
	Long numLong =numlong; // Auto boxing ==> converting primitive to Auto-boxing
	
	System.out.println(numlong);
	System.out.println(numLong);
	
	
	Boolean Booelanresult = false; 
	boolean booleanResult = Booelanresult; // unboxing 
	
	
	char ch1= 'L'; 
	Character ch2 = ch1; // autoboxing
	
	char ch3 = ch1; // none
	
	char ch4 = ch2; // unboxing
	
	Character ch5 = ch2; // none
	
	System.out.println(ch1);
	System.out.println(ch2);
	System.out.println(ch3);
	System.out.println(ch4);
	System.out.println(ch5);

	Integer [] arr = new Integer [3]; 
	System.out.println(Arrays.toString(arr)); // default value is null
	
	
	
	int num1=10; 
	// num1.methdod(); primitives does not have methods; 
	
	Integer num2 = 20; 
		int x= 	num2.MAX_VALUE;
	
	
	
	
	
	
	
	
	}
	
}
