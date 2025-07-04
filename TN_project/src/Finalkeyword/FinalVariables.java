package Finalkeyword;

public class FinalVariables {
	//final int x; //final instance variable must be initialized
	 final int x = 100;
	//declaring a static blank final variable
	 final static int y;
	 
	 //declare and initaialize 
	 final static int z =300;
	 
	 //instance method
	  void change() {
		  //x=30; we cannot change or reassign the final variable value
		  //z=40;
	  }

	@Override
	public String toString() {
		return "FinalVariables [x=" + x + " y=" + y +" ]";
	}
	//declare static block
	static {
		y=70;
		//z=30; once inistialize cant be reassign
	
	}
	  

}
