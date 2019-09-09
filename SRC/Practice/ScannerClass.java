package Practice;

import java.util.Scanner; 

public class ScannerClass {



public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in); 
	
	System.out.println("Enter your phone number");
	
	int pn = scan.nextInt(); 
	System.out.println(pn);
	
	scan.nextLine(); 
	System.out.println("enter your name");
	String name = scan.nextLine(); 



	Scanner in = new Scanner(System.in); 
	System.out.println("Please enter an int value");
	
	int num = in.nextInt(); 
	System.out.println("Plese enter a double value");
	double cost = in.nextDouble(); 
	
System.out.println(num+ " " + cost);


	

	System.out.println("Please enter a word");

	String word = new Scanner(System.in).nextLine();

	System.out.println("Today's Word-Of-The-Day is: " + word);

	System.out.println("Enter month number:"); 
    Scanner input = new Scanner(System.in); 
    int month = input.nextInt(); 
    switch (month) {
    case 1:
    	System.out.println("January");
    	break;
    }
    	
    	Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan2.next().charAt(0);
        //WRITE YOUR CODE HERE 
        switch (response){
          case 'y': 
            System.out.println("Your request is being processed");
            break; 
    		
	
    }

    }
}