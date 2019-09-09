package day05_Recap;

public class Primitives_Reviews {

/* Primitives :
 * 				byte:    only takes whole numbers
 * 				short:   only takes whole numbers
 * 				int(used more often):     only takes whole numbers
 * 				long:    only takes whole numbers
 * 
 * 
 * 				float:   can take decimals (must have F or f at the end of the number)
 * 				double (used more often) :  can take decimals
 * 
 * 
 * 				boolean:  true or false boolean expressions
 * 				char:	characters within single quote '' also takes number
 * 
 *  Range : Double > Float > Long > int > Short > Byte

  
 */
	
	public static void main(String[] args) {
		
		byte bNum = 127; 
		
		System.out.println(bNum);// java applications are executed from top to bottom.
		
		
			// byte range: -128 to 127
		
			// byte bNum2 = 126.5; // byte only takes whole numbers
		
			// short sNum = 126.5; // short only takes whole numbers
		
		short sNum2 = 1000; // only takes whole numbers
		
			// bNum = Snum2 short number is greater than byte number
		
		sNum2 = bNum; 	// sNum2= 127
		
		System.out.println(sNum2);
		
		short sNum3 = 127; 
		// byte bNum5 = sNum3;  short is greater than byte
				
		
		
// int :		
		int intNum = 100; 
		//int intNum2= 100.5; // int takes whole numbers only
		
		// byte ByteNum = intNum; // int > byte 
		// short ShortNum = intNum; // int > short
		
		short ShortNum2 = 105; 
		
		System.out.println(intNum); // 100 from top to bottom rule  

		
		intNum = ShortNum2;
		
		System.out.println(intNum);
		
		
// Long
		long LongNum = 100L; 
		long LongNum2= 100l; 
		
		// byte ByteNum3= LongNum; // long > byte
		// short ShortNum4= 100l;  // l comes with long value
		// int IntNum3 = 100L;     // l comes with long value
		
		
		byte a=10; 
		int b=30;
		short c= 40; 
		
		long longNum = a; 
		long longNum2 = b; 
		long longNum3 = c; 
		
		System.out.println(longNum);
		System.out.println(longNum2);
		System.out.println(longNum3); 

		
		
		float floatNumber= 10.5f; 
		float floatNumber2 = 20.5f; 
		
		short a1= 10;  byte b1= 20;    long c1= 30;    int d1= 40; 
		
		float Floats= a1; 
		float Floats2 = b1; 
		float Floats3 = c1; 
		float Floats4 = d1; 
		
		System.out.println(Floats); 
		System.out.println(Floats2);
		System.out.println(Floats3);
		System.out.println(Floats4);
		
// double : takes all the primitives 
		
		double doubleNum1 = 10l; // long is smaller than double 
		
		double doubleNum2 = 10.5f; 
		
// boolean:
		
		boolean result = true; 
		boolean result2 = false; 
		
		boolean result3 = 9 > 10; 
		System.out.println(result3);
		
		
// char: takes characters within single quote 
		
		char character1 = 'A'; 
		System.out.println( character1);
		
		// char character2 = A; 
		// char character3 = 'AA'; only one character can be accepted; 
		
		char charvalue = 98; 
		System.out.println(charvalue);
		
		int num3 = 'B';
		System.out.println(num3);
		
		float fnum = 'B'; 
		System.out.println(fnum);
		
		byte bValue = 'B';
		System.out.println(bValue);
		
		float fnum2 = 5.5f; // 5.5
		float fnum3= 5; // 5.0
		
		char specialcharacter = 55000; 
		System.out.println(specialcharacter);
		
		
		// practices :
		
		/*
		 * 8, 9, #, @, 8.5, 5.5F
		 * 
		 * 128, 40000, 9 >10 , true, false
		  
		 */
		
		byte Bnum = 8;         long lNum =8l ; 
		short Snum = 8;        float fNum = 8f;
		int iNum = 8;   	   double dNum = 8;  	
		
		char character = '8'; 
		
		System.out.println(Bnum);
		System.out.println(Snum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(character);
		
		
		// # & @ :
		
		char character2 = '#'; 
		char character3 = '@';
		System.out.println(character2);
		System.out.println(character3);
	
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
