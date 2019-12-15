package Practice;

import java.util.Arrays;

public class quiz5 {
public static void main(String[] args) {
	
	
	int wd = 0; 
	String [] days= { "sun", "mon", "wed", "sat"};
	
	for (int i=0; i<days.length;i++) {
		
		switch(days[i]) {
		
		case"sat":
		case"sun":
			wd-=1; 
			break; 
		case "mon":
			wd++; 
		case "wed":
			wd+=2; 
		
		
		
		
		
		}
		
		
		
		
	}
	
	
	
	System.out.println(wd);
	
	
	
	int [] intArr= {15,30,45,60,75};
	
	intArr[2]= intArr[4]; 
	intArr[4]=90; 
	
	System.out.println(Arrays.toString(intArr));
	
	
	
	
	
	
	
	
	
	
}
}
