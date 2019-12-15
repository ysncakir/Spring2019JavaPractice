package day22_NestedLoop;

import java.util.Scanner;

public class NestedLoop {

public static void main(String[] args) {
	
	
	/* nested loop: loop inside a loop
	
		for (5){
			for (5){		==> 25 times execution
			"Hello"
			}
		}	
			
	when we need to repeat some steps inside loop body
	
	
	
	*/
	
	
	for (int z=0; z<5; z++){
		for (int i =1; i<=5; i++) {
			System.out.print(i);
	}
	System.out.println();
	}
	
	int z= 5; 
	while (z>0) {
		int i = 1; 
	
		while (i<=5) {
		
		System.out.print("*");
		
		i++;
	}
	System.out.println();
	
	
	z--; 
	}
	System.out.println("\n\n");
	
	
	for (int i = 1; i<=10; i++) {
		
		for (int j = 1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	
	int A = 1; 
	
	while (A<=7) {
		int B =1; 
		while(B<=A) {
			System.out.print("&");
			B++; 
			
		}
		
		
		
		A++; 
	}
	
	/*
    
    *
    **
    ***
    ****
    *****


*/


  
  
for(int j = 1; j <= 5 ; j++) {
  
  for(int i = 1; i <= j;  i++  ) {
      System.out.print("*");
  }
  System.out.println();
  
}

/*

      ******
      *****
      ****
      ***
      **
      *

*/
  
  
  
	for(int y=6; y >= 0; y--) {


		for(int i =1; i <= y; i++) {
			System.out.print("*");
}
System.out.println();

}

  
 
 
  
	
	
	
	
	}
}
