package day09_Review;

public class Quiz {

public static void main(String[] args) {
	
	// Question 1: 
	boolean a  = !!!!!false; // 2 of them eliminate each other
			// 	  true
	System.out.println(a);
	
	// Question 2: 
	
	boolean result = !false != ("Batch 12" != " Best Batch Ever"); 
					// true	!= true
					// false
	
	
	// Question 3: 
	
	int x = 100; 
	double y = x+= 100/20; // x will be 105
		// y = x+5	
	
	System.out.println(x);
	System.out.println(y);
	
	// Question 5: 
	
	boolean A = 128> '9' || 128 == 127; // as long as one condition true in or logic ; you will get true
			//    true	 || false
	
	System.out.println(A);
	
	// Question 6: 
	
	boolean StupidOperators = 10>=20 && 'a'>'b'; // if one condition is false, you can't get true. 
						//		false	   false
	
	System.out.println(StupidOperators);
	
	// Question 7: 
	
	int num1= 999999; 
	int num2= 10; 
	
	System.out.println(num1*num2/10%num1);
					//	   	999999%999999
	
	// Question 9: 
	
	int num3 = 100; 
//	System.out.println("Z > 100 is :"+ H); // H is not defined yet
	boolean H = num3>100;  // false
	
	
}

}
