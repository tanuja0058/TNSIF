package string;

public class StringOperationDemo {

	public static void main(String[] args) {
		String s2 = new String(" Indian");
		System.out.println(s2);
		
		String s3=s2.toUpperCase();
		System.out.println(s3);
		System.out.println(s2.length());
		int a=s3.length();
		System.out.println(a);
		
		String s4 =s2.substring(1,7);
		System.out.println(s4);
		
		System.out.println(s2.trim());
		System.out.println(s2.stripTrailing());
		System.out.println(s2.isEmpty());
		
		//string comparison
		s3=new String(s2);
		
		//= //equals cehck the data is equal
		System.out.println("case 1:"+s2.equals(s3));
		System.out.println("case 2:"+s2==s3); //== is used to check object refrenace means both are in one memory or not does not check data values
		
		
		
	}

}
