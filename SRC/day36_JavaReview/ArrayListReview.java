package day36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReview {


	/*
    
    ArrayList methods: add(), get(), size(), clear(), set(),  indexOf(), 
                    lastIndexOf(), equals(), isEmpty(), contains(),  remove(),
                    Array.asList(), addAll(), removeAll() , sort9)
     */
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
            // add(object): takes an object
            list.add( 10 );   //Autoboxing
            list.add( 20 );
            
            //add(index, object): it will insert the given object at the given index number
            list.add(1, 30);
            
        //  list.add(4, 40);  // arrayList' size is dynamic. we cannot skip indexes
            list.add(3, 50);
            
        System.out.println(list);
        
        // get(index number): returns the object at the given index
            //50:
        System.out.println( list.get(3) );
        
            //30:
        System.out.println(list.get(1) );
        
        
    // size(): returns the total number of elements in the list ( similar with lenght method in array
        
        System.out.println( list.size() ); //4 
            // last index number: list.size()-1
        
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        
        System.out.println();
        
        for(int i = list.size()-1;  i >= 0; i--  ) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        
        
        // clear(): removes all object from arrayList, size will be 0
        
        list.clear();
        System.out.println(list);
        
        
        // set(0, Object): replaces the index with the given object
        ArrayList<String> students = new ArrayList<>();
                students.add("Erhan");
                students.add("Homayra");
                students.add("Rahwa");
                students.add("Arzu");
                students.add("Mehmet");
                students.add("Rahwa");
                
                System.out.println(students);
                
                students.set(0, "Holly");
                System.out.println(students);
                
                students.set(4, "Happy birthday Mehmed");
                System.out.println(students);
        
                
            // indexOf(Object): retrun's the first matching object's index number
            System.out.println( students.indexOf("Rahwa") ); //2
        
            // lastIndexOf(Object): returns the last matching object's index number
            System.out.println(students.lastIndexOf("Rahwa"));  //5
            
            
            // equals(): checks the objects in two arrayLIST AND RETURNS BOOLEAN EXPRESSION
        ArrayList<String> students2 = new ArrayList<>(Arrays.asList("A","B","C"));
            
            System.out.println(students.equals(students2));// false
            
            students2 = students;
            
            System.out.println(students.equals(students2)); // true
        
            
        // Contains(Object): checks if the given object is conatined in the arraylist or not, and returns boolean expression
            
            System.out.println(students);
            
            System.out.println(students.contains("Muhtar"));  // false
            
            System.out.println(students.contains("Rahwa"));  // true
            System.out.println(students.contains("Erhan"));  // false
        
    }

}
