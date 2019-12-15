package day27_CustomMethods;

public class VoidMethod {

	
	
	
	// methods : grouping a series of statements to gather to perform 
	//			a specific task
	
	
	// methods can male our codes reusable
	
	// method declaration ; 
	//		public             static       void    main(String [] args)
	
	//		access-modifier   specifier return-type name ()
	
	
	
	// access modifier : public, protected, default, private
	// specifiers : static, abstract, final 
	// return-type : void and any other data types(int, double vs..)
	
	// return type: 
	//			1. void methods : the method does not return any value
	
	 public static void main(String[] args) {
	        
	        myFirstMethod();
	        
	        even1To100();
	        
	        
	        
	        
	    }
	    
	    
	    public static void even1To100() {
	        for(int i=0; i <= 100; i++) {
	            if(i %2 != 0) {
	                continue;
	            }
	            System.out.print(i+" ");
	        }
	        
	    }
	    
	    
	    
	    
	    
	    public static void myFirstMethod() {
	        
	    //  public static void main(String[]) {  }  
	                // methods must be decleared within the class
	        
	        System.out.println("Hello World");
	        System.out.println("Hello Cybertek");
	        System.out.println("Hello Khurshed");
	            
	    }
	
	
	
	
	
	
	
	
	
	
}
	
	
	

