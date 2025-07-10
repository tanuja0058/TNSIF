package Throwexceptoon;

public class greatervalueException extends Exception {
	public greatervalueException(String string) {
		super(string);
	}

	public greatervalueException() {
		// TODO Auto-generated constructor stub
		super("percentage should not be greater than 100");
	}
	

}
