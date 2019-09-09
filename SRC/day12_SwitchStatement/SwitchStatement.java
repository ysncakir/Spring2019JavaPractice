package day12_SwitchStatement;

public class SwitchStatement {

public static void main(String[] args) {
	
	/* switch (expression)
	 * case caseValue1
	 * 	statement1	
	 * 	statement2
	 * 
	 * break: exiting the switch statement// closing statement; if there is no break, s
	 * default
	 * 
	 */
	
	
	
	int score =3;
	if (score==1){					// must give boolean expression
		System.out.println("1");
	}
	else if (score==2){
		System.out.println("2");
	}
	else {
		System.out.println("Invalid");
	}
		
	
	
	
	
	
	
	
	String str ="Java";
    
    switch (str) {
        
        case "C#":
            System.out.println("C# programming Language");
            break;  
        // System.out.println("C# programming Language"); 
                // case was closed at line 76
            
        case "Python":
            System.out.println("Python programming language");
        
        default:  // else
            System.out.println("Invalid");
    }



char grade = 'A';

switch(grade) {
            
    case 'B': 
            System.out.println("Passed with B");
            
    case 'C':
            System.out.println("Passed with A");
            
    default:
        System.out.println("Failed");
        
}  // switch statement only exits when there is break statement or }

		

	


	}
}
