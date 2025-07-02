package day4;

public class Customer {
	private String CutomerName;
	private int CustomerId;
	private String CustomerCity;
	
	public Customer()
	{
		System.out.println("Default constructore");
		
	}
	// para constructor
	public Customer(String CustomerName,int CustomerId,String CustomerCity)
	{
		System.out.println("parameter constructor");
		this.CutomerName=CustomerName;
		this.CustomerId= CustomerId;
		this.CustomerCity=CustomerCity;
	}
	public String getCutomerName() {
		return CutomerName;
	}
	public void setCutomerName(String cutomerName) {
		CutomerName = cutomerName;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerCity() {
		return CustomerCity;
	}
	public void setCustomerCity() {
		CustomerCity = CustomerCity;
	}

}
