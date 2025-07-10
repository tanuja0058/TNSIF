package Threadlifecycle;

import java.util.Scanner;

import Throwexceptoon.greatervalueException;
import Throwexceptoon.negativeException;

public class UsingThrow {

	static int acceptNumber()
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.close();
		return n;
	}
	public static void main(String[] args) {
		
		int per;
		System.out.println("enter your percentage ...");
	
		per=acceptNumber();
		try {
			if(per<0)
				throw new negativeException();
			else if(per>100) {
				throw new greatervalueException();
			}
			else 
				System.out.println("Valid percentage ");
		}
		catch(negativeException | greatervalueException e)
		{
			System.err.println("Errorr..."+e.getMessage());
		}

	}

}