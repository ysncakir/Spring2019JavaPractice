package day07_Unary_Shorthand;

public class UnaryOperators {

public static void main(String[] args) {
	
	
	/* 
	 * + : Positive
	 * - : Negative
	 * ++: Increment 
	 * -- : Decrement 
	 */
	
	int a = 10; 
	int b = -10; 
	
	System.out.println(b);
	
	int c = +b;// + (-10) 
	
	System.out.println(c);
	
	int d = -c; 
	
	System.out.println(d);
	
	int f = - (10); 
	System.out.println(f);
	
	// increment : increases the value by 1. Increments are :
			// 1. Post increment : operator is placed after the variable; (pass the current value first, then it will be incremented by 1)
			// 2. pre increment : operator is placed before the variable; (immediately)
	
		int num1 = 100; 
		++ num1; // 101
		System.out.println(num1); // num1 +1 
		int num2 = ++num1;
		System.out.println(num2);
		
		
		int IntNum = 100; 
		System.out.println(IntNum++);
		System.out.println(IntNum);
		
		int x = 100; 
		int y = x++ -1; 
		
		// y = 100 - 1; 
		
		System.out.println(y);
		
	
	
	
	// decrement : decreases the value by 1. There are two types of decrement. 
				// 1. pre-decrement : operator is placed before the variable and decreases the value immediately. 
		
				// 2. Post-decremetn : operator is placed after the variable and first it will pass current value. 
		
		int Z= 100; 
		System.out.println(--Z);
		
		int Y = 95; 
		System.out.println(Y--);
		System.out.println(Y);
		
		int T = 25; 
		
		System.out.println(++T);
		System.out.println(--T);
		
		int A= 50; 
		A = --A + A++ + A-- + A++; 
		//  = pre post  post  post
		//  = 49 + 49+  50 + 49; 
		// 98 + 50 + 49
		// 148 + 49
		// 197 
		System.out.println(A);
		
		
	
	
} 
}


