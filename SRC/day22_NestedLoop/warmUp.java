package day22_NestedLoop;

public class warmUp {

public static void main(String[] args) {
	
/* 1. write a program which prints out the numbers from 1 to 30:
        1. for numbers which are divisible by 3, print "FIN" instead of the number.
        2. for numbers which are divisible by 5, print "RA" instead of the number
        3. for numbers which are a divisible by booth 3 and  5, print "FFINRA" instead of the number
 * 
 */
	
		String str = ""; //+1+2+3+4+5
		
		int i =1;  
		
		while (i<=30) {
		
		str += (i%15==0) ? "FFINRA "
				:(i%3==0)? "FIN": (i%5==0) ? "RA" :i+" "; 
			
			i++; 
		}
			
		System.out.println(str);	
			
			
		/*	if (i%15==0) {
		str+="FFINRA "; 
		}
		else if(i%3==0) {
		str+="FIN ";
		} 
		else if (i%5==0) {
		str+="RA "; 
		} 
		else {
		str+=i+" "; 
		}
*/
						
			
			
			
			
			
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
