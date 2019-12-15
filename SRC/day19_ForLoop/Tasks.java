package day19_ForLoop;

public class Tasks {

public static void main(String[] args) {
	
	
	// Task 01 : write a program calculates square of the number from 1 to 10. 
	
			for (int i =1; i<=9; i++) {
				System.out.println("the square of "+ i + " is "+ (i*i));
			}
		
	
	
	// task 02 : write a program all even number between 1 and 32 
			
			
			for (int i =1; i < 33; i++ ) {
				
				if (i%2==0) {
				
					System.out.print(i+" ");
				}
			}
			
	// task 03 : write a program all odd number between 1 and 32 
			System.out.println();
			
			for (int i =1; i<33; i++) {
				if (i%2!=0) {
					
					System.out.print(i+" ");
				}
			}
			
			
			System.out.println();
	        
	        String str = "Cybertek";
	        //            01234567
	        //  "avaJ"
	        String Rev =""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
	        
	        String Reversed ="";
	        for(int i = str.length()-1 ; i >= 0; i--) {
	            Reversed += str.charAt(i);
	        }
	        
	        System.out.println(Reversed);
	    
	        
	        
	        
	    
	        
	        
	        
			
			
			
			
			
			
			
			
	}
}
