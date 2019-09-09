package day08_ShortHandOperators;

public class LogicalOperators {

		public static void main(String[] args) {
			
			/*
			 * && : And Logic ==> 	true && true ==> true; if both conditions are true or false , it will get true and false. 
			 * || : or Logic  ==> 	true || false ==> true 
			 * 						true || false ==> false 
			 * 					   false ||	true  ==> true
			 * 
			 */
			
			
			boolean ResultA = 9 ==0 && "Muhtar" == "good"; 
			//					false		false 			==> false
			
			System.out.println(ResultA);
			
			boolean ResultB = 8>5 && 7==(8-2+1); // both are true
			
			System.out.println(ResultB);
			
			boolean ResultC = !false != true && !false ==! (!true);
							//	true != true		true == !false
							// 		false				true
			System.out.println(ResultC);				
					
			boolean A = " Monday" == "Funday" || 6==6; 
					//		False					true; one of the is true, it will print true
			
			System.out.println(A);
		
			boolean C = ! (8>5) || ! ("Today" != "FRiday"); 
					//	!  true	||	!	true
					//   false	||	false
			
			
			System.out.println(C);
			
			boolean D = true && true || false; // true
			System.out.println(D);
			
			boolean E = !(7>5 && 6 !=5) && (9>5 || 10>4); 
						//	!true 		&& true
						//	false		&& true 
						//  false
			
			System.out.println(E);
			
			
			
			
			
			
			
			
			
			
			
		}




}
