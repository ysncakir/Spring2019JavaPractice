package day32_JavaReview;

public class ReviewbyYsn {

public static void main(String[] args) {
	
	
	int num = Integer.parseInt("123"); 
	
	System.out.println(num+1);
	
	
	Integer number = Integer.valueOf("124");
	
	System.out.println(number+1);
	
	method1(); 
	method1(); 
	method2();
	method3("yasin");
	
	int max = largestNum(9, 67); // 
	System.out.println(max);
	
	Reverse("yasin"); 
	System.out.println(Reverse("yasin"));
	
	sum(3.5, 98L, 10<20);
	
	int total = sum(20, 10.5, 10); 
	System.out.println(total);
	
}
	
public static void method1() {
	
	System.out.println("Hello World");
	System.out.println("Hello Yasin");
}

public static void method2() {
	for(int i=1; i<=100; i++) {
		if(i%2==1) {
		continue; 
		}
		System.out.print(i + " ");
	}
System.out.println();
}
	
public static void method3(String str) {
	
	for(int i= str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		
	}
	
	System.out.println();
}	
	
public static void print(String str) {
	
	return ; // exits the method and does not return any value
}
	
public static int largestNum(int a, int b) {
	int max=0;
	if(a>b) {
		max =a; 
	}else {
		max=b; 
	}	

	return max; 
}
	
public static String Reverse(String str) {

	String result =""; 
	for (int i =str.length()-1; i>=0; i--) {
		result +=str.charAt(i); 
		
	}
	return result; 
}
	

// Overload method

public static void sum(int a, int b) {
	System.out.println("int sum is: " + (a+b));
}

public static void sum(double a, double b) {
	System.out.println("double sum is: " + (a+b));
}

public static void sum(int a, int b, int c) {
	System.out.println("int sum is: " + (a+b+c));
}

public static void sum(double a, long b, boolean c) {
	System.out.println("you have entered " + a+" "+ b+" " +c);
}

public static int sum(int a, double b, int c) {
	int sum = a+(int)b+c; 
	return sum; 
}


}







