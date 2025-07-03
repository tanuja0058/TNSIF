package SimpleInharitance;
 //Inheritance concept

//child class
public class Student extends Citizen {
	//data members
	//// private String studentname;
	// private String address;
	// private long phoneno;
	 private int rollno;
	 private String clgname;
	 
	 //nonpara constructor 
	public Student() {
		super();
		
		//para constructor
		
	}

	public Student(String name, String adharNo, String address, long phone,int rollno, String clgname) {
		super(name,adharNo,address,phone);
		this.rollno = rollno;
		this.clgname = clgname;
	}
	//getter setter

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getClgname() {
		return clgname;
	}

	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
//tosting
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", clgname=" + clgname + ", getName()=" + getName() + ", getAdharNo()="
				+ getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + "]";
	}
	
	 
	 
	 
	

}
