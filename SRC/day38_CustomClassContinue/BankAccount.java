package day38_CustomClassContinue;

public class BankAccount {

	
	/*
	WarmUp:
    create a custom class for BankAccount
    attributes/data that can have are: 
                    1. AccountHolder, 2. AccountNumber, 3. Balance
        Actions: deposit, withdraw, showBalance
        requirements: 
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                    2.1 if the withdrawing account is greater than available balance, 35$ charge will be added
                    2.2 if the balance is less than 0, user should not be able to withdraw money
            3. user should be able to see their balance
     */
	
	
	  String AccountHolder;
      long AccountNumber;
      double balance;
     
      public BankAccount() { // we have to give default constructor in order to execute the other one
    	  
      }
      
      public BankAccount(String AccountHolder, long AccountNumber) {
    	  this.AccountHolder= AccountHolder; 
    	  this.AccountNumber= AccountNumber; 
      }
  
      public void ShowBalance() {
          System.out.println("----------------------------------------");
          String acct = ""+AccountNumber;
          String AccountNumber = "************"+acct.substring(12);
          System.out.println("Account Holder: " + AccountHolder);
          System.out.println("Account Number: " + AccountNumber);
          System.out.println("Available Balance: $" + balance);
          System.out.println("----------------------------------------");
      }
      
      public void Deposit(double amount) {
          System.out.println("----------------------------------------");
          String acct = ""+AccountNumber;
          String AccountNumber = "************"+acct.substring(12);
          System.out.println("Depositing $"+amount +" to the account "+AccountNumber);
          balance += amount; 
          System.out.println("New balance " + "$"+balance);
          System.out.println("----------------------------------------");
      }
	
      public void withdraw(double amount){
    	  System.out.println("----------------------------------------");
    	  
    	  if (balance <=0) {
    		  System.out.println("No available balance");
    		  return; // exists the method withdraw
    	  }
          String acct = ""+AccountNumber;
          String AccountNumber = "************"+acct.substring(12);
          System.out.println("Withdrawing $"+amount +" from the account "+AccountNumber);
          balance -= amount; 
          System.out.println("New balance " + "$"+balance);
          if (balance<0) {
        	  balance-=35; 
        	System.out.println("New balance " + balance);
        	System.out.println("----------------------------------------");  
          }
          
          
         
          
      }
	
	
      public void accountSetUp(String name, long acctNum){
    	  
    	  AccountHolder = name; 
    	  AccountNumber= acctNum; 
    	  
    	  
      }
	
	
	
	
	
	
	
	
	
}
