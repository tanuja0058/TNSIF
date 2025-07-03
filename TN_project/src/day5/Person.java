package day5;
//relation btw classes this is Has-a class relation and address and executor part of this
public class Person {
	private String name;
	private Address address;
	
	//para constructor 
	public Person(String name, Address address) {
		
		this.name = name;
		this.address = address;
	}

	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	//method to display person info
	public void displayInfo()
	{
		System.out.println("Name :"+ name );
		System.out.println("Address : "+ address.getStreet()+ 
				",  "+ address.getCity()+", "+address.getState()+
				", "+address.getPostalcode());
	}

	//to String 
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
	}
