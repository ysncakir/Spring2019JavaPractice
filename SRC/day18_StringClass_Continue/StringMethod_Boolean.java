package day18_StringClass_Continue;

public class StringMethod_Boolean {

public static void main(String[] args) {
	
	/* isEmpty(): checks if the String is empty and 
	 * returns a boolean expression 
	 * 
	 */
	
	String str = "Cybertek";
	boolean R1 = str.isEmpty();
	System.out.println(R1);
	
	
	String str2= "";
	
		if (str2.isEmpty()) {
			// true
			System.out.println("it is empty String");
			
		} else {
			System.out.println("it is not empty");
		}
	
	
	/* equals(str): checks if the 2 strings' visible texts  are equal or not and 
	 * then it returns boolean expression.
	 * equal = true  !equal = false
	 */
	
	
		String A1 = "Cybertek"; 	
		String A2 = new String ("Cybertek"); 
	
		System.out.println(A1==A2);
	
		boolean R2= A1.equals(A2); 
		System.out.println(R2);
	
		System.out.println("java".equals("Java")); // false ==> case sensitivity
	
	
		/* equalsIgnoreCase(Str)= checks if the 2 strings' visible texts  are equal or not and 
		 * then it returns boolean expression. Case sensitivity does not matter
		 * equal = true  !equal = false
		
		*/
		
		String s1 = "JAVA";
        String s2 = new String("java");
        System.out.println( s1 == s2 ); // false, different location
        System.out.println( s1.equals(s2) );  // false, case sensitivity
        System.out.println( s1.equalsIgnoreCase(s2) ); // true
        
        
        /*
         contains(str): checks if the str is contained in the String 
         or not,  then returns boolean expression
         
         contained ==> true       !contained ==> false
                
         */
        
        String name ="Muhtar";
            boolean Result = name.contains("ABC"); // false
        System.out.println( Result); // false
        
        String name2 ="Marufjon";
        System.out.println(name2.contains("m"));// false, case sensitivity
        
        
        /*
         startsWith(str): checks if the String is started with 
            the given str or not, then retunrs boolean expressions
         
         startedwith ==> true       !startedwith ==> false
         
         */
    
        String Today = "Java";
        boolean Result2 = Today.startsWith("J");  // true
        System.out.println(Result2);
    
        
        String names = "Cybertek School is a great palce to learn java";
    
        System.out.println(names.startsWith("Cybertek School"));  // true
    
    /*
     endsWith(str): checks if the String is ended with 
    the given str or not, then retunrs boolean expressions
    
    endedwith ==> true        !endedwith ==> false
     
     */
    	
		String B1= "Muhtar"; 
		System.out.println(B1.endsWith("r"));
		System.out.println(B1.endsWith("M"));

	}

}
