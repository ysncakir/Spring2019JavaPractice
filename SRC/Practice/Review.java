package Practice;

import java.util.Scanner;

public class Review {

public static void main(String[] args) {
	
	
	String  item1, item2, item3;
	String report = "";
	double price1, price2, price3, totalPrice;
	int count1, count2, count3;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Item1, count and its price:");
	item1 =scan.next();
	count1 = scan.nextInt();
	price1 = scan.nextDouble();
	
	// System.out.println("Item1 is " + item1 +", count is "+count1+ ", price is "+ price1);
	
	System.out.println("Enter Item2, count and its price:");
	item2=scan.next();
	count2 = scan.nextInt();
	price2 = scan.nextDouble();
	
	// System.out.println("Item2 is " + item2 +", count is "+count2+ ", price is "+ price2);
	
	System.out.println("Enter Item3, count and its price:");
	item3 =scan.next();
	count3 = scan.nextInt();
	price3 = scan.nextDouble();
	
	// System.out.println("Item3 is " + item3 +", count is "+count3+ ", price is "+ price3);

	
	totalPrice =  (count1>0?price1*count1:0) + 
							(count2>0?price2*count2:0) +  
							(count3>0?price3*count3:0); 
	
	//Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5
	
	report = report.concat(count1>0? "Item1: " + item1+" Price: "+ price1*count1:"");
	report = report.concat(count2>0?", ":"");
	report = report.concat(count2>0? "Item2: " + item2+" Price: "+ price2*count2:"");
	
	report = report.concat(count3>0? ", ":"");
	report = report.concat(count3>0? "Item3: " + item3+" Price: "+ price3*count3:"");
	
	
	System.out.println(report);
	
	System.out.println("Total price: " + totalPrice);


		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
	  Scanner scan2 = new Scanner(System.in); 
	  int seniorCitizens = scan2.nextInt(); 
	  int nonSeniorCitizens = scan2.nextInt();
	  
	  System.out.println("What is new citizen's age?"); 
	  int age = scan2.nextInt(); 

	 if (age>=65){
	   System.out.println("Senior Citizen"); 
	   seniorCitizens =seniorCitizens+=1; 
	   }
	  if (age<65){
	    System.out.println("Non-Senior Citizen"); 
	    nonSeniorCitizens=nonSeniorCitizens+=1;
	  }
	 System.out.println("New seniorCitizens count "+ seniorCitizens);
	 System.out.println("New nonseniorCitizens count "+ nonSeniorCitizens);
	 
		
		
			
			















	}
}
