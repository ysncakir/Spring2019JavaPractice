package Practice;

import java.util.Scanner;

public class Middle_character {

public static void main(String[] args) {
	
	
	Scanner input = new Scanner(System.in); 

	int n = input.nextInt(); 
	
	
	String rect = "xxx\n";
	
	for (int x=1; x<=n; x++) {
		
		rect+="x x\n"; 
	}
	rect+= "xxx";
	System.out.println(rect);
	
	
	for (int i=2; i<=100; i+=2) {
		System.out.print(i+", ");
	}
	
	
	
	
	}
}
