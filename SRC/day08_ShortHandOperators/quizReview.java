package day08_ShortHandOperators;

public class quizReview {



public static void main(String[] args) {
	
	
	// Question 1 :
	
	int ivar = 100; 
	double dvar= 200; 
	float fvar = 300; 
	
	// ivar = fvar;  // float is greater than int
	
	dvar = fvar; 
	
	System.out.println(dvar);
	
	// fvar = dvar ; // double is greater than float 
	
	dvar = ivar; 
	
	// ivar = dvar; // double is greater than int 
	
	// Question 2 ; 
	
	String str1 = "Result A" + 7 *2; // "result A" + 14; 
	
	System.out.println(str1);
	
	String str2 = " Result A" + 8%2; // result A + 0 
	
	System.out.println(str2);
	
	// Question 4 ; 
	
	long L = 30L; 
	long L2 = (byte)L;// we can assign long, short, byte int
	
	System.out.println(L2);
	
	// double J, K, P = 10.5; // we have to assign all local variables
	
//	System.out.println(9/0);
	
	// question 6 : 
	
	float a = 100.987_6543f; 
	short S = (short) a; 
	byte B = (byte)S; 
			
	System.out.println(B);
	
	// Question 10 : 
	
	// 1,000,000,000 ==> 1_000_000_000
	
	long Lnum= 3_000L; 
	double Dnum = (float) Lnum; 
	
	System.out.println(Dnum);
	
	int Inum = (short) Dnum; 
	System.out.println(Inum%1000);// 0
			
	
	// Question 15; 
	
	int  x =  10;

	int  y =  x++;	// y= 10, x=11; 
			// post
	

	System.out.println( y++  + "  " +  x++  + "  " + y); // y = 11, x= 12
			//			10				11			 11
	
	System.out.println(x + " " + y); 
				
	

	
	
	

}




}
