package day32_JavaReview;

public class OverLoadMethodReview {


	// same method names with different parameters
	// return type of overload does not matter


public static void main(String[] args) {
	
	sum(9.8, 18.7); 
	sum(3, 5, 12); 
	sum(10, 10, 10<20);
	
	int total = sum(10, 10.5, (byte)10);
}

public static void sum(int a, int b) {
	System.out.println("sum is " +(a+b));
}

public static void sum(double a, double b) {
	System.out.println("sum is " +(a+b));
}


public static void sum(int a, int b, int c) {
	System.out.println("sum is " +(a+b+c));
}

public static void sum(double a, long b, boolean c) {
	System.out.println("You have entered  " +a+" "+b+ " "+c);
}


public static int sum(int a, double b, byte c) {
	int sum = a + (int)b+ c; 
	return sum; 
}










}
