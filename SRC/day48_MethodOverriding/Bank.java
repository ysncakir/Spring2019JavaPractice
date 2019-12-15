package day48_MethodOverriding;

public class Bank {

	
	
		// actions :InterestRate()
		
		// sub classes : Bank of America, PNC, Capital One
		
		public void InterestRate() {
			System.out.println("9 percent");
		}
		
		
		public static void main(String[] args) {
			
			BankOfAmerica BOA = new BankOfAmerica(); 
			BOA.InterestRate();
			
			
			Chase Ch = new Chase(); 
			Ch.InterestRate();
			
			
			CapitalOne CO = new CapitalOne(); 
			CO.InterestRate();
		}
		
		
}
		
		
	class BankOfAmerica extends Bank{
	    
	    
	    public void InterestRate() {
	        System.out.println("5%");
	    }
	    
	}
	class Chase extends Bank {
	    
	    @Override
	    public void InterestRate(){
	        System.out.println("6%");
	    }
	    
	    
	//  @Override
	//  public void print(){  }   the method not overridden
	    
	}
	class CapitalOne extends Bank {
	    
	    public void InterestRate() {
	        System.out.println("4%");
	    }
	    
	}
	

	

	
	
	

