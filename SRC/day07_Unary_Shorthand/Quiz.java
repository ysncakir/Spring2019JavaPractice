package day07_Unary_Shorthand;

public class Quiz {

	public static void main(String[] args) {
		
		int a = 30; 
		int b = (byte)a;
		
		System.out.println(b);
		
		
		// QUESTION 3: 
		
		System.out.print("Result A" + 0 +1);
		
		// "Result A0" + 1 
		// "Result A01"
		
		
		System.out.println(";Result B" + (1) + (2));
		
		// Result B12
				
		
		System.out.println("Result B" + (1+2));
		// Result B3
		
		// QUESTION 4 
		
		System.out.print(" 5+2 = " + 3 + 4);
		// "5+2 = 3"+4
		// "5+2 = 3+4" 
		
		System.out.print( "; 5+2 =" + (3+4));
		// " 5+2 =" 7
		// " 5+2 =7" 
		
		// QUESTION 5 
		
		float FloatNum = 100.98765432F; 
		// short ShortNum = FloatNum; float is larger than short 
		short ShortNum = (byte) FloatNum; 
		
		System.out.println (ShortNum);
		
		// QUESTION 6 : 
		
		//byte BNum = 200; // byte max capacity is 127
		
		
		// QUESTION 9 
		
		long LNum = 3_000L; 
		double DNum = (float)LNum; // narrowing 
		int INum = (short)DNum ; // int, short, byte  
		
		
		
		System.out.println(INum % 1000);
						// 3000 %1000 // remainder  will be 0
		
		
		
		
				
		
		

				
	
		
		
	}
	
	

}
