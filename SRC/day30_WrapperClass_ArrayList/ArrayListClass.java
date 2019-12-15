package day30_WrapperClass_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		
		
		/*
		 * Declaration of arraylist =
		 * 	Arraylist<ClassType>variableName = new ArrayList<>();
		 *  ArrayList<Integer> variableName = new ArrayList<Integer>();
		 * 
		 * method of arrayList:
		 * add(value) : add values to Arraylist
		 * get (indexNum) : gets the specific index number of  
		 * size (): returns the length from Arraylist
		 * clear(): remove all values
		 */
		
	int [] array1 = new int [1]; // size is fixed
	
		ArrayList<Integer> list = new ArrayList<>(); 
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); 
						list2.add(30); // auto boxing
						list2.add(20);
						list2.add(10);
		
		System.out.println(list2);
		
		
		System.out.println(list2.get(2));
		
		System.out.println(list2.size());
		
		list2.clear();
		System.out.println(list2);
		
		System.out.println(list2.size());
		
		
		/* ArrayList vs Array 
		 * 
		 * 1. Array's size is fixed, ArrayList'size is dynamic
		 * 2. Array supports primitive and non-primitives, but ArrayList does not support primitives
		 * 3. Arraylist cannot be multi dimensional but Array can be
		 * 
		 * 
		 */
		
	}

}
