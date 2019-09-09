package day13_Review;

public class QuizReview {

public static void main(String[] args) {
	
	//Q2:
	boolean resultA= 9>=9 || 10<=10,
			resultB= 'A'>=128 && 'B'<128;
	
	// resultA = true || true==> true
	// resuiltB= false && true==> false
			
			if(resultA) {
				// true
				if(resultB) {
					// false
					System.out.println(resultA);
				}
				else {
					System.out.println(resultA);
				}
				
				
				
				
				
			}
	
	
	// in Multibranch if statement else block is not mandatory. 
			
			
	
	// Q4; 
			int num = 9; 
			if (++num<10) {
				// 10 <10 false==> else statement will be executed
				System.out.println(num+"Hello World");
			} else {
				System.out.println(num+ "Hello Universe");
			}
	
			int num2 = 9; 
			if (++num2<10) {
				// 9 <10 true==> if statement will be executed
				System.out.println(num2+"Hello World");
			} else {
				System.out.println(num2+ "Hello Universe");
			}
	
	// Q5:
			
			int x = 1, y=0;
			if(x++>++y) {
			//	1  > 1 ==> false 
				System.out.print("Hello");
			} else {
				System.out.print("Welcome");
			}
			System.out.println("Log"+ x + ":"+ y);
							//		  2	       1
	
	
			float flt= 100; 
			System.out.println(flt);
	
			
	// Q7:
			
			if (true) {
				System.out.println("1");
			}
			if (true) {
				System.out.println("2");
			}
			if (true) {
				System.out.println("3");
			}
			
			
			
			
			
			if (true) {							// only one of them will be executed
				System.out.println("1");
			}
			else if(true) {
				System.out.println("2");
			}
			else if(true) {
				System.out.println("3");
			}
			
			
			boolean Result = true; 
			int N=100; 
			if (Result) {
				// true
				N/=10;			// 10
				Result =!Result; // false
			} 
			else {
				N -=5; // 10-5=5
			}
	
	
	
	
	// Q10; 
			
			int n1 = 'B'; 
				System.out.println(n1);
				System.out.println('B');
				
				if (n1>128|| n1<=129){
				// false  ||		true ==>true
					System.out.println('B');
				} 
				else {
					System.out.println('A');
				}
				
				
	
	
	
	
	
	
	
	
	
	}
}
