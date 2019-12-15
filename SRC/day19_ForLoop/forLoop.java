package day19_ForLoop;

public class forLoop {
public static void main(String[] args) {
	
	
	/* for ( initialization ; condition  ; iterator){
	 * 			steps want to repeat like statements
	 * }
	 * 
	 * loop = used for repeated actions
	 * 
	 * for loop = for (initialization; condition; iterator; 
	 * statements within loops body is repeated until condition becomes false
	 * 
	 * initialization: usually the times of the number we want to execute the loop
	 * Ex: int i = 0 ==> starting point 
	 * condition : it is created based on the initialization,
	 * 
	 * iterator : co-related to the condition, runs long enough and either increases or decreases the value of initialization, 
	 * then eventually condition becomes false. 
	 * Iterator is not mandatory. However, if you do not give iterator, it will execute forever. 
	 */
	
	for (int i = 1; i<=10; i+=2) {
		System.out.println("Hello World "+i);
		
	}
		System.out.println("Winter is coming");
		
	
	
	}
}
