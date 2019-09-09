package day06_AritmaticOperator;

public class AritmaticOperators {

	
		/* 
		 * + : addition, adds two numbers together
		 * - : subtraction, subtracts a number from another number
		 * * : multiplication: multiplies
		 * / : division: divides
		 * 
		 */


public static void main(String[] args) {
	
	int a = 100; 
	int b = a-400; // -300
	
	System.out.println(b);
	
	int c = a+b; 
	
	System.out.println(a+b);
	
	int x=3, y=5, z= x*y;
	System.out.println(z);// 15
	
	int length = 100, 
		width = 10, 
		Area = length/width; 
	
	System.out.println(Area);
	
	short Number1 = 10 / 3;
	System.out.println(Number1);

	double Number2 = 10 / 3f; // or 10 / 3.0 or 10.0 / 3
	double Number3 = 10.0/ 4;
	System.out.println( Number2);
	System.out.println( Number3);

	
	// system always calculate as int number. So, int is default calculation tool. 
	
	
	int output = 12 + 6 / 3;
				// 12 + 2
	System.out.println(output);
	
	int output2 = 5 + 2 * 4;
	
	System.out.println(output2);
	
	//% remainder :
	
	/* 10/3 = 3 with remainder of 1 
	 * 12/5 = 2 with remainder of 2
	 * 20/3 = 6 with remainder of 2
	 * 
	 */
	
	int result1 = 10%3; 
	System.out.println(result1);
	
	// 20, 45, 65, 67, 68 
	// even : after being divided by 2 without remainder 
	// odd : divided by 2, will have remainder 
	
	System.out.println( 4+ 17%2 -1);
	
	System.out.println( 6 * 3 / 2); // first come first calculate // 9
	
	System.out.println( 1 +2- (2 +3)); // -2
	

}

}



