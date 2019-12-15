package day18_StringClass_Continue;

public class StringMethods {

public static void main(String[] args) {
	
	
	
	/*
    indexOf(str): returns the index number of the first 
     occurred character in the given String as an int value
    
    */
		String A1 ="Batch 12 is a great bacth";
   //                        
         int num = A1.indexOf("g");
         System.out.println(num);
         
         int num2 = A1.indexOf("eat"+2); // eat2
         // negative number means the str is not exist in the String
         
         System.out.println(num2);
   
   
         String B1= "today is tuesday, today we have class in the afternoon";
   
         int n1 = B1.indexOf("ter");
         System.out.println(n1);
   
   		String Address ="7925 Jones Branch Dr, Mclean, VA 22003";
   		int begin = Address.indexOf(",")+ 2;
   		int end = Address.indexOf(", V");

		String cityName =  Address.substring(begin, end  );
		System.out.println(cityName);

	
	
	
		String email = "RandomEmaails@gmail.com"; 
		int begin2 = email.indexOf("@")+1;
		int end2 = email.indexOf(".com"); 
		
		String emailType = email.substring(begin2,end2); 
		System.out.println(emailType);


		/*
		 * lastIndexOf(): returns the last occured character's index number
		 *  as int value
		 */

		String str = "ABCDABCDABCDABCDABCD"; 
		int n2= str.lastIndexOf("B");
		System.out.println(n2);
		
		
		String myemail = "Myemail.school@yahoo.com"; 
		int Begin = myemail.indexOf("@") +1;
		int End = myemail.lastIndexOf("."); 
		
		String EmailType = myemail.substring(Begin, End); 
		System.out.println(EmailType);

		
		
		
				
}


}
