import java.util.*;

public class ATM {
	
	ArrayList<Account> arr = new ArrayList<Account>();
	
	public void deposit(String UserID, double amount)
	{
		for(int i = 0; i < arr.size(); i++) 
		{
			if(arr.get(i).userID.equals(UserID))
			{
				arr.get(i).balance += amount;
			}
		}
	}
}
