package day19_ForLoop;
import java.util.Scanner; 
public class warmUp {
public static void main(String[] args) {
	


/* Given:  username: cybertek.batch12@gmail.com
            password: Javengers
    write a program for the login functionality of the gmail account. (user input is required)
        - username can be entered either in upper or lower case
        - password MUST be entered as it is
        - if the username does not end with "@gmail.com":
                    print "it's not a valid email address"
        - if username ends with gmail but username or password did not match:
                    print "Invalid username or password"
        - if the username and passwords are correct:
                    print "loged in successfully"
        
 
 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your username");
		String user = input.nextLine().toLowerCase(); 
		System.out.println("Enter your password");
		String pass = input.nextLine();

		String username = "cybertek.batCH12@gmail.com"; // since it has some Upper case letters, we keep the ignore case below
		String password = "Javengers"; 

		if (user.endsWith("gmail.com")) {
			
			if (user.equalsIgnoreCase(username) && pass.equals (password)){
				System.out.println("Logged in successfully");
			}else {
				if (!user.equalsIgnoreCase(username) && !pass.equals (password)){
					System.out.println(" Both username and password are incorrect");
				} else if (!user.equalsIgnoreCase(username)) {
					System.out.println("Invalid username");
				}	else {
						System.out.println("Invalid password");
					}
				}
		}
		else {
			System.out.println("it is not a valid email address");
		}
				
				
				
				
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
	}
}