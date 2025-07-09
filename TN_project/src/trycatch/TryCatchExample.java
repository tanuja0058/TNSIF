
package trycatch;

public class TryCatchExample {

	public static void performDivision(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("I am method");
                 int z;
        try {
        	System.out.println("I am in try block");
        
        z=x/y;
        System.out.println(z);
        }
        catch(ArithmeticException e) {
        	System.out.println(e.getMessage());
        }
	
	}

}
