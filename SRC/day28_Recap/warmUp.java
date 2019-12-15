package day28_Recap;

import java.util.Arrays;

public class warmUp {


 
/*
	Write a program that can convert km to miles 
			1 km =  0.612 miles 
	Write a program that can convert gallon to litters 
			1 gallon = 3.75 litter

	Write a program that can print out array in descneding order
*/

public static void main (String[] args) {
	//KmtoMiles ();  // not enough info to perform its tasks
	KmtoMiles (100);
	GltoLitters(85); 
	
	int [] arr = {0, -1, 200, 1000, 2000, 5000, 100, 90, 80}; 
	
	SortDes(arr); 
}
	


public static void SortDes(int [] array) {
	// array = {10,8,99,0,-1}
	
	Arrays.sort(array); // {-1, 0, 8, 10, 99}
	for (int i =array.length-1; i>=0; i--) {
		System.out.print(array[i]+" ");
	}
	
}
	
	
	

public static void KmtoMiles (double KM) {
	double Miles = KM*0.612; 
System.out.println(KM + " km equals to " + Miles + " miles");
	



}
	
	
	
public static void GltoLitters (double gallons) {
	double Liters = gallons*3.75; 
System.out.println(gallons + " gallons equals to " + Liters + " litters");	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}