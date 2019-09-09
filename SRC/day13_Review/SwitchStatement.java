package day13_Review;

public class SwitchStatement {



	 /*
    
    
    switch statement : whenever you are checking if some variable equal different values:
    
    1. you can use multi branch if
    2. switch
    
    
    switch(Expression-not boolean, data type)
           case caseValue:
                       statement1;
                       statement2;
                       break;
                       
                      - we can have as many cases as you want;
                      - case value Must match data type of Switch expression
                      - case is similar with if-else
           
           case caseValue:
           		statement1; 
           		statement2; 
           		break;
           
           default: ==> default section will be executed if case blocks do not match with given data type of swithc expression
                   statement1;
                   statement2;
                   break;
                  
                   
           break statement: used for exiting the switch statement. if we do not have break statement, 
           code will continue to run till next break statement or curly brace!!!!
    
    		!!!!! Default section can be placed anywhere in switch statement !!!!
    		!!!!! None of the blocks or statements are mandatory in switch statement
    		
    		
    		switch statements expression must be evaluate to a single value (either characters, digits or text, 
    		therefore 4 data types are not accepted
    		
    		double a = 10L, 10D, 10d; 
    		float a =10F, 10f; 
    		long a = 10, 10L, 10l; 
    		boolean = true, false, 10>9
    		
    		
    		
    	or logic; 
    	
    	there is no direct way of using  || operator
    	we can use multiple case blocks back to back
    	
      
    */
   
   public static void main(String[] args) {
	   
	   
	   
	   int num = 5; 
	   switch (num) {
	   		case 7:
	   			System.out.println("Sunday");
	   			break; // after the case is executed, break will be used// case closed!!!!
	   	
	   		case 10-5: // we must provide int value
	   			System.out.println("This is Friday");
	   			break;
	   			
	   		default :
	   			System.out.println("Invalid Entry");
	   			System.out.println("Invalid");
	   			break;
	   		
	   		// System.out.println("Wednesday");	// we cannot give a new statement after break
	   		
	 
	   }
	   
	   
	   String days= "Friday"; 
	   
	   switch (days) {
	   
	   default:
  			System.out.println("Invalid");
  
  			
	   	case "Monday": 
	   			System.out.println("Monday is  fun day"); 
	   			
	   			
	   	case "Wednesday":
	   			System.out.println("Wednesday is day off");
	   	break;
	//	break // useless 	
	     		
	   	case "Tuesday":
  			System.out.println("Tuesday is great day");
	   	 
	   
	   }
	   
	   
	   long N1 = 10; // 10L
	   //switch (N1) {}
	   
	   float N2= 100; //100f
	 //  switch (N2) {}
	   
	   double N3 = 10; // 10d
	   // switch(N3) {}
	   
	   
	   boolean N4= true; // 9<8 , 
	   // switch(N4) {}
	   
	   
	   // They all cannot be accepted for switch statement
	   
	   
	   char ch= 'A'; 
	   switch (ch) {}
	   
	   
	   
	   // OR logic : 
	   
	   char grade = 'B'; 
	   if (grade  == 'A' || grade =='B') {
		   System.out.println("Passed the exam");
		   }
	   else {
		   System.out.println("Failed");
	   }
	   System.out.println("---------------------------");
	   switch (grade) { // if any case of correct, it will be executed
	   case 'A':
	   case 'B':
		   System.out.println("Passed the exam");
		   
		break; 
		
		default:
			System.out.println("Failed");
	   
	   
	   }
	   
	   
	   String US = "USA"; 
	   if (US=="USA" || US== "America" || US=="US") {
		   System.out.println("American");
	   }
	   	
	   else {
		   System.out.println("Not American");
	   }
	   
	   
	   switch(US) {
	   case "USA":
	   case "America": 
	   case "US":
		   System.out.println("American");
	   break; 
		
	   default:
			System.out.println("Not American");
	   
	   
	   }
	   System.out.println("==================");
	   String laptop = "HP";
	   
	   
	   switch(laptop) {
	   case	"Apple":
		   System.out.println("Apple-no virus");
		   break; 
		   
	   case "Dell": 
		   System.out.println("Though one");
		   break; 
		   
	   case "Acer":
		   System.out.println("Cheap one");
		   break; 
		
		   
	  default:
		  System.out.println("Do not buy that one");
		  break; 
	   
	   }
	   
	   int day = 6; 
	   
	   switch (day) {
	   
	   case 1:
		   System.out.println("Monday");
		   break;
		   
	   case 2:
		   System.out.println("Tuesday");
		   break;
		   
	   case 3:
		   System.out.println("Wednesday");
		   break;
		   
		   
	   case 4:
		   System.out.println("Thursday");
		   break;
		   
	   case 5:
		   System.out.println("Friday");
		   break;
		   
	   case 6:
		   System.out.println("Saturday");
		   break;
		   
	  default:
		   System.out.println("Funday");
		   break;
		   
		   
	   
	   }
	   
	   char ysn = 'G'; 
	   switch (ysn){
	   case 'A':
	   case 'B':
	   case 'C':	   
	   case 'D':   
	   case 'E':
		   System.out.println("found");
		   break; 
		   
	   default:
		   System.out.println("not found");
		   break; 
		   
	   
		   
		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
       
         }

}
