package day62_Collections;

import java.util.*;

public class SetInterface {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(100, 100, 100));
    System.out.println(list1); // [100,100,100]
    System.out.println(list1.get(0));

    Set<Integer> st1 = new HashSet<>();
            st1.add(100);
            st1.add(100);
            st1.add(100);
    System.out.println(st1); // [100]
//  System.out.println(st1.get(0));  // set does not have index number

    System.out.println("======================");
    	Set<Integer> hashset = new HashSet<Integer>();
        hashset.add(100);
        hashset.add(10);
        hashset.add(5);
        hashset.add(4);
        hashset.add(3);
        hashset.add(1);
        hashset.add(100);
    
        System.out.println(hashset);  // HashSet does not keep the objects order as it is
        
        Set<Integer> linkedhashset = new LinkedHashSet<>();
        linkedhashset.add(100);
        linkedhashset.add(10);
        linkedhashset.add(5);
        linkedhashset.add(4);
        System.out.println(linkedhashset);  // LinkedHashSet keeps the order as it is 
    // doubly-linked: add() & remove() are faster than HashSet
    
        SortedSet<String> treeset = new TreeSet<>(); 
        treeset.add("Z"); 
		treeset.add("Y");
		treeset.add("X"); 
		treeset.add("W"); 
		System.out.println(treeset);
		
		
	// Task: remove duplicates from an ArrayList and sort it
		
		
		List<Integer> list = new ArrayList<>();
			list.addAll(Arrays.asList(10,9,8,7,6,5));
			Collections.sort(list);// how to sort list
			System.out.println(list);
			
			
		List<Integer> list2= new ArrayList<>();
			list2.addAll(Arrays.asList(10, 10, 10, 10, 10,9,8,7,6,5));
			
		TreeSet<Integer> ts = new TreeSet<>(list2); // sorts and removes duplicates
		System.out.println(ts);
		
	/*	
	String str ="AAAAABBBBCCCCDDDD";
	Write a program that can remove the duplicates
		
	*/	
		
		String str ="BBBDDDCCCCAAAAAAA";// ABCD
		String [] arr =	str.split(""); 
		System.out.println(Arrays.toString(arr));
		
		TreeSet<String> removeDuplicates = new TreeSet<>(Arrays.asList(arr)); 
		System.out.println(removeDuplicates);
		
		String result = removeDuplicates.toString().replace("[", "").replace("]", " ").replace(", ", "");
		
		System.out.println(result);
		
		
		// second solution: keep order as it is 
        String str2 =   new LinkedHashSet<String>(Arrays.asList(arr)).toString();
        System.out.println(str2);
        
		
		
		
	}

}
