package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class day_36_ArrayList {

	// return method can duplicate objects from Integer ArrayList
	
	
	
	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,3,3,4,4,4,4));
		 System.out.println(list);
		 list = RemoveDup(list); 
		 System.out.println(list);
		 
		 ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(5,5, 6,6,7,7,7,7,4,4,4,4));
		 list2= RemoveDup2 (list2); 
		 System.out.println(list2);
		 
		  
		 ArrayList <String> list3 = new ArrayList<>(Arrays.asList("Yasin", "Yasin", "Arzu", "Arzu", "Ihsan", "Ihsan"));
		 list3 = RemoveDup3(list3); 
		 System.out.println(list3);
		 
		 ArrayList<Integer> liste = new ArrayList<Integer>(); 
			liste.add(0); 
			liste.add(1);
			liste.add(2); 
			System.out.println(liste);
			liste.remove(2); 
			System.out.println(liste);
			
			String [] arr = {"Yasin", "Arzu", "Cakir", "Yasin"}; 
			ArrayList <String> names = new ArrayList<String> (Arrays.asList(arr));
			
			if (names.remove("Yasin")) {  // true Arzu, Cakir, Yasin
				names.remove("Ihsan");  // false 
			}
			
			System.out.println(names);
	}
	
	public static ArrayList<Integer> RemoveDup (ArrayList<Integer> list){
		ArrayList <Integer> result = new ArrayList<>(); 
	
		for (Integer each : list ) {
			if(!result.contains(each)) {
				result.add(each); 
			}
		}
		
		return result; 
	}
	
	
	public static ArrayList<Integer> RemoveDup2 (ArrayList<Integer> list){
		ArrayList <Integer> result = new ArrayList<>(); 
		
		for (int i =0; i<list.size(); i++) {
			if(!result.contains(list.get(i))){
				result.add(list.get(i)); 
				
			}
		}
		
	return result; 	
	}
		 
	public static ArrayList<String> RemoveDup3(ArrayList<String>list){
		ArrayList <String> result = new ArrayList<>(); 
		
		for (int i =0; i<list.size(); i++) {
			if(!result.contains(list.get(i))){
				result.add(list.get(i)); 
			}

		}
		return result; 
		}
	
	
	
	
	
}
