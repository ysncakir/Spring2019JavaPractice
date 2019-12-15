package day34_Constructors;

import java.util.ArrayList;

public class WarmUp {

	/*
	
	1. write  a return method that can remove duplicates from a string
        Ex: RemoveDup("abcabc") ==> returns "abc";
    2. write a return method that accepts two parameter Strings a and b, 
    	and returns the total numbers of appearance of b in String a
        Ex: count("abcaba", "a")  ==> returns 3 ;
    3. use the above two methods to write a new method that can find the frequency of characters
        Ex: frequency("aabcabcabc") ==>a4b3c3
    4. write a return method that can find the maximum number from an Integer arrayList   
    		(DO NOT use sort methods of Collections class)
    5. write a return method that can find the minimum number from an Integer arrayList    
     	(DO NOT use sort methods of Collections class)

	 */


public static void main(String[] args) {
	// task1
	String str2=RemoveDup("yasinnnyasincnkdkk");
	System.out.println(str2);
	// task2
	int total = count ("abcdaaabcdaaa", "c"); 
	System.out.println(total);
	// task 3
	String frequency= frequency ("abcabcabcabc");
	System.out.println(frequency);
	
	// task4
	ArrayList<Integer>list = new ArrayList<Integer>(); 
			list.add(100); 
			list.add(20); 
			list.add(0); 
			list.add(30); 
	maximum(list); //30
	System.out.println(maximum(list));
	
	// task5
	ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(100); 
		list2.add(5); 
		list2.add(10); 
		list2.add(30); 
	minimum(list2); 
	System.out.println(minimum(list2));
	}


// task 1
public static String RemoveDup (String str) { // remove duplicates
								// abcabc
	String result = ""; 
	for (int i =0; i<str.length(); i++) {
		if(!result.contains(str.substring(i, i+1))) {
			result+=str.substring(i, i+1); 
		}
		
	}
	
	
	return result;
}

// task2
public static int count(String a, String b) { // sonunda number istedigi icin int olarak yazdik 
					    // abab       a ==>1 
						// bab		  a ==>2
						// ab		  a ==>3
	int count =0; // how many times b is appeared in a
	
	
	while (a.contains(b)) {
		count++;
		a= a.replaceFirst(b, "");
	}
	return count; 
	
}

// task3
public static String frequency(String str) {
							// abcabcabc==>a3b3c3
							// first step ==> remove duplicates
							// second step ==> count appearance of each character
	String result =""; 
	String nonDup = RemoveDup(str); // abc

for (int i =0; i<nonDup.length(); i++) {
	int count = count(str, nonDup.charAt(i)+""); 
	result+=""+ nonDup.charAt(i)+count; 
	
}
	return result; 
}


// task4
public static int maximum(ArrayList<Integer> list) {
	int max= Integer.MIN_VALUE; 
	
	for(int each : list) {
		if(each > max) {
			max=each; 
		}
	}
	return max; 
}

// task5
public static int minimum(ArrayList<Integer> list) {
	int min= Integer.MAX_VALUE; 
	
	for(int each : list) {
		if(each < min) {
			min=each; 
		}
	}
	return min; 
}

}