package day14_Scanner;

public class Ternary {


public static void main(String[] args) {
	
int num = 0; 

if (false) {
	num =100; 
	
	} 
else { num =50; 
		
}

System.out.println("num");

/*
 * if (condition) 		===> Condition ?
 * else 				===> :
 * else if (Condition)	===> : condition?

		num = (true) ? 100 : 50;
	we can only give a single value and ternary Must be 
	initialized a variable or print it out,
 	Must return a valuable
	() is not required in ternary

*/

	int n = (false) ? 89: 50; // turnary returns a Value
	int y = false ? 100 : 50; 
	System.out.println(num);
	System.out.println(n);
	System.out.println(y);
	
	
	/* String SchoolName = ""; 
	 * boolean Batch12 = true; 
	 *  
	 * if (Batch12){
	 * 			SchoolName = "Cybertek";
	 * } 
	 * else {
	 * schoolName = "Invalid"
	 * } 
	 * 
	 * in ternary total number of (?) should be equal (:)
	 * 
	 * 
	 */
	
	String SchoolName = "Cybertek";
	boolean Batch12 = true;  
	
	String BestSchool = Batch12 ? "Cybertek" : "Invalid";
	
	System.out.println(BestSchool);
	System.out.println(Batch12 ? "Cybertek" : "Invalid");
	
	
	double interestRate = 0; 
	boolean GoodCredit = true ; 
	
	interestRate = GoodCredit == true ? 0.5: 0.9;
	System.out.println(interestRate);
	
	byte grade = 90; 
	
	boolean Passed = grade>=60 ? true : false; 
	
	System.out.println(Passed);
	
	

	char FinalGrade = 'C'; 
	String Group = "";
	/*if (FinalGrade== 'A') {
		Group = "Early bird";
		
	} else if(FinalGrade=='B') {
		Group = "Group 1";
		
	} else if (FinalGrade=='C'{
		Group = "Group 2";
	
	{
		else {Group = "After Group1"; 
		
	}*/

	Group= (FinalGrade == 'A' )? "Early Birds" 
		: (FinalGrade =='B')? "Group1" 
			: (FinalGrade == 'C') ? "Group 2" 
					: "";
	System.out.println(Group);
	
	int score = 90; 
	char Finals = ' ';
	
	Finals = (score>=80 && score <=100)? 'A'
	:(score>=80 && score <=89)? 'B'
		: (score >=70 && score <=79)?'C'
			:(score >=60 && score <= 69)? 'D'
					: (score >=0 && score <=59)? 'F'
							: ' ';
    System.out.println(Finals);
    
    int n1=1000, n2= 300, n3=400;
    
    int max = (n1> n2 && n1>n3) ? n1
    			: (n2>n1 && n2>n3) ? n2
    					: n3; 		
    	
    System.out.println(max);
}


}
