package day25_ArraysContinue;

public class warmUp2 {

public static void main(String[] args) {
	

	// write a program that can print out the unique values from a String Array
	
	
	
	String[] arr = { "A", "A", "A" , "A", "B", "C", "C", "d", "c"};
    // index:        0     1    2    3    4
   
   
for(int j = 0; j < arr.length; j++) {
       
       int count = 0;  
       for(int i=0; i < arr.length; i++) {
           if( arr[i].equals( arr[j] )  ) {
               count++;
           }
       }
       
       if(count == 1) {
           System.out.println( arr[j] );
       }
       
   }
   


	}
}
