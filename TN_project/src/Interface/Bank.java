package Interface;

public interface Bank {
	final static float MINBAL=5000;
	final static float Deposite_Limit=25000;
	
	public void deposite(float ammount);
	public void withdraw(float ammount);
	
	

}
