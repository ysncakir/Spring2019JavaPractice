package Practice;
import java.util.Scanner;
public class nestedIfTask {

public static void main(String[] args) {
	

	Scanner scan = new Scanner(System.in);
    //WRITE YOUR CODE HERE 
    int age = scan.nextInt(); 
    if(age>=2 && age<=18 ){ 
      if(age==2){
        System.out.println("toddler"); 
      }
      else if(age>=3 && age<=5){
        System.out.println("early childhood"); 
      }
      else if(age==6 || age==7){
        System.out.println("young reader"); 
      }
      else if(age>=8 && age<=10){
        System.out.println("elemantary"); 
      }
      else if(age==11 || age==12){
        System.out.println("middle"); 
      }
      else if(age==13){
        System.out.println("impossible"); 
      }
      else if(age>=14 && age<=16){
        System.out.println("high school"); 
      }
      else if(age==17 || age==18){
        System.out.println("scholar"); 
      }
      
    } else{
        System.out.println("ineligible"); 
      }

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = input.nextInt();
   
    if(number%2==0){
      System.out.println( number + " is even"); 
    } 
    else {
    	System.out.println( number + " is odd");
    }
    

































}

}
