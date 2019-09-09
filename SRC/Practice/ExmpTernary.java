package Practice;
import java.util.Scanner;
public class ExmpTernary {

public static void main(String[] args) {
	
	
Scanner s = new Scanner(System.in);
    
    
    int n1 = s.nextInt();
    int n2 = s.nextInt();
    int n3 = s.nextInt();
	
	String bigger = (n1>n2 && n1>n3) ? "n1 is bigger"
            :(n2>n1 && n2>n3) ? "n2 is bigger"
            : "n3 is bigger"; 
            
	System.out.println(bigger);
	
	
	System.out.println("Enter vehicle's year:");
	   Scanner vehicleYear = new Scanner(System.in); 
	   int input = vehicleYear.nextInt(); 
	   
	   String vehicle=  (input>=1995 && input>=1998) || (input>=2001 && input>=2002) 
			   || (input>=2004 && input>=2006) || (input>=2015 && input>=2017)? 
				"Your vehicle needs to be recalled" : "Your vehicle is fine, enjoy!";

	   System.out.println(vehicle);

	}
}
