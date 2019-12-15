package day38_CustomClassContinue;

public class BankAccountObjects {

	
	
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(); 
		
		account1.AccountHolder = "Erhan Dolapci"; 
		account1.AccountNumber = 1234567891234567L; 
		
		account1.ShowBalance();
		
		account1.Deposit(2000);
		account1.Deposit(4000);
		
		account1.withdraw(3000);
		account1.withdraw(3001); //-36
		
		account1.withdraw(2000);
		
	
		BankAccount account2 = new BankAccount(); 
		account2.accountSetUp("Yasin", 8765432198234567L);
		
		account2.ShowBalance();
		account2.Deposit(1000000);
		account2.withdraw(500000);
		
		BankAccount account3 = new BankAccount("Adem", 6781234901237654L); 
		
		account3.ShowBalance();
		account3.Deposit(3876);
		account3.Deposit(4569);
		account3.withdraw(8446);
		account3.withdraw(100);
	}
	
	
	
	
	
}
