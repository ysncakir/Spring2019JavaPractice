package day21_whileLoops;

public class WarmUp {

public static void main(String[] args) {
	
	
	/* Write a program that can count how many times 
	 * the word book is appeared in a String 
	 * 
	 * 
	 */
	
	
	String sentence=  "I like books, I have books, I need book, book, book";
	// index : 				  z,   z+4==> book // just assume index number is z
	int count = 0; 
	
	
	for (int i =0; i<sentence.length()-3; i++) {
		if (sentence.substring(i, i+4).equals("book")) {
			// substring (0,4)==> for the first letter
			// substring (1,5)==> for the second letter
			//			 (2,6), (3,7) ...............17 letters=max for instance==> (16,20)// 
														// thats why we excluded last 3 numbers
			count++; 
		}
		
	}
	System.out.println(count);
	
	
	
	String words ="Cybertek is school, Cybertek is great, I love Cybertek";
//  index:      i,  i+7
// substring (i, i+7+1)    ending index is excluded in substring
    int nTimes = 0;
    for(int i = 0; i < words.length()-7; i++) {
        //                  
        if(words.substring(i  ,  i+8 ).equals("Cybertek")) {
            //                   i+7
            nTimes++;
		}
			
		
	}
	
	System.out.println(nTimes);
	
	// write a program that can remove the duplicate 
	
	
	
	
	String s1= "aabbccdddddgkkkkiiiississi"; 
	String result =""; // abc
			// 	a : (0, 1)
			//		(i, i+1)
	
	for (int i=0; i<s1.length(); i++) {
		if (!result.contains(s1.substring(i, i+1))){
			result +=s1.substring(i, i+1);
		}
	}
	
	System.out.println(result);
	
	for (int i=0; i<s1.length(); i++) {
		if (!result.contains(""+s1.charAt(i))){
			result +=s1.substring(i, i+1);
	
		}
	}
	
	System.out.println(result);
	}
}
