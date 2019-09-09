package day12_SwitchStatement;

public class WarmUp {

	
	public static void main(String[] args) {
		
	
	// declare 3 numbers 
				// if n1 and n2 are equal ==> n1&n2 are equal
				// if n2 and n3 are equal ==> n2&n3 are equal
				// if n3 and n1 are equal ==> n1&n3 are equal
				// if all is equal ==> all equal
				// if none of them are equal==> none of them are equal
	
	//do not use single if statement


		int n1= 4; 
		int n2= 1;
		int n3= 5;
		
		
		if(n1==n2 && n1!=n3) {
			System.out.println(n1+ " and " + n2 + " are equal");
		}	
		else if (n2==n3 && n2!=n1) {
			System.out.println(n2+ " and " + n3 + " are equal");

		}
		else if(n3==n1 && n3!=n2) {
			System.out.println (n3+ " and " + n1 + " are equal");
			
		}
		else if(n1==n2 && n2==n3 && n1==n3) {
			System.out.println("All is equal");
		}
		else {
			System.out.println("None of them are equal");
			
		}
			
		System.out.println("\n");
		
// second ;
		
		int num1=5;
		int num2=9; 
		int num3=4;
		
		if (num1==num2 && num2==num3) {
			System.out.println("All equal");
		} 
		
		else if (num1==num2){
			System.out.println("num1 and num2 are equal");
			
		}
		else if (num2==num3) {
			System.out.println("num2 and num3 are equal");
		}
		else if (num1==num3) {
			System.out.println("num1 and num3 are equal");
		}
		else  {
			System.out.println("none of them are equal");
			
		} 
		
// third way; 
		
		int A= 10; 
		int B= 20; 
		int C= 30;
		
		if (A==B & B==C) {// if all is equal
			System.out.println("All is equal");
			
		} else { // if not all of them is equal
			if (A==B) {  // if A and B equal
				System.out.println("A and B are equal");
			}
			else if (A==C) { // if A and C are equal
				System.out.println("A and C are equal");
				
			}
			else if (B==C) { // if B and C are equal
				System.out.println("B and C are equal");
			}
			else {// if none of them are equal
				System.out.println("None of them are equal");
			}
		}
		

	
		
	
		
		
		

	}
}