package Practice;

public class forLoop {

public static void main(String[] args) {
	
	System.out.println("odd numbers from 100 to 0: ");
	
	 for (int i =99; i>1; i-=2) {
		 System.out.print(""+i+" ");
		
	 }

	 System.out.println("All numbers can be divided 3 and 7 between 0-100");
	 for (int i = 0; i<100; i++) {
		 if (i%3==0 && i%7==0) {
			 System.out.print(""+i+" ");
		 }
	 }
	 System.out.println();
	 System.out.println("numbers can be divided by 5 between 0-25 ");
	 for (int i = 1; i<=25; i++) 
		 if (i%5==0) 
			 System.out.println(i);
		 
	 
	
	System.out.println("numbers which can be multiples of 2; ");
	int us = 1; 
	for (int i=2; i<7; i++) {
		System.out.println(""+(i+1));
	}
	
	
	
	}
}
