package Practice;

import java.util.Arrays;

public class methods {

	public static void main(String[] args) {
			
		EvenorOdd(987); 
		
		int z = 500; 
		
		EvenorOdd(z); 
		
		method(6, 6.5, 8); 
		
		method2(23, 68); 
		
		method3(2010); 
		
		EvenoneTo100();
		
		
		
		
		int [] numbers = new int [100]; 
		
		for (int i = 1; i<=100; i++) {
			numbers[i-1] =i; 
			// numbers[0] will be 1; 
			// numbers[1] will be 2;
			// numbers[99] will be 100; 
		}
		
		System.out.println(Arrays.toString(numbers));
		
		for (int each : numbers) {
			
			if (each%2!=0) {
				continue;
			}
			System.out.print(each + " ");	
		}
		
		
		
	}	
		
	 
	
	public static void EvenoneTo100() {
	
	
	for (int i =0; i<=100; i++) {
		if(i%2==0) {
			System.out.print(i+ " ");
		}
		}
	
	}
	public static void method(int a, double b, int c) {
		method2(87, 65); 
		
		double sum = a+b+c; 
		System.out.println(sum);
	}
	
	
	
	
	public static void method2(double x, double y) {
		
		if(x>y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
		
	}	
		public static void method3(double num) {
			
		double age; 
		
		age = 2019-num; 
			
		System.out.println(age);
		}
		
		
	public static void EvenorOdd(int num1) {
		if(num1%2==1) {
			System.out.println(num1 + " is the odd number");
		} else {
			System.out.println(num1 +" is even number");
		}
	}
		
		
	
		
		
		
		
		  
		
		
		
}
