package day09_Review;

public class Review {

	/*
	 * Relational 
	 * 
	 * >   greater   	x =10 y= 9 only return true when x>y
	 * <  less than		x =10 y= 9 only return true when y<x
	 * <=  less than or equal 	; there are two possibilities returning true less or equal
	 * >= greater than or equal 	true; either greater or equal 
	 * ==  equal
	 * !=  not equal 
	 * 
	 * Logical operators
	 * && : if both conditions are same; 
	 * || : true: as long as one condition is true, returns us true 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

public static void main(String[] args) {
	
	System.out.println( 'Z' > 'A'); // true
	System.out.println( 'Z'>= 'A'); // true
	System.out.println('a' < 'A'); //false
	
	char ch1 = 123; 
	System.out.println(ch1);
	
	System.out.println(true==true && false != true);
	//						true  &&	true
	
	System.out.println(true!=true || false == true);
				//			false ||	false
	
	System.out.println("Monday" == "Friday" || true == !false);
					// 		false					true
}



}
