package day50_Abstraction;

public class Zoo {

	public static void main(String[] args) {
		
		
	        Cat  Cleo  =  new  Cat('F', (byte)5 , "White & Black", "Cleo");
	    //  System.out.println( "Name is "+ Cleo.Nickname );  //Cleo
	    //  System.out.println("Gender is "+Cleo.Gender );
	    //  System.out.println( "Color is "+Cleo.color );
	    //  System.out.println("Age is "+Cleo.Age);
	        
	        System.out.println("====================================");
	        Cleo.getInfo();
	        
	        Cat misha = new Cat('F', (byte)6, "White & Grey", "misha");
	            misha.getInfo();
	            misha.Sleep(15);
	            misha.Eat("chicken");
	            misha.Drink("milk");
	            misha.Speak("meow");
	            System.out.println("====================================");  
	            
	        Dog yato = new Dog('M', (byte)3, "Black and White", "yato"); 
	        	yato.getInfo();
	        	yato.Eat("meat");
	        	yato.Drink("beer");
	        	yato.Speak("urdu");
	        	yato.Sleep(10);
	
	        	
	        	Dog Tuzik  = new Dog('M', (byte)12, "Black", "Tuzik");
	            Tuzik.getInfo();
	            Tuzik.Drink("redbull");
	            Tuzik.Eat("Hot dog");
	            Tuzik.Sleep(10);
	            Tuzik.Speak("Kyrgyz woof");
	        
	            System.out.println("\n =================================");
	            
	            Dog[] dog = { yato , Tuzik};
	            Cat[] cat = {misha,  Cleo};
	            
	            dog[1].getInfo(); 	
	            
	            
	            
	            /*
	            
	            abstract class: Countries
	                       Data: name, flag, language, population, religion, rivals, capital city
	                       
	                       constructor that can set all those data
	                       
	                   Actions (abstract):  exports(parameter),  import(prameter),
	                                           economy(), currency()..
	                                           
	                                           
	               sub class: 
	                       South Korea
	                       USA
	                       Kazakhistan
	                       New Zealand
	                       Mother Russia
	                       Turkey
	                       ....
	                                       
	            abstract method, inheritance, abstract class, method overriding ..         
	            
	            */
	                    
	}
	
}
