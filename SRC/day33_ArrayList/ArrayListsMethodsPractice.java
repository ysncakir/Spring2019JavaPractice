package day33_ArrayList;

import java.util.ArrayList;

public class ArrayListsMethodsPractice {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> Javengers = new ArrayList<String>(); 
		
		
		Javengers.add("Jena"); 
		Javengers.add("Mary");
		Javengers.add("Tarah"); 
		Javengers.add("Mahriban"); 
		
		Javengers.set(1, "Seyfo"); // replace the current element with new one
		
		System.out.println(Javengers);
		
		Javengers.remove(0); // auto boxing 
		Javengers.add(0, "Pilot Nijat Borhan"); 
		
		System.out.println(Javengers);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(); 
			
			numbers.add(1); // 0
			numbers.add(2); // 1
			numbers.add(3); // 2
			numbers.add(4); // 3
			numbers.add(5); // 4
			
			numbers.remove(3); 
			System.out.println(numbers); // 1, 2, 3, 5
			
			boolean result = numbers.remove("3"); // there is no String 3 in the array
			
			//  numbers.remove(Integer.parseInt("3"));
			System.out.println(result);
			
			boolean result2 = numbers.remove(Integer.valueOf("3")); 
			
			System.out.println(result2);
		
		
		
		
		
		
	}

}
