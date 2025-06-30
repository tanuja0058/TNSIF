package Day2;

public class DataTypes {
	public static void main(String[]arg) {
		
		//variable declaration invalid 
		//int for = 13;     //error bcz keyword cannot be define;
		//int num 1 = 13;   // error becz space 
		//int @num = 10;    //special symbol not allowed , only $ allowed

		//****DataTypes*****
		
		
		//byte 1 byte = 8 bits 2^8=256
		byte byteMax = 127;
		byte byteMin = 126;
		System.out.println(byteMax);
		
		//short 1 byte = 16 bits
		short shortMax = 32767;
		short shortMin = 32766;
		
		//int 4 byte = 64 bits Range is 4^64
		int max = 2147483647;
		int min = 2147483646;
		System.out.println(max);
		System.out.println(min);
		int val = 9/2;
		System.out.println(val);
		
		//long 8 byte = 
		long maxlong  =2147483647;
		long minlong =-2147483648;
          System.out.println(maxlong);
          System.out.println(minlong);
		
          
		float val1 = 101f/61f;
		System.out.println(val1);
		
		double val2 = 10d/6d;
		System.out.println(val2);
		
		//Boolean data type 
		boolean flag = false;
		boolean flag1 = true;
		
		//Assigning single character literal
		
		char ch = 'T';
		System.out.println(ch);
		
		//Assining num to char 
		char ch1 = 65;
		System.out.println(ch1);
		
		//Assining unicode to char 
		char var1 = '\u00A7';
		char var2 ='\u00AC';
		
		//
		
		

	}
  
}
