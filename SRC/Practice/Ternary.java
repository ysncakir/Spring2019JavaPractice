package Practice;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		
		int num = 0; 
		
		if (false) {
			num =100; 
		} else {
			num = 50; 
			
		}
		System.out.println(num);
	
	
	int n = (false)? 100 : 50; 
	
	
	
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
		
	}*/ Group = (FinalGrade =='A') ? "Early Bird" 
					:FinalGrade =='B' ? "Group 1"
							: FinalGrade =='C' ? "Group 2"
									: "After Group 2";
	
	System.out.println(Group);
	int score =87;
	char Finals =' ';
	
	/* if(score >= 90 && score <=100)
			Finals ='A';
	else if(score >= 80 && score <= 89)
			Finals = 'B';
	else if(score >=70 && score <= 79)
			Finals = 'C';
	else if(score>= 60 && score <= 69)
			Finals ='D';
	else if(score>=0 && score <= 59)
			Finals = 'F';
	else
		Finals = ' '; 
	*/		
	
	Finals = (score >=90 && score <=100) ? 'A' 
			: (score >= 80) ? 'B'
					: score>=70 ? 'C'
							: score >= 60 ? 'D'
									:score>=50 ? 'F'
											: ' ';
	
	System.out.println(Finals);
	
	System.out.println("Please enter the text");
	Scanner input = new Scanner(System.in); 
	String text = input.nextLine(); 
	int textlength = text.length(); 
	
	System.out.println(textlength);
	
	}
}
