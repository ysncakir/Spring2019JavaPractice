package Practice;

public class WrapperClass {
	
	/*		primitives 							wrapper classes 
	 * 			byte			Unboxing			Byte
	 * 			short	<=================			Short
	 * 			int									Integer
	 * 			long								Long
	 * 			float								Float
	 * 			double 		Autoboxing						Double
	 * 			boolean	=================>		    Boolean
	 * 			char								Character
	 */

	
	int b = 12; 
	Integer a =10; 
	
	Integer a2 = b; 
	// Integer a2 = c; // not possible to assign another class 
	
	
	int d = a2; // this is possible 
	
	boolean result = 9>10; 
	Boolean result2 = result; // auto boxing ==>ASSIGNING PRIMITIVE TO WRAPPER CLASS
	
	boolean result3 = result2; // un-boxing ==> assigning Wrapper class to primitive
	
	
	// max_Value
	
	
	
	public static void main(String[] args) {
		int max = Integer.MAX_VALUE; 
		System.out.println(max);
		
		
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		
		int min = Integer.MIN_VALUE; 
		System.out.println(min);
		
		int min2 = Byte.MIN_VALUE; 
		
		System.out.println(min2);
		
		
		// parse ==> Converts String to primitive
		
		String str = "1234"; 
		
		short s1 = Short.parseShort(str); 
		System.out.println(s1 +1 );
		
		double d1= Double.parseDouble("78.5"); 
		Double d2 = Double.parseDouble("78.5"); // autoboxing, converting primitive to Wrapper 
		
		boolean r1 = Boolean.parseBoolean("tRue"); 
		System.out.println(!r1);
		
		boolean r2 = Boolean.parseBoolean("break"); 
		System.out.println(r2);
		
		
		// ValueOf ==> Converts String to Wrapper Class
		
		Integer num = Integer.valueOf("123"); 
		System.out.println(num); // Integer 
		
		byte num2 = Byte.valueOf("12"); // un-boxing 
		
}
	
	
	
	
	
	
	
}
