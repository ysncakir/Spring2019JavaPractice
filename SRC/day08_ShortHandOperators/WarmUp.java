package day08_ShortHandOperators;

public class WarmUp {



/// write java program that converts litters to gallons 
	// 1 GalLon = 3.785 litter
	// 1 litter = 1/ 3.785
	
	public static void main(String[] args) {
		
		int gallon = 15;
				
		double liter = gallon * 3.785; 
		
		String result1 =  gallon +" gallons equal to " +liter +" litters"; 
		
		System.out.println(result1);
		
		
	double L = 50; 
	double G = L / 3.785;
	String result2 = L + " litters equal to " + G + " gallon "; 
	
	System.out.println(result2);
	
	
	// Task 1; 
	
	int x = 2; 
	int y = x++; // y = 2; x =3 because it is post 
	
	System.out.println(y+ " " + x);
	
	int x2= 2; 
	System.out.println(x2++); // 2
	System.out.println(x2); //2+1
	
	int x3 = 2; 
	System.out.println(--x3); // 2-1
			
	int x4 = 8; 
	int y4 = x4--; // 8
	System.out.println(x4);
	System.out.println(y4);
	
	
	
	int a = 3, b =2; 
	long c = (a+b)*2/3%2; 
	System.out.println(c);
	
	
	
	
	
	
	
	
	
	
	}

}
