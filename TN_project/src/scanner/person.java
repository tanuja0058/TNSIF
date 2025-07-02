package scanner;



public class person {
	//data members
	
	private String name;
	private int income;
	private String gender;
	private int age;
	private long MobNo;
	private int tax;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobNo() {
		return MobNo;
	}
	public void setMobNo(long mobNo) {
		MobNo = mobNo;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	//object class methods returns string representation of person object
		@Override
		public String toString() {
			return "person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", MobNo="
					+ MobNo + ", tax=" + tax + "]";
		}

}
