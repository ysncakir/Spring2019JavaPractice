package day33_ArrayList;

import java.util.ArrayList;

public class ArrayListClass {
	
	public static void main(String[] args) {
		
		// declaration of ArrayList
		
		ArrayList<String>list = new ArrayList<String>(); 
		ArrayList<String>list2 = new ArrayList<>(); 
		
		
		// add: it is an overloaded method
		
		ArrayList<String> shoppingList = new ArrayList<>(); 
		
		shoppingList.add("apple");  // index number :0, size: 1
		shoppingList.add("orange"); // index number :1 , size:2
		shoppingList.add("grape"); // index number :2, size : 3
		
		System.out.println(shoppingList);
		
		
		// add (index, object) : adds the object at the given index number
		
		shoppingList.add(1, "strawberry");
		
		System.out.println(shoppingList);
		
		 //  shoppingList.add(5 , "Toyota Corolla");  // it does not skip indexes
        System.out.println( shoppingList );     
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0,  5);  // [5]
        numbers.add(1,  10); // [5, 10]
        numbers.add(2,  15); // [5, 10, 15]
        
        numbers.add(1,  1);   // [5, 1, 10, 15]
        
        numbers.add(1, 6);  //[5, 6, 1, 10, 15]
        
        System.out.println(numbers);

//  get(index number): returns the object
        ArrayList<String> names = new ArrayList<>();
            names.add("Homayra");
            names.add("Meri");
            names.add(1, "Mikrigul");
            names.add(1, "Tabriz");
            names.add(0, "Asiya");
            
            String str1 = names.get(1); 
            System.out.println( str1 );
            
            
 // size (): returns the length of the ArrayList as an Int value
            
            int length = names.size(); 
            System.out.println(length);

            for (int i =0; i <names.size(); i++) {
            	String each = names.get(i).concat(" "); 
            	System.out.print(each);
            }
            System.out.println();
		
            for (String eachName : names) {
            	System.out.print(eachName + " ");
            }
            System.out.println();
            
// clear(); removes all the objects from the ArrayList
            
        ArrayList<String> students = new ArrayList<>(); 
            students.add("Holly"); 
            students.add("Erhan"); 
            students.add("Seyfo"); 
            students.add("Nadira"); 
            students.add("Cihan"); 
            
            System.out.println(students);
            
            students.clear();
            
            System.out.println(students);
            System.out.println(students.size()); // 0
            
 // set (index number, object): given object will replace the object number at given index number \
            
        ArrayList<String> javengers = new ArrayList<>(); 
            javengers.add("Ferhat"); 
            javengers.add("Lexi"); 
            javengers.add("Asiya"); // "Yasin"
            javengers.add("Ozgen"); 
            javengers.add("Alex");
            javengers.add("Safwan"); 
            
            javengers.set(2, "Yasin"); // replaced Asiya with Yasin
            
            System.out.println(javengers);
		
// contains(): checks if the given object is contained in the ArrayList or not and return boolean value
            
            
        ArrayList<String> goodGuys = new ArrayList<String>(); 
            goodGuys.add("Hakan"); 
            goodGuys.add("Ihsan"); 
            goodGuys.add("Tim"); 
            goodGuys.add("Ibrahim"); 
            goodGuys.add("Dilyar"); 
		  
            boolean result =  goodGuys.contains("Muhtar");
            System.out.println(result);
            
 // equals(): checks if the 2 array list or equal or not, returns bolean value	
            
       ArrayList<String> badGuys = new ArrayList<>(); 
       		badGuys.add("Muhtar"); 
       		badGuys.add("Asiya");
       		badGuys.add("replit");
       		badGuys.add("Ibrahim");
       		
       		boolean result2 = badGuys.equals(goodGuys); // false 
       		
       		
       	if (goodGuys.contains("Ibrahim") && badGuys.contains("Ibrahim")) {
       		
       		System.out.println("Ibrahim is good guy");
       	}
// remove (int): removes index
       	
        ArrayList<Integer> lists = new ArrayList<Integer>(); 
        
        lists.add(1); // auto boxing 	index : 0
        lists.add(2); // auto boxing	index : 1
        lists.add(3); // auto boxing 	index : 2
        lists.add(4); // auto boxing 	index : 3
        lists.add(5); // auto boxing 	index : 4
        
        lists.remove(2); // 1, 2, 4,5
        lists.remove(3);
        System.out.println(lists);
        System.out.println(lists.size());
        
        
// remove (Integer): removes first matching object and returns boolean value
        
        ArrayList<Integer> lists2 = new ArrayList<Integer>(); 
        
        lists2.add(1); // auto boxing 	index : 0
        lists2.add(2); // auto boxing	index : 1
        lists2.add(3); // auto boxing 	index : 2
        lists2.add(4); // auto boxing 	index : 3
        lists2.add(5); // auto boxing 	index : 4
        
        Integer a =1; 
        
        boolean r1 = lists2.remove(a);
        System.out.println(r1);
        
        ArrayList<String> city = new ArrayList<>(); 
        city.add("Miami");
        city.add("Miami");
        city.add("Gotham");
        city.add("Azarbaijan");
        city.add("Istanbul");
        city.add("Urumqi");   // [Miami, Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]
                    
    //  city.remove("Miami");  // [Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]
    
        if( city.remove("Miami") )    {  // [Miami, Gotham, Azarbaijan, Istanbul, "Urumqi]
                city.remove( 2 );  // [Miami, Gotham, Istanbul, "Urumqi"]
        }
        
        city.add(3, "Azarbaijan" ); // [Miami, Gotham, Istanbul, Azarbaijan,"Urumqi"]
        System.out.println(city);
                
        
    ArrayList<Integer>     price = new ArrayList<>();           
        price.add( 1 );// auto
        price.add( 2 );
        price.add( 3 );
        price.add( 4 );
        price.add( 5 );
        
        price.remove( Integer.parseInt("2") ) ;  // parse method returns primitive,
        System.out.println(price);  // [1, 2, 4, 5]
        
        boolean r3 = price.remove( Integer.valueOf("3") );  // valueOf method returns wrapper class,
        System.out.println(price);
        System.out.println(r3);
        
        
    
    
        
        
	}
}
