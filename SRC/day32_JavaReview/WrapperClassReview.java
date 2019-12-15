package day32_JavaReview;

public class WrapperClassReview {

	/*  Primitives 					Wrapper Classes :  java.lang package
	 * 	byte							Byte
	 *  short		Unboxing			Short
	 *  int 		<========			Integer
	 *  long							Long
	 *  float							Float								
	 *  double		Autoboxing			Double
	 *  boolean		=========>			Boolean
	 * 	char							Character
	 * 
	 * Wrapper classes  have methods which means take object; primitive don't
	 * methods: Max_Values; Min_Values; parse methods; valueOf method
	 */


		public static void main(String[] args) {
			
			
			int a =10; 
			Integer b =10; // only accepts int primitive values 
			
			
			byte c= 20; 
			// Integer b2 = c; //  only accepts int primitive values 
			
			long L = b; // Integer is within the range of long
			
			
			
		// Max_Values : returns the max value of the data type 	
			
			int max = Integer.MAX_VALUE; 
		//	int max2 = Double.MAX_VALUE;  // int does not equal double
			System.out.println(max);
			System.out.println(Double.MAX_VALUE);
			System.out.println(Byte.MAX_VALUE);


		// Min_Values : returns the max value of the data type 	
			
			int min = Byte.MIN_VALUE; 
			int min2 = Short.MIN_VALUE; 
			System.out.println(min);
			System.out.println(min2);
			
			
			
			
			
		// parse method : converts String to primitives
			
			
			
			
			
			
			
			
		// ValueOf : converts String to wrapper class
			Integer num =  Integer.valueOf("123"); 
			System.out.println(num);
			
			
			int num2 = num; // unboxing
			
			byte num3 = Byte.valueOf("12"); 
			
			
			boolean R1 = Boolean.valueOf("True"); // unboxing
			System.out.println(R1);


			boolean result = 9 > 0+1; 
			
			Boolean result2 = result;  // auto boxing 
			
			boolean result3 = result2; // unboxing 

			Boolean result4 = result2; // none 
			
			boolean result5 = result3; // none 

		}

}
