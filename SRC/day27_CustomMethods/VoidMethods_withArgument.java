package day27_CustomMethods;

public class VoidMethods_withArgument {


// methods with argument

		//access-modifier   specifier		return-type 	name (parameter){}
		// parameter can be any data type

		public static void main(String[] args) {
			
			OddorEven(911); // method was designed to take an argument
							// need to provide a value that can be assigned to the parameter 
		
			int z =100; 
			OddorEven(z); // allows us to use different variable
		}

		public static void OddorEven (int a) {
				if (a%2==0) {
					System.out.println(a + " is even number");
				} else {
					System.out.println(a + " is odd number");
				}
					
			
			
			
			
		}


		
		
		
}