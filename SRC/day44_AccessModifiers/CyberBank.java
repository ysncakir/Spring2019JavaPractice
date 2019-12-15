package day44_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class CyberBank {

	public static void main(String[] args) {
		
		BankAccount Sarah = new BankAccount(); 
		
		Sarah.setAccountHolder("Sarah Abdujappar");
		Sarah.setAccountNumber(123456789101113L);
		
		System.out.println("Name: " + Sarah.getAccountHolder()); 
		System.out.println("Account Number: "+Sarah.getAccountNumber());
		System.out.println("Available Balance: "+ Sarah.getAvailableBalance());
		
		Sarah.deposit(3500);
		Sarah.ShowBalance();
		Sarah.withdraw(4000);
		Sarah.ShowBalance();
		Sarah.deposit(10000);
		Sarah.ShowBalance();
		
		System.out.println("======================================");
		
		BankAccount Serkan = new BankAccount(); 
		Serkan.setAccountHolder("Serkan Keskin");
		Serkan.setAccountNumber(98765542145L);
		Serkan.getAccountInfo();
		
		
		Serkan.deposit(10000);
		Serkan.ShowBalance();
		Serkan.withdraw(3000);
		
		Serkan.getAccountInfo();
		
	BankAccount [] accounts = {Sarah, Serkan};
	
	ArrayList<BankAccount>Accounts = new ArrayList<>(); 
		Accounts.add(Sarah);
		Accounts.add(Serkan);
		
		Accounts.addAll(Arrays.asList(Sarah, Serkan));
		
		
	}
	
	
}
