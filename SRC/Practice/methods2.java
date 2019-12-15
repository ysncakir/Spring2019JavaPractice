package Practice;

import java.util.Arrays;

public class methods2 {
	
	public static void main(String[] args) {
		RemoveDup("ihhhhhsssssaaaaannn"); 
		KmtoMiles(450); 
		LitertoGal(30.8); 
		Grades (101);
		 
		
		calculate(10,2, "/"); 
		
		calculate (28, 6, "+"); 
		
		calculate (49, 7, "%"); 
		
		calculate (49, 7, "$"); 
	}
	
	
	public static void RemoveDup(String str) {   // remove duplicates 
		
		String result = ""; 
		
		for (int i=0; i<str.length(); i++) {
			if(!result.contains(str.substring(i, i+1))) {
			result+=str.substring(i, i+1); 
		}
		}
		System.out.println(result);
	
	}	



	public static void KmtoMiles(double KM) {  // convert km to miles 
		// 1 km = 0.612 miles
		// 100 km = 100*0.62 ==> 62 ml
		
		double miles = KM*0.62; 
		System.out.println(KM + " km equals to "+ miles+ " miles");
		
		
		
		
	}
	
	public static void LitertoGal (double gal) { // conver gal to liter
		
		// 1 G = 3.75 L
		
		double liter = gal*3.75; 
		
		System.out.println(gal + " gal equals to "+ liter + " liter");
	}
	
	public static void SortDes ( int [] numbers) {
		
		Arrays.sort(numbers); 
		
		for (int i = numbers.length; i>=0; i--) {
			
			System.out.print(numbers[i]+ " ");
		}
		
		
	}
	
	
	public  static void calculate (int a, int b, String c) {
		String result =""; 
		if (c.equals("-")) {
			result += (a-b); 
		} else if (c.equals("+")) {
			result += (a+b); 
		} else if (c.equals("*")) {
			result += (a*b); 
		} else if (c.equals("/")) {
			result += (a/b);
		} else if (c.equals("%")) {
			result += (a%b);
		} else {
			result = "Invalid operator"; 
		}
		
		
		System.out.println(result);
		
		
		
	}
	
	public static void Grades(int score) {
		
		char grade = (score>=90 && score<=100)? 'A' : (score>=80 && score<=89)? 'B': (score>=70 && score<=79) ? 'C':
			(score>=60 && score<=69) ? 'D': (score>=0) ? 'F': 'I';  
		
		if (grade=='I') {
			System.out.println("Invalid Score");
		} else {
			System.out.println(grade);
		}
	}
	
	
}