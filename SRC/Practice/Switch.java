package Practice;
import java.util.Scanner; 

public class Switch {

public static void main(String[] args) {
	
	System.out.println("Enter a number");
	
	Scanner num = new Scanner(System.in);  
	
	int day = num.nextInt(); 
	
	switch(day){
		case 1:
			System.out.println("Monday");
			break; 
		case 2:
			System.out.println("Tursday");
			break; 
		case 3:
			System.out.println("Wednesday"); 
			break; 
		default:
			System.out.println("Weekend");
			break; 
		
		
		
		
	}
	
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter number1:");
		int num1 = scan.nextInt();
		System.out.println("Enter number2:");
		int num2 = scan.nextInt();
		//WRITE YOUR CODE HERE
		int result = num1 > num2 ? num1 : num2; 
		System.out.println(result); 
	
	
	
	
	
	
	}
}
