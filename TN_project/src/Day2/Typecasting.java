package Day2;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//widening
		byte b = 10;
		int i =b;
		System.out.println(i); 
		
		float f = 22.7f;
		double d = f;
		System.out.println(d);
		
		//narrowing
		double f1 = 10.43f;
		long l1=(long)f1;
		System.out.println(l1);
		
		long l2= 8665948960335L;
		int i2=(int)l2;
		System.out.println(i2);
		
		short s= 120;
		byte b1= (short)120;
		System.out.println(b1);
		
		
	}
}
