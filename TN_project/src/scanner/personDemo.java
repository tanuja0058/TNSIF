package scanner;
import java.util.Scanner;

public class personDemo {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		 String name;
		 System.out.println("ENter Person Name");
		name=sc.next();
		
		System.out.println("Enter AGe:");
		int age =sc.nextInt();
		
		System.out.println("Enter gender:");
		String gender =sc.next();
		
		System.out.println("Enter MobNo:");
		long MobNo =sc.nextLong();
		
		System.out.println("Enter Income:");
		int income =sc.nextInt();
		
		//person object and initialized values using setter
		person person = new person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		person.setMobNo(MobNo);
		
		//by using getter method i am reading data
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		System.out.println(person.getIncome());
		System.out.println(person.getMobNo());
		System.out.println(person.getTax());
		
		//display person details using tostring method 
		System.out.println(person);
		System.out.println("After creating tax object");
		Taxcalcultaion calc = new Taxcalcultaion();
		calc.calculateTax(person);
		System.out.println("After calculation Of tax");
		System.out.println(person);
		
	}

}
