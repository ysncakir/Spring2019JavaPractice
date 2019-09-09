package day10_ifStatement;

public class without_CurlyBrace {

public static void main(String[] args) {
	

	if (false) {
		System.out.println("Today is Friday");
		System.out.println(" Tomorrow is day off");
	}

		if (false)
			System.out.println("Today is Friday");// if there is no curley brace, that means it is only single line
												  // if condition will be applied 

		
			System.out.println("There is no class tomorrow");


		if (false)
			System.out.println("Hello");
			System.out.println("World");


			
		/* / if -else statement without curley brace:
			
			if (condition) for only one single line statement
			

		 */
			
			if (true)
				System.out.println("this is if");
				// System.out.println("hello");// else block must be right after if block if we don't use {}
			else 
				System.out.println("this is else");
			
			
			/*
			 * Multi branch if statement 
			 * 
			 * else if condition 2
			 * 			// single line of statement 
			 * else 
			 * 
			 */

			if (true)
				System.out.println("if Block");	
				//System.out.println("hello");
			else if (true)
				System.out.println("else if block");
			else 
				System.out.println("else block");
			
			
			




}			






}