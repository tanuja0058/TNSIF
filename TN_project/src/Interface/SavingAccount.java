package Interface;
//child class
public class SavingAccount extends Customer implements Bank{
	private int accNo;
	private float balance;
	
	//para constructor

	@Override
	public void deposite(float ammount) {
		if (ammount<0 || ammount>Deposite_Limit)
		{
			System.out.println("Pls enter valid deposite ammount");
		}
		else {
			balance+=ammount;  //balance = balance+amt
			System.out.println("Rs:"+ammount+"is deposited Succesfully");
		}

		
	}

	public SavingAccount(String name, String city, int accNo, float balance) {
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}

	

	@Override
	public void withdraw(float ammount) {
		if(ammount<=balance-MINBAL) {
			balance-=ammount;
			System.out.println("Rs:"+ammount);
		}
		else {
			System.out.println("Insufficient balanace");
		}
		
		
		
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}

}
