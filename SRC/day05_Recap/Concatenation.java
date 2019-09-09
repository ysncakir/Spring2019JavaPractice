package day05_Recap;

public class Concatenation {

	/* String: represents the sequences of characters, used for text
	 * String values are surrounded by a double quote. 
	 
	 * Concatenation: combining, linking things together==> creates a new string value, uses + sign
	 * We can concate any values to string 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		String str = "any text goes here"; // must be used with "
		System.out.println( str );
		
		String str2 = "1"; 
		System.out.println(str2);
	
		
		System.out.println("Hello World");
		
		String Hello = "Hello World"; 
		System.out.println(Hello);
		
		
		String myName= "Cybertek" + " School";
		System.out.println(myName);
	
		String Year = "This is" + "2019";  
		
		
		String name = "Kamil"; 
		System.out.println("My name is "+  name);
		
		
		/* Cucumber is $3
		 * Tomato is $5
		 * 
		 
		 */
		
		int cucumber = 3; 
		int tomato = 5; 
		
		System.out.println(tomato + cucumber);
		System.out.println("Tomato is "+ '$'+ tomato);
		
		String newStr = "1000"+10; 
		System.out.println(newStr); //10010 
	
		System.out.println( 1+2+3); // 6
		
		System.out.println( "1"+2+3);// 123
		// System.out.println("1"+1-3); // "11"-3 cannot be compiled
		
		System.out.println("Batch 12"+1+2); // Batch 1212
		
		System.out.println(2-1+1+"4");// 24
		
		System.out.println( "Batch 12" + (1+2)); // Batch 123
		
		System.out.println( 1 + "123" + 4 +5);
		
		System.out.println(1 + ("1"+2));
		
		System.out.println( 1 + "123" + (4 +5));
		
		System.out.println( 4+3 - (9+3));
		
		System.out.println( 1+2 + "3");
		
		String BookName = " I like the book called \'Game of Thrones\'"; 
		System.out.println(BookName);

		String MyInfo = "My name is : \n\t\tCybertek"; 
		System.out.println(MyInfo);
		
		System.out.println('3' + 3); // '3' will be converted 51 in the ASCII table
	
		System.out.println("3" + '3'); // if we concat char to string, char is concated as a character. 
		
		System.out.println(12+ '3'); //63 
		
		System.out.println(2+3);
		System.out.println("2"+3); //23
		
		System.out.println('7'+3); // number of char will be concated. 
	
	}
}
