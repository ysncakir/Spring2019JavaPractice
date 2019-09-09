package day08_ShortHandOperators;

public class ShortHand {

public static void main(String[] args) {
	
	/*
	 * += addition assignment     x+=y ==> x = x+y
	 * -= subtraction assignment  x-=y ==> x = x-y
	 * *= multiplication assignment x *= y ==> x = x*y
	 * /= division assignmnet 		x /= y ==> x = x/y
	 * %= remainder assignment		x %= y ==> x = x % y
	 * remainder cannot be negative 
	 *
	 * 
	 * 
	 */
	
	int a = 9; 
	  //  a = a +3;  
	   a += 3; //12
	
	   System.out.println(a);
	
	
	int b =  a += 5; // a =12+5
		System.out.println(b);
	
	
	int c = a+= b; // a= 17 ; b = 17;  
		System.out.println(c); // a =34; b = 17, c=34; 
	
	int d = a + c;  // 34 +34 
		System.out.println(d); // a = 68 b = 17 c = 34 d =68; 
		
	int e = (d+=b) * 2; // d= 85, b= 17; 
	
		System.out.println(e);
		System.out.println(d);
		System.out.println(b);
		System.out.println(c);
	
	int f = b += d * 2 ; 
		System.out.println(f); // b = 187 
	
	
	// subtraction; 
	
	int g = 101; 
	int h = g -=1; 
		System.out.println(h); // h= 100; g =100
		System.out.println(g);
	
	
	int i = g +=h+ 5; // 205 i = 205 ; g = 205
		System.out.println(i);
	
	int j = h +=g % i; 
		//  100 205 % 205	
		//  100 + 0
	
		System.out.println(j);
		
	int k = j -= h *2 % 5; // j =100
	//		j -= 200 % 5; 
	//		100-=0 
	
		System.out.println(k);
	
	// Multiplication ; 

	
	int A = 100; 
		A *= 200; // 100*200
		
		System.out.println(A); // 20000
		
		int B = 100 ; 
			B *= 100 / 10; 
			
		System.out.println(B); // 1000
		
		
	B *= B-= 1000; 
	// 1000 * (1000-1000)
		System.out.println(B);
	
	int C = 1000; 
		C /= 5; 
		
		System.out.println(C);
	
	int D =10; 
		// C /= D-10; // denominator cannot be 0 
	
		System.out.println(C);
		
		C /= D+10; 
		
		System.out.println(C); // 200/2
		
		int Z = 10 % 3; // 10/3 = 3... remainder; 1
		System.out.println(Z);
		int E = 10; 
		
		E %=2; 
		System.out.println(E);
		
		
		int F = 100; 
			F %= 2; // F = F %2 = 0 
		System.out.println(F);	// if it is zero, it is even number 
		
		System.out.println(-100%3);
		System.out.println(10.5 %3);	// 10.5 - 9 
		
		
		int J = 300; 
		int K = 10; 
		J += J %= K; 
		
		System.out.println(J);
		
		
		
			
		
		
	
	
	
}




}
