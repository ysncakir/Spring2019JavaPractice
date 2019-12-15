package day57_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class ExeceptionHandling {

	public static void main(String[] args) {
		
		int [] number  = {100,200,300};
		
		try {
			System.out.println(number[-1]);
			System.out.println("Try Block, Checked Exception");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch Block, Unchecked exception");
		}
		
		System.out.println("==========================================");
		
		try {
		
			Thread.sleep(2000);
			System.out.println("Try Block, Checked Exception");
		} catch(InterruptedException e) {
			
		}
		
		System.out.println("Work is done");
		
		ArrayList<Integer> list  = new ArrayList<Integer>(); 
			list.addAll(Arrays.asList(1,2,3));
			
			
			// IndexOutOfBoundException is child class of Runtime Exception and we can use it any time 
			
			try {
				System.out.println(list.get(10));
				System.out.println("Checked Exception in ArrayList");
			} catch(RuntimeException e) {
				System.out.println("Unchecked exception occured in arraylist");
			}
	}
}
