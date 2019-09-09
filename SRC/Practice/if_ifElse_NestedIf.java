package Practice;

public class if_ifElse_NestedIf {

	 
	        /*
		     * 60<=grade <70 ==> D
			 * 70 <= grade <80==> C
			 * 80 <= grade <90==>B
			 * 90 <= grade <100 ==>A
			 * 
			 * 50<= grade <60 ==> F
			 * 40<= grade <50 ==>G
			 * 30<= grade <40 ==> H
			 * 20<= grade < 30 ==>I
			 * 10<= grade < 20 ==>J
			 * 0<= grade < 10 ==>K}
			*/
	
public static void main(String[] args) {
		
			
	int grade = 109; 
	
		if (grade>=60 && grade<=100) {
			System.out.print("Passed");
		
			if (grade>=90 && grade<=100) {
				System.out.print(" with A.");
				
		}
			else if (grade >=80 && grade<90) {
				System.out.print(" with B");
		}
		
			else if (grade>=70 && grade <80) {
				System.out.print( " with C");
		}
		
			else {
				System.out.println( " with D");
			}
		}
		else {
			if (grade< 60 || grade >100) {
			System.out.print("Failed");
				if(grade>=50 && grade <60) {
					System.out.print(" with F");
				}
				else if (grade >=40 && grade <50) {
					System.out.print(" with G");
				}
				else if (grade >=30 && grade <40) {
					System.out.print(" with H");
				}
				else if (grade >=20 && grade <30) {
					System.out.print(" with I");
				}
				else if (grade >=10 && grade <20) {
					System.out.print(" with J");
				}
				else if (grade >=0 && grade <10) {
					System.out.print(" with K");
				}
			
				else {
					System.out.println(" Invalid Score, Not Found");
				}
				
			
			}
		
		/* declare a int variable called Age
		 * declare another variable Boolean variable called "Good Person"
		 * write a program 
		 * if good person is false:
		 * age >=18 ==> cigarette
		 * age >=21 ==> Hookah 
		 * age >=25 ==> alcohol 
		 * age < 18 ==> milk
		 * 
		 * age= 23
		 */
		
			int age =19; 
			boolean GoodPerson= false; 
			
			if (age>=18) {
				System.out.println("You can buy milk");
				if (GoodPerson) {
					System.out.println("Alcohol is bad for your health");
				}
	
				else { // GoodPerson= false and && age >=18
					System.out.println("You can buy cigarettes");
					if (age>=21) {
						System.out.println("You can buy Hookah");
					}
					if (age>=25) {
						System.out.println("You can buy Alcohol");
					}
					
				}
			}
			else { // less than 18
				System.out.println("buy milk");
			}
			
			
			
			/* write of program that can find the number of days in a month
			 * (Assume that Feb has 28 days)
			 * 
			 * int month = 0~12
			 * 	1		2		3		4		5		6		7		8		9		10		11		12
			 * Jan	 	Feb		Mar		April	May		Jun		July 	Aug		Sep		Oct		Nov		Dec		
			 *  31		28`		 31		 30		 31		30		 31		31		 30		 31		 30		 31	
			 * 
			 * Must use nested if
			 * 28 days: 2
			 * 30 days: 4, 6, 9, 11
			 * 31 days: 1, 3, 5, 7, 8, 10, 12 
			 * 
			 * even number of 30 days: 4&6
			 * odd number of 30 days : 9 &11
			 * even number of 31 days : 8, 10, 12
			 * odd numbers of 31 days : 1, 3, 5, 7
			 * 					// before August all even months have 30 days and all odd months have 31 days

			 */
			
			
			
			int month= 9; 
			if (month >0 && month <13) {
				if(month==1) {
					System.out.println("31");
				}
				else if (month==2) {
					System.out.println("28");
				}
				else if (month==3) {
					System.out.println("31");
				}
				else if (month==4) {
					System.out.println("30");
				}
				else if (month==5) {
					System.out.println("31");
				}
				else if (month==6) {
					System.out.println("30");
				}
				else if (month==7) {
					System.out.println("31");
				}
				else if (month%2==0) {
					System.out.println("31");// after July all even numbers have 31 days
				}
				else { // after July all odd numbers have 31 days
					System.out.println("30");
				}
						
				
			} 
			else {
				System.out.println("Invalid Entry");
			}
			
			
			 /*28 days: 2
			 * 30 days: 4, 6, 9, 11
			 * 31 days: 1, 3, 5, 7, 8, 10, 12 // rest of 31 days
			 * 
			 * even number of 30 days: 4&6
			 * odd number of 30 days : 9 &11
			 * even number of 31 days : 8, 10, 12
			 * odd numbers of 31 days : 1, 3, 5, 7
			 * 
			 * 
			 * Leap Year =29 days==>2
			 * 
			 */
			
			
			
			int month2= 2; 
			int year = 2000;
		if (month2>0 && month2<13) { // 1~12
			
				if (month2 ==2) { // month2=2
					if (year%4==0) {
						System.out.println("29 days"); // condition for leap year
					}
					else {// condition for regular year
					System.out.println("28 days");
					}
				}
				else if (month2==4 || month==6) { //month2=4, 6
					System.out.println("30 days");
				
				}
				else if (month2==9|| month2==11){ // month2= 9, 11
					System.out.println("30 days");
				}
				else {
					System.out.println("31 days"); // month2 = 1, 3, 5, 7, 8, 10, 12
				}
			
				
		} else { // month2<0 or month2>12
			System.out.println("Invalid Entry");
			}
		
				// if-else && else-if:
		
		if (true) {
			System.out.println("Hello");
		}
		else {
			System.out.println("Batch 12");
		}
		
		if (true) { // true
			System.out.println("Hello");
		}
		else if (false) { // false
			System.out.println("Batch 12");
		}
		else { // extra if we have 2 possibilities // never gets executed
			System.out.println("Cybertek");
		}
			
		/*
		 * if (true){
		 * 
		 * }
		 * 
		 * else {
		 * }
		 * 
		 * else if (false ){ // else if must be declared right after if statement 
		 * }
		 * 
		 * 
		 * 
		 */
		
		int X= 10; 
		
		if (X>0) {
			System.out.println("greater than 0");
		}
		if (X>5) {
			System.out.println("greater than 5");
		}
		if (X==10) {
			System.out.println("Equal to 10");
		}


		if (X>0) { // only one of them will be executed 
			System.out.println("greater than 0");
		}
		else if (X>5) {
			System.out.println("greater than 5");
		}
		else if (X==10) {
			System.out.println("Equal to 10");
		}
		
		if (true) { // for single condition
			
		}
		
		
		if (true) { // for 2 possibilities
		
		}
		else {
			System.out.println(" hade be");
		}
		
		
		
		int i = 5; 
		
		if (i==20) {
			System.out.println( "value of i is 10");
		}
		
		else if (i<10) {
			System.out.println(" value of i is less than 10");
		}
		else {
			System.out.println(" valeu of i is differnt than 10");
		}
		
		
		// 90+ AA
		// 80-90 BB
		// 70-80 CC
		// <70 F
		
		

		
		
		
		
		
		
		}
	}
}