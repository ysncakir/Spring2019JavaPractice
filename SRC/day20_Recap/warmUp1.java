package day20_Recap;

public class warmUp1 {

public static void main(String[] args) {
	
	
	// task 1:
	int sum1 = 0; 
	
	for (int i =1; i <=1000; i++) { // i: 1~1000
		sum1 += i; 
	}
	System.out.println("sum of all numbers: "+ sum1);
	
	// task 2
	
	
	int sum2 = 0; 
	
	for (int i =1; i <=1000; i++) { // i: 1~1000
		if (i%2==0) {
		sum2 += i; }
	}
	System.out.println("sum of all even numbers: "+ sum2);
	
	//task2 method2;
	
	int Sum2 = 0; 
	
	for (int i =2; i <=1000; i+=2) { // i: 1~1000
		Sum2 += i; 
	}
	System.out.println("sum of all even numbers: "+ Sum2);
		
	// task 3
	
	
		int sum3 = 0; 
		
		for (int i =1; i <1000; i++) { // i: 1~1000
			if (i%2==1) {
			sum3 += i; }
		}
		System.out.println("sum of all odd numbers: "+ sum3);
		
		// second method
		
		int Sum3= 0; 
		for (int i = 1; i <1000; i+=2) {
			Sum3 +=i;
		}
		System.out.println("sum of all odd numbers: "+ Sum3);




	}
}