package day41_InitializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlockPractice {



	 public static String name;  // "suna" , "Erhan", "mehmet"
	    public static int[] arr1;
	    public static ArrayList<String> list = new ArrayList<>();
	    public static ArrayList<String> students = new ArrayList<>();
	    public static String [] online = {"Arzu", "Yasin", "Ihsan", "Kerem", "Cakir"};
	    public static String [] inClass = { "Daryna", "Nadire", "Olga", "Mizgin"};
	    
	    public static double a =100; 
	    
	    public int grade;  
	    
	    static {
	        name = "Erhan";
	        arr1 = new int[3];  //{0, 0, 0};
	        arr1[1] = 2;   // {0, 2, 0}
	        list.add("Break");
	        students.addAll(Arrays.asList(online)); 
	        a =300; 
	    }
	    
	    
	    static {
	        name = "Suna";
	        arr1 = new int[5];  //{0, 0, 0, 0, 0};
	        arr1[0] =1;   // { 1, 0, 0,0,0}
	        arr1[2] =3;  //  { 1, 0, 3,0,0}
	        
	        list.add("Coffee");
	        list.add("Tea");
	        students.addAll(Arrays.asList(inClass)); 
	        a =400; 
	        // list.add(6, "Madina"); // we cannot skip indexes-index number should start 3
	    }
	    
	    
	    
	    public static void main(String[] args) {
	        StaticBlockPractice obj1 = new StaticBlockPractice();
	        
	        System.out.println(name);  // null
	        
	        System.out.println( Arrays.toString( arr1 ) ); 
	        
	        System.out.println(list);
	        
	        System.out.println( students ); 
	        
	        a=500; 
	        System.out.println(a);
	        
	        // System.out.println(grade); not possible because grade is instance variable
	        
	        System.out.println(obj1.grade);
	    }
	    
	    
	    
	    
	    public StaticBlockPractice(){ // constructor also accepts instance variable since it is not static
	        name = "Mehmet";
	        grade = 100; 
	    }


}
