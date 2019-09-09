package day08_ShortHandOperators;

public class RelationalOperators {

	/* Relational Operators : return Boolean expression; 
	 * >  : greater than
	 * >= : greater than or equal to 
	 * <  : less than
	 * <= : less than or equal
	 * == : equal 
	 * != : not equal 
	 * 
	 * 
	 * 
	 */


public static void main(String[] args) {
	
	System.out.println(10>9);
	boolean resultA = 10> 9; 
	
	System.out.println(resultA);
	System.out.println(10>=9); // greater or equal
	
	boolean resultB= 10>=9; 
	System.out.println(resultB);
	
	boolean resultC = 10<=9; 
	System.out.println(resultC);
	
	boolean resultD= 1100 <1200;
	System.out.println(resultD);
	
	boolean resultE = 1000 < 1000; 
	System.out.println(resultE);
			
	boolean resultF = 1000 <= 1000; 
	System.out.println(resultF);
	
	
	
	
	boolean A = ! false ; 
	System.out.println(A);
	
	boolean B = ! true; 
	System.out.println(B);
	
	boolean C = ! false !=false; 
	System.out.println(C);
	
	
	
	// practice ! (not) : 
	
	boolean g = false; 
	System.out.println(g);
	
	System.out.println(! g);
	
	System.out.println(!true == false);
	
	
	
	boolean h = "Batch 12" == "Batch13"; 
	System.out.println(h);

	System.out.println( " batch12" != "Batch12");
	System.out.println("Kuzzat" == "bad guy");
	
	
	int Num = 198; 
	System.out.println(Num %= 2);
	
	byte byteNum = 30; 
	// int INum = INum + byteNum ; // we must give value to local variables . 
	
	
	String str; 
	// System.out.println(str);
	
	
	
}



}


