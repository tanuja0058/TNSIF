package Interface;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s1= new SavingAccount("zeel","pune",1234443,36500);
		s1.deposite(23490);
		System.out.println(s1);
		
		s1.withdraw(6700);
		System.out.println(s1);
		

	}

}
