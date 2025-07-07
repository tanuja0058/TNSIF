package MethodOverriding;
//in overridinf we cant change return type like int float but it is possible in java to change return type forcefully using covirant 
public class methodoverridingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi;
		//dynamic binding assigning child object to parent refrance variable //this is new type to call our program 
		rbi = new SBI();
		System.out.println(rbi.getRateOfIntrest());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfIntrest());
		
		rbi = new ICICI();
		System.out.println(rbi.getRateOfIntrest());
		

	}

}
