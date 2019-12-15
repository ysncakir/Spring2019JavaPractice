package day32_JavaReview;

public class CustomMethodsReview {

	/*
	 * Declaration: 
	 * 
	 * Access-modifier 	specifier	return-type		methodname(parameter){
	 * 
	 * 			method body
	 * }
	 * 
	 * 	Access-modifier : public static 
	 * 	specifier : static
	 *  return-type	: void, all primitive and non primitives
	 * parameter : all data type
	 * 
			if the return type is void : method does not return any value
			if the return type is not void : method MUST return a value
		
	 */
	
public static void main(String[] args) {
	for (int i=0; i<5; i++) {
	method1(); 	
	}
	oneTo100Even();
	ReverseStr("yasin cakir"); // yasin cakir is argument
	
}	
	
	public static void method1() {
		System.out.println("Hello World");
		System.out.println("Hello Cybertek");
		System.out.println("Hello Batch12");
	}
	
	
	public static void oneTo100Even() {
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public static void ReverseStr(String str) { // String str is parameter
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i)); 	 
		}
	}	
	public static void print(String str) {
		        System.out.println(str);
		        
		        return;
		    //  System.out.println("Completed");
		        
	}
		    
		    
	public static int  largestNumber (int a, int b) {
		            int max =0;
		            
		            if(a >b)
		                max = a;
		            else 
		                max = b;
		            
		            return  max;
	}
		    
		    
		    
		    	
	
	
}
