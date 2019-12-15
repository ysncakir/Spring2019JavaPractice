package day45_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

class credentials{
	
	 String userName; 
	 String passWord; 
	
	private String username; // admin
	private String password; // 123
	
	public credentials() {   // constructor
		setUsername("admin");
		setPassword("123");
	}
	
	// getter 
	public String getUsername() {
		return username; 
	}
	
	public String getPassword() {
		return password; 
	}
	
	// setter 
	public void setUsername (String username) {
		this.username = username; 
	}
	
	public void setPassword (String password) {
		this.password = password; 
		
	}
	
	public void setcredentials (String username, String password) {
		this.username = username; // also we can call setUsername()
		this.password = password; // also we can call setPassword()
	} 
	
	public void getInfo () {
		System.out.println("username: "+ getUsername());
		System.out.println("password: "+ getPassword());
	}
}

public class EncapsulationReview {
	
	private static final String ArrayList = null;

	public static void main(String[] args) {
		
		credentials ysn = new credentials(); 
		
		ysn.userName = "ysncakir"; 
		ysn.passWord = "3747"; 
		// ysn.username = "ysn" // data is private, it is only visible within the class 
		
		// to read private data
		
		 
        ysn.setcredentials("ysn", "111");
    
		System.out.println(ysn.getUsername()); 
		System.out.println(ysn.getPassword());
	

	credentials Nurzat  = new credentials(); 
	System.out.println(Nurzat.getUsername());  // same with the above 
	System.out.println(Nurzat.getPassword());  // same with the above
	
	Nurzat.setUsername("nuri");
	Nurzat.setPassword("9876");
	System.out.println(Nurzat.getUsername());
	System.out.println(Nurzat.getPassword()); 
	
	credentials Seyfo  = new credentials(); 
		Seyfo.setcredentials("seyfo", "1234");
		// Seyfo.setPassword("789"); // if we do it, the result will be 789
	
		System.out.println("username: "+ Seyfo.getUsername());
		System.out.println("password: "+ Seyfo.getPassword());
		
		Seyfo.getInfo();
		
		System.out.println("=============================================");
		
		credentials [] users = {ysn, Nurzat, Seyfo}; 
		
		users[0].getInfo();
		users[1].getInfo();
		users[2].getInfo();
		
		System.out.println("=============================================");
		
		ArrayList<credentials> CredentialsList = new ArrayList<>(); 
		
		CredentialsList.addAll(Arrays.asList(ysn, Nurzat, Seyfo)); 
		CredentialsList.get(0).getInfo(); 
		CredentialsList.get(1).getInfo(); 
		
		for (credentials each :CredentialsList) {
			each.getInfo();
		}
		
		
	}
	
}






