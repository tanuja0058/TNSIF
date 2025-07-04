package day6;
//static method
public class Employee {
	
	//declare instance variable
	private String name;
	private int id;
	 //declare static variable comapnyname with data type 
	static String companyName ="TNSIF";
	
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id +", companyName=" + companyName +"]";
	}
	
	
	
	

}
