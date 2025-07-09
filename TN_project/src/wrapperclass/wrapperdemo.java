package wrapperclass;
//boing means coverting one data type into anohter knows as wrapping

//converting the one primitive datatype into another known as wrapping 
public class wrapperdemo {

	public static void main(String[] args) {
		//unboxing
		Integer i  = new Integer(10);
		System.out.println(i);
		int b=i.intValue();
		System.out.println(b);
		
		//withou using int value()
		
		int c =i;
		System.out.println(c);
		
		//autoboxing
		int a =100;
		Integer i1=a;
		System.out.println(i1);

	}

}
