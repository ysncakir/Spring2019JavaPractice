package day06_AritmaticOperator;

public class PrimitiveCasting {

/* casting : converting larger primitive to smaller size. 
 * 
 * datatype variablename = (datatype)value 
 * 
 * castings : Explicit & implicit
 * 
 * primitives : byte, short, int, long, float, double 
  
 */
	
public static void main(String[] args) {
// explicit casting :
	
	int a = 10;
	//byte b = a;// byte is shorter than int
	byte b = (byte) a;// explicit casting 
	System.out.println(b);
	
	double DecimalNum = 10.5;
	float FloatNum = (int) DecimalNum; 
	System.out.println(FloatNum);
	
	long LongNum = 300l; 
	int IntNum = (short) LongNum;
	System.out.println(IntNum);
	
// implicit casting:
	
	byte ByteNum = 100; 
	int IntNum2 = ByteNum;
	
	// same with line below:
	
	int IntNum3 = (int) ByteNum; 
	
	short ShortNum = 100; 
	long LongNum2 = (long) ShortNum; 
	
//	explicit casting practices :
	
	double LargestNum = 100.8765; 
	
	byte ByteValue = (byte) LargestNum; 
	System.out.println(ByteValue); // byte cannot take decimals
	
	
	float FloatValue = (float) LargestNum; 
	float FloatValue2 = (int) LargestNum; 
	float FloatValue3 = (short) LargestNum; 
	float FloatValue4 = (byte) LargestNum; 
	float FloatValue5 = (long) LargestNum; 


	System.out.println(FloatValue);
	System.out.println(FloatValue2);
	System.out.println(FloatValue3);
	System.out.println(FloatValue4);
	System.out.println(FloatValue5);
	
	
	float FloatNumber2 = 500.67f;
	int myNumber = (short) FloatNumber2; // explicit: converting large data type to small data type 
	int myNumber2 = (int) FloatNumber2; 
	System.out.println(myNumber);
	System.out.println(myNumber2);
	
	/*int Num1 = 100; 
	  int Num2 = 200; 
	  int Num3 = 300; 
	*/
	
	// we can write 3 different variables as follows:
	
	int Num1= 100 , num2= 200, num3= 300; 

		System.out.println(Num1 + "\t" + num2 + "\t" + num3);
	
}

}
