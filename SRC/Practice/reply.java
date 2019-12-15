package Practice;

import java.util.Scanner;

public class reply {
public static void main(String[] args) {
	
	   
	   
	int freeBooks = 0;
    Scanner scan = new Scanner(System.in);
    boolean isPremiumCustomer = scan.nextBoolean();
    int nbooksPurchased = scan.nextInt();
    
    
    
      if (isPremiumCustomer) {
        if(nbooksPurchased>=5 && nbooksPurchased<8) {
          freeBooks+=1; 
          } else if (nbooksPurchased>=8){
          freeBooks+=2; 
          }
    }
      else{
    	  if (nbooksPurchased>=7 && nbooksPurchased<12){
      freeBooks+=1;
      } 
    	  else if (nbooksPurchased>=12) {
          freeBooks+=2; 
      }
      
    
      
}   
      System.out.println(freeBooks);
	   
      boolean exists = false;
      boolean entry = true; 
      String word = scan.next();
      
  if ( word.substring(0, 4).contains("java") 
		  || (word.substring(1, 5).contains("java"))){
	  		System.out.println(entry);
  } else {
    	  System.out.println(exists);
     }
 
      
  for (int i =1; i<21; i++)
	    if (i%3==0){
	    System.out.println(i);
	    }
      
	}
}