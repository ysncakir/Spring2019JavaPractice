package day43_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlock {

	static String [] arr = new String[3]; 
	static ArrayList<String> list = new ArrayList<>();
	double salary = 100000; 
	
	static {
		System.out.println("Static Block");
		arr[2] = "Alla"; 
		arr[0] = "Kateryna"; 
		arr[1] = "Ruslan";
		
		list.addAll(Arrays.asList(arr)); 
		
		// salary = 500000; static cannot accept instance directly 
	
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method ");
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(list);
	}
}
