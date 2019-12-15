package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp {

	/*
	 1. write a return method that can remove the duplicated objects from an Integer arraylist
     2. write a return method that can remove the duplicated objects from a String arraylist
     3. write a return method that can remove the duplicated objects from a Character arraylist
     4. write a return method that can remove the duplicated objects from a Double arraylist

	 */

public static void main(String[] args) {
	// Task01
	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,4,4));
	System.out.println(list);
	list = RemoveDup(list);  
	System.out.println(list);
	
	
	ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(7,7,7,1,1,2,2,3,4,4,9,9));
	list2 = RemoveDup(list2);  
	System.out.println(list2);
	
	// task02
	String []names = {"Yasin", "Yasin", "Arzu", "Arzu", "Ihsan", "Ihsan", "Kerem", "Kerem"};
	
	ArrayList<String> str = new ArrayList<>(Arrays.asList(names)); 
	
	System.out.println(str);
	
	str =RemoveDup2(str);
	
	System.out.println(str);

	// task03
	
}
	
	
	
	// task1
	
	public static ArrayList<Integer> RemoveDup(ArrayList<Integer>list){
		ArrayList<Integer> result = new ArrayList<>(); 
		
		for (int i =0; i<list.size(); i++) {
			if (!result.contains(list.get(i))) {
				result.add(list.get(i)); 
			}
		
		
		/*for ( Integer each : list) {
			if (!result.contains(each)) {
				result.add(each);
			}
		}
		*/
	
	}

		return result; 
	}



	public static ArrayList<String> RemoveDup2(ArrayList<String>list){
		ArrayList<String> result = new ArrayList<>(); 
		
		for (int i =0; i<list.size(); i++) {
			if (!result.contains(list.get(i))) {
				result.add(list.get(i)); 
			}

		}

		return result; 
	}


	//task03;
	public static ArrayList<Character> RemoveDup3(ArrayList<Character>list){
		ArrayList<Character> result = new ArrayList<>(); 
		
		for (int i =0; i<list.size(); i++) {
			if (!result.contains(list.get(i))) {
				result.add(list.get(i)); 
			}

		}

		return result; 
	}


	


}
