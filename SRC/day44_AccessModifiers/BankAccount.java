package day44_AccessModifiers;

public class BankAccount {
	
	/*
	 * The attributes/data that the class can have are: 
            AccountHolder, AccountNumber, AvailableBalance
    Actions the class can do are:
            deposit, withdraw, checking balance
    requirements:
            1. apply encapsulation
            2. user should be able to deposit, withdraw and check the balance
             2.1 if the withdrawing account is greater than available balance, 
             35$ penalty fee will be charger from the account
                2.2 if the available balance is less or equal to 0, 
                account holder won't be able to withdraw money
	 */

	private String AccountHolder; 
	private long AccountNumber; 
	private double AvailableBalance; 
	
	
	// getter : It is an instance return (does not have void) method and used to read our data outside the class
				// return type must match with instance variable 
	
	public String getAccountHolder() {
		return AccountHolder; 
	}
	
	
	public long getAccountNumber() {
		return AccountNumber; 
	}
	
	public double getAvailableBalance() {
		return AvailableBalance; 
	}
	
	// setter : allows us private data to modify outside the class. 
				// does not return a value, so it is instance void method, passes a parameter 
	
	public void setAccountHolder (String AccountHolder) {
		this.AccountHolder = AccountHolder; 
	}
	
	public void setAccountNumber (long AccountNumber) {
		this.AccountNumber = AccountNumber; 
	}
	
	
	// Actions:
			// deposit
	
	public void deposit (double amount) {
		
		AvailableBalance += amount; 
	}
	
		// withdraw: 
	
	
	public void withdraw (double amount) {
		if (AvailableBalance<=0) {
			System.out.println("Your account balance is less than 0");
			return;
		} 
		
		if (amount>AvailableBalance) {
			AvailableBalance-=35; 
			
		}
		
		AvailableBalance -= amount; 
		
	}
	
	// checking balance; 
	
	public void ShowBalance () {
		System.out.println("Available Balance is " + AvailableBalance);
		
	}
	
	// get account Info 
	
	public void getAccountInfo() {
		System.out.println("Name: " + getAccountHolder()); 
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Available Balance: "+ getAvailableBalance());
		
	}
	
	
	
}
