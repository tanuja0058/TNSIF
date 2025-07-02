package day4;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 String Name, City;
		 int Id;
		 System.out.println("Enter Customer Id");
		 Id=sc.nextInt();
		 
		 sc.nextLine();
		 System.out.println("Enter Customer Name");
		 Name=sc.nextLine();
		 
		 sc.nextLine();
		 System.out.println("Enter customer city");
		 City=sc.nextLine();
		 System.out.println(" ");
		 
		 Customer c1 = new Customer();//default
		 
		 c1.setCustomerCity();
		 c1.setCustomerId(Id);
		 c1.setCutomerName(Name);
		
	 
		 
	}

}
