package day6;
//static methods
public class MyClass {
	
	private int section;
	private static int srNo;
	 //static block
	
	static {
		System.out.println("-----with static block-----");
		srNo=1000;
	//section=101;
	}

	//default constructor
	public MyClass() {
		System.out.println("----within default constructor----");
		srNo++;
		section++;
		
	}

	@Override
	public String toString() {
		return "MyClass [Serial NO "+srNo+"section=" + section + "]";
	}
	//static method 
	static void disp_static_method() {
		System.out.println("serial no:"+srNo);
	}
	
	
	
}
