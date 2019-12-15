package day39_JavaReview;

import java.text.DecimalFormat;

public class FormattingDecimals {
	
	public static void main(String[] args) {
		
		DecimalFormat format = new DecimalFormat("0.00");
		
		double b = 23.123456789334; 
		
		// format(double): format the decimals and returns string value;
		
		String str = format.format(b); 
		
		System.out.println(str);
		
		double c = 45.56789; 
		
		System.out.println(format.format(c)+1); // will concate 
		
		c= Double.parseDouble(format.format(c)); // returns String to primitive 
		
		System.out.println(c+1);
		
	}

}
