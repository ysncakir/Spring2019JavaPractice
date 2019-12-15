package Practice;

public class MethodsReview {
	
	public static void main(String[] args) {
		for (int i =0; i<=5; i++) {
		method1(); 
		}
		
		method1(); 
		
		method3(); 
		
		method4("yasin");
		
		int max = method5 (9, 67); // we have to assign or print it out 
		
		System.out.println(max);
		
		// return den sonra bir sey yazamayiz, cunku return method dan cikisdir 
		
		String reverse= method6 ("ihsan");
		System.out.println(reverse);
		
		sum (9, 6);
		
		sum (9.7, 6.7);
		
		sum (9,8,7); 
		
		sum (8, 6L, false); 
		
		int total = sum (90, 786.9, (byte)56);
		
		System.out.println(total);
		
	}
	
	 
	
	/*
	 *  access-modifier    specifer    return type  methodName (parameter){
	 *  }
	 * 
	 */
	
	public static void method1() {
		System.out.println("Void method");
	}

	public static int method2() {  // can be all primitives and non-primitives
		return 5; 
	}

	public static void method3(){
		for (int i=1; i<=100; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
	}
	
	public static void method4 (String str) {
		String str2= ""; 
		for (int i=str.length()-1; i>=0; i--) {
			str2+=str.charAt(i); 
		}
		System.out.println(str2);
	}
	
	public static int method5 (int a, int b) {

		
		int largest =0; 
		if (a>b) {
			largest= a;
		} else {
			largest= b;
		}
		return largest; 
	}

	public static String method6 (String str) {
		String result ="";
		for (int i=str.length()-1; i>=0; i--) {
			result+=str.substring(i,i+1); 
		}
		
		return result; 
	}


	public static void sum (int a, int b) {
		System.out.println("sum is " + (a+b));
	}

	public static void sum (double a, double b) {
		System.out.println("sum is " + (a+b));
	}
	
	public static void sum (int a, int b, int c) {
		System.out.println("sum is " + (a+b+c));
	}

	public static void sum (double a, long b, boolean c) {
		System.out.println("data are " + a+ " "+ b+" "+ c);
	}

	public static int sum (int a, double b, byte c) {
		int sum = a+(int)b+c; 
		
		return sum; 
	}






}
