package Day2;

public class Nested {

	public static void main(String[] args) {
		int a =10,b=20,c=30;
		System.out.println("Largest No is");
		if(a>b) {
			System.out.println("");
		}
		    if(a>c) {
		    	System.out.println(a);
		    }
		    else {
		    	System.out.println(c);
		    }
			   if(c>b) {
				   System.out.println(b);
			   }
			   else {
				   System.out.println(c);
			   }
		   }
	

}
