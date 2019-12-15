package day33_ArrayList;

public class MethodCalls {

	public static void main(String[] args) {
		
		// cannot call itself
		
		method3(); 
		
		int max2 = max (9,81); // 81
		System.out.println(max2);
		
		int max3 = max(9, 81, 169); 
		System.out.println(max3);
		
		maximum(1585449, 3790874, 8775938); 
	
		
		
	}
	
	
	public static void method1() {
		// method2();            cannot call itself
		System.out.println("A");
	}


	public static void method2() {
		method1(); // A
		System.out.println("B"); // B
	}

	public static void method3() {
		method2(); //A, B
		System.out.println("C"); // C
	}

	public static int max(int a, int b) {
		return(a>b)? a :b; 
	}
	
	public static int max(int a, int b, int c) {
		// int largestNum = max(a,b);
		
	return (max(a,b) > c) ? max(a,b) : c; 
		
	}	
	
	
	public static int max(int a, int b, int c, int d) {
        /*
        int result = max(a, b, c);
        if(result > d) {
            return result;
        } else {
            return d;
        }
        */
        // return  (result > d) ? result : d;
        
        return  max(    max(a, b)  ,   max(c, d)  );
        
    }
    
    public static int max(int a, int b, int c, int d, int e) {
        
            // return   max(    max(a,b,c,d)  ,  e );
        
            return max (    max(a,b,c)  ,  max(d,e) );
            
    }
    
    
    
    
    public static void maximum(int a, int b, int c) {
         System.out.println(    max(a, b, c) );  
    }
    
    public static String print(int a, int b, int c) {
        maximum(a, b, c);
        return "900";
    }
    
    
    /*
     Assignment:
        1. write a return method that can remove duplicates from a string
            Ex: RemoveDup("AABBBCCCDD")  ==> ABCD
     
        2. write a return method that passes two string parameters a and b, 
             return the number apperences of b in a
            Ex:     occured("ABAB" , "A") ==> 2
             
     
        3. combine method 1 and method 2 to write a method that can find 
        the frequency of characters
            Ex: frequncy("AAABBBCCCDD")  ==> A3B3C3D2
        
     
     */
    
    

	
	
	

}


