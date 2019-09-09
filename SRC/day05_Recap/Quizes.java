package day05_Recap;

public class Quizes {


	public static void main(String... args) { // main method is the entry point of java application
		
		
		/*
		
		
		multiple ways to declare main methods
		1. public static void main(String[] args) {}
		2. static public void main(String[] args) {}
		3. public static void main(String... args){}
		
		
		*/
		
		//int 7num = 10; cannot start with digits 
		
		
		// double num = 10l; 
				// long value can be assigned to double and float

		// range: double > float > long > int > short > byte
		

		// double b = 5.5f; // double is grater than float
		
		float num2 =10; 
		
		// float num3 = 5.5f; 
		
		//float num4 = 5.5; // double > float 
		
		double num = 10l; 
		System.out.println(num);
		System.out.println(num2); 
		
		
		int _variableName = 10; 
		int $variableName2 =20; 
		// int %VariableName3 = 40; // variable name cannot contain special character but _ at the beginning and between numbers is ok. 
		

		
		// 1,000,000 
		int accountNum= 1_000_000; 
		System.out.println(accountNum); 
		
		
		int iNum = 10; 
		long LNum = iNum; 
		
		long LNum2= 10L; 
		
		
		System.out.println(iNum); 
		System.out.println(LNum2);
		
		
		// char values declared as ''
		
		int myNum = '9'; 
		
		System.out.println(myNum); // numbers
		
		// int MyNum2 = 'AWS'; // char value must be single character 
		
		// boolean result = 'C'; // boolean takes true or false boolean expression 
		
		// pwd (print working directory): shows us which directory we are in
		
		
		int i = 100; 
		double d = 300l;
		float f= 200f; 
		
		// i = f; f is greater than i, 
		f = i; 
		d = f; 
		// f = d; double > float
		// i = d; double > int
		
		
		
		double nums1 = 10f; 
		
		// int int = 100; not possible since it is using java reserved words. 
		
		System.out.print("Hello");
		System.out.print(" Batch 12");
		System.out.println("Cybertek");
		System.out.println("School");
		
		
		/*
		 * \n(or\r)
		 * \t  horizontal tab
		 * \\: single slash
		 * \': single quote
		 * \": double quote
		 * 
		 */
		
		System.out.println("Today is great day \n \t Friday");
		System.out.println(" \tTomorrow is Saturday, it is a day off");
		System.out.println("\\");
		System.out.println("\'Game of Thrones\'");
		System.out.println(" I like to read the book called \"Game of Thrones\"");
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		

		
		
	
	}



}
