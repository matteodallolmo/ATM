
public class ATM {

	double balance;
	String userID = "";
	
	public ATM(int bal)
	{
		balance = bal;
	}
	
	public void deposit(String UserID, double amount)
	{
		userID = UserID;
		balance += amount;
	}
}
