package day35_Constructors;

import java.util.ArrayList;

public class ConstructorsMethod {


	


	public ConstructorsMethod(int a) {
        this(10.5);
        System.out.println("constructor with argument: "+a);
        
    }
    
    public ConstructorsMethod(double a) {
    //  this(10.5);  // constructor cannot call it self 
        
    //  this(10);  // constructor cannot contain itself
        System.out.println("constructor with argument: "+a);
    
        
    }
    
    public ConstructorsMethod(boolean a) {
        // ConstructorMethod(9);   // constructor cannot be called by constructorname
    
    //      System.out.println("constrcutor with argument of: "+a);
                            // the constructor call HAS to be the priority in the constructor
            
    //  this(100);
        this(10.5);
        
        System.out.println("constrcutor with argument of: "+a);
    }
    
    
    public static void main(String[] args) {
        
        // ConstructorMethod obj = new ConstructorMethod("Hello");
                                        // the constructor is not exist
        
    //  ConstructorMethod obj2 = new ConstructorMethod();
                            // the constructor is not exist
        
        ConstructorsMethod obj3 = new ConstructorsMethod(100);
        
        System.out.println("====================================");
        
        method1();
        
    //  ConstructorMethod();
        
        ConstructorsMethod obj4 = new ConstructorsMethod(true);
        
    }
    
    
    public static void method1() {
        
        
    }
    
	        
	    }