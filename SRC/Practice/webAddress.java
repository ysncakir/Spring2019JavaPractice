package Practice;
import java.util.Scanner; 
public class webAddress {

public static void main(String[] args) {

	
	
	
	System.out.println("Please enter your web address");
	Scanner scan = new Scanner(System.in); 
	String url = scan.nextLine();
	
	

	boolean valid = url.startsWith("www") && url.endsWith("com") || url.endsWith("net")||
			url.endsWith("edu")||  url.endsWith("org") ||  url.endsWith("gov");
	
	int begin = url.indexOf(".")+1; 
	int last = url.lastIndexOf("."); 
	String extension = url.substring(url.lastIndexOf(".")+1); 
	String domain = url.substring(begin, last); 
	
		if (valid) {
			System.out.println("That is a valid URL");
			System.out.println("Domain: " + domain);
			System.out.println("Extension: "+ extension);
	}
		else
			System.out.println("That is invalid URL");
	

	
	
	
	
	
	
	
	
	
	
	
	}
}
