package day10_ifStatement;

public class if_else_Statement {

public static void main(String[] args) {

	
	/* if & else statement : two possibilities
	 * 
	 * if (condition){
	 * 		//A
	 * }
	 * if condition is true, if block is going to be executed. If it is false, else block will be executed.
	 * else {
	 * 		//B
	 * }
	 * Only one of them will be executed
	 * 
	 * 
	 */
	
	
	if (9<=8) {
		System.out.println("9 is less than 8 or equal to 8");
	}
	
	else {
	
		System.out.println("9 is greater than eight");
	}
	
	if (false ==!false) {
		System.out.println("if block");
	}
	
	else {
		System.out.println("else block");
	}
	
	
	int score = 61; 
	
	if (score  >= 60) {
		System.out.println("Passed");
	}
	else {
		System.out.println("Failed");
	}

	// declare 3 variables angle 1, 2, 3
	// write a program to check if the triangle is valid or not
	
	
	int angle1= 59; 
	int angle2= 50; 
	int angle3= 75; 
	boolean valid = (angle1+angle2+angle3==180);
	
	if (valid) {
		System.out.println("It is a valid triangle");
	}
	else {
			System.out.println("invalid triangle, do some math");
		}
	
	
	// bugs; one angle can be assigned 180
	// some angles can be negative 

	
	// multi-branch statements: for more than 2 possibilities

	











}	
}
