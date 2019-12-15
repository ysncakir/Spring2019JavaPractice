package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistReview {

	public static void main(String[] args) {
		
	
	
	ArrayList<Integer> list = new ArrayList<>(); 
	
	list.add(10); // will be converted Wrapper class to create object
				  // auto boxing==>converting primitive to Wrapper 
	
	list.add(20); 
	
	list.add(1, 30);
	
	// list.add(4, 40); not possible , we cannot skip index
	
	list.add(3,50); 
	
	
	System.out.println(list);
	
	
	Integer a = list.get(2); 
	
	System.out.println(a);
	
	System.out.println(list.size());
	
	for(int i=0; i<list.size(); i++) {
		System.out.print(list.get(i)+ " ");
	}
	System.out.println();
	
	for(int i=list.size()-1; i>=0; i-- ) {
		System.out.print(list.get(i)+ " ");
	}
	
	
	list.clear();
	
	System.out.println();
	System.out.println(list);
	
	ArrayList<String> students = new ArrayList<>(); 
	students.add("Erhan"); 
	students.add("Kerem"); 
	students.add("Erdal"); 
	students.set(2, "Arzu"); 
	System.out.println(students);
	
	students.set(0, "Mehmet"); 
	System.out.println(students);
	
	System.out.println(students.indexOf("Arzu"));
	
	ArrayList<String> students2 = new ArrayList<>();
	students2.add("Mecnun"); 
	
	System.out.println(students.equals(students2));
	
	System.out.println(students.contains("Muhtar"));
	
	System.out.println(students.contains("Mehmet"));
	
	
	ArrayList<Character> ch = new ArrayList<>(); 
	
	System.out.println(ch.isEmpty());
	
	ch.add('a'); 
	
	System.out.println(ch.isEmpty());
	
	ArrayList<Integer> price = new ArrayList<>(); 
	price.add(1); // 0
	price.add(2); // 1
	price.add(3); // 2
	
	price.remove(1); 
	
	System.out.println(price);
	
	ArrayList<String> n1 = new ArrayList<>();
	n1.addAll(Arrays.asList("Yasin", "Cakir")); 
	System.out.println(n1);
	
	Integer[] arr = {1,2,3,4,5,5,5,5,-100,-9}; 	
	ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(arr)); 
	System.out.println(nums);
	
	Collections.sort(nums);
	System.out.println(nums);
	
	
	}
}