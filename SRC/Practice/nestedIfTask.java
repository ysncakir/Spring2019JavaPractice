package Practice;
import java.util.Scanner;
public class nestedIfTask {

public static void main(String[] args) {
	
	/*
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
    */


    
    System.out.println("Enter item1, count and its price"); 
    Scanner scan = new Scanner(System.in); 
    String item1= scan.nextLine();
    int count1= scan.nextInt(); 
    double price1 = scan.nextDouble(); 
    double total = (price1 * count1); 
    
    
    System.out.println("Enter item2, count and its price");
    Scanner scan2 = new Scanner(System.in); 
    String item2= scan2.nextLine();
    int count2= scan2.nextInt(); 
    double price2 = scan2.nextDouble(); 
    double total2 = (price2 * count2); 
    
   System.out.println("Enter item3, count and its price");
    Scanner scan3 = new Scanner(System.in); 
    String item3= scan3.nextLine();
    int count3= scan3.nextInt(); 
    double price3 = scan3.nextDouble();
    double total3 = (price3 * count3); 


    double totalPrice1 = count1>0 ? count1*price1 : 0; 
    double totalPrice2 = count1>0 ? count2*price2 : 0; 
    double totalPrice3 = count3>0 ? count3*price3 : 0; 
    
    double report = totalPrice1 + totalPrice2 + totalPrice3; 
    
    System.out.println("Total price: "+ report);






















}

}
